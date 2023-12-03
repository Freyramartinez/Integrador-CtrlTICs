package com.mycompany.proyecto;
import java.util.Scanner;
/**
 *
 * @author Frey
 */
public class Angulo_y_Ecuacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Solicita datos del primer punto
        System.out.println("Ingresa la coordenada x1: ");
        double x1 = sc.nextDouble();
        System.out.println("Ingresa la coordenada y1: ");
        double y1 = sc.nextDouble();
        
        // Solicita datos del segundo punto
        System.out.println("Ingresa la coordenada x2: ");
        double x2 = sc.nextDouble();
        System.out.println("Ingresa la coordenada y2: ");
        double y2 = sc.nextDouble();
        
        // Calcula la diferencia entre coordenadas
        double dx = x2 - x1;
        double dy = y2 - y1;
        
        // Calcula la pendiente y la intersección con el eje y
        double pendiente = dy / dx;
        double interseccionY = y1 - pendiente * x1;
        
        // Calcula el ángulo en radianes
        double anguloR = Math.atan2(dy, dx);
        
        // Convierte el ánguloR a grados
        double anguloG = Math.toDegrees(anguloR);
        
        // Imprime la ecuación y el ángulo interno
        System.out.println("La ecuación de la recta es: y = " + pendiente + "x + " + interseccionY);
        System.out.println("El ángulo interno entre la recta y el eje horizontal es: " + anguloG + " grados");
    }
}