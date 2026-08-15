public class Ejercicio23 {
    public static void main(String[] args) {
    double M = 452; // Kilogramos de harina obtenidos por tonelada de maíz
    double N = 197; // Litros de aceite obtenidos por tonelada de maíz
    double B1 = 132; // Precio por bulto de harina (24 paquetes)
    double B2 = 180; // Precio por caja de aceite (15 envases)
    double B3 = 7.50; // Precio al detal por kilogramo de harina
    double B4 = 14.50; // Precio al detal por litro de aceite

    // Calcular el ingreso total por la venta de cada tonelada de maíz
    double ingresoHarina = (M / 24) * B1 + (M % 24) * B3; // Ingreso por harina
    double ingresoAceite = (N / 15) * B2 + (N % 15) * B4; // Ingreso por aceite

    double ingresoTotal = ingresoHarina + ingresoAceite;

    System.out.println("Ingreso total por la venta de cada tonelada de maíz: " + ingresoTotal + " Bolívares");

    
}
}
