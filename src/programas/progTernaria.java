package programas;
import java.util.Scanner;
public class progTernaria {
    public static void progTernaria() {
        System.out.printf(" -----------------------------------------------------------------------------------------------------------------------------" + "\n");
        System.out.printf(" -     Programa Ternaria                                                                                                     -" + "\n");
        System.out.printf(" -     Determina si un numero es par o impar                                                                                 -" + "\n");
        System.out.printf(" ---------------------------------------------------------------------------------------------------------------------------- " + "\n");
        Scanner numero = new Scanner(System.in);
        System.out.println("Ingrese número");
        double n = numero.nextDouble();
        String resultado = (n % 2 == 0) ? "Par" : "Impar";
        System.out.println("El número es:" + resultado);
        System.out.println("Clic enter para volver al menu anterior ");
    }
}