
package u2_a03_concierto;

import java.util.Scanner;

/**
 *
 * @author 76066969N
 */
public class U2_A03_Concierto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el aforo máximo del local: ");
        int aforo = sc.nextInt(); // crea la variable aforo y le introduce un valor int por consola.
        System.out.print("Introduce el precio de la entrada: ");
        double PrecioEntrada = sc.nextDouble(); // crea la variable PrecioEntrada y le introduce un valor double por consola.
        System.out.print("Cúantas entradas se han vendido: ");
        int EntradasVendidas = sc.nextInt(); // crea la variable EntradasVendidas y le introduce un valor int por consola.
        
        double recaudacion = PrecioEntrada * EntradasVendidas;
        
        //1. VALIDA EL AFORO.
        if (EntradasVendidas > aforo {
            System.out.println("No disponible. El número de entradas vendidas no puede superar el aforo máximo.\nRecaudación no obtenida.");
            recaudacion = 0;
        } else {
            
            if  (EntradasVendidas < aforo * 0.20) {
            System.out.printf("Lo siento. Concierto Cancelado.\nSe han reacudado: %.2feuros.\nGracias.", recaudacion);
            recaudacion = 0;
        }
        
       
        } else if (EntradasVendidas < aforo*0.5) {
            System.out.printf("Se realiza una rebaja del 25% del precio de la entrada.\nSe han recaudad: %.2f euros.\nGracias.", recaudacion);
            recaudacion = EntradasVendidas * (PrecioEntrada * 0.75);
        } else {
            System.out.printf("Disfrute del concierto.\nSe han reacudado: %.2f euros.\nGracias.", recaudacion);
        }
    }
    
}
