import java.util.Scanner;

/**
 *
 * @author Johao Smith Urbina González
 */
public class Main {

    public static int mayor(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int a = Integer.parseInt(teclado.nextLine());

        System.out.print("Ingrese el segundo numero: ");
        int b = Integer.parseInt(teclado.nextLine());

        int resultado = mayor(a, b);
        System.out.println("El numero mayor es: " + resultado);
    }
}
