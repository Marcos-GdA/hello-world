// Calcular el factorial usando un bucle.
// Como mejora, añadir una versión recursiva.
// Practicar métodos y tipos numéricos.

import java.util.Scanner;

public class CalculadoraDeFactoriales {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        introducirNumero();
    }

    public static void introducirNumero(){
        int num = 0;
        
        while (num<=1){
            System.out.println("Introduce el número:");
            num = sc.nextInt();

            if (num <= 1) {
                System.out.println("El número debe ser mayor que 1.");
            }
        }

        calcularFactorial(num);
    }

    public static void calcularFactorial(int num){
        int fac = 1;

        for (int i=num; i>=1; i--){
            fac = fac * i;
        }
        System.out.println("El factorial de " + num + " es: " + fac);
    }
}