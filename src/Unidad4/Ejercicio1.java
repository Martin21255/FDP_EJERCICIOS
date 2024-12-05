/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Unidad4;

import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] nums = new double [10];
        double suma=0;
        //Ingreso de 10 valores de tipo real
        for(int i=0; i <nums.length;i++){
            System.out.println("Ingrese valor " + (i+1)+":");
            nums[i] = sc.nextDouble();
            //Se va sumando el cuadrado de cada valor ingresado
            suma = suma + Math.pow(nums[i],2);
        }
        System.out.println("La suma de los cuadrados de los valores del array es: " + suma);
    }
    
}
