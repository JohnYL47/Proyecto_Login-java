/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyect;
import View.fLogin;
import Controller.Controlador;
/**
 *
 * @author AdminSena
 */

public class Proyect {

    
    public static void main(String[] args) {
       fLogin login = new fLogin();
       Controlador MARVEL = new Controlador(login);
       MARVEL.iniciar();
    }
}
