
package u1.pkg4_solicitaredad;

import java.util.Scanner;

public class U14_SolicitarEdad {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce la edad: ");
        int edad = sc.nextInt();
        boolean mayorEdad = edad <= 18;
        System.out.println("¿Es mayor de edad? -> " + mayorEdad);
    }
    
}
