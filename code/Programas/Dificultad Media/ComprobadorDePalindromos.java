//Comprobar si una palabra se lee igual al derecho y al revés.
// Ignorar mayúsculas, minúsculas y espacios.
// Ejemplo: reconocer.

import java.util.Scanner;

public class ComprobadorDePalindromos {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        introducirPalabra();
    }

    // Se introduce la palabra a comprobar
    public static void introducirPalabra(){
        System.out.println("Introduce la palabra a comprobar: ");
        String pal = sc.nextLine().replace(" ", "").toLowerCase();

        comprobarPar(pal);
    }

    public static void comprobarPar(String pal){
        recorrerPalabra(pal);
    }

    public static void recorrerPalabra(String pal){
        for (int i=0; i<pal.length() / 2; i++){
            if (pal.charAt(i) != pal.charAt(pal.length() - 1 - i)){
                System.out.println("La palabra no es un palíndromo.");
                return;
            }
        }
        System.out.println("La palabra es un palíndromo.");
    }
}