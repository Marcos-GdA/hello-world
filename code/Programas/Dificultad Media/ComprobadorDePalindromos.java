//Comprobar si una palabra se lee igual al derecho y al revés.
// Ignorar mayúsculas, minúsculas y espacios.
// Ejemplo: reconocer.

import java.util.Scanner;

public class ComprobadorDePalindromos {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        
    }

    public static void introducirPalabra(){
        System.out.println("Introduce la palabra a comprobar: ");
        String pal = sc.next();

        comprobarPar(pal);
    }

    public static void comprobarPar(String pal){
        int mitN = pal.length() / 2;
        int mitP = 0;

        if (pal.length() %2 == 0){
            mitP = mitN + 1;
        } else if (pal.length() %2 != 0){
            mitP = mitN + 2;
        }

        recorrerPalabra(pal, mitN, mitP);
    }

    public static void recorrerPalabra(String pal, int mitN, int mitP){
        for (int i=mitP; i>=0; i--){
            
        }
    }
}