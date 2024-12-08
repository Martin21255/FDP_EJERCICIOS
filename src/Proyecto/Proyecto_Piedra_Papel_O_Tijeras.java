/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author Mark
 */
public class Proyecto_Piedra_Papel_O_Tijeras {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int eleccionJugador, eleccionComputadora;
        String[] opciones = {"Piedra", "Papel", "Tijera"};
        boolean seguirJugando = true;
        int contadorJugador = 0; // Contador para el jugador
        int contadorComputadora = 0; // Contador para la computadora
        
        System.out.println("Bienvenido al juego de Piedra, Papel o Tijera");
        while (seguirJugando) {
            System.out.println("Elige una opcion:");
            System.out.println("1. Piedra");
            System.out.println("2. Papel");
            System.out.println("3. Tijera");
            eleccionJugador = 0;

            try {
                System.out.print("Tu eleccion (1-3): ");
                eleccionJugador = sc.nextInt();
                if (eleccionJugador < 1 || eleccionJugador > 3) {
                    System.out.println("Eleccion no valida. Por favor, elige entre 1, 2 o 3.");
                    continue;
                }
            } catch (Exception e) {
                System.out.println("Entrada no valida. Por favor, ingresa un numero.");
                sc.next();
                continue;
            }

            eleccionComputadora = (int) (Math.random() * 3) + 1;
            System.out.println("Tu elegiste: " + opciones[eleccionJugador - 1]);
            System.out.println("La computadora eligio: " + opciones[eleccionComputadora - 1]);

            // Determinar el ganador
            if (eleccionJugador == eleccionComputadora) {
                System.out.println("Es un empate!");
            } else if ((eleccionJugador == 1 && eleccionComputadora == 3) ||
                       (eleccionJugador == 2 && eleccionComputadora == 1) ||
                       (eleccionJugador == 3 && eleccionComputadora == 2)) {
                System.out.println("Ganaste!");
                contadorJugador++;
            } else {
                System.out.println("La computadora gana!");
                contadorComputadora++;
            }

            // Mostrar el puntaje actual
            System.out.println("\nPuntaje actual:");
            System.out.println("Jugador: " + contadorJugador);
            System.out.println("Computadora: " + contadorComputadora);
            System.out.println();

            // Preguntar si quiere jugar de nuevo
            char respuesta;
            while (true) {
                System.out.print("Quieres jugar otra vez? (s/n): ");
                respuesta = sc.next().toLowerCase().charAt(0);
                if (respuesta == 's' || respuesta == 'n') {
                    break; // Salir del bucle si la entrada es válida
                } else {
                    System.out.println("Entrada no valida. Por favor, ingresa 's' para si o 'n' para no.");
                }
            }
            seguirJugando = (respuesta == 's');
        }

        // Imprimir puntaje final
        System.out.println("\nPUNTAJE FINAL:");
        System.out.println("-----------------");
        System.out.println("Jugador: " + contadorJugador);
        System.out.println("Computadora: " + contadorComputadora);
        System.out.println("-----------------");

        System.out.println("Gracias por jugar! Hasta la proxima.");
        sc.close();
    }
}
