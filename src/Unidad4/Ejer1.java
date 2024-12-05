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
public class Ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numMaterias;
        double calificacion[], suma = 0, promedio;
        
        System.out.println("Numero de materias: ");
        numMaterias = sc.nextInt();
        calificacion = new double[numMaterias];
        
        for (int i = 0; i < numMaterias; i++) {
            System.out.println("Calificacion de la materia " + (i + 1) + ": ");
            calificacion[i] = sc.nextDouble();
            suma += calificacion[i];
        }
        promedio = suma / numMaterias;
        System.out.println("El promedio de calificacion es: " + promedio);
    }

}
