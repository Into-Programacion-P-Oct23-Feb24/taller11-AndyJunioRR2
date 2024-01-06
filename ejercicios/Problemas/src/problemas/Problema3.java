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
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        
        System.out.println("Ingrese por favor la nota 1");
        nota1 = entrada.nextDouble();
        System.out.println("Ingrese por favor la nota 2");
        nota2 = entrada.nextDouble();
        System.out.println("Ingrese por favor la nota 3");
        nota3 = entrada.nextDouble();
        System.out.println("Ingrese por favor la nota 4");
        nota4 = entrada.nextDouble();
        String promedio = promedios(nota1, nota2, nota3, nota4);
        System.out.printf("El promedio de las notas: %.2f, %.2f, %.2f, %.2f es "
                + "%s\n",
                 nota1, nota2, nota3, nota4, promedio);
    }
    public static String promedios(double w, double x, double y, double z)  {
        double suma = w + x + y + z;
        double promedio = suma / 4;
        String mensaje = "";
        if (promedio >= 0 && promedio <= 5) {
            mensaje = "Regular";
        } else {
            if (promedio >= 5.1 && promedio <= 8) {
                mensaje = "Bueno";
            } else {
                if (promedio >= 8.1 && promedio <= 9) {
                    mensaje = "Muy Bueno";
                } else {
                    mensaje = "Sobresaliente";
                }
            }
        }
        return mensaje;
    }

}
    
    

