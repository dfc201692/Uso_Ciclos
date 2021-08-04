package act.pkg4.sena;

import java.util.Scanner;

public class promedioAlumno {

    public static void main(String[] args) {

        Scanner z = new Scanner(System.in);
        System.out.println("Promedio Alumno");
        int i =1;
        float a,s=0,p=0;
        do{
            System.out.println("Califiacion numero "+i);
            a=z.nextFloat();
            s=a+s;
            p=s/3;
            i++;
        
        }while(i<4);
        System.out.println("Su promedio es: "+p);
        
    }

}
