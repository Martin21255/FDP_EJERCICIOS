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
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matriz;
        int f, c,numMayor,numMenor;
        
        //Se define el tamaño de la matriz
        System.out.println("Tamaño de la matriz ");
        System.out.println("Filas: ");
        f = sc.nextInt();
        System.out.println("Columnas: ");
        c = sc.nextInt();
        matriz = new int[f][c];
        
        //Ingreso de valores en la matriz
        for (int i =0;i<f;i++){
            for (int j=0;j<c;j++){
                System.out.println("Ingrese elemento ("+(i+1)+","+(j+1)+"): ");
                matriz[i][j]=sc.nextInt();
            }
        }
        
        //Obtener el elemento mayor y menor de cada fila
        for (int i =0;i<f;i++){
            //Se asignan valores iniciales a las variables que almacenaran el valor mayor
            //y el valor menor, cada vez que se pasa a una nueva fila
            numMenor = matriz[i][0];
            numMayor = matriz[i][0];
            
            for (int j =1;j<c;j++){
            if(matriz[i][j]>numMayor)
                numMayor = matriz[i][j];
            if(matriz[i][j]<numMenor)
                numMenor = matriz[i][j];
                
            }
            System.out.println("Fila"+(i+1)+".Numero mayor:"+numMayor+".Numero menor:"+numMenor);
        }
        
        
    }
    
}
