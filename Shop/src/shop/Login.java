
package shop;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement; 
import javax.swing.table.DefaultTableModel;
import Conexion.conexion;

public class Login extends Usuario{
    
    public Login() {
        super(); // llama constructor vacío
    }

    public Login(String usuario, String clave) {
        super(usuario, clave);
    }

    @Override
    public boolean validarLogin() {
        return this.usuario.equals(conexion.user) && this.clave.equals(conexion.pass);
    }

    @Override
    public boolean validarLogin(String usuario, String clave) {
        setUsuario(usuario);
        setClave(clave);
        return validarLogin();
    }
}
    

