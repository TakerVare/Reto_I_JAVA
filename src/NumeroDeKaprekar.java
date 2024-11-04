import java.util.Scanner;

public class NumeroDeKaprekar {

    public static void ejercicio() {
        int iNumeroIntroducido;
        long lCuadradoNumero;
        int iAuxUno=0;
        int iAuxDos=0;

        String sMemoria;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número entre 1 y 65536:");
        iNumeroIntroducido = sc.nextInt();
        sc.nextLine();

        while (iNumeroIntroducido!=0){
            lCuadradoNumero = (long) (iNumeroIntroducido*iNumeroIntroducido);

            sMemoria = String.valueOf(lCuadradoNumero);
            /*
            if(sMemoria.length()%2==0){
                iAuxUno=Integer.parseInt(sMemoria.substring(0, ((sMemoria.length()/2))));
                iAuxDos=Integer.parseInt(sMemoria.substring(sMemoria.length() / 2));

            }
            else{
                if(sMemoria.length()>1){
                    iAuxUno=Integer.parseInt(sMemoria.substring(0, ((sMemoria.length()/2))));
                    iAuxDos=Integer.parseInt(sMemoria.substring((sMemoria.length() / 2)));
                }
                else{
                    iAuxUno=0;
                    iAuxDos=Integer.parseInt(sMemoria);
                }
            }
            */
            if(sMemoria.length()>1){
                iAuxUno=Integer.parseInt(sMemoria.substring(0, ((sMemoria.length()/2))));
                iAuxDos=Integer.parseInt(sMemoria.substring((sMemoria.length() / 2)));
                if(iAuxUno%10==0){
                    iAuxUno=iAuxUno/10;
                }
            }
            else{
                iAuxUno=0;
                iAuxDos=Integer.parseInt(sMemoria);
            }
            /*
            System.out.println("El cuadrado es: "+lCuadradoNumero);
            System.out.println("iAuxUno="+iAuxUno);
            System.out.println("iAuxDos="+iAuxDos);
            //System.out.println(sMemoria);
            */
            
            if(iAuxUno+iAuxDos==iNumeroIntroducido){
                System.out.println("SI");
            }
            else {
                System.out.println("NO");
            }

            System.out.println("Introduce un número entre 1 y 65536:");
            iNumeroIntroducido = sc.nextInt();
            sc.nextLine();

        }



        sc.close();

    }

}
