// Pedir longitud de la contraseña
// Generar letras, números y símbolos aleatoriamente
// Practicar String, Random y Arrays

// - Crear array vacio con la longitud de la contraseña que se vaya rellenando de manera aleatoria

import java.util.Random;
import java.util.Scanner;

public class GeneradorDeContraseñas {
    Static scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int lon = inicioYLongitud();
        String[] cont = new String[lon];

    }

    public static int inicioYLongitud(){
        System.out.println("Bienvenido al generador de contraseñas");
        System.out.println("Ingrese la longitud de la contraseña: ");
        int lon = sc.nextInt();

        return lon;
    }

    public static void rellenarArray(String[] cont, int i){
        int tip = (int) Math.random() * 3 + 1;

        switch (tip) {
            case 1:
                // Generar letra
                break;
            case 2:
                // Generar número
                break;
            case 3:
                // Generar símbolo
                break;
        }
    }

    public static String[] letra(String[] cont, int i){
        String[] letras = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        // CONTINUAR AQUI
        // Generar letra aleatoria y asignarla al array cont en la posición i
        // FALTAN generar número y símbolo y añadirlo al array
    }
}