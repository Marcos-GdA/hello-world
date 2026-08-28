// El programa genera un número aleatorio.
// El usuario intenta adivinarlo.
// Mostrar si el número introducido es mayor o menor.
// Practicar Random, bucles y condicionales.

import java.util.Scanner;
public class AdivinaElNumero {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int numAle = (int) (Math.random() * 100 + 1);
        int numUsu = 0;
        int inte = 0;

        partida(numUsu, numAle, inte);
    }

    public static void partida(int numUsu, int numAle, int inte){
        while (numUsu != numAle){
            inte++;

            System.out.println("Adivina el número entre 1 y 100: ");
            numUsu = sc.nextInt();

            while (numUsu < 1 || numUsu > 100){
                System.out.println("¡Número fuera de rango! Ingrese un número entre 1 y 100: ");
                numUsu = sc.nextInt();
            }

            if (numUsu < numAle){
                System.out.println("¡" + numUsu + " es menor que el número aleatorio!");
                continue;
            } else if (numUsu > numAle){
                System.out.println("¡" + numUsu + " es mayor que el número aleatorio!");
                continue;
            } else {
                System.out.println("¡Felicidades! ¡Adivinaste el número aleatorio: " + numAle + "!");
                break;
            }
        }

        System.out.println("¡GRACIAS POR JUGAR!");
        System.out.println("NUMERO ALEATORIO: " + numAle);
        System.out.println("NUMERO DE INTENTOS: " + inte);
    }
}