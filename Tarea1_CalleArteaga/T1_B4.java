/**
 * Tarea 1 - Parte B4: Ambito de las variables (version CORREGIDA)
 * Autor: Kevin Andres Calle Arteaga
 *
 * El enunciado original tenia dos lineas que no compilaban:
 *   - System.out.println(i);        -> i es del for, no existe fuera de el
 *   - System.out.println(parcial);  -> parcial es local de sumar(), no
 *                                       es visible en main
 * Ambas se eliminaron para que el programa compile. La linea
 * "int total = 5;" SI compila (oculta/"shadowing" al campo estatico
 * total mientras dura main), asi que se dejo igual que en el enunciado.
 */
public class T1_B4 {
    static int total = 0;

    static void sumar(int x) {
        int parcial = x * 2;
        total += parcial;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            sumar(i);
        }
        System.out.println(total); // imprime 12
        int total = 5;
        System.out.println(total); // imprime 5 (oculta al campo estatico)
    }
}
