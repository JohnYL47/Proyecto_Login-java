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

    public ModelPerson(int Id, String Nombre, String Apellido) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
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
    
}
