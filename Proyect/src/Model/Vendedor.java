/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import Model.*;
/**
 *
 * @author SENA
 */
public class Vendedor{
    protected int IdV;
    protected String NombreV;
    protected String ApellidoV;

    public Vendedor(int IdV, String NombreV, String ApellidoV) {
        this.IdV = IdV;
        this.NombreV = NombreV;
        this.ApellidoV = ApellidoV;
    }

    public int getIdV() {
        return IdV;
    }

    public void setIdV(int IdV) {
        this.IdV = IdV;
    }

    public String getNombreV() {
        return NombreV;
    }

    public void setNombreV(String NombreV) {
        this.NombreV = NombreV;
    }

    public String getApellidoV() {
        return ApellidoV;
    }

    public void setApellidoV(String ApellidoV) {
        this.ApellidoV = ApellidoV;
    }
    
}
