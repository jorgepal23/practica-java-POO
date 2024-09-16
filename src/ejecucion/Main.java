package ejecucion;
import explicacion.Detalles;
import menus.MenuPpal;
import menus.SubMenus;
import programas.*;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class Main {
    public static void main(String[] args) {
        int x;
        do {
            Scanner enter = new Scanner(System.in);
            MenuPpal.menuPpal();
            System.out.println("ingresa la opcion que deseas: ");
            Scanner sc = new Scanner(System.in);
            x = sc.nextInt();
            switch (x) {
                case 1:
                    int y;
                    do {
                        SubMenus.menuPrimitivos();
                        System.out.println("ingresa la opcion que deseas: ");
                        Scanner dp = new Scanner(System.in);
                        y = dp.nextInt();
                        switch (y) {
                            case 1:
                                Detalles.expByte();
                                enter.nextLine();
                                break;
                            case 2:
                                Detalles.expShort();
                                enter.nextLine();
                                break;
                            case 3:
                                Detalles.expInt();
                                enter.nextLine();
                                break;
                            case 4:
                                Detalles.expLong();
                                enter.nextLine();
                                break;
                            case 5:
                                Detalles.expFloat();
                                enter.nextLine();
                                break;
                            case 6:
                                Detalles.expDouble();
                                enter.nextLine();
                                break;
                            case 7:
                                Detalles.expChar();
                                enter.nextLine();
                                break;
                            case 8:
                                Detalles.expBoolean();
                                enter.nextLine();
                                break;
                            case 0:
                                System.out.printf(" ----------------------------------------- " + "\n");
                                System.out.printf(" -     GRACIAS POR SU VISITA             - " + "\n");
                                System.out.printf(" ----------------------------------------- " + "\n");
                                break;
                            default:
                                System.out.printf(" ----------------------------------------- " + "\n");
                                System.out.printf(" -     OPCION INVALIDA                   - " + "\n");
                                System.out.printf(" ----------------------------------------- " + "\n");
                        }
                    } while (y != 0);
                    break;
                case 2:
                    Detalles.expString();
                    enter.nextLine();
                    break;
                case 3:
                    Detalles.expConstante();
                    enter.nextLine();
                    break;
                case 4:
                    int z;
                    do {
                        SubMenus.menuOperadores();
                        System.out.println("ingresa la opcion que deseas: ");
                        Scanner to = new Scanner(System.in);
                        z = to.nextInt();
                        switch (z) {
                            case 1:
                                Detalles.expAritmeticos();
                                enter.nextLine();
                                break;
                            case 2:
                                Detalles.expRelacionales();
                                enter.nextLine();
                                break;
                            case 3:
                                Detalles.expLogicos();
                                enter.nextLine();
                                break;
                            case 4:
                                Detalles.expAsignacion();
                                enter.nextLine();
                                break;
                            case 5:
                                Detalles.expIncDec();
                                enter.nextLine();
                                break;
                            default:
                                System.out.printf(" ----------------------------------------- " + "\n");
                                System.out.printf(" -     OPCION NO VALIDA                  - " + "\n");
                                System.out.printf(" ----------------------------------------- " + "\n");
                        }
                    } while (z != 0);
                    break;
                case 5:
                    int a;
                    do {
                        SubMenus.menuIfElse();
                        System.out.println("ingresa la opcion que deseas: ");
                        Scanner ie = new Scanner(System.in);
                        a = ie.nextInt();
                        switch (a) {
                            case 1:
                                Detalles.expIf();
                                enter.nextLine();
                                break;
                            case 2:
                                Detalles.expElseIf();
                                enter.nextLine();
                                break;
                            case 3:
                                Detalles.expElse();
                                enter.nextLine();
                                break;
                            case 4:
                                progIF.progIF();
                                enter.nextLine();
                                break;
                            default:
                                System.out.printf(" ----------------------------------------- " + "\n");
                                System.out.printf(" -     OPCION NO VALIDA                  - " + "\n");
                                System.out.printf(" ----------------------------------------- " + "\n");
                        }
                    }while (a != 0);
                    break;
                case 6:
                    int s;
                    do {
                        SubMenus.menuSwitch();
                        Scanner sw = new Scanner(System.in);
                        System.out.println("ingresa la opcion que deseas");
                        s = sw.nextInt();
                        switch (s) {
                            case 1:
                                Detalles.expSwitch();
                                enter.nextLine();
                                break;
                            case 2:
                                progSwitch.progSwitch();
                                enter.nextLine();
                                break;
                            default:
                                System.out.printf(" ----------------------------------------- " + "\n");
                                System.out.printf(" -     OPCION NO VALIDA                  - " + "\n");
                                System.out.printf(" ----------------------------------------- " + "\n");
                        }
                    }while (s != 0);
                    break;
                case 7:
                    int t;
                    do {
                        SubMenus.ternaria();
                        Scanner te = new Scanner(System.in);
                        System.out.println("ingresa la opcion que deseas");
                        t = te.nextInt();
                        switch (t) {
                            case 1:
                                Detalles.expTernaria();
                                enter.nextLine();
                                break;
                            case 2:
                                progTernaria.progTernaria();
                                enter.nextLine();
                                break;
                            default:
                                System.out.printf(" ----------------------------------------- " + "\n");
                                System.out.printf(" -     OPCION NO VALIDA                  - " + "\n");
                                System.out.printf(" ----------------------------------------- " + "\n");
                        }
                    }while (t != 0);
                    break;
                case 8:
                    int d;
                    do {
                        SubMenus.dowhile();
                        Scanner dw = new Scanner(System.in);
                        System.out.println("ingresa la opcion que deseas");
                        d = dw.nextInt();
                        switch (d) {
                            case 1:
                                Detalles.expDowhile();
                                enter.nextLine();
                                break;
                            case 2:
                                progDowhiles.progDowhile();
                                enter.nextLine();
                                break;
                            default:
                                System.out.printf(" ----------------------------------------- " + "\n");
                                System.out.printf(" -     OPCION NO VALIDA                  - " + "\n");
                                System.out.printf(" ----------------------------------------- " + "\n");
                        }
                    }while (d != 0);
                    break;
                case 9:
                    int w;
                    do {
                        SubMenus.whiles();
                        Scanner wh = new Scanner(System.in);
                        System.out.println("ingresa la opcion que deseas");
                        w = wh.nextInt();
                        switch (w) {
                            case 1:
                                Detalles.expWhile();
                                enter.nextLine();
                                break;
                            case 2:
                                progWhile.progWhile();
                                enter.nextLine();
                                break;
                            default:
                                System.out.printf(" ----------------------------------------- " + "\n");
                                System.out.printf(" -     OPCION NO VALIDA                  - " + "\n");
                                System.out.printf(" ----------------------------------------- " + "\n");
                        }
                    }while (w != 0);
                    break;
                case 10:
                    int f;
                    do {
                        SubMenus.fors();
                        Scanner fo = new Scanner(System.in);
                        System.out.println("ingresa la opcion que deseas");
                        f = fo.nextInt();
                        switch (f) {
                            case 1:
                                Detalles.expFor();
                                enter.nextLine();
                                break;
                            case 2:
                                progFor.progFor();
                                enter.nextLine();
                                break;
                            default:
                                System.out.printf(" ----------------------------------------- " + "\n");
                                System.out.printf(" -     OPCION NO VALIDA                  - " + "\n");
                                System.out.printf(" ----------------------------------------- " + "\n");
                        }
                    }while (f != 0);
                    break;
                case 0:
                    System.out.printf(" - Espero hayas aprendido algo, nos vemos en una proxima oportunidad lk - " + "\n");
                    break;
                default:
                    System.out.println("No existe el capitulo, verificar el menu de arriba");
            }
        }while (x != 0);
    }
}