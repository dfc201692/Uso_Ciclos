package act.pkg4.sena;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        int opc;
        Scanner s = new Scanner(System.in);

        System.out.println("Este programa calcula el promedio de estas materias \n");
        System.out.println("1. Matematicas");
        System.out.println("2. Español");
        System.out.println("3. Ingles \n");
        System.out.print("Digite la materia que desea calcular: ");

        opc = s.nextInt();

        switch (opc) {
            case 1:
                // Ciclo for
                float prom = 0,
                 calif,
                 suma = 0;
                int notas = 3;

                Scanner i = new Scanner(System.in);

                for (int x = 0; x < notas; x++) {
                    System.out.print("Escriba la calificación " + (x + 1) + ": ");
                    calif = i.nextFloat();
                    suma = suma + calif;
                }
                prom = suma / notas;
                System.out.println("El promedio de Matematicas es: " + prom);

                break;
            case 2:
                //Ciclo while
                int acum = 1;//acumulado
                float nota = 0,
                 cn = 3;

                Scanner p = new Scanner(System.in);

                while (acum <= cn) {
                    System.out.print("Ingrese la nota numero: " + acum);
                    float n = p.nextFloat();
                    nota += n;
                    acum++;
                }
                float promedio = nota / cn;
                System.out.println("El promedio de Español es: " + promedio);
                break;
            case 3:
                //Ciclo do while
                Scanner z = new Scanner(System.in);
                int t = 1;
                float a,
                 k = 0,
                 w = 0;
                do {
                    System.out.print("Califiacion numero " + t);
                    a = z.nextFloat();
                    k = a + k;
                    w = k / 3;
                    t++;

                } while (t < 4);
                System.out.println("El promedio de Ingles es: " + w);
                break;
            default:
                System.out.println("No existe la opción");
                break;
        }

    }

}
