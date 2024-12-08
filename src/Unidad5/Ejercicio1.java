/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Unidad5;
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
        // Se define el arreglo de tamaño 10
        double[] nums = new double[10];

        // Se invoca a la función llenarArreglo y se pasa como parámetro al arreglo "nums"
        nums = llenarArreglo(nums);

        // Se invoca y se imprime el resultado de la función sumaCuadrados
        System.out.println("La suma de los cuadrados de los valores contenidos en el array son: " + sumaCuadrados(nums));
    }
    

    // Se ingresan los valores de tipo real al arreglo
    public static double[] llenarArreglo(double[] nums) {
        Scanner lector = new Scanner(System.in);
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Ingrese valor " + (i + 1) + ":");
            nums[i] = lector.nextDouble();
        }
        return nums;
    }
    
    public static double sumaCuadrados(double[] nums) {
    double suma = 0;
    for (int i = 0; i < nums.length; i++) {
        // Se va sumando el cuadrado de cada valor ingresado
        suma = suma + Math.pow(nums[i], 2);
    }
    return suma;
}


}

