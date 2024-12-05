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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Definicion de variables
        //Tipo de dato "Scanner"
        Scanner sc = new Scanner(System.in);
        //Tipo de dato "Double"
        double maxpuntos, porcentaje, puntos, rc, ri, rb;
        //Entrada 
        System.out.println("Ingresa el numero de respuestas correctas: ");
        rc = sc.nextDouble();

        System.out.println("Ingresa el numero de respuestas incorrectas: ");
        ri = sc.nextDouble();

        System.out.println("Ingresa el numero de respuestas en blanco: ");
        rb = sc.nextDouble();

        //Proceso
        maxpuntos = (rc + ri + rb) * 5;
        puntos = (rc * 5) + (ri * (-2)) + (rb * 0);
        porcentaje = (puntos / maxpuntos) * 100;

        //Salida 
        System.out.println("El porcentaje obtenido en el examen es del " + porcentaje + "%");

    }

}
