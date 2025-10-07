package U3_A11_BuclesDependientes_Rectangulo;

// Importamos la clase Scanner, que nos permite leer la entrada del usuario.
import java.util.Scanner;

public class U3_A11_BuclesDependientes_Rectangulo {
    public static void main(String[] args) {
        
        // --- 1. PREPARACIÓN Y ENTRADA DE DATOS ---
        
        // Creamos un objeto de tipo Scanner para poder leer desde la consola.
        Scanner sc = new Scanner(System.in);
        
        // Pedimos al usuario que introduzca un número.
        System.out.print("Introduce el número de lados para el triángulo: ");
        int n = sc.nextInt(); // Leemos el número entero y lo guardamos en la variable 'n'.

        System.out.println("\n--- Tu triángulo ---");

        // --- 2. LÓGICA DE BUCLES ANIDADOS ---
        
        // Bucle Exterior (para las filas).
        // Empieza con 'i' valiendo 'n' y en cada pasada le resta 1, hasta que 'i' sea 1.
        // Si n=4, este bucle se ejecutará para i=4, i=3, i=2 y i=1.
        for (int i = n; i >= 1; i--) {
            
            // Bucle Interior (para los asteriscos de cada fila).
            // Este bucle depende del exterior. Se repite 'i' veces.
            // Cuando i=4, este bucle se repite 4 veces.
            // Cuando i=3, este bucle se repite 3 veces... etc.
            for (int j = 0; j < i; j++) {
                
                // Imprimimos un asterisco y un espacio.
                // Usamos 'print' (y no 'println') para que todos los asteriscos
                // de esta pasada se queden en la misma línea.
                System.out.print("* "); 
            }
            
            // Una vez que el bucle interior ha terminado (ha impreso todos los '*' de la fila),
            // necesitamos hacer un salto de línea para que la siguiente fila empiece debajo.
            System.out.println(); 
        }
        
        // Es una buena práctica cerrar el objeto Scanner cuando ya no lo necesitamos
        // para liberar los recursos del sistema.
        sc.close(); 
    }
}