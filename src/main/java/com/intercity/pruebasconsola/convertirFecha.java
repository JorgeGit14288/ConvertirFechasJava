/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intercity.pruebasconsola;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import static javax.print.attribute.Size2DSyntax.MM;

/**
 *
 * @author intercitydev
 */
public class convertirFecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here

        String fechah = "21/12/2016";
        System.out.println("La fecha a convertir es "+fechah);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = formato.parse(fechah);
        System.out.println("recibiendo del historial " + fechaDate);

        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");

        try {
            String resultado = formatoDelTexto.format(fechaDate);
            System.out.println(resultado);
            System.out.println("convirtiendo para consulta " + formatoDelTexto.format(fechaDate));

        } catch (Exception ex) {

        }

    }

}
