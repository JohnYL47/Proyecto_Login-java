/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author SENA
 */
public class Clientes {
    protected int IdClient;
    protected String NombreClient;
    protected String ApellidoClient;

    public Clientes(int IdClient, String NombreClient, String ApellidoClient) {
        this.IdClient = IdClient;
        this.NombreClient = NombreClient;
        this.ApellidoClient = ApellidoClient;
    }

    public int getIdClient() {
        return IdClient;
    }

    public void setIdClient(int IdClient) {
        this.IdClient = IdClient;
    }

    public String getNombreClient() {
        return NombreClient;
    }

    public void setNombreClient(String NombreClient) {
        this.NombreClient = NombreClient;
    }

    public String getApellidoClient() {
        return ApellidoClient;
    }

    public void setApellidoClient(String ApellidoClient) {
        this.ApellidoClient = ApellidoClient;
    }
    
}
