
package Unidad2;

import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion de variables
        //Tipo de dato "Scanner"
        Scanner sc = new Scanner(System.in);
        int num1, num2, suma;
        //Entrada
        System.out.println("Ingresa el numero 1: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el numero 2");
        num2 = sc.nextInt();
        //Proceso
        suma = num1 + num2;
        //Salida
        System.out.println("El resultado de la suma es: " + suma);

    }

}
