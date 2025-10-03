
//package u1_a02_frutero;

import java.util.Scanner;

public class U1_A02_Frutero {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        final double manzanas = 2.35;
        final double peras = 1.95;
        
        System.out.print("¿Cuántos kilos de manzanas has vendido el primer semestre? ");
        double ventaManzanas1 = sc.nextDouble();
        System.out.print("¿Cuántos kg de peras has vendido el primer semestre? ");
        double ventaPeras1 = sc.nextDouble();
        
        System.out.print("¿Cuántos kg de manzanas has vendido en el segundo semestre? ");
        double ventaManzanas2 = sc.nextDouble();
        System.out.print("¿Cuantos kg de peras has vendido ene el segundo semestre? ");
        double ventaPeras2 = sc.nextDouble();
        
        double TotalManzanas = ventaManzanas1 + ventaManzanas2;
        double PrecioTotalManzanas = TotalManzanas * manzanas;
        
        double TotalPeras = ventaPeras1 + ventaPeras2;
        double PrecioTotalPeras = TotalPeras * peras;
        
        System.out.printf("Has vendido " + TotalManzanas + " kilos de manzanas y " + TotalPeras + ", por el precio de " + TotalManzanas+ " manzanzas y esto de peras " + TotalPeras + ".");
        System.out.println("");
    }
    
}
