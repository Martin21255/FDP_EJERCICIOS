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
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String signo;
        
        System.out.println("Descubre tu compatibilidad astrologica");
        System.out.println("Ingresa tu signo zodiacal");
        signo = sc.next().toLowerCase();
        
        switch(signo){
            case "aries":
                System.out.println("Eres compatible con: Aries, Leo, Sagitario, Geminis, Libra  y Acuario");
            break;
            
            case "leo":
                System.out.println("Eres compatible con: Aries, Leo, Sagitario, Geminis, Libra  y Acuario");
            break;
            
            case "sagitario":
                System.out.println("Eres compatible con: Aries, Leo, Sagitario, Geminis, Libra  y Acuario");
            break;
            
            case "geminis":
                System.out.println("Eres compatible con: Geminis, Libra, Acuario, Aries, Leo y Sagitario ");
            break;
            
            case "libra":
                System.out.println("Eres compatible con: Geminis, Libra, Acuario, Aries, Leo y Sagitario ");
            break;
            
            case "acuarios":
                System.out.println("Eres compatible con: Geminis, Libra, Acuario, Aries, Leo y Sagitario ");
            break;
            
            case "cancer":
                System.out.println("Eres compatible con: Tauro, Virgo, Capricornio, Cancer, Escorpio y Piscis ");
            break;
            
            case "escorpio":
                System.out.println("Eres compatible con: Tauro, Virgo, Capricornio, Cancer, Escorpio y Piscis ");
            break;
            
            case "piscis":
                System.out.println("Eres compatible con: Tauro, Virgo, Capricornio, Cancer, Escorpio y Piscis ");
            break;
            
            case "tauro":
                System.out.println("Eres compatible con: Cancer, Escorpio, Piscis, Tauro, Virgo y Capricornio ");
            break;
            
            case "virgo":
                System.out.println("Eres compatible con: Cancer, Escorpio, Piscis, Tauro, Virgo y Capricornio ");
            break;
            
            case "capricornio":
                System.out.println("Eres compatible con: Cancer, Escorpio, Piscis, Tauro, Virgo y Capricornio ");
            break;
        
        
        }
    }
    
}
