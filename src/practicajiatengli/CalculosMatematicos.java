package practicajiatengli;

import java.util.ArrayList;

/**
 * @author Jiateng Li
 *
 * La clase {@code CalculosMatematicos} contiene métodos para realizar cálculos matemáticos como
 * la factorización en números primos, verificar si un número es primo, y calcular el máximo común divisor.
 */

public class CalculosMatematicos {

    public CalculosMatematicos() {
    }
    
       /**
     * Este método refactorizado realiza la factorización de primos y verifica si un número es primo.
     * 
     * @param numero Parámetro tipo entero para el cual se desea realizar la factorización y la comprobación de si es primo o no.
     */
    public void calculosRefactorizados(int numero) {

        boolean noEsPrimo = mostrarFactorizacionPrimos(numero);

        esPrimo(numero, noEsPrimo);
    }

    /**
     * Este método verifica si el número dado es primo o no lo es.
     * 
     * @param numero Parámetro de tipo entero que verifica si es primo o no.
     * @param noEsPrimo Parámetro de tipo booleano que indica si el número es primo o no.
     */
    private void esPrimo(int numero, boolean noEsPrimo) {
        for (int i = 2; i < numero; i++) {
            noEsPrimo = false;
            if (numero % i == 0) {
                noEsPrimo = true;
                i = numero;
            }
        }

        if (noEsPrimo) {
            System.out.println("El nÃºmero " + numero + " NO es primo");
        } else {
            System.out.println("El nÃºmero " + numero + " SI es primo");
        }
    }
    
 /**
     * Este método muestra la factorización de primos del número introducido.
     * 
     * @param numero Parámetro de tipo entero para el cual se desea calcular su factorización.
     * @return Devuelve un valor booleano que indica si el número es primo o no.
     */
    private boolean mostrarFactorizacionPrimos(int numero) {

        // Calculamos los factoriales primos
        ArrayList<Integer> miArray = new ArrayList();
        boolean noEsPrimo = false;
        int j;

        //AÃ±adimos el 1
        miArray.add(1);


        for (int i = 2; i < numero; i++) {
            noEsPrimo = false;
            j = 2;
            while (j < i) {
                if (i % j == 0) {
                    noEsPrimo = true;
                    j = i;
                } else {
                    j++;
                }
            }
            if (!noEsPrimo && numero % i == 0) {
                miArray.add(i);
            }

        }


        System.out.println("Los factoriales primos del nÃºmero introducido son: " + miArray);

      return noEsPrimo;
    }
      /**
     * Este método calcula el máximo común divisor de dos números usando el algoritmo de Euclides.
     * 
     * @param numA El primer número para calcular el MCD.
     * @param numB El segundo número para calcular el MCD.
     */
    // Método para calcular el MCD usando el algoritmo de Euclides
    public void calcularMCD(int numA, int numB) {
        int a = numA, b = numB;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("El máximo común divisor de " + numA + " y " + numB + " es " + a);
    }
}
