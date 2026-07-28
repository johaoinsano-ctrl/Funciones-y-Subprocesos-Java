/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

import java.util.Scanner;

/**
 *
 * @author Johao Smith Urbina González
 */
public class Main {

    public static double calcularPromedio(double n1, double n2, double n3) {
        double promedio = (n1 + n2 + n3) / 3;
        return promedio;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la primera nota: ");
        double n1 = Double.parseDouble(teclado.nextLine());

        System.out.print("Ingrese la segunda nota: ");
        double n2 = Double.parseDouble(teclado.nextLine());

        System.out.print("Ingrese la tercera nota: ");
        double n3 = Double.parseDouble(teclado.nextLine());

        double promedio = calcularPromedio(n1, n2, n3);
        System.out.println("Promedio: " + promedio);

        if (promedio >= 7) {
            System.out.println("El estudiante aprobo.");
        } else {
            System.out.println("El estudiante no aprobo.");
        }
    }
}