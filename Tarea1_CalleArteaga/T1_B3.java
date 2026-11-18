/**
 * Tarea 1 - Parte B3: Paso de parametros y ambito
 * Autor: Kevin Andres Calle Arteaga
 *
 * Codigo tal como aparece en el enunciado, usado para verificar en el
 * computador la salida predicha a mano (3 30 4).
 */
public class T1_B3 {
    static void modificar(int n, int[] v) {
        n = n * 10;
        v[0] = v[0] * 10;
        v = new int[]{-1, -1};
        v[1] = 99;
    }

    public static void main(String[] args) {
        int n = 3;
        int[] v = {3, 4};
        modificar(n, v);
        System.out.println(n + " " + v[0] + " " + v[1]);
    }
}
