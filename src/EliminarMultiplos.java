import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EliminarMultiplos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);
        numeros.add(7);
        numeros.add(12);
        numeros.add(9);

        System.out.println("Lista inicial: " + numeros);

        System.out.print("Introduce el número para eliminar sus múltiplos: ");
        int divisor = sc.nextInt();

        eliminarMultiplos(numeros, divisor);

        System.out.println("Lista después de eliminar múltiplos de " + divisor + ": " + numeros);

        sc.close();
    }

    public static void eliminarMultiplos(ArrayList<Integer> lista, int divisor) {

        Iterator<Integer> it = lista.iterator();

        while (it.hasNext()) {
            int num = it.next();

            if (num % divisor == 0) {
                it.remove();
            }
        }
    }
}
