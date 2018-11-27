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
public class PruebaThis {
    
    
    public static void main(String[] args) {
        
        HoraSimple hora= new HoraSimple(12, 30, 19);
        
        JOptionPane.showMessageDialog(null, hora.crearCadena(),"demostracion de la referencia\"this\""
                + "",JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
    }
    
}
