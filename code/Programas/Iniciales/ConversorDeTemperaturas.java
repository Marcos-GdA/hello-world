// Convertir entre Celsius, Fahrenheit y Kelvin.
// Practicar fórmulas, menús y validación de datos.
// Por ejemplo: Celsius → Fahrenheit.

import java.util.Scanner;
public class ConversorDeTemperaturas {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String []args){
        elegirConversion(ingresarTemperatura());
        while (continuar() == true){
            elegirConversion(ingresarTemperatura());
        }
    }

    public static double ingresarTemperatura(){
        System.out.println("Ingrese la temperatura en grados Celsius: ");
        double cel = sc.nextDouble();

        return cel;
    }

    public static void elegirConversion(double cel){
        int ele = 0;
        while (ele !=1 && ele !=2){
            System.out.println("¿A qué unidad desea convertir la temperatura? [1 | Fahrenheit] [2 | Kelvin]");
            ele = sc.nextInt();

            switch (ele) {
                case 1:
                    System.out.println("Fahrenheit");
                    Farenheit(cel);
                    break;
                case 2:
                    System.out.println("Kelvin");
                    Kelvin(cel);
                    break;
                default:
                    System.out.println("Opción no válida. Introduzca una opción entre: [1] y [2]");
                    break;
            }
        }
    }

    public static void Farenheit(double cel){
        double far = (cel * 9/5) + 32;
        System.out.println("La temperatura en Fahrenheit es: " + far);
    }

    public static void Kelvin(double cel){
        double kel = cel + 273.15;
        System.out.println("La temperatura en Kelvin es: " + kel);
    }

    public static boolean continuar(){
        boolean cont = true;
        int contN = 0;

        while (contN != 1 && contN != 2){
            System.out.println("¿Desea ingresar otra temperatura? [1 | Sí] [2 | No]");
            contN = sc.nextInt();

            switch (contN) {
                case 1:
                    cont = true;
                    break;
                case 2:
                    cont = false;
                    break;
                default:
                    System.out.println("¿Desea ingresar otra temperatura? [1 | Sí] [2 | No]");
                    contN = sc.nextInt();
            }
        }

        return cont;
    }
}