/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fbelitama.vista;

import javax.swing.JOptionPane;

/**
 *
 * @author Fernando
 */
public class PruebaTiempo1 {
    
    public static void main(String[] args) {
        
        Tiempo1 tiempo = new Tiempo1();
        
        
        String salida="La ora universal inicial es :"+
                tiempo.aStringUniversal()+"\nLa Hora estandar inicial es:"+
                tiempo.aStringEstandar();
        
        tiempo.establecerHora(13,27, 6);
        salida+="\n\nLa Hora unversal despues de establecer hora es :"+
                tiempo.aStringUniversal()+
                "\nLa hora estandar despues de establecer hora es :"+
                tiempo.aStringEstandar();
        
        JOptionPane.showMessageDialog(null, salida, "prueba de la clase tiempo1", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
    
}
