
package u2_a02_operadorternario;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author 76066969N
 */
public class U2_A02_OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        int num1, num2;
        int mayor, menor;
        
        System.out.print("Introduce un numero: ");
        num1 = sc.nextInt();
        System.out.print("Introduce otro numero: ");
        num2 = sc.nextInt();
        
        mayor = num1 > num2 ? num1 : num2;
        //si nu
        menor = num1 < num2 ? num1 : num2;
        System.out.printf("El numero %d es mayor que %d.\n", mayor, menor);
        
        
    }
    
}
