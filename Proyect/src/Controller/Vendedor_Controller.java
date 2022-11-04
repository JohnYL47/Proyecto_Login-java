/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author SENA
 */
public class Vendedor_Controller {
    
    protected int Idv;
    protected String Nombrev;
    protected String Apellidov;

    public Vendedor_Controller(int Idv, String Nombrev, String Apellidov) {
        this.Idv = Idv;
        this.Nombrev = Nombrev;
        this.Apellidov = Apellidov;
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
    
}
