/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intercity.pruebasconsola;

import java.math.BigDecimal;

/**
 *
 * @author intercitydev
 */
public class StringToLong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String dennis = "123.126540000008880000";
        double f = Double.parseDouble(dennis);
        System.out.println(f);
        System.out.println(String.format("%.7f", f));
        System.out.println(String.format("%.9f", new BigDecimal(f)));
        System.out.println(String.format("%.35f", new BigDecimal(f)));
        System.out.println(String.format("%.2f", new BigDecimal(f)));
    }

}
