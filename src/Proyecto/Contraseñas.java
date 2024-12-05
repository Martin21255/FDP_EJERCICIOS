
package Proyecto;
import java.util.Scanner;
import java.security.SecureRandom;
/**
 *
 * @author Martin
 */
public class Contraseñas {

    private static String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
    private static final String MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMEROS = "0123456789";
    private static final String CAR_ESPECIALES = "!@#$%^&*()/-_+=<>?";
    private static String CUSTOM = "";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int longitud,nContras=0,contador=0,opcion;  
        
                boolean incluirMayusculas = false;
                boolean incluirNumeros = false;
                boolean IncluirCar_s = false;
                boolean incluirCustom = false;
        
        do{
            if(contador == 0){
            System.out.println("***|GENERADOR DE CONTRASEÑAS|***");
            System.out.println("Bienvenido usuario, ingrese una opcion");
            System.out.println("1.- Incluir Mayusculas y Minusculas");
            System.out.println("2.- Incluir Mayusculas, Minusculas y Numeros");
            System.out.println("3.- Incluir Mayusculas, Minusculas, Numeros y Caracteres especiales");
            System.out.println("4.- Incluir Caracteres personalizados");
            System.out.println("5.- Salir del programa");
            opcion = sc.nextInt();
           contador ++;
            }
            else
            {
                System.out.println("Esa no es una opcion valida");
                System.out.println("Ingresa una opcion valida:");
                opcion = sc.nextInt();
            }
            
        }while(opcion<=0 || opcion>5);
        
        switch(opcion){
            case 1:
                incluirMayusculas = true;
                incluirNumeros = false;
                IncluirCar_s = false;
                incluirCustom = false;
                
                System.out.println("Ingresa la longitud de la contraseña: ");
                longitud = sc.nextInt();
                System.out.println("Ingresa el numero de contrasenas a generar: ");
                nContras = sc.nextInt();
                
                System.out.println("Contrasenas generadas (" + nContras +"):");
                for (int i =1; i<=nContras;i++){
                String password = generarContra(longitud, incluirMayusculas, incluirNumeros, IncluirCar_s, incluirCustom);
                System.out.println( password + "\n");
                }
                break;
            case 2:
                incluirMayusculas = true;
                incluirNumeros = true;
                IncluirCar_s = false;
                incluirCustom = false;
                
                System.out.println("Ingresa la longitud de la contraseña: ");
                longitud = sc.nextInt();
                System.out.println("Ingresa el numero de contrasenas a generar: ");
                nContras = sc.nextInt();
                
                 System.out.println("Contrasenas generadas (" + nContras +"):");
                for (int i =1; i<=nContras;i++){
                String password = generarContra(longitud, incluirMayusculas, incluirNumeros, IncluirCar_s, incluirCustom);
                System.out.println( password + "\n");
                }
                break;
            case 3:
                incluirMayusculas = true;
                incluirNumeros = true;
                IncluirCar_s = true;
                incluirCustom = false;
                
                System.out.println("Ingresa la longitud de la contraseña: ");
                longitud = sc.nextInt();
                System.out.println("Ingresa el numero de contrasenas a generar: ");
                nContras = sc.nextInt();
                
                System.out.println("Contrasenas generadas (" + nContras +"):");
                for (int i =1; i<=nContras;i++){
                String password = generarContra(longitud, incluirMayusculas, incluirNumeros, IncluirCar_s, incluirCustom);
                System.out.println( password + "\n");
                }
                break;
            case 4:
                MINUSCULAS = "";
                incluirMayusculas = false;
                incluirNumeros = false;
                IncluirCar_s = false;
                incluirCustom = true;
                System.out.println("Ingresa los caracteres que necesites");
                CUSTOM = sc.next();
                System.out.println("Ingresa la longitud de la contraseña: ");
                longitud = sc.nextInt();
                System.out.println("Ingresa el numero de contrasenas a generar: ");
                nContras = sc.nextInt();
                
                System.out.println("Contrasenas generadas (" + nContras +"):");
                for (int i =1; i<=nContras;i++){
                String password = generarContra(longitud, incluirMayusculas, incluirNumeros, IncluirCar_s, incluirCustom);
                System.out.println( password + "\n");
                }
                break;
            case 5:
                System.exit(0);
                break;
        
        }   

    }

    public static String generarContra(int length, boolean incluirMayusculas, boolean incluirNumeros, boolean incluirCar_S, boolean incluirCustom) {
        StringBuilder characterPool = new StringBuilder(MINUSCULAS);

        if (incluirMayusculas) {
            characterPool.append(MAYUSCULAS);
        }
        if (incluirNumeros) {
            characterPool.append(NUMEROS);
        }
        if (incluirCar_S) {
            characterPool.append(CAR_ESPECIALES);
        }
        if (incluirCustom){
            characterPool.append(CUSTOM);
        }

        SecureRandom random = new SecureRandom();
        StringBuilder contra = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characterPool.length());
            contra.append(characterPool.charAt(randomIndex));
        }

        return contra.toString();
    }
    
}
