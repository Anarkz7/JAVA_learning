package U3_A06_NumeroSuspensos;

import java.util.Scanner;


public class U3_A06_NumeroSuspensos {
    public static void main(String[] args) {
        int suspensos = 0;
        for (int i = 0; i < 5 ; i ++){
            System.out.println("Introduce la nota sin decimales: (0-10)");
            int notas = sc.nextInt();
            if (notas < 0 || notas > 10) {
                System.out.println("La nota no es válida.";
                i--;
            }
            if ( notas >= 0 && notas < 5) suspenso ++;
        }
    System.out.println("El número de suspensos es: " + suspensos);
}
