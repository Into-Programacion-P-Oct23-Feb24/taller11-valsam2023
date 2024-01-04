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
import java.util.Scanner;

public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion;
        System.out.println("Ingrese 1 para obtener el area del Cuadrado, 2 para"
                + " el area del Triangulo, 3 para el area del Rectangulo");
        opcion = entrada.nextInt();

        if (opcion == 1) {
            obtenerAreaCuadrado();
        } else {
            if (opcion == 2) {
                obtenerAreaTriangulo();
            } else {
                if (opcion == 3) {
                    obtenerAreaRectangulo();
                }
            }
        }
    }   

    public static void obtenerAreaCuadrado() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la longitud del lado del triangulo");
        double lado = entrada.nextDouble();
        double area = lado * lado;
        System.out.println("El area del cuadrado es: " + area);
    }
    public static void obtenerAreaTriangulo() {
        
    }
}


