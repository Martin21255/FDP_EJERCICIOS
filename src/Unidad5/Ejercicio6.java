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

        // Solicitar el tamaño del arreglo
        System.out.println("Ingrese el tamano del arreglo:");
        int n = scanner.nextInt();

        // Inicializar y llenar el arreglo
        int[] arreglo = new int[n];
        System.out.println("Ingrese los elementos del arreglo:");
        llenarArreglo(arreglo, scanner);

        // Solicitar el valor a buscar
        System.out.println("Ingrese el valor a buscar:");
        int valor = scanner.nextInt();

        // Realizar la búsqueda binaria
        int resultado = busquedaBinaria(arreglo, valor);

        // Mostrar el resultado
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

            // Verificar si el valor está en el medio
            if (arreglo[medio] == valor) {
                return medio;
            }

            // Si el valor es mayor, ignorar la mitad izquierda
            if (arreglo[medio] < valor) {
                izquierda = medio + 1;
            } else {
                // Si el valor es menor, ignorar la mitad derecha
                derecha = medio - 1;
            }
        }

        // Si el valor no está presente en el arreglo
        return -1;
    }
}
