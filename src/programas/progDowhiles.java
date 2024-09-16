package programas;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class progDowhiles {
    public static void progDowhile() {
        System.out.printf(" -----------------------------------------------------------------------------------------------------------------------------" + "\n");
        System.out.printf(" -     Programa DO WHILE                                                                                                     -" + "\n");
        System.out.printf(" -     Adivina el numero                                                                                                     -" + "\n");
        System.out.printf(" ---------------------------------------------------------------------------------------------------------------------------- " + "\n");

        Scanner sdw = new Scanner(System.in);
        int numeroAlea = ThreadLocalRandom.current().nextInt(1, 10);
        double numeroUsuario;
        int intentos = 0;
        do {
            System.out.print("Ingresa tu número: ");
            numeroUsuario = sdw.nextDouble();
            intentos++;

            if (numeroUsuario < numeroAlea) {
                System.out.println("El número que he pensado es mayor.");
            } else if (numeroUsuario > numeroAlea) {
                System.out.println("El número que he pensado es menor.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número en " + intentos + " intentos.");
            }
        }
        while (numeroUsuario != numeroAlea);
        System.out.println("Clic enter para volver al menu anterior ");
    }
}
