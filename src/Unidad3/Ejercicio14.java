/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Unidad3;

/**
 *
 * @author Martin
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int j=4;
        int k=5;   
        System.out.println("|| CICLOS ||");
        System.out.println("\nCICLO FOR:");
        for(int i = 1; i<=10;i++){
            System.out.print(i + " ");
        }
        
        System.out.println("\nCICLO WHILE:");
        while(j<25){
        System.out.print(j + " ");
        j+=4;
            }
        System.out.println("\nCICLO DO WHILE:");
        do{
            System.out.print(k + " ");
            k--;
        }while(k>=1);
        
        System.out.println("\n");
    }
    
}
