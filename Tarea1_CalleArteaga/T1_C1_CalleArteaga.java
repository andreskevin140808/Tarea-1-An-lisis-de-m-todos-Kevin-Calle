import java.util.Scanner;

/**
 * Tarea 1 - Parte C1: Planilla de agua potable
 * Autor: Kevin Andres Calle Arteaga
 *
 * Calcula el valor a pagar por el consumo de agua potable de un
 * usuario, aplicando una tarifa escalonada y un cargo fijo mensual.
 */
public class T1_C1_CalleArteaga {

    /**
     * leerConsumo: solicita al usuario el consumo en metros cubicos
     * y repite la peticion hasta recibir un valor mayor o igual a 0.
     */
    static double leerConsumo(Scanner entradaDatos) {
        double caudalRegistrado;
        do {
            System.out.print("Ingrese el consumo de agua en m3: ");
            caudalRegistrado = entradaDatos.nextDouble();
            if (caudalRegistrado < 0) {
                System.out.println("El consumo no puede ser negativo, intente de nuevo.");
            }
        } while (caudalRegistrado < 0);
        return caudalRegistrado;
    }

    /**
     * calcularValor: aplica la tarifa escalonada (hasta 15 m3 a $0.40,
     * el excedente a $0.75) mas un cargo fijo de $2.50.
     */
    static double calcularValor(double caudalRegistrado) {
        final double TARIFA_BASICA = 0.40;
        final double TARIFA_EXCEDENTE = 0.75;
        final double CARGO_FIJO = 2.50;
        final double LIMITE_BASICO = 15.0;

        double importeCalculado;
        if (caudalRegistrado <= LIMITE_BASICO) {
            importeCalculado = caudalRegistrado * TARIFA_BASICA;
        } else {
            double excedente = caudalRegistrado - LIMITE_BASICO;
            importeCalculado = (LIMITE_BASICO * TARIFA_BASICA) + (excedente * TARIFA_EXCEDENTE);
        }
        importeCalculado += CARGO_FIJO;
        return importeCalculado;
    }

    /**
     * mostrarPlanilla: imprime el detalle de la planilla con el
     * consumo registrado y el valor final a pagar.
     */
    static void mostrarPlanilla(double caudalRegistrado, double importeFinal) {
        System.out.println("----- PLANILLA DE AGUA POTABLE -----");
        System.out.printf("Consumo registrado: %.2f m3%n", caudalRegistrado);
        System.out.printf("Valor a pagar: $%.2f%n", importeFinal);
        System.out.println("-------------------------------------");
    }

    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);

        System.out.println("=== Caso de prueba 1: consumo dentro del tramo basico ===");
        double consumo1 = leerConsumo(entradaDatos);
        double valor1 = calcularValor(consumo1);
        mostrarPlanilla(consumo1, valor1);

        System.out.println();
        System.out.println("=== Caso de prueba 2: consumo con excedente ===");
        double consumo2 = leerConsumo(entradaDatos);
        double valor2 = calcularValor(consumo2);
        mostrarPlanilla(consumo2, valor2);

        entradaDatos.close();
    }
}
