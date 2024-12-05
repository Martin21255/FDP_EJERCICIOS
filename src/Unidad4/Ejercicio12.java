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
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int matriz[][];
        // Solicitar el tamaño de la matriz
        System.out.println("Ingrese el tamano de la matriz (N):");
         n = scanner.nextInt();

        // Inicializar la matriz
        matriz = new int[n][n];

        // Llenar la matriz con 1 en las diagonales y 0 en el resto
        for (int i = 0; i < n; i++) {
            matriz[i][i] = 1; // Diagonal principal
            matriz[i][n - 1 - i] = 1; // Diagonal secundaria
        }

        // Imprimir la matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}