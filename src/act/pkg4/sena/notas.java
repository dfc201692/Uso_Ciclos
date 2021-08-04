package act.pkg4.sena;

import java.util.Scanner;

public class notas {

    public static void main(String[] args) {

        float prom=0, calif, suma=0;
        int notas = 3;
        
        Scanner s = new Scanner(System.in);
    
        for(int x=0; x<notas;x++){
            System.out.println("Escriba la calificación "+(x+1)+": ");
            calif = s.nextFloat();
            suma = suma +calif;
        }
        prom = suma/notas;
        System.out.println("El promedio es de: "+prom);

    }
    
}
