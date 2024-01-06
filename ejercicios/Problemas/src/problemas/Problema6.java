/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema6 {

    public static void main(String[] args) {
        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};

        // Calcular la media aritmética
        double media = calcularMedia(informacion);
        double desviacionEstandar = calcularDesviacionEstandar(informacion, media);

        System.out.printf("La media es: %.2f\nLa desviación estandar "
                + "es: %.2f\n", media, desviacionEstandar);
    }

    public static double calcularMedia(int[] arreglo) {
        int suma = 0;
        double media;
        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];
        }
        media = (double) suma / arreglo.length;
        return media;
    }

    public static double calcularDesviacionEstandar(int[] arreglo, double media) {
        double sumaDiferenciaCuadrado = 0;
        double mathsqrt;
        for (int i = 0; i < arreglo.length; i++) {
            sumaDiferenciaCuadrado = sumaDiferenciaCuadrado
                    + Math.pow(arreglo[i] - media, 2);
            /* Math.pow se utiliza para calcular la potencia de un número, en este 
           caso (arreglo[i] - media) es la base, y el 2 seria el exponente.
             */
        }

        double varianza = sumaDiferenciaCuadrado / arreglo.length;
        mathsqrt = Math.sqrt(varianza);
        // el Math.sqrt se utiliza para calcular la raíz cuadrada de un número
        return mathsqrt;
    }
}
