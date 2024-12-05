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
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        // Solicitar el número de alumnos
        System.out.println("Ingrese el numero de alumnos:");
        int n = scanner.nextInt();

        // Inicializar el arreglo de calificaciones
        double[][] calificaciones = new double[n][4];

        // Llenar el arreglo con las calificaciones
        System.out.println("Ingrese las calificaciones de los alumnos:");
        llenarCalificaciones(calificaciones, scanner);

        // Calcular y mostrar el promedio de cada alumno
        System.out.println("Promedio de cada alumno:");
        calcularPromedioAlumnos(calificaciones);

        // Calcular y mostrar el promedio del grupo en cada examen
        System.out.println("Promedio del grupo en cada examen:");
        calcularPromedioExamenes(calificaciones);

        // Calcular y mostrar el examen con mayor promedio
        int examenMayorPromedio = calcularExamenMayorPromedio(calificaciones);
        System.out.println("El examen con mayor promedio es el Examen " + (examenMayorPromedio + 1));

        // Calcular y mostrar el número de alumnos aprobados en cada examen
        System.out.println("Número de alumnos aprobados en cada examen:");
        calcularAprobadosExamenes(calificaciones);
    }

    public static void llenarCalificaciones(double[][] calificaciones, Scanner scanner) {
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Alumno " + (i + 1) + ":");
            for (int j = 0; j < calificaciones[i].length; j++) {
                System.out.println("Calificacion del Examen " + (j + 1) + ":");
                calificaciones[i][j] = scanner.nextDouble();
            }
        }
    }

    public static void calcularPromedioAlumnos(double[][] calificaciones) {
        for (int i = 0; i < calificaciones.length; i++) {
            double suma = 0;
            for (int j = 0; j < calificaciones[i].length; j++) {
                suma += calificaciones[i][j];
            }
            double promedio = suma / calificaciones[i].length;
            System.out.println("Alumno " + (i + 1) + ": " + promedio);
        }
    }

    public static void calcularPromedioExamenes(double[][] calificaciones) {
        for (int j = 0; j < 4; j++) {
            double suma = 0;
            for (int i = 0; i < calificaciones.length; i++) {
                suma += calificaciones[i][j];
            }
            double promedio = suma / calificaciones.length;
            System.out.println("Examen " + (j + 1) + ": " + promedio);
        }
    }

    public static int calcularExamenMayorPromedio(double[][] calificaciones) {
        double maxPromedio = 0;
        int examenMayorPromedio = 0;
        for (int j = 0; j < 4; j++) {
            double suma = 0;
            for (int i = 0; i < calificaciones.length; i++) {
                suma += calificaciones[i][j];
            }
            double promedio = suma / calificaciones.length;
            if (promedio > maxPromedio) {
                maxPromedio = promedio;
                examenMayorPromedio = j;
            }
        }
        return examenMayorPromedio;
    }

    public static void calcularAprobadosExamenes(double[][] calificaciones) {
        for (int j = 0; j < 4; j++) {
            int aprobados = 0;
            for (int i = 0; i < calificaciones.length; i++) {
                if (calificaciones[i][j] >= 70 && calificaciones[i][j] <= 100) {
                    aprobados++;
                }
            }
            System.out.println("Examen " + (j + 1) + ": " + aprobados + " alumnos aprobados.");
        }
    }
}
