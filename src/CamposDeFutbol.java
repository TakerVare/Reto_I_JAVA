import java.util.Scanner;

public class CamposDeFutbol {
    /**
     * Dado que estos valores van a permanecer inmutables durante
     * todo el ejercicio, hemos decido,a fin de facilitar su procesamiento,
     * declararlos como constantes.
     */
    public static final int iMinimoLargoAdmitido = 90;
    public static final int iMinimoAnchoAdmitido = 45;

    public static final int iMaximoLargoAdmitido = 120;
    public static final int iMaximoAnchoAdmitido = 90;

    public static void ejercicio() {
        int iNumeroCasosPrueba;
        Scanner sc = new Scanner(System.in);
        /**
        Vamos a utilizar unas variables con el área de los campos de futbol, para hacer más
        mantenible el código en caso de modificarse las dimensiones mínimas.
        */
        int iAreaMinimaCamposDeFutbol = iMinimoLargoAdmitido*iMinimoAnchoAdmitido;
        int iAreaMaximaCamposDeFutbol = iMaximoLargoAdmitido*iMaximoAnchoAdmitido;

        int iCasos[][];


        System.out.println("Introduce el número de casos de prueba que quieres realizar:");
        iNumeroCasosPrueba = sc.nextInt();
        sc.nextLine();

        iCasos = new int[iNumeroCasosPrueba][2];

        //Proceso de recogida de datos
        for(int i=0; i<iNumeroCasosPrueba;i++){
            System.out.println("Introduce el área para el caso de prueba Nº "+(i+1));
            iCasos[i][0] = sc.nextInt();
            sc.nextLine();
            System.out.println("Introduce la estimación en campos de fútbol para el caso de prueba Nº "+(i+1));
            iCasos[i][1] = sc.nextInt();
            sc.nextLine();

        }


        //Procesamiento de datos y salida de resultados
        for(int i=0; i<iNumeroCasosPrueba; i++){
            if( ( (iCasos[i][1]*iAreaMinimaCamposDeFutbol) <= iCasos[i][0] )  && ( (iCasos[i][1]*iAreaMaximaCamposDeFutbol) >= iCasos[i][0])){
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }
        }

        sc.close();

    }

}
