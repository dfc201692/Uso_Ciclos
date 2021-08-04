package act.pkg4.sena;

import java.util.Scanner;

/**
 * @author david.cruz
 */
public class Act4Sena {

    public static void main(String[] args) {

        int acum = 1;//acumulado
        float notas =0;
        float cn=3;

        Scanner s = new Scanner(System.in);
        //System.out.println("Ingrese la cantidad de notas a pormediar");
        //float cn = s.nextFloat();

        while (acum <= cn) {
            System.out.println("Ingrese la nota numero: " + acum);
            float n = s.nextFloat();
            notas +=n;
            acum++;
        }
        float promedio = notas/cn;
        System.out.println("El promedio es: "+promedio);
    }

}
