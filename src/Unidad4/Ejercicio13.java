/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Unidad4;

/**
 *
 * @author Martin
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int filas,columnas;
        // Definir la matriz de 4x5 con elementos fijos de tipo String
        String[][] matriz = {
            {"La", "vida", "no", "es", "la"},
            {"momentos", "que", "te", "dejan", "cantidad"},
            {"los", "Hitch", "aliento.", "sin", "de"},
            {"sino", ",", "respiras", "que", "veces"}
        };

        // Imprimir la matriz por filas
        System.out.println("Impresión por filas:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }

        // Imprimir la matriz en espiral
        System.out.println("\nImpresión en espiral:");
         filas = matriz.length;
         columnas = matriz[0].length;
        int inicioFila = 0, finFila = filas - 1;
        int inicioColumna = 0, finColumna = columnas - 1;

        while (inicioFila <= finFila && inicioColumna <= finColumna) {
            for (int i = inicioColumna; i <= finColumna; i++) {
                System.out.print(matriz[inicioFila][i] + " ");
            }
            inicioFila++;

            for (int i = inicioFila; i <= finFila; i++) {
                System.out.print(matriz[i][finColumna] + " ");
            }
            finColumna--;

            if (inicioFila <= finFila) {
                for (int i = finColumna; i >= inicioColumna; i--) {
                    System.out.print(matriz[finFila][i] + " ");
                }
                finFila--;
            }

            if (inicioColumna <= finColumna) {
                for (int i = finFila; i >= inicioFila; i--) {
                    System.out.print(matriz[i][inicioColumna] + " ");
                }
                inicioColumna++;
            }
        }
    }
}