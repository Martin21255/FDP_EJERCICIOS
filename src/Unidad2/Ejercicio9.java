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
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Definicion de variables 
        //Tipo de dato "Scanner"
        Scanner sc = new Scanner(System.in);
        //Tipo de dato "Double"
        double sueldod, sueldoq, imss, isr;
        //Entrada 
        System.out.println("Ingresa tu salario diario: ");
        sueldod = sc.nextDouble();
        
        //Proceso
        sueldoq = sueldod * 15;
        isr = sueldoq * 0.135;
        imss = sueldoq * 0.025;
        //Salida
        System.out.println("Tu salario quincenal es de: " + (sueldoq - isr - imss));
        
    }

}
