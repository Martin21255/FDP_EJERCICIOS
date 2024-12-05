/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Unidad4;

/**
 *
 * @author Martin
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] primos = new int[100];
        int numero = 2;
        int contador = 0;

        while (contador < 100) {
            boolean esPrimo = true;

            if (numero < 2) {
                esPrimo = false;
            } else {
                for (int i = 2; i <= Math.sqrt(numero); i++) {
                    if (numero % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }
            }

            if (esPrimo) {
                primos[contador] = numero;
                contador++;
            }
            numero++;
        }

        for (int primo : primos) {
            System.out.print(primo + " ");
        }
    }
}

