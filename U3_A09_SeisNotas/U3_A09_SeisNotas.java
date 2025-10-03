package U3_A09_SeisNotas;

import java.util.Scanner;

public class U3_A09_SeisNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aprobados = 0, suspensos = 0, condicionados = 0;

        for ( int i = 1; i <= 6; i++) {
            System.out.printf("Nota del alumno número %d : ", i);
            int nota = sc.nextInt();

            if (nota == 4) {
                condicionados++;
            } else if (nota >= 5) {
                aprobados++;
            } else if (nota < 4 ) {
                suspensos++;
            }
        }
        System.out.printf("Aprobados: %d. \nSuspensos: %d. \nCondicionados: %d.", aprobados, suspensos, condicionados);
    }
}
