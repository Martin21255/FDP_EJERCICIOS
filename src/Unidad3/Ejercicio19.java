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
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad, pesoh = 0, pesom = 0, alturah = 0, alturam = 0, xp, acumulador, cm=0,ch=0 ,ppesoh=0,ppesom=0,palturah = 0,palturam=0;
        String sexo;
        System.out.println("Ingresa la cantidad de personas que viven en Veracruz");
        xp = sc.nextInt();

        for (int i = 1; i <= xp; i++) {
            System.out.println("Ingresa la edad de la persona " + i + ":");
            edad = sc.nextInt();
            if (edad >= 18) {

                System.out.println("Ingresa el sexo de la persona " + i + ":");
                sexo = sc.next().toLowerCase();
                if (sexo.equals("hombre")) {
                    ch++;
                    System.out.println("Ingresa el peso de la persona " + i + ":");
                    acumulador = sc.nextInt();
                    pesoh = pesoh + acumulador;

                    System.out.println("Ingresa la altura de la persona " + i + ":");
                    acumulador = sc.nextInt();
                    alturah = alturah + acumulador;
                } else if (sexo.equals("mujer")) {
                    cm++;
                    System.out.println("Ingresa el peso de la persona " + i + ":");
                    acumulador = sc.nextInt();
                    pesom = pesom + acumulador;

                    System.out.println("Ingresa la altura de la persona " + i + ":");
                    acumulador = sc.nextInt();
                    alturam = alturam + acumulador;
                }

            }

        }
        
        if (ch!=0){
            ppesoh = pesoh / ch;
            palturah = alturah / ch;}
        
        if(cm!=0){
        ppesom = pesom / cm;
        palturam = alturam / cm;}
        
        System.out.println("El promedio de peso en hombres es de: " + ppesoh);
        System.out.println("El promedio de altura en hombres es de: " + palturah);
        
        System.out.println("El promedio de peso en mujeres es de: " + ppesom);
        System.out.println("El promedio de altura en mujeres es de: " + palturam);
    }

}
