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
public class Ejercicio10 {

    
    public static void main(String[] args) {
        String artistaF_chico;
        int edad_chico,edad_chica, altura;
        Scanner sc = new Scanner(System.in);

        
        System.out.println("BUSCADOR DE PAREJAS");
        System.out.println("Ingresa tu edad (chica):" );
        edad_chica = sc.nextInt();
        System.out.println("Ingresa tu edad (chico):" );
        edad_chico = sc.nextInt();
        System.out.println("Ingresa tu altura(chico): ");
        altura = sc.nextInt();
        System.out.println("Ingresa tu artista Favorito (chico): ");
        artistaF_chico = sc.next();
                
        if (edad_chico>edad_chica && altura >= 180 && artistaF_chico.equals("Pantera")){
            System.out.println("Aprobado");
        }
        else
            System.out.println("NO APROBADO");

    }
    
}
