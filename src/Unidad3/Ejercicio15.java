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
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nMaterias,calificacion=0,suma,promedio;
        
        System.out.println("Ingresa el numero de materias: ");
        nMaterias = sc.nextInt();
        
        for(int i=1; i<=nMaterias;i++){
            System.out.println("Ingresa la calificacion de la materia " + i +":");
            suma = sc.nextInt();
            calificacion = calificacion + suma;
        }
        promedio = calificacion/nMaterias;
        System.out.println("El promedio es: "+promedio);
    }
    
}
