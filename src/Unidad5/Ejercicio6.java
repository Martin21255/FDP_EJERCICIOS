/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Unidad5;

import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,valor,resultado;
        int[] arreglo;
        
        System.out.println("Ingrese el tamano del arreglo:");
        n = scanner.nextInt();
        
        arreglo = new int[n];
        System.out.println("Ingrese los elementos del arreglo:");
        llenarArreglo(arreglo, scanner);
     
        System.out.println("Ingrese el valor a buscar:");
        valor = scanner.nextInt();
        resultado = busquedaBinaria(arreglo, valor);

        if (resultado == -1) {
            System.out.println("El valor no se encuentra en el arreglo.");
        } else {
            System.out.println("El valor se encuentra en la posicion: " + resultado);
        }
    }

    public static void llenarArreglo(int[] arreglo, Scanner scanner) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = scanner.nextInt();
        }
    }

    public static int busquedaBinaria(int[] arreglo, int valor) {
        int izquierda = 0;
        int derecha = arreglo.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            if (arreglo[medio] == valor) {
                return medio;
            }

            if (arreglo[medio] < valor) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }

        return -1;
    }
}
