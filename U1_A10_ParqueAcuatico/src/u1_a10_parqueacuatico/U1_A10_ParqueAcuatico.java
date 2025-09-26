
package u1_a10_parqueacuatico;

import java.util.Scanner;

/**
 *
 * @author 76066969N
 */
public class U1_A10_ParqueAcuatico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        //final double PRECIO_INFANTIL = 15.50;
        //final double PRECIO_ADULTO = 20;
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Cantidad de entradas infantiles: " );
        double Infantiles = sc.nextInt()*15.50;
        System.out.println("Cantidad de entradas adulto: ");
        double Adultos = sc.nextInt()*20;
 
        
        double importeTotal = Infantiles + Adultos;
        double descuento = importeTotal >= 100 ? importeTotal*0.05: 0;
        
        System.out.printf("El importe total es %.02f.\n", (importeTotal - descuento));
        
      //  double importe 
        
        
    }
    
}
