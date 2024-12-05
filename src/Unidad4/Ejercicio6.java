/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Unidad4;
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
        int n;
        int[] arreglo;
        // Solicitar el tamaño del arreglo
        System.out.println("Ingrese el tamano del arreglo:");
        n = scanner.nextInt();

        // Inicializar y llenar el arreglo
         arreglo = new int[n];
        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            arreglo[i] = scanner.nextInt();
        }

        // Solicitar el valor a buscar
        System.out.println("Ingrese el valor a buscar:");
        int valor = scanner.nextInt();

        // Realizar la búsqueda binaria
        int izquierda = 0;
        int derecha = n - 1;
        int resultado = -1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            // Verificar si el valor está en el medio
            if (arreglo[medio] == valor) {
                resultado = medio;
                break;
            }

            // Si el valor es mayor, ignorar la mitad izquierda
            if (arreglo[medio] < valor) {
                izquierda = medio + 1;
            } else {
                // Si el valor es menor, ignorar la mitad derecha
                derecha = medio - 1;
            }
        }

        // Mostrar el resultado
        if (resultado == -1) {
            System.out.println("El valor no se encuentra en el arreglo.");
        } else {
            System.out.println("El valor se encuentra en la posicion: " + resultado);
        }
    }
}