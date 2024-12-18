/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Unidad4;

/**
 *
 * @author Martin
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Inicializar la matriz con valores predefinidos
        int filas,columnas;
        int[] sumas ;
        int[][] matriz = {
            {1, 2, 3, 4, 5, 6},
            {7, 8, 9, 10, 11, 12},
            {13, 14, 15, 16, 17, 18},
            {19, 20, 21, 22, 23, 24},
            {25, 26, 27, 28, 29, 30},
            {31, 32, 33, 34, 35, 36}
        };

        // Calcular la suma de las columnas
        columnas = matriz[0].length;
        filas = matriz.length;
        sumas = new int[columnas];

        for (int j = 0; j < columnas; j++) {
            for (int i = 0; i < filas; i++) {
                sumas[j] += matriz[i][j];
            }
        }

        // Imprimir el resultado
        System.out.println("Suma de cada columna:");
        for (int j = 0; j < columnas; j++) {
            System.out.println("Columna " + (j + 1) + ": " + sumas[j]);
        }
    }
}
