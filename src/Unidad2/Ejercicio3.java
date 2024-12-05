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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Definicion de variables 
        //Tipo de dato "Scanner"
        Scanner sc = new Scanner(System.in);
        //Tipo de dato "Double"
        double basema, baseme, altura, area;
        //Entrada
        System.out.println("Ingresa la base mayor del trapecio: ");
        basema = sc.nextDouble();
        System.out.println("Ingresa la base menor del trapecio: ");
        baseme = sc.nextDouble();
        System.out.println("Ingresa la altura del Trapecio: ");
        altura = sc.nextDouble();
        //Proceso
        area = ((basema + baseme) * altura) / 2;
        //Salida 
        System.out.println("El area del Trapecio es: " + area);

    }

}
