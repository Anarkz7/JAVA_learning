
package miprimeraapp;

import java.util.Scanner;

public class Miprimeraapp {

    public static void main(String[] args) {
        System.out.println("Hola Mundo!");
        
        //Recoge la edad, el apellido, y el nombre.
        Scanner sc = new Scanner(System.in);
        
        //EDAD
        System.out.println("Introduce tu edad: ");
        int e;
        e = sc.nextInt();
        System.out.println("La edad del usuario es: " + e); 
        
        
        //NOMBRE
        
        System.out.println("Introduce el nombre del user: ");
        String nombre = sc.nextLine();
        System.out.println("El nombre del user es: " + nombre);
        
        
        //APELLIDO
        System.out.println("Introduce el apellido: ");
        String apellido = sc.nextLine();
        System.out.println("El apellido es: " + apellido);
        
    }
    
}
