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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        System.out.println("Programa que determina si Ud es mayor de edad");
        System.out.println("Ingrese su edad");
        edad = sc.nextInt();
        
        System.out.println("Solucion de israel");
        if (edad >=18){
            System.out.println("Eres mayor de edad. Te voy a llevar a un VIP");
        
        }
        else{
            System.out.println("Eres menor de edad");
        }
     
        System.out.println("\nSolucion de yamir y christopher");
        
        if(edad<18){
            System.out.println("Eres MENOR de edad");
            
        }
        else{
            System.out.println("Eres MAYOR de edad");
            
        }
        
        System.out.println("\nSolucion de diego");
        
        if(edad<17){
            System.out.println("Eres mayor de edad");
        }
        else{
            System.out.println("Ve anda, mira, te habla tu mami. \nNo quiero ir a la carcel");
        }
        
    }
    
}
