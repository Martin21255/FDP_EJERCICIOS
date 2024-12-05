/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Unidad3;

/**
 *
 * @author Martin
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int x = 181;
       int y = 125;
       boolean comparacion = (x<y); //false
        System.out.println("x es menor que y: "+ comparacion);
       
        comparacion = (x>y); //true
        System.out.println("x es mayor que y: " + comparacion);
        
        comparacion = (x==y); //false
        System.out.println("x es igual que y: " + comparacion);
        
        comparacion = (x!=y); //true
        System.out.println("x es diferente de y: " + comparacion);
        
        comparacion = (x<=y); //false
        System.out.println("x es menor o igual que y: " + comparacion);
        
        comparacion = (x>=y); //true
        System.out.println("x es mayor o igual que y: " + comparacion);
    }
    
}
