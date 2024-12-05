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
public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radio;
        
        System.out.println("Ingresa el radio del circulo: ");
        radio = sc.nextDouble();
        
        System.out.println("El area del circulo es: " + Math.PI * Math.pow(radio, 2));
    }
    
}
