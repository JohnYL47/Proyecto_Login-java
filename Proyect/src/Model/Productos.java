/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author SENA
 */
public class Productos {
    protected int Id_Product;
    protected String Nombre_Product;
    protected String Precio_Product;
    protected String Categoria_Product;

    public Productos(int IdTb, String NombreTb, String ApellidoTb, String PrecioTb, String CategoriaTb) {
        this.Id_Product = IdTb;
        this.Nombre_Product = NombreTb;
        this.Precio_Product = PrecioTb;
        this.Categoria_Product = CategoriaTb;
    }

    public int getIdTb() {
        return Id_Product;
    }

    public void setIdTb(int IdTb) {
        this.Id_Product = IdTb;
    }

    public String getNombreTb() {
        return Nombre_Product;
    }

    public void setNombreTb(String NombreTb) {
        this.Nombre_Product = NombreTb;
    }

    public String getPrecioTb() {
        return Precio_Product;
    }

    public void setPrecioTb(String PrecioTb) {
        this.Precio_Product = PrecioTb;
    }

    public String getCategoriaTb() {
        return Categoria_Product;
    }

    public void setCategoriaTb(String CategoriaTb) {
        this.Categoria_Product = CategoriaTb;
    }
    
}
