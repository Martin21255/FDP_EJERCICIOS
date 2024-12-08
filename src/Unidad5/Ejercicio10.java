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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz, traspuesta;

        matriz = setTamanioMatriz();
        traspuesta = new int[matriz[0].length][matriz.length];
        matriz = llenarMatriz(matriz);
        traspuesta = matrizTraspuesta(matriz, traspuesta);
        imprimirMatriz("MATRIZ ORIGINAL", matriz);
        imprimirMatriz("MATRIZ TRASPUESTA", traspuesta);
    }

    public static int[][] setTamanioMatriz(){
        Scanner lector = new Scanner(System.in);
        int[][] matriz;
        int f, c;

        System.out.println("Tamaño de la matriz");
        System.out.println("Filas:");
        f = lector.nextInt();
        System.out.println("Columnas:");
        c = lector.nextInt();
        matriz = new int[f][c];
        return matriz;
    }

    public static int[][] llenarMatriz(int[][] matriz) {
        Scanner lector = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Ingrese elemento (" + (i + 1) + "," + (j + 1) + "): ");
                matriz[i][j] = lector.nextInt();
            }
        }
        return matriz;
    }

    public static int[][] matrizTraspuesta(int[][] matriz, int[][] traspuesta) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                traspuesta[j][i] = matriz[i][j];
            }
        }
        return traspuesta;
    }

    public static void imprimirMatriz(String mensaje, int[][] matriz) {
        System.out.println("\n" + mensaje);
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println("");
        }
    }

}


