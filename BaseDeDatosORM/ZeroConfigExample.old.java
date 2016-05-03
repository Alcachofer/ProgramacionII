package db;

/* sormula - Simple object relational mapping
 * Copyright (C) 2011-2015 Jeff Miller
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import org.sormula.Database;
import org.sormula.Table;

/**
 * An example to show how to use sormula with nothing but a POJO
 * {@link Inventory} and the sormula.jar. There is no SQL, no configuration
 * files, and no annotations. Annotations may be used to override default
 * configuration. Sormula never needs a configuration file.
 * <p>
 * No annotations are required for insert, update, delete, and select by primary
 * key if the POJO (row class) conforms to the following:
 * <ul>
 * <li>Table name and class name are the same</li>
 * <li>Column names and class field names are the same</li>
 * <li>First field corresponds to primary column</li>
 * <li>All fields in class are columns in table</li>
 * </ul>
 * </p><p>
 * Everything needed for this example is in the one directory that contains this
 * class. The database used by this example is db.script. db.script may be
 * viewed with any text editor.
 * <p>
 * Compile with compile.bat<br>
 * Run with run.bat
 * </p>
 *
 * @author Jeff Miller
 */
public class ZeroConfigExample {

    Connection connection;
    Database database;
    Table<Alumno> tablaAlumno;

    public ZeroConfigExample() throws Exception {
        connection = DriverManager.getConnection("jdbc:hsqldb:file:kaadb;shutdown=true");
        database = new Database(connection);
        tablaAlumno = database.getTable(Alumno.class);
    }

    public void close() throws Exception {
        connection.close();
        database.close();
    }

    public void createTable() throws Exception {
        try (Statement statement = connection.createStatement()) {
            System.out.println("create table");
            statement.execute("CREATE TABLE ALUMNO(DNI INTEGER, NOMBRE VARCHAR(64), APELLIDO VARCHAR(64))");
        } catch (SQLException e) {
            // assume exception because table already exists
            System.out.println("Error:! " + e);
        }

        tablaAlumno.deleteAll(); // start with empty table
    }

    public void insert(int dni, String nombre, String apellido) throws Exception {
        Alumno al = new Alumno(dni, nombre, apellido);
        tablaAlumno.insert(al);
        tablaAlumno.save(al);
    }

    public void update(int dni, String nombre) throws Exception {
        Alumno aux_alumn = tablaAlumno.select(dni);
        aux_alumn.setNombre(nombre);
        int count = tablaAlumno.update(aux_alumn);
        System.out.println(count + " updated");
    }

    public void delete(int dni) throws Exception {
        Alumno aux_alumn = tablaAlumno.select(dni);
        int count = tablaAlumno.delete(aux_alumn);
        System.out.println(count + " deleted");
    }

    public void viewTable() throws Exception {    
        Alumno alumn = tablaAlumno.select(312);
         System.out.println(alumn);/*
        List<Alumno> list = tablaAlumno.selectAll();
        for (Alumno alumn : list) {
            System.out.println(alumn);
        }*/

    }

    public static void main(String[] args) throws Exception {
        System.out.println("begin");
        ZeroConfigExample ejemplo = new ZeroConfigExample();
        ejemplo.createTable();
        ejemplo.insert(1234, "Javi", "g");
        ejemplo.insert(312, "pepe", "e");
        ejemplo.insert(25432, "Javi", "h");
        ejemplo.insert(4324324, "Javi", "z");
        
        ejemplo.viewTable();
        ejemplo.close();
        System.out.println("end");
    }
}
