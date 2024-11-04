import java.util.Scanner;

public class Shakespeare {

    public static void ejercicio() {
        int iNumeroCasos=0;
        int iContadorAniosBisiestosDesdeCambio=0;

        Scanner sc = new Scanner(System.in);

        while (iNumeroCasos<1){
            System.out.println("Introduzca el número de casos que desea analizar (el número ha de ser mayor o igual a 1): ");
            iNumeroCasos=sc.nextInt();
            sc.nextLine();

        }

        int[][] arryCasoDiaMesAnioEspana = new int[iNumeroCasos][3];
        int[][] arryCasoDiaMesAnioInglaterra = new int[iNumeroCasos][3];

        for (int i=0; i< arryCasoDiaMesAnioEspana.length; i++){
            System.out.println("Introduzca el día de la fecha nº "+(i+1));
            arryCasoDiaMesAnioEspana[i][0]= sc.nextInt();
            sc.nextLine();
            System.out.println("Introduzca el mes de la fecha nº "+(i+1));
            arryCasoDiaMesAnioEspana[i][1]= sc.nextInt();
            sc.nextLine();
            System.out.println("Introduzca el año de la fecha nº "+(i+1)+" ¡HA DE ESTAR COMPRENDIDO ENTRE EL AÑO 1 Y EL 2000");
            arryCasoDiaMesAnioEspana[i][2]= sc.nextInt();
            sc.nextLine();
        }

        for(int i=0; i<arryCasoDiaMesAnioEspana.length; i++){
            if(arryCasoDiaMesAnioEspana[i][2]<1582 || arryCasoDiaMesAnioEspana[i][2]>1752 || (arryCasoDiaMesAnioEspana[i][2]==1582 && arryCasoDiaMesAnioEspana[i][1]<10) || (arryCasoDiaMesAnioEspana[i][2]==1582 && arryCasoDiaMesAnioEspana[i][1]==10 && arryCasoDiaMesAnioEspana[i][0]<5) || (arryCasoDiaMesAnioEspana[i][2]==1752 && arryCasoDiaMesAnioEspana[i][1]>9) || (arryCasoDiaMesAnioEspana[i][2]==1752 && arryCasoDiaMesAnioEspana[i][1]==9 && arryCasoDiaMesAnioEspana[i][0]>13) ){
                arryCasoDiaMesAnioInglaterra[i]=arryCasoDiaMesAnioEspana[i];
            }else{
                //Calculamos cuántos días bisiestos "ingleses" habría
                for(int j=1583; j<=arryCasoDiaMesAnioEspana[i][2]; j++){
                    if(j%100==0 && j%400==0){
                        iContadorAniosBisiestosDesdeCambio++;
                    }
                }
                //Asignamos las fechas aplicando las correcciones de los días pertinentes
                arryCasoDiaMesAnioInglaterra[i][2]=arryCasoDiaMesAnioEspana[i][2];
                arryCasoDiaMesAnioInglaterra[i][1]=arryCasoDiaMesAnioEspana[i][1];
                arryCasoDiaMesAnioInglaterra[i][0]=((arryCasoDiaMesAnioEspana[i][0]-iContadorAniosBisiestosDesdeCambio)+10);
                //Factorizo las fechas para que se ajusten a los formatos de fecha
                for(int j=0){

                }


            }
            iContadorAniosBisiestosDesdeCambio=0;
        }

        for(int i=0; i<arryCasoDiaMesAnioInglaterra.length; i++){
            System.out.print("La fecha nº "+(i+1)+" del calendario español, corresponde al "+arryCasoDiaMesAnioInglaterra[i][0]+" de "+arryCasoDiaMesAnioInglaterra[i][1]+" de "+arryCasoDiaMesAnioInglaterra[i][2]);
        }
        sc.close();

    }

}
