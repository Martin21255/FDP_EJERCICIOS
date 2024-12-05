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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz, traspuesta;
        int f, c;

        //Se define el tamanio de la matriz
        System.out.println("Tamano de la matriz");
        System.out.println("Filas: ");
        f = sc.nextInt();
        System.out.println("Columnas: ");
        c = sc.nextInt();
        matriz = new int[f][c];
        traspuesta = new int[c][f];
        //Observa ahora que la cantidad de columnas ahora hace referencia a la cantidad de filas
        // y la cantidad de filas hace referencia a la cantidad de columans

        //Se ingresan los valores de la matriz original
        //Con el codigo matriz.length se obtiene el numero de filas
        //Con el codigo matriz[0].lenth se obtiene el numero de columas
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Ingrese elemento (" + (i + 1) + "," + (j + 1) + "):");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Se realiza la matriz traspuesta
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                traspuesta[j][i] = matriz[i][j];
            }
        }

        // Impresión de la matriz original
        System.out.println("\nMATRIZ ORIGINAL");
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println("");
        }

        // Impresión de la matriz traspuesta
        System.out.println("\nMATRIZ TRASPUESTA");
        for (int[] fila : traspuesta) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println("");
        }

    }

}
