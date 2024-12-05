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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int[] calificaciones;
        // Solicitar el número de alumnos
        System.out.println("Ingrese el numero de alumnos:");
        n = scanner.nextInt();

        // Inicializar el arreglo de calificaciones
        calificaciones = new int[n];

        // Llenar el arreglo con las calificaciones
        System.out.println("Ingrese las calificaciones:");
        for (int i = 0; i < n; i++) {
            calificaciones[i] = scanner.nextInt();
        }

        // Calcular la media aritmética
        double suma = 0;
        for (int i = 0; i < n; i++) {
            suma += calificaciones[i];
        }
        double media = suma / n;
        System.out.println("Media aritmetica: " + media);

        // Calcular la varianza
        double sumaDesviaciones = 0;
        for (int i = 0; i < n; i++) {
            sumaDesviaciones += Math.pow(calificaciones[i] - media, 2);
        }
        double varianza = sumaDesviaciones / n;
        System.out.println("Varianza: " + varianza);

        // Calcular la desviación estándar
        double desviacionEstandar = Math.sqrt(varianza);
        System.out.println("Desviacion estandar: " + desviacionEstandar);

        // Calcular la moda
        int moda = calificaciones[0];
        int maxContador = 0;
        for (int i = 0; i < n; i++) {
            int contador = 0;
            for (int j = 0; j < n; j++) {
                if (calificaciones[j] == calificaciones[i]) contador++;
            }
            if (contador > maxContador) {
                maxContador = contador;
                moda = calificaciones[i];
            }
        }
        System.out.println("Moda: " + moda);
    }
}
