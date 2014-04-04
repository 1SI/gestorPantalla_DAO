/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author A7
 */
public class Cliente {
    
    private int idCliente;
    private String user, pass;

    public Cliente() {
    }

    public Cliente(int idCliente, String user, String pass) {
        this.idCliente = idCliente;
        this.user = user;
        this.pass = pass;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    
    
}
