package U3_A10_BuclesIndependientes;

public class U3_A10_BuclesIndependientes {
    public static void main(String[] args) {
        for (int tabla = 1; tabla <= 10; tabla++) {
            System.out.println("Esta es la tabla del " + tabla);
            for (int i = 1; i <= 10; i++) {
                System.out.println(tabla + " x " + i + " = " + tabla * i);
            }
        }
    }
}
