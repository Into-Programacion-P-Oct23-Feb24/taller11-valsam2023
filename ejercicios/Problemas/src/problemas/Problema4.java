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
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        int opcionB;
        boolean bandera = true;
        String nombre;
        int cedula;
        while (bandera) {
            System.out.println("Ingrese su nombre");
            nombre = entrada.nextLine();
            System.out.println("Ingrese su numero de cedula");
            cedula = entrada.nextInt();
            System.out.println("Ingrese 1 si desea obtener su plantilla de luz, "
                    + "ingrese 2 si desea obtener el valor de su predio");
            opcion = entrada.nextInt();
            if (opcion == 1) {
                calcularLuz(nombre, cedula);
            } else {
                if (opcion == 2) {
                    calcularPredio(nombre, cedula);
                }
            }
            System.out.println("Si desea seguir ingresando mas nombres digite 8,"
                    + "si ya no desea ingresar digite 9");
            opcionB = entrada.nextInt();
            entrada.nextLine();
            if (opcionB == 9) {
                bandera = false;
            }
        }
    }

    public static void calcularLuz(String n, int c) {
        Scanner entrada = new Scanner(System.in);
        double kilovatio;
        double nkilovatio;
        double totalk;
        System.out.println("Ingrese el valor del kilovatio");
        kilovatio = entrada.nextDouble();
        System.out.println("Ingrese los kilovatios que consume en el mes");
        nkilovatio = entrada.nextDouble();
        totalk = kilovatio * nkilovatio;
        System.out.println("Cliente: " + n + " con cedula: " + c + " debe cancelar "
                + "el valor de: $" + totalk);
    }

    public static void calcularPredio(String n, int c) {
        Scanner entrada = new Scanner(System.in);
        double total;
        double inmueble;
        System.out.println("Ingrese el valor inmueble");
        inmueble = entrada.nextDouble();
        total = inmueble - (inmueble * 0.20);
        System.out.println("Cliente: " + n + " con cedula: " + c + " tiene un bien "
                + "inmueble valorando en: $" + inmueble + " y tiene que pagar un "
                + "predio de: $" + total);
    }
}
