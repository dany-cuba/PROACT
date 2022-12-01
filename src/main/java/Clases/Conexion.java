
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    private static Connection conn = null;
    
    private Connection Conectar() throws SQLException, ClassNotFoundException{
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testing","root","");
        
        return conn;
    }
    
    private void desconectar(){
        conn = null;
    }
    
}
