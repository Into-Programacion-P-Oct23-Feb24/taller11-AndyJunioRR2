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
public class Problema5 {
    public static void main(String[] args) {
        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};
        double desviacionEstandar;
        double media;
        media = calcularMedia(informacion);
        System.out.println("Media aritmética: " + media);

        desviacionEstandar = calcularDesviacion(informacion, media);
        System.out.println("Desviación estándar: " + desviacionEstandar);
    }

    public static double calcularMedia(int[] arreglo) {
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        return (double) suma / arreglo.length;
    }

    public static double calcularDesviacion(int[] arreglo, double media) {
        double suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += Math.pow(arreglo[i] - media, 2);
        }
        return Math.sqrt(suma / arreglo.length);
    }

}
    

