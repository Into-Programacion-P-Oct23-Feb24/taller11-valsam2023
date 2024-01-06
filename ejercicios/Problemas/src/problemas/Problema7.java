/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el número de elementos del arreglo: ");
        int n = entrada.nextInt();
        entrada.nextLine();
        String[] arreglo = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese los elemento del arreglo:\n");
            arreglo[i] = entrada.nextLine();
        }
        imprimirCadenasConLongitud(arreglo);
    }

    public static void imprimirCadenasConLongitud(String[] arreglo) {
        int longitud;
        String cadena;
        System.out.println("Los elemetos de 4 o 5 caracteres son:");
        for (int i = 0; i < arreglo.length; i++) {
            cadena = arreglo[i];
            longitud = cadena.length();
            if (longitud == 4 || longitud == 5) {
                System.out.println(cadena);
            }
        }
    }
}
