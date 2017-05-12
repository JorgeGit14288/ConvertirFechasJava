/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intercity.pruebasconsola;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 *
 * @author intercitydev
 */
public class fechas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException, IOException {
        // Para obtener las fechas a mandar
        Calendar c = Calendar.getInstance();
        int dia = c.get(Calendar.DAY_OF_MONTH);

        int mes = c.get(Calendar.MONTH);
        int year = c.get(Calendar.YEAR);
        mes = mes + 1;
        int mesAnterior;
        int yearAnterior;

        if (mes == 1) {
            mesAnterior = 12;
            yearAnterior = year - 1;
        } else {
            mesAnterior = mes - 1;
            yearAnterior = year;
        }
       

      

        String fechaActual = year + "-" + mes + "-" + dia + " 23:59:00";
        String fechaActual2 = year + "-" + mes + "-" + dia;
        System.out.println("Fecha acual " + fechaActual);

        System.out.println();

        String fechaAnterior = yearAnterior + "-" + mesAnterior + "-" + dia + " 00:00:00";
        System.out.println("La fecha de un mes anterior es " + fechaAnterior);
        String startDate = fechaAnterior;
        String endDate = fechaActual;

        //fin fechas
        
        
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat formateador = new SimpleDateFormat("'Hoy es' EEEEEEEEE dd 'de' MMMMM 'de' yyyy");
        SimpleDateFormat formatea = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat forma    = new SimpleDateFormat("'Ingresaste' EEEEEEEEE dd 'de' MMMMM 'de' yyyy");
        cal.setTimeZone(TimeZone.getDefault());
        System.out.println(formateador.format(new Date()));
      
        String fechaAs = fechaActual2;
        try
        {
            formatea.setLenient(false);
            Date fechaForm = formatea.parse(fechaAs);
            System.out.println(forma.format(fechaForm));
        }
        catch (ParseException e)
        {
           System.out.println("Error, la cadena de texto no se puede convertir en fecha.");
        }
    }

}
