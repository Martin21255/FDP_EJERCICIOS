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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion de variables
        //Tipo de dato "Scanner"
        Scanner sc = new Scanner(System.in);
        //Tipo de dato "Double"
        double c, f, k, r;
        //Entrada
        System.out.println("Ingresa el valor en grados Celsius: ");
        c = sc.nextDouble();
        //Proceso
        f = (c * 1.8) + 32;
        k = c + 273.15;
        r = (c + 273.15)*1.8;
        
        //Salida
        System.out.println("El valor " + c + " en grados Celsius equivale a:");
        System.out.println( f + " grados fahrenheit");
        System.out.println( k + " grados kelvin");
        System.out.println( r + " grados rankine");
        
    }

}
