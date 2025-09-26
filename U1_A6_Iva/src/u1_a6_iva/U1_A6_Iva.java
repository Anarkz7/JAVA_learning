
package u1_a6_iva;

import java.util.Scanner;

public class U1_A6_Iva {

    public static void main(String[] args) {
        double baseImponible;
        int iva;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la base ponible: ");
        baseImponible = sc.nextDouble();
        System.out.print("Introduce el IVA a aplicar: ");
        iva = sc.nextInt();
        
        double importeIVA = baseImponible * iva/100;
        System.out.println("El importe del iva es : " + importeIVA);
        double importeTotal = baseImponible + importeIVA;
        System.out.println("El importe total del producto es : " + importeTotal);
    }
    
}
