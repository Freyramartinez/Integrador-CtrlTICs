package integradorpruebas;

import java.util.Scanner;

/**
 * @author 
 */
public class Circunferencia {
    
    public static void main(String[] args) {
        /* DATOS DE ENTRADA */
        
        // Crea un objeto Scanner para leer datos desde la consola
        Scanner datos = new Scanner(System.in);

        // Solicitar que ingrese las coordenadas del centro de la circunferencia (punto C)
        System.out.println("Ingresa las coordenadas del centro de una circunferencia (punto C) separado por una coma (x,y):");
        //Se pide una cadena de caracteres, se separa usando las coma como separador y se almacena en un arreglo tipo String
        String[] puntoC = (datos.nextLine()).split(","); 

        // Solicitar al usuario que ingrese el radio de la circunferencia
        System.out.println("Ingresa el radio de la circunferencia:");
        // Leer el radio como un número de con punto decimal
        float radio = datos.nextFloat();
        
        // Asegura de que la siguiente operación de lectura de línea se realice correctamente
        datos.nextLine();

        // Solicitar que ingrese las coordenadas del punto T
        System.out.println("Ingresa los valores de \"x\" y \"y\" del punto a evaluar (punto T) separado por una coma (x,y):");
        //Se pide una cadena de caracteres, se separa usando las coma como separador y se almacena en un arreglo tipo String
        String[] puntoT = (datos.nextLine()).split(",");

        // Cerrar la lectura de datos
        datos.close();
        
        
        /* PROCEDIMIENTOS */
        
        // Convertir las coordenadas de Strings a números enteros int
        int xc = Integer.parseInt(puntoC[0].trim());
        int yc = Integer.parseInt(puntoC[1].trim());
        int xt = Integer.parseInt(puntoT[0].trim());
        int yt = Integer.parseInt(puntoT[1].trim());

        /*
            La expresion Math.pow(xt-xc, 2) + Math.pow(yt-yc, 2) calcula la suma (x1, y1)² + (x2, y2)²
            Math.sqrt(suma)  calcula la raiz cuadrada de esa suma
            El resultado es un dato double por eso se necesita un casteo (float)
        */
        float distanciaPuntosCT = (float)Math.sqrt(Math.pow(xt-xc, 2) + Math.pow(yt-yc, 2));
        
        
        /* DATOS DE SALIDA */

        // La vadriable mensaje es una cadena de caracteres vacia
        String mensaje = "";
        
        // Si la distancia entre T y C es mayor que el radio 
        if (distanciaPuntosCT > radio) {
            mensaje = "El punto T("+xt+","+yt+") está fuera de la circunferencia";
        }
        // Si la anterior no se cumplió y la distancia entre T y C es igual al radio
        else if (distanciaPuntosCT == radio) {
            mensaje = "El punto T("+xt+","+yt+") está en la circunferencia";
        }
        // Si las dos anteriores no se cumplieron significa que la distancia entre T y C es menor que el radio
        else {
            mensaje = "El punto T("+xt+","+yt+") está dentro de la circunferencia";
        }
        
        // Imprimir el mensaje en la consola
        System.out.println(mensaje);

    }
}
