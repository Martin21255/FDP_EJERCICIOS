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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el número de elementos
        System.out.println("Ingrese el numero de elementos:");
        int n = scanner.nextInt();
        
        // Crear un arreglo para almacenar los elementos
        int[] arreglo = new int[n];
        
        // Ingresar los elementos en el arreglo
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el elemento "+"("+(i+1)+")"+" del arreglo:");
            arreglo[i] = scanner.nextInt();
        }

        // Llamar a la función para obtener el arreglo sin elementos repetidos
        int[] arregloSinRepetidos = eliminarRepetidos(arreglo);
        
        // Imprimir el arreglo sin elementos repetidos
        System.out.println("Arreglo sin elementos repetidos:");
        for (int elemento : arregloSinRepetidos) {
            System.out.print(elemento + " ");
        }
    }

    // Función para eliminar elementos repetidos sin librerías adicionales
    public static int[] eliminarRepetidos(int[] arreglo) {
        int n = arreglo.length;
        int[] arregloTemporal = new int[n];
        int tam = 0;

        for (int i = 0; i < n; i++) {
            boolean repetido = false;
            for (int j = 0; j < tam; j++) {
                if (arreglo[i] == arregloTemporal[j]) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                arregloTemporal[tam++] = arreglo[i];
            }
        }

        // Crear el arreglo final sin elementos repetidos
        int[] arregloSinRepetidos = new int[tam];
        for (int i = 0; i < tam; i++) {
            arregloSinRepetidos[i] = arregloTemporal[i];
        }

        return arregloSinRepetidos;
    }
    
}
