import java.util.Scanner;

public class PiedraPapelTijera {
    static Scanner sc = new Scanner(System.in);
    static int vic = 0, der = 0, emp = 0;

    public static void main(String[] args) {
        String nom = inicio();

        partida(nom);

        while (continuar() == true){
            partida(nom);
        }
    }

    public static String inicio(){
        System.out.println("Bienvenido al juego de Piedra, Papel o Tijera");
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Hola " + nombre + ", ¿está listo para jugar?");
        return nombre;
    }

    public static void partida(String nom){
        int eleJug = eleccionJugador();

        int eleIA = (int) (Math.random() * 3) + 1;

        jugadaElegida(eleJug, eleIA, nom);

        resultado(eleJug, eleIA);
    }

    public static int eleccionJugador(){
        System.out.println("Ingrese su elección: [1 | Piedra] [2 | Papel] [3 | Tijera]");
        int eleJug = sc.nextInt();
        while (eleJug != 1 && eleJug != 2 && eleJug != 3){
            System.out.println("Opción no válida. Introduzca una opción entre: [1], [2] y [3]");
            eleJug = sc.nextInt();
        }
        return eleJug;
    }

    public static void jugadaElegida(int eleJug, int eleIA, String nom){

        System.out.print(nom + ": ");
        switch (eleJug) {
            case 1:
                System.out.println("PIEDRA");
                break;
            case 2:
                System.out.println("PAPEL");
                break;
            case 3:
                System.out.println("TIJERA");
                break;
        }

        System.out.print("IA: ");
        switch (eleIA) {
            case 1:
                System.out.println("PIEDRA");
                break;
            case 2:
                System.out.println("PAPEL");
                break;
            case 3:
                System.out.println("TIJERA");
                break;
        }
    }

    public static void resultado(int eleJug, int eleIA){
        int res = 0;

        if (eleJug == eleIA){
            System.out.println("¡EMPATE!");
            res = 3;
        } else if ((eleJug == 1 && eleIA == 3) || (eleJug == 2 && eleIA == 1) || (eleJug == 3 && eleIA == 2)){
            System.out.println("¡GANASTE!");
            res = 1;
        } else {
            System.out.println("¡PERDISTE!");
            res = 2;
        }

        resultadoFinal(res);
    }

    public static boolean continuar(){
        boolean cont = true;
        
        System.out.println("¿Desea jugar otra partida? [1 | Sí] [2 | No]");
        int contN = sc.nextInt();

        while (contN != 1 && contN != 2){
            System.out.println("Opción no válida. Introduzca una opción entre: [1] y [2]");
            contN = sc.nextInt();
        }

        switch (contN) {
            case 1:
                cont = true;
                break;
            case 2:
                cont = false;
                break;
        }

        return cont;
    }

    public static void resultadoFinal(int res){

        switch (res) {
            case 1:
                vic++;
                break;
            case 2:
                der++;
                break;
            case 3:
                emp++;
                break;
        }

        if (vic > 0){
            System.out.println("Victorias: " + vic);        
        }
        if (der > 0){
            System.out.println("Derrotas: " + der);
        }
        if (emp > 0){
            System.out.println("Empates: " + emp);
        }
    }
}