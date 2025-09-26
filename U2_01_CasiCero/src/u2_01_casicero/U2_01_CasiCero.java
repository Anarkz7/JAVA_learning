
package u2_01_casicero;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author 76066969N
 */
public class U2_01_CasiCero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.print("Introduce un número para comprobar si es casi cero: ");
        double numero = sc.nextDouble();
        
        if (numero > -1 && numero < 1 && numero != 0) {
                System.out.printf("%.02f es un numero casi cero." + numero);
               } else {
            System.out.println("No es un casi cero. Gracias.");
            }
        }
}
    