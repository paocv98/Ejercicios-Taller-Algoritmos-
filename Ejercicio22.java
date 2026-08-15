public class Ejercicio22 {
    public static void main(String[] args) {
        double precioContado;
        double cuotaMensual;
        double totalCuotas;
        double recargo;
        double porcentajeRecargo;

        System.out.println("Ingrese el precio por compra al contado (Bolívares):");
        precioContado = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese el valor de cada cuota mensual (Bolívares):");
        cuotaMensual = Double.parseDouble(System.console().readLine());

        totalCuotas = cuotaMensual * 12; // Total a pagar en 12 cuotas
        recargo = totalCuotas - precioContado; // Recargo por pagar en cuotas
        porcentajeRecargo = (recargo / precioContado) * 100; // Porcentaje de recargo

        System.out.println("El porcentaje de recargo por pagar en cuotas es: " + porcentajeRecargo + "%");
    }
    
}
