// Introducir varias notas
// Calcular la media
// Mostrar si el alumno ha aprobado y su calificación

import java.util.Scanner;

public class CalculadoraDeNotas {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        introducirNotas();
    }

    public static void introducirNotas(){
        int numNot = 0;
        int not = 0;
        int notTot = 0;

        while (not >= 0) {
            System.out.println("Introduce la nota (un número negativo para terminar):");
            not = sc.nextInt();

            if (not < 0) {
                break;
            }

            notTot += not;
            numNot++;
        }

        calcularNotas(numNot, notTot);
    }

    public static void calcularNotas(int numNot, int notTot){
        int med = 0;

        med = notTot / numNot;

        if (med >= 5) {
            System.out.println("El alumno ha aprobado con una media de: " + med);
        } else {
            System.out.println("El alumno ha suspendido con una media de: " + med);
        }
    }
}