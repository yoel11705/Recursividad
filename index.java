import java.util.Scanner;

public class index {
    
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            int a = 0;
            int b = 1;

            System.out.print("Por favor ingrese la cantidad de elementos para la serie: ");
            int n = teclado.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.println(a);

                int c = a + b;
                a = b;
                b = c;
            }
        }
    }
}
