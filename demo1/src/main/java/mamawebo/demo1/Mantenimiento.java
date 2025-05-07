package mamawebo.demo1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;
import java.time.LocalDate;

public class Mantenimiento {

    public static Connection conectar(){

        Connection conexion;
        String host = "jdbc:mariadb://localhost:3307/";
        String usuario = "root";
        String psw = "";
        String bd = "instituto";

        try {
            conexion = DriverManager.getConnection(host+bd,usuario,psw);
            System.out.println("Conexión realizada con éxito.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }

        return conexion;
    }

    public static void desconectar(Connection conexion){

        try {
            conexion.close();
            System.out.println("Conexión finalizada.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public static ObservableList<Estudiante> consulta (Connection conexion){

        ObservableList<Estudiante> listaEstudiantes = FXCollections.observableArrayList();
        String query = "SELECT * FROM estudiante";

        Statement stmt;
        ResultSet resultado;

        try {
            stmt = conexion.createStatement();
            resultado = stmt.executeQuery(query);

            while (resultado.next()){
                int nia = resultado.getInt("nia");
                String nombre = resultado.getString("nombre");
                LocalDate fecha_nacimiento = resultado.getDate("fecha_nacimiento").toLocalDate();
                listaEstudiantes.add(new Estudiante(nia, nombre, fecha_nacimiento));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }

        return listaEstudiantes;
    }

    public static void insertar(Connection conexion, Estudiante estudiante){

        StringBuilder query = new StringBuilder();
        query.append("INSERT INTO estudiante (nia,nombre,fecha_nacimiento) VALUES('");
        query.append(estudiante.getNia());
        query.append("','");
        query.append(estudiante.getNombre());
        query.append("','");
        query.append(estudiante.getFecha_nacimiento());
        query.append("')");

        Statement stmt;

        try {
            stmt = conexion.createStatement();
            stmt.executeUpdate(query.toString());
            System.out.println("Fila insertada.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }

    }

    public static void modificar(Connection conexion, Estudiante estudiante, int nia_anterior){

        String query = "UPDATE estudiante set nia = '" + estudiante.getNia()
                + "', nombre = '" + estudiante.getNombre() + "', fecha_nacimiento = '"
                + estudiante.getFecha_nacimiento() + "' WHERE nia = '" + nia_anterior
                + "'";

        Statement stmt;

        try {
            stmt = conexion.createStatement();
            stmt.executeUpdate(query);
            System.out.println("Fila insertada.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }

    }

    public static void borrar (Connection conexion, Estudiante estudiante){

        String query = "DELETE FROM estudiante WHERE nia = '" + estudiante.getNia() + "'";

        Statement stmt;

        try {
            stmt = conexion.createStatement();
            stmt.executeUpdate(query);
            System.out.println("Fila eliminada.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }

    }

}
