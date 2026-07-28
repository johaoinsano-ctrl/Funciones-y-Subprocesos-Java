/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

import java.util.Scanner;

/**
 *
 * @author Johao Smith Urbina González
 */
public class Main {

    public static double calcularArea(double base, double altura) {
        double area = base * altura;
        return area;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la base del rectangulo: ");
        double base = Double.parseDouble(teclado.nextLine());

        System.out.print("Ingrese la altura del rectangulo: ");
        double altura = Double.parseDouble(teclado.nextLine());

        double area = calcularArea(base, altura);
        System.out.println("El area del rectangulo es: " + area);
    }
}