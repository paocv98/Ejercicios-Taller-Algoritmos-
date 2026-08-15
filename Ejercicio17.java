public class Ejercicio17 {
    public static void main (String[] args) {

        double PrecioVF;
        double PrecioVP;
        double Descuento;

        

        System.out.println("Ingrese el precio final pagado: ");
        PrecioVF = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese el precio de venta al publico del producto: ");
        PrecioVP = Double.parseDouble(System.console().readLine());

        Descuento = (PrecioVP - PrecioVF)/100;

        System.out.println("El porcentaje de descuento realizado es de :"+Descuento+"%");

}
}
