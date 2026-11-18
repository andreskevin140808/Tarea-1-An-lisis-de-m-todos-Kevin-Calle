/**
 * Tarea 1 - Parte C4 (Reto opcional): numero de Armstrong
 * Autor: Kevin Andres Calle Arteaga
 */
public class T1_C4_CalleArteaga {

    /** contarDigitos: cuenta cuantos digitos tiene un numero entero. */
    static int contarDigitos(int numero) {
        int cantidad = 0;
        int resto = Math.abs(numero);
        if (resto == 0) {
            return 1;
        }
        while (resto > 0) {
            resto /= 10;
            cantidad++;
        }
        return cantidad;
    }

    /** potencia: calcula base elevado a exponente sin usar Math.pow. */
    static int potencia(int base, int exponente) {
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    /**
     * esArmstrong: determina si un numero es de Armstrong, es decir,
     * si la suma de sus digitos elevados a la cantidad de digitos del
     * numero es igual al numero original.
     */
    static boolean esArmstrong(int numero) {
        int cantidadDigitos = contarDigitos(numero);
        int copiaNumero = numero;
        int sumaTotal = 0;

        while (copiaNumero > 0) {
            int digitoActual = copiaNumero % 10;
            sumaTotal += potencia(digitoActual, cantidadDigitos);
            copiaNumero /= 10;
        }
        return sumaTotal == numero;
    }

    public static void main(String[] args) {
        int[] casosPrueba = {153, 123};
        for (int numero : casosPrueba) {
            System.out.println(numero + " es Armstrong? " + esArmstrong(numero));
        }
    }
}
