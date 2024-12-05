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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int calificacion;
        
        System.out.println("Ingresa tu calificacion: ");
        calificacion= sc.nextInt();
        if (calificacion>=70)
            System.out.println("Aprobado");
        else 
            System.out.println("Reprobado");
    }
    
}
