import java.util.Scanner;

public class Ejercicio1 {
        public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la edad de la primera persona: ");
        int edad1 = teclado.nextInt();

        System.out.print("Ingrese la edad de la segunda persona: ");
        int edad2 = teclado.nextInt();

        System.out.print("Ingrese la edad de la tercera persona: ");
        int edad3 = teclado.nextInt();

        int promedio = (edad1 + edad2 + edad3) / 3;

        System.out.println("El promedio de edad es: " + promedio);

        teclado.close();
    }
}
