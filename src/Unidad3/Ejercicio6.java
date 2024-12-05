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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Ingresa un numero entero cualquiera: ");
        numero = sc.nextInt();
        if (numero>=0){
            System.out.println("Tu numero es positivo");
        }
        else
            System.out.println("Tu numero es negativo");
    }
    
}
