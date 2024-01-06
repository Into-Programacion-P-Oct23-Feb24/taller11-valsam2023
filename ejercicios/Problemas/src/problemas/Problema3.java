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
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la primera nota: ");
        nota1 = entrada.nextDouble();
        System.out.println("Ingrese la segunda nota: ");
        nota2 = entrada.nextDouble();
        System.out.println("Ingrese la tercera nota: ");
        nota3 = entrada.nextDouble();
        System.out.println("Ingrese la cuarta nota: ");
        nota4 = entrada.nextDouble();

        obtenerPromedioC(nota1, nota2, nota3, nota4);
        String promedioC = obtenerPromedioC(nota1, nota2, nota3, nota4);
        System.out.println("El promedio de las notas: " + nota1 + ", " + nota2 + ", "
                + nota3 + ", " + nota4 + " es " + promedioC);
    }

    public static String obtenerPromedioC(double nota1, double nota2,
            double nota3, double nota4) {
        double promedio;
        String cualitativa;
        promedio = (nota1 + nota2 + nota3 + nota4) / 4;
        if (promedio >= 0 && promedio <= 5) {
            cualitativa = "Regular";
        } else {
            if (promedio >= 5.1 && promedio <= 8) {
                cualitativa = "Bueno";
            } else {
                if (promedio >= 8.1 && promedio <= 9) {
                    cualitativa = "Muy Bueno";
                } else {
                    if (promedio >= 9.1 && promedio <= 10) {
                        cualitativa = "Sobresaliente";
                    } else {
                        cualitativa = "Fuera de rango";
                    }
                }
            }
        }
        return cualitativa;
    }
}
