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
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        System.out.println("=== MENU ===");
        System.out.println("1.- Italiana");
        System.out.println("2.- Carnes Frías");
        System.out.println("3.- Vegetariana");
        System.out.println("4.- Pepperoni");
        System.out.println("5.- Hawaiana");
        System.out.println("6.- Mexicana");
        System.out.println("7.- Camaron");
        System.out.println("¿Que pizza desea ordenar? ");
        opcion = sc.nextInt();
        
        
        switch(opcion){
            case 1: 
        System.out.println("Ha elegido la pizza Italiana" +
            "\nLos ingredientes son: Jamón serrano, aceitunas negras, tomate cherry, albahaca, salsa de tomate y queso mozzarella");
        break;
    
        case 2: 
        System.out.println("Ha elegido la pizza de Carnes Frías" +
            "\nLos ingredientes son: Jamón, salami, pepperoni, chorizo, salsa de tomate y queso mozzarella");
        break;
    
        case 3: 
        System.out.println("Ha elegido la pizza Vegetariana" +
            "\nLos ingredientes son: Pimiento, champiñones, cebolla, aceitunas, tomate fresco, salsa de tomate y queso mozzarella");
        break;
    
        case 4: 
        System.out.println("Ha elegido la pizza de Pepperoni" +
            "\nLos ingredientes son: Pepperoni, salsa de tomate y queso mozzarella extra");
        break;
    
        case 5:
        System.out.println("Ha elegido la pizza Hawaiana" +
            "\nLos ingredientes son: Jamón, piña, salsa de tomate y queso mozzarella");
        break;
    
        case 6:
        System.out.println("Ha elegido la pizza Mexicana " + 
                "\nLos ingredientes son: Carne molida, jalapeños, pimiento, cebolla, salsa de tomate y queso mozzarella");
        break;
    
        case 7:
        System.out.println("Ha elegido la pizza de Camarón" +
            "\nLos ingredientes son: Camarones, ajo, perejil, salsa de tomate y queso mozzarella");
        break;
        
        default: 
            System.out.println("Pero selecciona una opcion correcta, alcornoque");
        
        }
    }
    
}
