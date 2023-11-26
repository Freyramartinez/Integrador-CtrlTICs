

package com.mycompany.programacorrecto;

import java.util.Scanner;

/**MARCO ANTONIO MENDOZA CALVA
 */
public class Programacorrecto {

    public static void main(String[] args) {
     Scanner h=new Scanner(System.in);
     System.out.println("Teclea el valor en decimal : ");
     int decimal=h.nextInt();
     int bits = (int) (Math.log(Math.abs(decimal)) / Math.log(2)) + 1;//calcular los bits del numero entero.
     int valorinicial=decimal;    
    
       
        // Verificar si el número es negativo (-)
        if (decimal < 0) {
            // Obtener la representación en complemento a 2
            decimal = (int) (Math.pow(2, bits) + decimal);
        }

        // Convertir Numero decimal a binario
        StringBuilder binary = new StringBuilder();
        do {
            // Obtener el bit menos significativo
            int bit = decimal % 2;
            // Agregar el bit al inicio de la cadena
            binary.insert(0, bit);
            // Dividir el número por 2
            decimal /= 2;
        } while (decimal > 0);

        // Ajustar la longitud al número de bits especificado
        while (binary.length() < bits) {
            binary.insert(0, '0');
        }

        
        String binario =binary.toString(); //converitr a cadena 
        System.out. println("       RESULTADOS    ");
        System.out.println("El Número decimal es : \t" + valorinicial);
        System.out. println("La cantidad de bits son: \t "+ bits);
        System.out.println("El numero binario es :\t " + binario);
    }       
}