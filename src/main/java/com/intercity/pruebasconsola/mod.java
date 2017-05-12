/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intercity.pruebasconsola;

import java.util.Scanner;

/**
 *
 * @author intercitydev
 */
public class mod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int a, b, cociente, residuo;
        System.out.print("Ingrese el valor de a: ");
        a = in.nextInt();
        System.out.print("Ingrese el valor de b: ");
        b = in.nextInt();
        cociente=a/b;
        residuo=a%b;
        System.out.println("Valor de cociente: " + cociente);
        System.out.println("Valor de residuo: " + residuo);
    }
    
}
