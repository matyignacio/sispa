package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionDB {

    public static Connection GetConnection() {
        Connection conexion = null;
        String connectionString = "jdbc:mysql://localhost:3306/sispa";
        String user = "root";
        String pass = "root";
        //esta clase INTENTA realizar la conexion a la base de datos
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(connectionString, user, pass);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error  en la Conexión con la BD " + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion = null;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error2 en la Conexión con la BD " + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion = null;
        } finally {
            return conexion;
        }
    }
}
