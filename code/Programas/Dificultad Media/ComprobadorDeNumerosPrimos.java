// Pedir un número.
// Indicar si es primo.
// Añadir una opción para mostrar todos los primos hasta un límite.

import java.util.Scanner;

public class ComprobadorDeNumerosPrimos {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){

        menu();

        while (continuar()==true){
            menu();
        }
    }

    public static boolean continuar(){
        System.out.println("¿Quieres salir? [1 | SI] [2 | NO]");
        int res = sc.nextInt();

        while (res != 1 && res != 2){
            System.out.println("Introduce un valor válido [1 | SI] [2 | NO]");
            res = sc.nextInt();
        }

        if (res==1){
            return false;
        } else if (res==2){
            return true;
        }

        return true;
    }

    public static void menu(){
        System.out.println("MENÚ:");
        System.out.println("[1 | Indicar si un número es primo]");
        System.out.println("[2 | Mostrar lista de primos]");
        int opc = sc.nextInt();

        switch (opc){
            case 1:
                pedirNumero();
                break;
            case 2:
                listaPrimos();
                break;
            default:
                System.out.println("Introduce una opción válida");
        }
    }

    public static void pedirNumero(){
        System.out.println("Introduce un número: ");
        int num = sc.nextInt();

        comprobarPrimo(num);

        if (comprobarPrimo(num)==true){
            System.out.println(num + " es primo.");
        } else {
            System.out.println(num + " no es primo.");
        }
    }

    public static void listaPrimos(){
        System.out.println("¿Hasta que número quiere mostrar primos?");
        int num = sc.nextInt();

        System.out.println("Lista de primos del 1 al " + num);
        for (int j=1; j<=num; j++){
            if (comprobarPrimo(j)==true){
                System.out.println(j);
            } else {
                continue;
            }
            
        }
    }

    public static boolean comprobarPrimo(int num){
        if (num < 2){
            return false;
        }

        for (int i=2; i<num; i++){
            if (num%i==0){
                return false;
            }
        }

        return true;
    }
}