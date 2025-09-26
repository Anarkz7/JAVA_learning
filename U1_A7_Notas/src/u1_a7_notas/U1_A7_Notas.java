
package u1_a7_notas;

import java.util.Scanner;

public class U1_A7_Notas {

    public static void main(String[] args) {
        int nota1, nota2, nota3;
        double mediaBoletin;
        double mediaExpediente;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la nota 1: ");
        nota1 = sc.nextInt();
        System.out.print("Introduce la nota 2: ");
        nota2 = sc.nextInt();
        System.out.print("Introduce la nota 3: ");
        nota3 = sc.nextInt();
        
        mediaBoletin = (int) ((nota1 + nota2 + nota3) / 3.0) ;
        mediaExpediente = 3.0 / (nota1 + nota2 + nota3);
        
        System.out.println("Boletín de calificaciones: " + mediaBoletin);
        System.out.println("Expediente académico (con decimales): " + mediaExpediente);
        
    }
    
}
