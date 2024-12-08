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
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;
        int[][] matriz;
        
        System.out.println("Ingrese el tamaño de la matriz (N):");
        n = scanner.nextInt();
        
        matriz = new int[n][n];
        System.out.println("Ingrese los elementos de la matriz:");
        llenarMatriz(matriz, scanner);

        boolean esSimetrica = esMatrizSimetrica(matriz);

        if (esSimetrica) {
            System.out.println("La matriz es simetrica.");
        } else {
            System.out.println("La matriz no es simetrica.");
        }
    }

    public static void llenarMatriz(int[][] matriz, Scanner scanner) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Ingrese los elementos de la fila "+(i+1));
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Ingrese el elemento "+(j+1));
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    public static boolean esMatrizSimetrica(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
