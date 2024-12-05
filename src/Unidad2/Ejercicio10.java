/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Unidad2;

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
        //Definicion de variables
        //Tipo de dato "Scanner"
        Scanner sc = new Scanner(System.in);
        //Tipo de dato "Double"
        double cal_ex, cal_inv, cal_rep, calfinal;
        //Entrada
        System.out.println("Ingresa los valores en una escala de 0 - 100");
        System.out.println("Ingresa tu calificacion del examen: ");
        cal_ex = sc.nextDouble();
        System.out.println("Ingresa tu calificacion de la investigacion: ");
        cal_inv = sc.nextDouble();
        System.out.println("Ingresa tu calificacion del reporte: ");
        cal_rep = sc.nextDouble();
        //Proceso
        calfinal = (cal_ex * 0.40) + (cal_inv * 0.30) + (cal_rep * 0.30);
        //Salida
        System.out.println("Tu calificacion final es de: " + calfinal);
    }

}
