import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int iEjercicio;
        Scanner sc = new Scanner(System.in);

        System.out.println("Selecciona un ejercicio, siendo:");
        System.out.println("1 - Campos de fútbol.");
        System.out.println("2 - Número de Kaprekar.");
        System.out.println("3 - Número de Shakespeare.");
        iEjercicio = sc.nextInt();
        sc.nextLine();

        switch (iEjercicio){
            case 1:
                CamposDeFutbol.ejercicio();
                break;
            case 2:
                NumeroDeKaprekar.ejercicio();
                break;
            case 3:
                Shakespeare.ejercicio();
                break;

            default:
                System.out.println("No hay ejercicio con el índice seleccionado:");
                break;


        }




        sc.close();

    }
}