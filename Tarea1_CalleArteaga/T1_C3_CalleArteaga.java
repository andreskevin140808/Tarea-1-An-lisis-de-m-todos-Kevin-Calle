import java.util.Scanner;

/**
 * Tarea 1 - Parte C3: Volumenes con metodos sobrecargados
 * Autor: Kevin Andres Calle Arteaga
 */
public class T1_C3_CalleArteaga {

    /** volumen: calcula el volumen de un cubo dado el lado. */
    static double volumen(double lado) {
        return lado * lado * lado;
    }

    /** volumen: calcula el volumen de un cilindro dado el radio y la altura. */
    static double volumen(double radio, double altura) {
        return Math.PI * radio * radio * altura;
    }

    /** volumen: calcula el volumen de un prisma rectangular. */
    static double volumen(double largo, double ancho, double alto) {
        return largo * ancho * alto;
    }

    static void mostrarMenu() {
        System.out.println("===== MENU DE VOLUMENES =====");
        System.out.println("1. Cubo");
        System.out.println("2. Cilindro");
        System.out.println("3. Prisma rectangular");
        System.out.println("0. Salir");
        System.out.print("Elija una opcion: ");
    }

    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        int opcionElegida;

        do {
            mostrarMenu();
            opcionElegida = entradaDatos.nextInt();

            switch (opcionElegida) {
                case 1:
                    System.out.print("Ingrese el lado del cubo: ");
                    double lado = entradaDatos.nextDouble();
                    System.out.println("Volumen del cubo: " + volumen(lado));
                    break;
                case 2:
                    System.out.print("Ingrese el radio: ");
                    double radio = entradaDatos.nextDouble();
                    System.out.print("Ingrese la altura: ");
                    double altura = entradaDatos.nextDouble();
                    System.out.println("Volumen del cilindro: " + volumen(radio, altura));
                    break;
                case 3:
                    System.out.print("Ingrese el largo: ");
                    double largo = entradaDatos.nextDouble();
                    System.out.print("Ingrese el ancho: ");
                    double ancho = entradaDatos.nextDouble();
                    System.out.print("Ingrese el alto: ");
                    double alto = entradaDatos.nextDouble();
                    System.out.println("Volumen del prisma: " + volumen(largo, ancho, alto));
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
            System.out.println();
        } while (opcionElegida != 0);

        entradaDatos.close();
    }
}
