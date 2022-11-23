/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.main;

import controlador.Controlador;

/**
 *
 * @author Adonay
 */
public class Iniciar {
    public static void main(String[] args) {
        Menu menu = new Menu();
        new Controlador(menu);
    }
}
