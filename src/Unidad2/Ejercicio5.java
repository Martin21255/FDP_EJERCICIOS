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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion de variables
        // Tipo de dato "Scanner"
        Scanner sc = new Scanner(System.in);
        //Tipo de dato "Double"
        double perimetro, area, lado, apotema;
        //Entrada 
        System.out.println("Ingresa el lado del pentagono: ");
        lado = sc.nextDouble();
        System.out.println("Ingresa el apotema del pentagono: ");
        apotema = sc.nextDouble();
        //Proceso
        perimetro = lado * 5;
        area = (perimetro * apotema) / 2;
        //Salida
        System.out.println("El perimetro del pentagono es: " + perimetro);
        System.out.println("El area del pentagono es: " + area);

    }

}
