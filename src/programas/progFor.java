package programas;

import java.util.Scanner;

public class progFor {
    public static void progFor() {
        System.out.printf(" -----------------------------------------------------------------------------------------------------------------------------" + "\n");
        System.out.printf(" -     Programa FOR                                                                                                          -" + "\n");
        System.out.printf(" -   Realizar la sumatoria de los números enteros comprendidos entre el 1 y el 10, es decir, 1 + 2 + 3 + …. + 10             -" + "\n");
        System.out.printf(" ---------------------------------------------------------------------------------------------------------------------------- " + "\n");
        Scanner pf = new Scanner(System.in);
        System.out.println("ingresa hasta que numero quieres sumar");
        double nu = pf.nextDouble();
        double sum = 0;
        for (int i = 1; i <= nu; i++) {
            sum = sum + i;
        }
        System.out.println("Suma = " + sum);
        System.out.println("Clic enter para volver al menu anterior ");
    }
}
