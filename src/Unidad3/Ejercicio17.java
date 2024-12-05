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
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ntabla;
        
        System.out.println("Ingresa el numero de la tabla que quieres generar: ");
        ntabla = sc.nextInt();

        
        for (int i=1;i<=10;i++) {
            System.out.println(ntabla + " * " + i + " = " + (ntabla*i));
        }
    }
    
}
