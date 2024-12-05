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
public class Ejercicio12 {

   
    public static double areat(double b, double h) {
        return (b * h) / 2;
    }

    public static double perimetror(double b, double h) {
        return (b + h) * 2;
    }

    public static void main(String[] args) {
        //Definicion de variables 
        //Tipo de dato "Scanner"
        Scanner sc = new Scanner(System.in);
        //Tipo de dato "Double"
        double baset, alturat, baser, alturar;

        //Entrada 
        System.out.println("Ingresa la base del triangulo: ");
        baset = sc.nextDouble();
        System.out.println("Ingresa la altura del triangulo: ");
        alturat = sc.nextDouble();

        //Salida
        System.out.println("El area del triangulo es: " + areat(baset, alturat));

        //Entrada
        System.out.println("Ingresa la base del rectangulo: ");
        baser = sc.nextDouble();
        System.out.println("Ingresa la altura del rectangulo: ");
        alturar = sc.nextDouble();

        //Salida 
        System.out.println("El perimetro del rectangulo es: " + perimetror(baser, alturar));
    }

}
