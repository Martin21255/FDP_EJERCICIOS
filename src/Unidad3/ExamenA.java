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
public class ExamenA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        byte numero, i=1;
        System.out.println("Ungrese un numero: ");
        numero = entrada.nextByte();
        System.out.println("Que hace este programa?");
        while(i<=11){
            System.out.println(i+" x " + numero + " = " + (i*numero));
            i++;
        }
    }
    
}
