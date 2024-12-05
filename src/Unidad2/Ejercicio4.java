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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Definicion de variables 
        //Tipo de dato "Scanner"
        Scanner sc = new Scanner(System.in);
        //Tipo de dato "Entero"
        int base, altura, perimetro;
        //Entrada
        System.out.println("Ingresa la base del rectangulo: ");
        base = sc.nextInt();
        System.out.println("Ingresa la altura del rectangulo");
        altura = sc.nextInt();
        //Proceso
        perimetro = (base + altura) * 2;
        //Salida
        System.out.println("El perimetro del rectangulo es: " + perimetro);
    }

}
