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
public class Ejercicio8 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double divisor,dividendo;
       
        System.out.println("**Programa de divisiones**");
        
        System.out.println("Ingresa el dividendo: ");
        dividendo = sc.nextDouble();
        System.out.println("Ingresa el divisor: ");
        divisor = sc.nextDouble();
        
        if(divisor==0){
            System.out.println("Esa no es una division valida, alcornoque");
        }
        else
            System.out.println("El resultado de la division es: "+ (dividendo/divisor));
    }
    
}
