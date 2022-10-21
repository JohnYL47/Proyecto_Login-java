/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author SENA
 */
public class Tablas {
    protected int IdTb;
    protected String NombreTb;
    protected String ApellidoTb;
    protected String PrecioTb;
    protected String CategoriaTb;

    public Tablas(int IdTb, String NombreTb, String ApellidoTb, String PrecioTb, String CategoriaTb) {
        this.IdTb = IdTb;
        this.NombreTb = NombreTb;
        this.ApellidoTb = ApellidoTb;
        this.PrecioTb = PrecioTb;
        this.CategoriaTb = CategoriaTb;
    }

    public int getIdTb() {
        return IdTb;
    }

    public void setIdTb(int IdTb) {
        this.IdTb = IdTb;
    }

    public String getNombreTb() {
        return NombreTb;
    }

    public void setNombreTb(String NombreTb) {
        this.NombreTb = NombreTb;
    }

    public String getApellidoTb() {
        return ApellidoTb;
    }

    public void setApellidoTb(String ApellidoTb) {
        this.ApellidoTb = ApellidoTb;
    }

    public String getPrecioTb() {
        return PrecioTb;
    }

    public void setPrecioTb(String PrecioTb) {
        this.PrecioTb = PrecioTb;
    }

    public String getCategoriaTb() {
        return CategoriaTb;
    }

    public void setCategoriaTb(String CategoriaTb) {
        this.CategoriaTb = CategoriaTb;
    }
    
}
