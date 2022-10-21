/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import Model.modelo;
import View.fLogin;
import View.fcliente;
import View.fproductos;
import View.fvendedor;
import java.util.*;
import javax.swing.JOptionPane;

public class Controlador implements ActionListener {

    ArrayList<modelo> listaModel = new ArrayList<modelo>();
    fLogin vistalogin = new fLogin();
    fcliente clientes = new fcliente();
    fproductos productos = new fproductos();
    fvendedor vendedor = new fvendedor();

    //privados
    private String user;
    private String password;

    public Controlador(fLogin login) {
        this.vistalogin.JTNombre_login.addActionListener(this);
        this.vistalogin.JTPassword_login.addActionListener(this);
    }

    public void iniciar() {
        this.vistalogin.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
