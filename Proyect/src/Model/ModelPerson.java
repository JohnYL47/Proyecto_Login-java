/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

//import java.util.ArrayList;
/**
 *
 * @author AdminSena
 */
public class ModelPerson {
    protected int Id;
    protected String Nombre;
    protected String Apellido;
    protected String usuario;
    protected String password;

    public ModelPerson(int Id, String Nombre, String Apellido, String usuario, String password) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.usuario = usuario;
        this.password = password;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
}
