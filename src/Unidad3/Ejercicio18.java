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
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnum, num,contp=0,contn=0,ceros=0;
        System.out.println("Ingresa la cantidad de numeros a leer");
        cnum = sc.nextInt();
        for(int i=1;i<=cnum;i++){
            System.out.println("Ingresa el numero " + i + ":");
            num = sc.nextInt();
            
            if (num>0)
                contp++;
            else if(num<0)
                contn++;
            else
                ceros++;
        }
        System.out.println("Cantidad de numeros positivos: " + contp);
        System.out.println("Cantidad de numeros negativos: " + contn);
        System.out.println("Cantidad de ceros: " + ceros);
    }
    
}
