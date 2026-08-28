// Pedir longitud de la contraseña
// Generar letras, números y símbolos aleatoriamente
// Practicar String, Random y Arrays

import java.util.Scanner;

public class GeneradorDeContraseñas {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int lon = inicioYLongitud();
        String[] cont = new String[lon];

        rellenarArray(cont);
    }

    public static int inicioYLongitud(){
        System.out.println("Bienvenido al generador de contraseñas");
        System.out.println("Ingrese la longitud de la contraseña: ");
        int lon = sc.nextInt();

        return lon;
    }

    public static void rellenarArray(String[] cont){
        System.out.print("CONTRASEÑA: ");

        for (int i=0; i<cont.length; i++){
            int tip = (int) (Math.random() * 3) + 1;

            switch (tip) {
                case 1:
                    letra(cont, i);
                    break;
                case 2:
                    numero(cont, i);
                    break;
                case 3:
                    caracter(cont, i);
                    break;
            }

            System.out.print(cont[i]);
        }

        
    }

    public static String[] letra(String[] cont, int i){
        String[] letras = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        int posAle = (int) (Math.random() * letras.length);
        
        cont[i] = letras[posAle];

        return cont;
    }

    public static String[] numero(String[] cont, int i){
        String[] numeros = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        int posAle = (int) (Math.random() * numeros.length);
        
        cont[i] = numeros[posAle];

        return cont;
    }

    public static String[] caracter(String[] cont, int i){
        String[] caracteres = {"!", "@", "#", "$", "%", "&", "/", "=", "*", "+"};
        int posAle = (int) (Math.random() * caracteres.length);
        
        cont[i] = caracteres[posAle];

        return cont;
    }
}