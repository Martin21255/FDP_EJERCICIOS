/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Unidad3;

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
        Scanner sc = new Scanner(System.in);
        int semestre, promedio;

        System.out.println("Ingresa tu semestre (En numero): ");
        semestre = sc.nextInt();

        System.out.println("Ingresa tu promedio (0-100): ");
        promedio = sc.nextInt();

        if (semestre > 0 && semestre < 4) {
            if (promedio >= 75) {
                System.out.println("El alumno es apto para la beca de Transporte");
            } else {
                System.out.println("El alumno no es apto a ninguna de las becas disponibles");
            }
        }
        if (semestre > 3 && semestre < 10) {
            if (promedio >= 80) {
                System.out.println("El alumno es aptop para la beca de manutencion");
            } else {
                System.out.println("El alumno no es apto a ninguna de las becas disponibles");
            }
        }

    }

}
