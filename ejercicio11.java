/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

import java.util.Scanner;

/**
 *
 * @author Johao Smith Urbina González
 */
public class Main {

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int numero = Integer.parseInt(teclado.nextLine());

        boolean resultado = esPar(numero);

        if (resultado) {
            System.out.println("El numero es par.");
        } else {
            System.out.println("El numero es impar.");
        }
    }
}