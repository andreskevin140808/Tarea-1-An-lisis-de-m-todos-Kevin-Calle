/**
 * Tarea 1 - Parte C2: Calculo de notas y estado academico
 * Autor: Kevin Andres Calle Arteaga
 */
public class T1_C2_CalleArteaga {

    /** promedio: calcula el promedio simple de tres calificaciones. */
    static double promedio(double notaUno, double notaDos, double notaTres) {
        return (notaUno + notaDos + notaTres) / 3.0;
    }

    /**
     * estado: clasifica el promedio en Aprobado (>=14), Supletorio
     * (9 a 13.99) o Reprobado (menor a 9).
     */
    static String estado(double promedioFinal) {
        if (promedioFinal >= 14) {
            return "Aprobado";
        } else if (promedioFinal >= 9) {
            return "Supletorio";
        } else {
            return "Reprobado";
        }
    }

    /**
     * necesitaEnSupletorio: calcula la nota minima que se necesita en el
     * supletorio para que el promedio entre la nota actual y el
     * supletorio llegue a 14. El resultado se limita entre 0 y 20.
     */
    static double necesitaEnSupletorio(double notaActual) {
        double notaRequerida = (14 * 2) - notaActual;
        if (notaRequerida > 20) {
            return 20; // no es posible superar la nota maxima
        }
        if (notaRequerida < 0) {
            return 0;
        }
        return notaRequerida;
    }

    public static void main(String[] args) {
        System.out.println("=== Caso de prueba 1: estudiante Aprobado ===");
        double promedio1 = promedio(16, 15, 14);
        System.out.println("Promedio: " + promedio1);
        System.out.println("Estado: " + estado(promedio1));

        System.out.println();
        System.out.println("=== Caso de prueba 2: estudiante en Supletorio ===");
        double promedio2 = promedio(10, 9, 11);
        System.out.println("Promedio: " + promedio2);
        System.out.println("Estado: " + estado(promedio2));
        System.out.println("Nota minima necesaria en supletorio: " + necesitaEnSupletorio(promedio2));
    }
}
