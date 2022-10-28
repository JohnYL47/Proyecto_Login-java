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
    //Client
    protected int Id;
    protected String Nombre;
    protected String Apellido;
    //Login
    protected String usuario;
    protected String password;
    //Vendedor
    protected int Idv;
    protected String Nombrev;
    protected String Apellidov;
    //Productos
    protected int Id_Product;
    protected String Nombre_Product;
    protected String Precio_Product;
    protected String Categoria_Product;

    public ModelPerson(int Id, String Nombre, String Apellido, String usuario, String password, int Idv, String Nombrev, String Apellidov, int Id_Product, String Nombre_Product, String Precio_Product, String Categoria_Product) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.usuario = usuario;
        this.password = password;
        this.Idv = Idv;
        this.Nombrev = Nombrev;
        this.Apellidov = Apellidov;
        this.Id_Product = Id_Product;
        this.Nombre_Product = Nombre_Product;
        this.Precio_Product = Precio_Product;
        this.Categoria_Product = Categoria_Product;
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

    public int getIdv() {
        return Idv;
    }

    public void setIdv(int Idv) {
        this.Idv = Idv;
    }

    public String getNombrev() {
        return Nombrev;
    }

    public void setNombrev(String Nombrev) {
        this.Nombrev = Nombrev;
    }

    public String getApellidov() {
        return Apellidov;
    }

    public void setApellidov(String Apellidov) {
        this.Apellidov = Apellidov;
    }

    public int getId_Product() {
        return Id_Product;
    }

    public void setId_Product(int Id_Product) {
        this.Id_Product = Id_Product;
    }

    public String getNombre_Product() {
        return Nombre_Product;
    }

    public void setNombre_Product(String Nombre_Product) {
        this.Nombre_Product = Nombre_Product;
    }

    public String getPrecio_Product() {
        return Precio_Product;
    }

    public void setPrecio_Product(String Precio_Product) {
        this.Precio_Product = Precio_Product;
    }

    public String getCategoria_Product() {
        return Categoria_Product;
    }

    public void setCategoria_Product(String Categoria_Product) {
        this.Categoria_Product = Categoria_Product;
    }

}
