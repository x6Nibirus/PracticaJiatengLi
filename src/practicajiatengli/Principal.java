package practicajiatengli;

import java.util.Random;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el número sobre el que hacer los cálculos");


        int numero;
        try {
            numero = sc.nextInt();
        } catch (Exception e) {
            System.out.println("El dato introducido no es un n�mero");
            return;
        }




        Random r = new Random();
        int numAleatorio = r.nextInt(numero) + 1;
        new CalculosMatematicos().calcularMCD(numero, numAleatorio);
    }

}
