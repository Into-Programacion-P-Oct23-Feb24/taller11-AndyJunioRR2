/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema7 {
    public static void main(String[] args) {
        String[] ciudades;
        ciudades = obtenerMensaje();
        System.out.println("Valores:");
        for (int i = 0; i < ciudades.length; i++) {
            System.out.println(ciudades[i]);

        }
        System.out.println("\nValores de  4 a 5 carácteres:");
        obtenerValores(ciudades);
    }

    public static String[] obtenerMensaje() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int num;
        System.out.println("Ingrese el numero de datos");
        num = entrada.nextInt();
        String[] ciudades = new String[num];
        entrada.nextLine();
        for (int i = 0; i < ciudades.length; i++) {
            System.out.println("Ingrese una ciudad de Ecuador");
            ciudades[i] = entrada.nextLine();
        }
        return ciudades;
    }

    public static void obtenerValores(String[] valores) {
        for (int i = 0; i < valores.length; i++) {
            if (valores[i].length() == 4 || valores[i].length() == 5) {
                System.out.println(valores[i]);

            }

        }

    }
}