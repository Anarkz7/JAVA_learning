
package u1_5_puedosalir;

import java.util.*;

public class U1_5_PuedoSalir {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Está lloviendo? (true/false) : ");
        boolean lluvia = sc.nextBoolean();
        System.out.println("Has acabado las tareas? (true/false) : ");
        boolean tareas = sc.nextBoolean();
        System.out.println("Tienes que ir a la biblioteca? (true/false) : ");
        boolean biblioteca = sc.nextBoolean();
        
        boolean salir = !lluvia && tareas || biblioteca;
        System.out.println("Puedes salir? -> " + salir);
        
        
        boolean salir2 = ((lluvia == false) && (tareas == true) == (biblioteca == true));
        
    }
    
}
