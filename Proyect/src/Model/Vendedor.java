/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author SENA
 */
public class Vendedor {
    protected int IDVents;
    protected String usuarioVents;
    protected String apellidoVents;

    public Vendedor(int ID, String usuario, String apellido) {
        this.IDVents = ID;
        this.usuarioVents = usuario;
        this.apellidoVents = apellido;
    }

    public int getID() {
        return IDVents;
    }

    public void setID(int ID) {
        this.IDVents = ID;
    }

    public String getUsuario() {
        return usuarioVents;
    }

    public void setUsuario(String usuario) {
        this.usuarioVents = usuario;
    }

    public String getApellido() {
        return apellidoVents;
    }

    public void setApellido(String apellido) {
        this.apellidoVents = apellido;
    }

    public void setValueAt(int id, int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
