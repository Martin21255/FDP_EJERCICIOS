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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int n,m;
        Scanner scanner = new Scanner(System.in);

        // Solicitar el tamaño de los arreglos
        System.out.println("Ingrese el tamano del primer arreglo:");
        n = scanner.nextInt();
        System.out.println("Ingrese el tamano del segundo arreglo:");
        m = scanner.nextInt();

        // Inicializar los arreglos
        int[] arreglo1 = new int[n];
        int[] arreglo2 = new int[m];

        // Llenar los arreglos con datos del usuario
        System.out.println("Ingrese los elementos del primer arreglo:");
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el elemento ("+(i+1)+") del primer arreglo");
            arreglo1[i] = scanner.nextInt();
        }
        System.out.println("Ingrese los elementos del segundo arreglo:");
        for (int i = 0; i < m; i++) {
            System.out.println("Ingrese el elemento ("+(i+1)+") del segundo arreglo");
            arreglo2[i] = scanner.nextInt();
        }

        // Mezclar los arreglos
        int[] arregloMezclado = new int[n + m];
        int index = 0;

        for (int i = 0; i < n; i++) {
            arregloMezclado[index++] = arreglo1[i];
        }
        for (int i = 0; i < m; i++) {
            arregloMezclado[index++] = arreglo2[i];
        }

        // Ordenar el arreglo mezclado en forma descendente
        for (int i = 0; i < arregloMezclado.length - 1; i++) {
            for (int j = 0; j < arregloMezclado.length - 1 - i; j++) {
                if (arregloMezclado[j] < arregloMezclado[j + 1]) {
                    int temp = arregloMezclado[j];
                    arregloMezclado[j] = arregloMezclado[j + 1];
                    arregloMezclado[j + 1] = temp;
                }
            }
        }

        // Imprimir el arreglo resultado
        System.out.println("Arreglo mezclado y ordenado:");
        for (int i = 0; i < arregloMezclado.length; i++) {
            System.out.print(arregloMezclado[i] + " ");
        }
    }
}