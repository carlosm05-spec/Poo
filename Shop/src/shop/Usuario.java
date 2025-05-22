/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shop;


public class Usuario {
    
    protected String usuario;
    protected String clave;

    // Constructor vacío
    public Usuario() {}

    // Constructor con parámetros (sobrecarga)
    public Usuario(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    public boolean validarLogin() {
        return false; // base no valida nada
    }

    public boolean validarLogin(String usuario, String clave) {
        return this.usuario.equals(usuario) && this.clave.equals(clave);
    }

    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }


}
    

