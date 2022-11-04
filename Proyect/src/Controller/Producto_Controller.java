/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author SENA
 */
public class Producto_Controller {
    
    protected int Id_Product;
    protected String Nombre_Product;
    protected String Precio_Product;
    protected String Categoria_Product;

    public Producto_Controller(int Id_Product, String Nombre_Product, String Precio_Product, String Categoria_Product) {
        this.Id_Product = Id_Product;
        this.Nombre_Product = Nombre_Product;
        this.Precio_Product = Precio_Product;
        this.Categoria_Product = Categoria_Product;
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
