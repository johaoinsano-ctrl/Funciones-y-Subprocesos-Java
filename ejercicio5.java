import java.util.Scanner;

/**
 *
 * @author Johao Smith Urbina González
 */
public class Main {

    public static void operaciones(double a, double b) {
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicacion: " + (a * b));
        System.out.println("Division: " + (a / b));
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        double a = Double.parseDouble(teclado.nextLine());

        System.out.print("Ingrese el segundo numero: ");
        double b = Double.parseDouble(teclado.nextLine());

        operaciones(a, b);
    }
}
