/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Unidad2;
import java.util.Scanner;
/**
 *
 * @author Martin
 */
public class Ejercicio19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dias,horas,minutos,segundos,segundosT,segundosR;
        
        System.out.println("Ingrese la cantidad total de tiempo en segundos: ");
        segundosT = sc.nextInt();
        
        dias = segundosT / 86400;
        segundosR = segundosT % 86400;

        horas = segundosR / 3600;
        segundosR %= 3600;

        minutos = segundosR / 60;
        segundos = segundosR % 60;
        
        System.out.println("Dias: " + dias);
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);
    }
    
}
