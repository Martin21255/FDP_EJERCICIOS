/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Unidad3;

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
        Scanner sc = new Scanner(System.in);
        int edad;
        System.out.println("Ingresa tu edad: ");
        edad = sc.nextInt();
        //IF ANIDADOS
        if (edad>=18 && edad<30){
            System.out.println("Ya puedes votar");
        }
        else if(edad>=30 && edad <65){
            System.out.println("Ya casate y ten hijos");
        
        }
        else if(edad>=65){
            System.out.println("Ya puedes cobrar la ayuda del bienestar");
        }
    }
    
}
