package programas;
import java.util.Scanner;
public class progIF {
    public static void progIF() {
        System.out.printf(" -----------------------------------------------------------------------------------------------------------------------------" + "\n");
        System.out.printf(" -     Programa Programa IF, ELSE, IF ELSE                                                                                   -" + "\n");
        System.out.printf(" -     Evalua las calificaciones de un estudiante, y muestra un mensaje de aprobado o reprobado, según la calificación.      -" + "\n");
        System.out.printf(" -----------------------------------------------------------------------------------------------------------------------------" + "\n");

        Scanner scanner = new Scanner(System.in);
        // Solicitar al usuario que ingrese su calificación
        System.out.print("Ingrese su calificación (0-100): ");
        double calificacion = scanner.nextDouble();
        // Evaluar la calificación usando sentencias IF, ELSE IF y ELSE
        if (calificacion >= 60) {
            System.out.println("¡Felicidades! Has aprobado.");
        } else if (calificacion >= 50) {
            System.out.println("Estás en recuperación. Necesitas mejorar.");
        } else {
            System.out.println("Lo siento, has reprobado.");
        }
        System.out.println("Clic enter para volver al menu anterior ");
    }
}
