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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Definicion de variables
        //Tipo de dato "Scanner"
        Scanner sc = new Scanner(System.in);
        double b,h,area;
        //Entrada
        System.out.println("Ingresa la base del Triangulo: ");
        b = sc.nextDouble();
        System.out.println("Ingresa la altura del Triangulo: ");
        h = sc.nextDouble();
        //Proceso
        area = (b*h)/2;
        //Salida
        System.out.println("El area del Triangulo es: "+area);
    }
    
}
