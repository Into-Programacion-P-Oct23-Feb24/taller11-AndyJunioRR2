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
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero del 1 al 3");
        num = entrada.nextInt();
        if (num == 1) {
            obtenerCuadrado();
            if (num == 2) {
                obtenerTriangulo();
                if (num == 3) {
                    obtenerRectangulo();
                }
            }
        }
    }

    public static void obtenerCuadrado() {
        Scanner entrada = new Scanner(System.in);
        double lado;
        double area;
        System.out.println("Ingrese la medida del lado");
        lado = entrada.nextDouble();
        area = lado * lado * lado * lado;
        System.out.printf("%.2f\n", area);
    }

    public static void obtenerTriangulo() {
        Scanner entrada = new Scanner(System.in);
        double base;
        double altura;
        double area;
        System.out.println("Ingrese el valor de la base");
        base = entrada.nextDouble();
        System.out.println("Ingrese el valor de la altura");
        altura = entrada.nextDouble();
        area = (base * altura) / 2;
        System.out.printf("%.2f\n", area);
    }

    public static void obtenerRectangulo() {
        Scanner entrada = new Scanner(System.in);
        double base;
        double altura;
        double area;
        System.out.println("Ingrese el valor de la base");
        base = entrada.nextDouble();
        System.out.println("Ingrese el valor de la altura");
        altura = entrada.nextDouble();
        area = base * altura;
        System.out.printf("%.2f\n", area);
    }
}
