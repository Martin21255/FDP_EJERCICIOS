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
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vInicial,vFinal;
        
        do{
            System.out.println("Ingresa el valor inicial: ");
            vInicial=sc.nextInt();
            System.out.println("Ingresa el valor final: ");
            vFinal=sc.nextInt();
                        
        }while(vInicial<vFinal+5);
        
        
        while(vInicial >= vFinal){
            System.out.println(" " + vInicial);
            vInicial = vInicial-5;
        } 
    }
}
