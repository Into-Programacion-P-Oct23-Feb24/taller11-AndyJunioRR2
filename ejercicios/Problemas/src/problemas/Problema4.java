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
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int r;
        String nombre;
        String cedula;
        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su número de cédula");
        cedula = entrada.nextLine();
        System.out.println("Si desea obtener su planilla de luz digite 1 si "
                + "desea valor de su predio digite 2");
        r = entrada.nextInt();
        if (r == 1) {
            calcularValorLuz(nombre, cedula);
        } else {
            if (r == 2) {
                calcularPredio(nombre, cedula);
            }
        }
    }

    public static void calcularValorLuz(String n, String c) {
        Scanner entrada = new Scanner(System.in);
        double kilo;
        double numkilo;
        System.out.println("Ingrese el valor del kilowatio");
        kilo = entrada.nextDouble();
        System.out.println("Ingrese el valor de kilowatios consumidos");
        numkilo = entrada.nextDouble();
        double valortotal;
        valortotal = (kilo * numkilo);
        System.out.printf("Cliente: %s con cedula: %s debe cancelar el"
                + " valor de: $%.2f", n, c, valortotal);

    }

    public static void calcularPredio(String n, String c) {
        Scanner entrada = new Scanner(System.in);
        double resultado;
        double mueble;
        System.out.println("Ingrese el valor del inmueble");
         mueble = entrada.nextDouble();
         resultado = mueble - (mueble * 0.2);
         System.out.printf("Cliente: %s con cédula: %s tiene un inmueble "
                 + "valorado en: $%.2f y tiene que pagar un predio de: $%.2f",
                 n,c,mueble,resultado);
    }
}
