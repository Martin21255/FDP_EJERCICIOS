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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el número de alumnos
        System.out.println("Ingrese el numero de alumnos:");
        int n = scanner.nextInt();

        // Inicializar el arreglo de calificaciones
        int[] calificaciones = new int[n];

        // Llenar el arreglo con las calificaciones
        System.out.println("Ingrese las calificaciones:");
        for (int i = 0; i < n; i++) {
            calificaciones[i] = scanner.nextInt();
        }

        // Calcular y mostrar la media aritmética
        double media = calcularMedia(calificaciones);
        System.out.println("Media aritmetica: " + media);

        // Calcular y mostrar la varianza
        double varianza = calcularVarianza(calificaciones, media);
        System.out.println("Varianza: " + varianza);

        // Calcular y mostrar la desviación estándar
        double desviacionEstandar = Math.sqrt(varianza);
        System.out.println("Desviacion estandar: " + desviacionEstandar);

        // Calcular y mostrar la moda
        int moda = calcularModa(calificaciones);
        System.out.println("Moda: " + moda);
    }

    public static double calcularMedia(int[] arreglo) {
        double suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        return suma / arreglo.length;
    }

    public static double calcularVarianza(int[] arreglo, double media) {
        double sumaDesviaciones = 0;
        for (int i = 0; i < arreglo.length; i++) {
            sumaDesviaciones += Math.pow(arreglo[i] - media, 2);
        }
        return sumaDesviaciones / arreglo.length;
    }

    public static int calcularModa(int[] arreglo) {
        int moda = arreglo[0];
        int maxContador = 0;
        for (int i = 0; i < arreglo.length; i++) {
            int contador = 0;
            for (int j = 0; j < arreglo.length; j++) {
                if (arreglo[j] == arreglo[i]) contador++;
            }
            if (contador > maxContador) {
                maxContador = contador;
                moda = arreglo[i];
            }
        }
        return moda;
    }
}