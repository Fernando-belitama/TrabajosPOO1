/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fbelitama.vista;

import java.text.DecimalFormat;

/**
 *
 * @author Fernando
 */
public class HoraSimple {
    
    private int hora;
    private int minuto;
    private int segundo;

    public HoraSimple() {
    }

    public HoraSimple(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    
    public  String crearCadena(){
        
        return "this,aStringEstandar();"+ this.aStringEstandar()+""
                + "\naStringEstandar();"+aStringEstandar();
    }
    
    public String aStringEstandar(){
        DecimalFormat dosDigitos = new DecimalFormat("00");
        return dosDigitos.format(this.hora)+":"+
                dosDigitos.format(this.minuto)+":"+
                dosDigitos.format(this.segundo);
    }
    
    
}
