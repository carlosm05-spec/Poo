
package Conexion;
import java.sql.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

public class conexion {
    
    public final static String url="jdbc:mysql://localhost:3306/Tienda";
    public final static String user="root";
    public final static String pass="12345";

    
    public Connection getConnection()throws SQLException{
        
        return DriverManager.getConnection(url,user,pass);
    }
    
}
