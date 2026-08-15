import java.util.Scanner;

public class Ejercicio2 {
        public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el capital que desea invertir: ");
        int capital = teclado.nextInt();

        int ganancia = capital * 2 / 100;

        System.out.println("La ganancia después de un mes es: $" + ganancia);

        teclado.close();
    }
}
