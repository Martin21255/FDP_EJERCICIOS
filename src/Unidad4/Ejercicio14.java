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
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        double[][] calificaciones;
        // Solicitar el número de alumnos
        System.out.println("Ingrese el numero de alumnos:");
         n = scanner.nextInt();

        // Inicializar el arreglo de calificaciones
         calificaciones = new double[n][4];

        // Llenar el arreglo con las calificaciones
        System.out.println("Ingrese las calificaciones de los alumnos:");
        for (int i = 0; i < n; i++) {
            System.out.println("Alumno " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                System.out.println("Calificacion del Examen " + (j + 1) + ":");
                calificaciones[i][j] = scanner.nextDouble();
            }
        }

        // Calcular y mostrar el promedio de cada alumno
        System.out.println("Promedio de cada alumno:");
        for (int i = 0; i < n; i++) {
            double suma = 0;
            for (int j = 0; j < 4; j++) {
                suma += calificaciones[i][j];
            }
            double promedio = suma / 4;
            System.out.println("Alumno " + (i + 1) + ": " + promedio);
        }

        // Calcular y mostrar el promedio del grupo en cada examen
        System.out.println("Promedio del grupo en cada examen:");
        for (int j = 0; j < 4; j++) {
            double suma = 0;
            for (int i = 0; i < n; i++) {
                suma += calificaciones[i][j];
            }
            double promedio = suma / n;
            System.out.println("Examen " + (j + 1) + ": " + promedio);
        }

        // Calcular y mostrar el examen con mayor promedio
        double maxPromedio = 0;
        int examenMayorPromedio = 0;
        for (int j = 0; j < 4; j++) {
            double suma = 0;
            for (int i = 0; i < n; i++) {
                suma += calificaciones[i][j];
            }
            double promedio = suma / n;
            if (promedio > maxPromedio) {
                maxPromedio = promedio;
                examenMayorPromedio = j;
            }
        }
        System.out.println("El examen con mayor promedio es el Examen " + (examenMayorPromedio + 1));

        // Calcular y mostrar el número de alumnos aprobados en cada examen
        System.out.println("Numero de alumnos aprobados en cada examen:");
        for (int j = 0; j < 4; j++) {
            int aprobados = 0;
            for (int i = 0; i < n; i++) {
                if (calificaciones[i][j] >= 70 && calificaciones[i][j] <= 100) {
                    aprobados++;
                }
            }
            System.out.println("Examen " + (j + 1) + ": " + aprobados + " alumnos aprobados.");
        }
    }
}
