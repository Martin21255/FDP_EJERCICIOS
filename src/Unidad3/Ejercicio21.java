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
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x,termino,seno;
        int n;
        System.out.print("Introduce un numero: ");
        x = sc.nextDouble();

        termino = x;  
        seno = termino; 
        n = 1;

        
        while (Math.abs(termino) > 0.001) {
            termino = -termino * x * x / ((2 * n) * (2 * n + 1));
            seno += termino;
            n++;
        }

        
        System.out.println("El seno de " + x + " es: " + seno);
    }
}

    


