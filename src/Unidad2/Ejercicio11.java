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
public class Ejercicio11 {
    
    public static int sumar_numeros( int a , int b){
        return a + b;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Definicion de variables
        //Tipo de dato "Scanner"
        Scanner sc = new Scanner(System.in);
        //Tipo de dato "Entero"
        int num1,num2;
        //ENtrada 
        System.out.println("Ingrese el numero 1: ");
        num1 =  sc.nextInt();
        System.out.println("Ingresa el numero 2: ");
        num2 = sc.nextInt();
        //Salida 
        System.out.println("El resultado de la suma es: " + sumar_numeros(num1,num2));
        
    }
    
}
