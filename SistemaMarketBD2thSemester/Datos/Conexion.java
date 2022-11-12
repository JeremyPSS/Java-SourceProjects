
package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jeremy Prieto
 */
public class Conexion {
     private static Connection conexion = null; 
    private static final String usr = "root";
    private static final String pswd = "guitarra197"; //clave
    private static final String url = "jdbc:mysql://localhost:3306/producto"; //BD
    public Conexion() {
    }
    public Connection ObtenerConexion() throws SQLException
    {
        try{
        Class.forName("org.gjt.mm.mysql.Driver");
        conexion = DriverManager.getConnection(url, usr, pswd); //Envia la direccion de la base de datos, usuario, y contraseña
        System.out.println("conexion exitosa");
    }
    catch(ClassNotFoundException | SQLException e)
    {
        throw new RuntimeException(e);
    }
        return conexion;
    }
}
