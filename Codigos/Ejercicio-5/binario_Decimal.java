package proyectointegrador;
/**
 * @author Eduardo
 */
// Se importa la clase Scanner
import java.util.Scanner;
public class binario_Decimal {    
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
// Se le pide al usuario que ingrese un número binario.
    System.out.println("Ingrese por favor el número binario (solo están permitidos 0 y 1): ");
    String binario = sc.nextLine();
    
    // Condición para verificar que solo se hayan ingresado los caracteres 0 y 1.
    if (!validarBin(binario)) {
        System.out.println("Error: El número binario ingresado contiene dígitos no válidos.");
        return;
    }

    int decimal = convertirBin(binario);

    System.out.println("La conversión a número decimal es: " + decimal);
}

// Método para convertir un número binario a decimal.
public static int convertirBin(String binario) {
    int decimal = 0;
    int longitud = binario.length();
    int exponente = longitud - 1;

    for (int i = 0; i < longitud; i++) {
        char digito = binario.charAt(i);
        int valor = Character.getNumericValue(digito);
        decimal += valor * Math.pow(2, exponente);
        exponente--;
    }

    return decimal;
}

// Método para validar si un número binario solo contiene los caracteres 0 y 1.
public static boolean validarBin(String binario) {
    for (int i = 0; i < binario.length(); i++) {
        char digito = binario.charAt(i);
        if (digito != '0' && digito != '1') {
            return false;
        }
    }
    return true;
  }
}