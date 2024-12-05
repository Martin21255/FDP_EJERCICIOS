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
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int[][] matriz;
        // Solicitar el tamaño de la matriz
        System.out.println("Ingrese el tamaño de la matriz (N):");
         n = scanner.nextInt();

        // Inicializar y llenar la matriz
        matriz = new int[n][n];
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese los elementos de la fila "+(i+1));
            for (int j = 0; j < n; j++) {
                System.out.println("Ingrese el elemento "+(j+1));
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Verificar si la matriz es simétrica
        boolean esSimetrica = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    esSimetrica = false;
                    break;
                }
            }
        }

        // Mostrar el resultado
        if (esSimetrica) {
            System.out.println("La matriz es simetrica.");
        } else {
            System.out.println("La matriz no es simetrica.");
        }
    }
}
