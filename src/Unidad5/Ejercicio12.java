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
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int[][] matriz;
        System.out.println("Ingrese el tamano de la matriz (N):");
        n = scanner.nextInt();

        matriz = new int[n][n];

        llenarMatriz(matriz);

        imprimirMatriz(matriz);
    }

    public static void llenarMatriz(int[][] matriz) {
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            matriz[i][i] = 1; // Diagonal principal
            matriz[i][n - 1 - i] = 1; // Diagonal secundaria
        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}