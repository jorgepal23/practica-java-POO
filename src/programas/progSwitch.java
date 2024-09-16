package programas;
import java.util.Scanner;
public class progSwitch {
    public static void progSwitch() {
        System.out.printf(" -----------------------------------------------------------------------------------------------------------------------------" + "\n");
        System.out.printf(" -     Programa Switch                                                                                                       -" + "\n");
        System.out.printf(" -     Determina la calificación de acuerdo al numero ingresado                                                              -" + "\n");
        System.out.printf(" -     Si es 1 o 2 Su calificación es:F,Si es 3 o 4 Su calificación es:D,Si es 5 o 6 Su calificación es: C                   -" + "\n");
        System.out.printf(" -     Si es 7 o 8 Su calificación es: B, Si es 9 o 10 Su calificación es: A                                                 -" + "\n");
        System.out.printf(" ---------------------------------------------------------------------------------------------------------------------------  " + "\n");
        Scanner calificacion = new Scanner(System.in);
        System.out.println("Ingrese calificación");
        int cal = calificacion.nextInt();
        switch (cal) {
            case 1:
            case 2:
                System.out.println("Calificación F");
                break;
            case 3:
            case 4:
                System.out.println("Calificación D");
                break;
            case 5:
            case 6:
                System.out.println("Calificación C");
                break;
            case 7:
            case 8:
                System.out.println("Calificación B");
                break;
            case 9:
            case 10:
                System.out.println("Calificación A");
                break;
            default:
                System.out.println("Número no válido, por favor verifique");
                break;
        }
        System.out.println("Clic enter para volver al menu anterior ");
    }
}
