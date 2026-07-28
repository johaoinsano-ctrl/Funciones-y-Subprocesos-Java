/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author Johao Smith Urbina González
 */
public class Main {

    public static int obtenerNumero() {
        int numero = (int) (Math.random() * 100) + 1;
        return numero;
    }

    public static void main(String[] args) {
        int numero = obtenerNumero();
        System.out.println("Numero aleatorio generado: " + numero);
    }
}