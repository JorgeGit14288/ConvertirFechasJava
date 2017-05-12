/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intercity.pruebasconsola;

/**
 *
 * @author intercitydev
 */
public class dosdecimales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String numeroS = "8";
        
        double numero = Double.parseDouble(numeroS);
        System.out.print("El numero 8.5252719 con 2 decimales queda " + redondearDecimales(numero));
       
        numero = 1285.5552917;
        System.out.print("El numero 12.5552917 con 2 decimales queda " + redondearDecimales(numero));
    
        numero = -12.5566112345;
        System.out.print("El numero -12.5566112345 con 2 decimales queda " + redondearDecimales(numero));
 

    }

    public static double redondearDecimales(double valorInicial) {
        double parteEntera, resultado;
        resultado = valorInicial;
        parteEntera = Math.floor(resultado);
        resultado = (resultado - parteEntera) * Math.pow(10, 2);
        resultado = Math.round(resultado);
        resultado = (resultado / Math.pow(10, 2)) + parteEntera;
        return resultado;
    }

}
