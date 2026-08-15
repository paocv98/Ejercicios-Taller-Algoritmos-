public class Ejercicio20 {
    public static void main(String[] args) {
    double capital;
    double tiempo;
    double interes;
    double razon;

    System.out.println("Ingrese el capital prestado (Bolívares):");
    capital = Double.parseDouble(System.console().readLine());

    System.out.println("Ingrese el interés pagado (Bolívares):");
    interes = Double.parseDouble(System.console().readLine());

    tiempo = 4; // Tiempo en años

    razon = (interes * 100) / (capital * tiempo);

    System.out.println("El porcentaje anual cobrado por el préstamo es: " + razon + "%");
    
}
}