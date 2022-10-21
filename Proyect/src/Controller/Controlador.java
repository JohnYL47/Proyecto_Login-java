/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.Tablas;
import Model.Vendedor;
import java.util.ArrayList;
import Model.IngresoTb;
import View.fLogin;
import View.fcliente;
import View.fproductos;
import View.fvendedor;
import java.util.*;
import javax.swing.JOptionPane;

public class Controlador implements ActionListener {

    ArrayList<IngresoTb> listaModel = new ArrayList<>();
    //ArrayList<Tablas> listaTablas = new ArrayList<>();
    ArrayList<Vendedor> listVent = new ArrayList<>();
    
    fLogin vistalogin = new fLogin();
    fcliente clientes = new fcliente();
    fproductos productos = new fproductos();
    fvendedor vendedor = new fvendedor();

    //privados
    private int ID;
    private String usuario;
    private String password;
    private String nombre;
    private String apellido;
    private String precio;
    private String categoria;
    /*
    privados Tb
    private int IdTb;
    private String NombreTb;
    private String ApellidoTb;
    private String PrecioTb;
    private String CategoriaTb;*/
    //privados Ven
    private int IDVents;
    private String usuarioVents;
    private String apellidoVents;

    public Controlador(fLogin login) {
        //Falta Admin
        this.vistalogin.JBGuardar_login.addActionListener(this);
        this.clientes.JBClient_Buscar.addActionListener(this);
        this.clientes.JBClient_Guardar.addActionListener(this);
        this.clientes.JBClient_Mostrar.addActionListener(this);
        this.productos.JBProducts_Buscar.addActionListener(this);
        this.productos.JBProducts_Guardar.addActionListener(this);
        this.productos.JBProducts_Mostrar.addActionListener(this);
        this.vendedor.JBVENDEDOR_Buscar.addActionListener(this);
        this.vendedor.JBVENDEDOR_Guardar.addActionListener(this);
        this.vendedor.JBVENDEDOR_Mostrar.addActionListener(this);        
    } //Buttons

    public void iniciar() {
        this.vistalogin.setVisible(true);
    } //inicio

    @Override
    public void actionPerformed(ActionEvent e) {
        
        //Ingreso de las tablas
        if (e.getSource() == this.vistalogin.JBGuardar_login) {
            usuario = this.vistalogin.JTNombre_login.getText();
            password = this.vistalogin.JPassword_login.getText();

            if (usuario.equals("admin") && password.equals("123")) {
                productos.setVisible(true);
            }else if (usuario.equals("cliente") && password.equals("456")) {
                clientes.setVisible(true);
            }else if (usuario.equals("vendedor") && password.equals("789")) {
                vendedor.setVisible(true);
            }else if (usuario.equals("") && password.equals("")){
                JOptionPane.showMessageDialog(null, "","Errror",JOptionPane.ERROR_MESSAGE);
                        
            }else{
                JOptionPane.showMessageDialog(null, "no esta");
            
            
            }
            limpiar();
        }
        
        if (e.getSource() == this.clientes) {
            
        }
        if (e.getSource() == this.vendedor.JBVENDEDOR_Guardar) {
            ID = Integer.parseInt(this.vendedor.JTVENDEDOR_ID.getText());
            usuarioVents = this.vendedor.JTVENDEDOR_Nombre.getText();
        }
    }
    private void limpiar() {
        //Falta admin
        this.vistalogin.JTNombre_login.setText("");
        this.vistalogin.JPassword_login.setText("");
        this.clientes.JTClient_Apellido.setText("");
        this.clientes.JTClient_ID.setText("");
        this.clientes.JTClient_Nombre.setText("");
        this.vendedor.JTVENDEDOR_Apellido.setText("");
        this.vendedor.JTVENDEDOR_ID.setText("");
        this.vendedor.JTVENDEDOR_Nombre.setText("");
    } //Limpiar --Admin
}
