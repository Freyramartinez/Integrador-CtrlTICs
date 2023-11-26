/*
 * 2. Dada una ecuación cuadrática regresar los valores 
de las raíces en caso de que estén sobre el conjunto de 
los números reales, en caso contrario indicar que la 
solución está en el conjunto de los números complejos.
 */
package SegundoProblema;

import java.util.Scanner;

public class ecuacionCuadratica {

    public static void main(String[] args) {
        Scanner constante = new Scanner (System.in); 
        
       double a, b, c, numero, x1, x2, x;
        //Solicita el valor de los coeficientes para realizar la ecuación
        System.out.print("Ingrese el valor de a: ");
        a = constante.nextDouble();
        
        System.out.print("Ingrese el valor de b: ");
        b = constante.nextDouble();
        
        System.out.print("Ingrese el valor de c: ");
        c = constante.nextDouble();
        //Cierra el escaneo
        constante.close();
        
        numero = b * b - 4 *a * c;
        //Se va a determinar cuál de las tres posibles soluciones es la indicada dependiendo de los valores ingresados
        if (numero > 0){
            x1 = (-b + Math.sqrt(numero)) / (2* a);
            x2 = (-b - Math.sqrt(numero)) / (2* a);
            System.out.println("Tiene dos soluciones, las cuales son x1 = " + x1 + " y x2 = " + x2);
            
        } else if (numero == 0){
            x = -b / (2*a);
            System.out.println("Solo tiene una solución, la cual es es x = " + x);
        }else {
            System.out.println("La ecuación no tiene soluciones reales.");
        }
    }
}
