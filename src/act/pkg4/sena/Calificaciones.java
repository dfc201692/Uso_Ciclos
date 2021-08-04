package act.pkg4.sena;

import java.util.Scanner;

public class Calificaciones {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("por favor digite la 1ra nota: ");
        float n1 = s.nextFloat();
        System.out.println("por favor digite la 2da nota: ");
        float n2 = s.nextFloat();
        System.out.println("por favor digite la 3ra nota: ");
        float n3 = s.nextFloat();

        float prom = (n1 + n2 + n3) / 3;

        System.out.println("Su promedio es: "+prom);
        if (prom < 3) {
            System.out.println("Lo siento, usted perdio la materia");
        } else {
            if (prom < 4) {
                System.out.println("Usted debe hacer recuperación");
            }else{
                System.out.println("Felicitaciones, Usted aprobo la materia");
            }
        }

    }

}
