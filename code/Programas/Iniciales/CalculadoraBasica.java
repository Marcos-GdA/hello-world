// Pedir dos números.
// Elegir suma, resta, multiplicación o división.
// Practicar Scanner, switch y métodos.

import java.util.Scanner;
public class CalculadoraBasica {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int ope = 0;
        int res = 0;
        
        System.out.println("Ingrese el primer número: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int num2 = sc.nextInt();

        System.out.println("¿Qué operación desea realizar? [1 | SUMA] [2 | RESTA] [3 | MULTIPLICACIÓN] [4 | DIVISIÓN]");
        ope = sc.nextInt();

        operaciones(ope, num1, num2);

    }

    public static int operaciones(int ope, int num1, int num2){
        int res = 0;

        switch (ope) {
            case 1:
                System.out.println("SUMA");
                res = num1 + num2;
                System.out.println("El resultado es: " + res);
                break;
            case 2:
                System.out.println("RESTA");
                res = num1 - num2;
                System.out.println("El resultado es: " + res);
                break;
            case 3:
                System.out.println("MULTIPLICACIÓN");
                res = num1 * num2;
                System.out.println("El resultado es: " + res);
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("DIVISIÓN");
                    res = num1 / num2;
                    System.out.println("El resultado es: " + res);
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                break;
            default:
                System.out.println("Operación no válida.");
        }
        
        return res;
    }
}