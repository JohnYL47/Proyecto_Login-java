/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import View.flogin;
import Model.modelo;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class Controlador implements ActionListener {
    flogin vistalogin= new flogin();
    private String user;
    private String password;
 
    
    public Controlador(){
    this.vistalogin.JTNombre_login.addActionListener(this);
    this.vistalogin.JTPassword_login.addActionListener(this);
} 
    public void iniciar(){
        this.vistalogin.setVisible(true);
        
    
    
}
    
    
    
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
  
}