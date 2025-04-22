package practicajiatengli;

import java.util.ArrayList;

/**
 * @author Jiateng Li
 *
 * La clase {@code CalculosMatematicos} contiene m�todos para realizar c�lculos matem�ticos como
 * la factorizaci�n en n�meros primos, verificar si un n�mero es primo, y calcular el m�ximo com�n divisor.
 */

public class CalculosMatematicos {

    public CalculosMatematicos() {
    }
    
       /**
     * Este m�todo refactorizado realiza la factorizaci�n de primos y verifica si un n�mero es primo.
     * 
     * @param numero Par�metro tipo entero para el cual se desea realizar la factorizaci�n y la comprobaci�n de si es primo o no.
     */
    public void calculosRefactorizados(int numero) {

        boolean noEsPrimo = mostrarFactorizacionPrimos(numero);

        esPrimo(numero, noEsPrimo);
    }

    /**
     * Este m�todo verifica si el n�mero dado es primo o no lo es.
     * 
     * @param numero Par�metro de tipo entero que verifica si es primo o no.
     * @param noEsPrimo Par�metro de tipo booleano que indica si el n�mero es primo o no.
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
            System.out.println("El número " + numero + " NO es primo");
        } else {
            System.out.println("El número " + numero + " SI es primo");
        }
    }
    
 /**
     * Este m�todo muestra la factorizaci�n de primos del n�mero introducido.
     * 
     * @param numero Par�metro de tipo entero para el cual se desea calcular su factorizaci�n.
     * @return Devuelve un valor booleano que indica si el n�mero es primo o no.
     */
    private boolean mostrarFactorizacionPrimos(int numero) {

        // Calculamos los factoriales primos
        ArrayList<Integer> miArray = new ArrayList();
        boolean noEsPrimo = false;
        int j;

        //Añadimos el 1
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


        System.out.println("Los factoriales primos del número introducido son: " + miArray);

      return noEsPrimo;
    }
      /**
     * Este m�todo calcula el m�ximo com�n divisor de dos n�meros usando el algoritmo de Euclides.
     * 
     * @param numA El primer n�mero para calcular el MCD.
     * @param numB El segundo n�mero para calcular el MCD.
     */
    // M�todo para calcular el MCD usando el algoritmo de Euclides
    public void calcularMCD(int numA, int numB) {
        int a = numA, b = numB;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("El m�ximo com�n divisor de " + numA + " y " + numB + " es " + a);
    }
}
