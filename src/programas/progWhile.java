package programas;
import java.util.Scanner;
public class progWhile {
    public static void progWhile() {
        System.out.printf(" -----------------------------------------------------------------------------------------------------------------------------" + "\n");
        System.out.printf(" -     Programa  WHILE                                                                                                       -" + "\n");
        System.out.printf(" -   Realizar la sumatoria de los números enteros comprendidos entre el 1 y el numero ingresado es decir, 1 + 2 + 3 + …. +   -" + "\n");
        System.out.printf(" ---------------------------------------------------------------------------------------------------------------------------- " + "\n");

        Scanner wp = new Scanner(System.in);
        System.out.println("ingresa hasta que numero quieres sumar");
        double  nu = wp.nextDouble();
        int contador = 1;
        double suma = 0;
        while (contador <= nu) {
            suma = suma + contador;
            contador++;
        }
        System.out.println("Suma = " + suma);

        System.out.println("Clic enter para volver al menu anterior ");
    }
}
