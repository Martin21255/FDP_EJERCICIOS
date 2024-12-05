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
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0, contador = 0;
        boolean check = true;
        do {
            if (contador == 0) {
                System.out.println("Ingresa un numero entero positivo: ");
                n = sc.nextInt();
                contador++;
            } else if (contador > 0) {
                System.out.println("Ingresa un numero entero positivo valido: ");
                n = sc.nextInt();
            }

        } while (n <= 0);

        System.out.println("Numeros primos menores a " + n + ":");
        for (int i = n-1; i >=2; i--) {
            check = true;
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check == true) {
                System.out.println(i);
            }
        }
    }

}
