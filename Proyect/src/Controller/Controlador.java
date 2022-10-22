/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.Productos;
import Model.Vendedor;
import Model.Clientes;
import java.util.ArrayList;
import Model.ModelPerson;
import View.fLogin;
import View.fcliente;
import View.fproductos;
import View.fvendedor;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class Controlador implements ActionListener {

    ArrayList<ModelPerson> Ingreso_list = new ArrayList<>();
    ArrayList<Productos> lista_Prod = new ArrayList<>();
    ArrayList<Vendedor> lista_Vended = new ArrayList<>();
    ArrayList<Clientes> lista_Client = new ArrayList<>();

    fLogin vistalogin = new fLogin();
    fcliente clientes = new fcliente();
    fproductos productos = new fproductos();
    fvendedor vendedor = new fvendedor();

    //--------------List--------------------------//
    //SESION DE TABLAS
    private String usuario;
    private String password;
    //TABLA DE VENDEDOR
    private int IDVents;
    private String usuarioVents;
    private String apellidoVents;
    //TABLA PRODUCTOS
    private int Id_Product;
    private String Nombre_Product;
    private String Precio_Product;
    private String Categoria_Product;
    //TABLA CLIENTES
    private int IdClient;
    private String NombreClient;
    private String ApellidoClient;
    private JTable JTable_Vendedor;
    private JTable JTable_Cliente;
    private JTable JTable_Products;
    //------------------------------------------//

    public Controlador(fLogin login) {
        //Falta Admin
        this.vistalogin.JBGuardar_login.addActionListener(this);
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
            } else if (usuario.equals("cliente") && password.equals("456")) {
                clientes.setVisible(true);
            } else if (usuario.equals("vendedor") && password.equals("789")) {
                vendedor.setVisible(true);
            } else if (usuario.equals("") && password.equals("")) {
                JOptionPane.showMessageDialog(null, "Favor ingrese datos", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Contraseña o Usuario no valido", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            limpiar();
        }
        //CLIENTE
        if (e.getSource() == this.clientes.JBClient_Guardar) {
            IdClient = Integer.parseInt(this.clientes.JTClient_ID.getText());
            NombreClient = this.clientes.JTClient_Nombre.getText();
            ApellidoClient = this.clientes.JTClient_Apellido.getText();

            lista_Vended.add(new Vendedor(IDVents, usuario, apellidoVents));
            cargartablaClient(JTable_Cliente, lista_Client);
        }
        if (e.getSource() == this.clientes.JBClient_Mostrar) {
            //
        }
        //VENDEDOR
        if (e.getSource() == this.vendedor.JBVENDEDOR_Guardar) {
            IDVents = Integer.parseInt(this.vendedor.JTVENDEDOR_ID.getText());
            usuarioVents = this.vendedor.JTVENDEDOR_Nombre.getText();
            apellidoVents = this.vendedor.JTVENDEDOR_Apellido.getText();

            lista_Vended.add(new Vendedor(IDVents, usuario, apellidoVents));
            cargartablaVent(JTable_Vendedor, lista_Vended);
        }
        //PRODUCTO
        if (e.getSource() == this.productos.JBProducts_Guardar) {
            Id_Product = Integer.parseInt(this.productos.JTProducts_ID.getText());
            Nombre_Product = this.productos.JTProducts_Nombre.getText();
            Precio_Product = this.productos.JTProducts_precio.getText();

            lista_Vended.add(new Vendedor(IDVents, usuario, apellidoVents));
            cargartablaProduct(JTable_Products, lista_Prod);
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

    private void cargartablaClient(JTable JTable_Cliente, ArrayList<Clientes> ListClient) {
        for (int i = 0; i < ListClient.size(); i++) {
            JTable_Cliente.setValueAt(ListClient.get(i).getId(), i, 0);
            JTable_Cliente.setValueAt(ListClient.get(i).getNombre(), i, 1);
            JTable_Cliente.setValueAt(ListClient.get(i).getApellido(), i, 2);

        }
    }
    
    private void cargartablaVent(JTable JTable_Vendedor, ArrayList<Vendedor> ListVent) {
        for (int i = 0; i < ListVent.size(); i++) {
            JTable_Vendedor.setValueAt(ListVent.get(i).getId(), i, 0);
            JTable_Vendedor.setValueAt(ListVent.get(i).getNombre(), i, 1);
            JTable_Vendedor.setValueAt(ListVent.get(i).getApellido(), i, 2);

        }
    } //Carga la tabla creo...

    private void cargartablaProduct(JTable JTable_Products, ArrayList<Productos> ListProd) {
        for (int i = 0; i < ListProd.size(); i++) {

            JTable_Products.setValueAt(ListProd.get(i).getIdTb(), i, 0);
            JTable_Products.setValueAt(ListProd.get(i).getNombreTb(), i, 1);
            JTable_Products.setValueAt(ListProd.get(i).getPrecioTb(), i, 2);
            JTable_Products.setValueAt(ListProd.get(i).getCategoriaTb(), i, 3);

        }
    }// 'Tb' = PRODUCTOS
}
