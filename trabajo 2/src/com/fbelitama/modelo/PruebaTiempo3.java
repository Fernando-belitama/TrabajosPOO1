/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fbelitama.modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author Fernando
 */
public class PruebaTiempo3 {
    
    
    public static void main(String[] args) {
       
        Tiempo2 t1 = new Tiempo2();
        Tiempo2 t2 = new Tiempo2(2);
        Tiempo2 t3 = new Tiempo2(21,34);
        Tiempo2 t4 = new Tiempo2(12, 25, 42);
        Tiempo2 t5 = new Tiempo2(27, 74, 99);
        Tiempo2 t6 = new Tiempo2(t4);
        
        
        String salida ="se construyo con: "+
               "\n     "+t1.aStringUniversal()+
                "\n    "+t1.aStringEstandar();
        
        salida ="\nt2: se especifico hora; minuto y segundo predeterminados"+
               "\n     "+t2.aStringUniversal()+
               "\n    "+t2.aStringEstandar();                
                
        salida ="\nt3: se especifico hora; minuto y segundo predeterminado"+
               "\n     "+t3.aStringUniversal()+
               "\n    "+t3.aStringEstandar();        
                
        
        salida ="\nt4: se especifico hora; minuto y segundo"+
               "\n     "+t4.aStringUniversal()+
               "\n    "+t4.aStringEstandar();
        
        
        salida ="\nt5: se especificaron todos como valores invalidos"+
               "\n     "+t5.aStringUniversal()+
               "\n    "+t5.aStringEstandar();
        
        
        salida ="\nt6: se especifico objeto t4 de la clase tiempo2"+
               "\n     "+t6.aStringUniversal()+
               "\n    "+t6.aStringEstandar();
        
        
        JOptionPane.showMessageDialog(null, salida, "constructores sobre cargados",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
        
        
    }
    
}
