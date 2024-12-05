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
public class Ejercicio17 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,aux;
        
        System.out.println("Ingresa un valor para 'a': ");
        a = sc.nextInt();
        System.out.println("Ingresa un valor para 'b': ");
        b = sc.nextInt();
        
        aux = a;
        a = b;
        b = aux;
        
        System.out.println("Los valores de a y b son: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    
}
