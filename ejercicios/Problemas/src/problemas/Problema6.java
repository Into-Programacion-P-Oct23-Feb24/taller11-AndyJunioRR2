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
        double mediaAritmetica = calcularMediaA(informacion);
        System.out.println("El valor de la media aritmética es: "
                + mediaAritmetica);
        double desviacion = calcularDesviacion(informacion,
                mediaAritmetica);
        System.out.println("El valor de la desviación media es de: "
                + desviacion);
    }

    public static int calcularMediaA(int[] informacion) {
        int suma = 0;
        int media;
        for (int i = 0; i < informacion.length; i++) {
            suma += informacion[i];
        }
        media = suma / informacion.length;
        return media;
    }

    public static double calcularDesviacion(int[] informacion,
            double mediaArit) {
        double sumaDiferenciasCuadrado = 0.0;
        for (int i = 0; i < informacion.length; i++) {
            double diferencia = informacion[i] - mediaArit;
            sumaDiferenciasCuadrado += Math.pow(diferencia, 2);

        }
        double varianza = sumaDiferenciasCuadrado / informacion.length;
        double desviacionEstandar = Math.sqrt(varianza);
        return desviacionEstandar;
    }
}
