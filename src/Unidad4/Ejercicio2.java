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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n;
         int[] arreglo;
        
        // Solicitar el número de elementos
        System.out.println("Ingrese el numero de elementos:");
         n = scanner.nextInt();
        
        // Crear un arreglo para almacenar los elementos
        arreglo = new int[n];
        
        // Ingresar los elementos en el arreglo
        for (int i = 0; i < n; i++) {
             System.out.println("Ingrese el elemento "+"("+(i+1)+")"+" del arreglo:");
            arreglo[i] = scanner.nextInt();
        }

        // Eliminar elementos repetidos
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

        // Imprimir el arreglo sin elementos repetidos
        System.out.println("Arreglo sin elementos repetidos:");
        for (int i = 0; i < tam; i++) {
            System.out.print(arregloTemporal[i] + " ");
        }
    }
}

   