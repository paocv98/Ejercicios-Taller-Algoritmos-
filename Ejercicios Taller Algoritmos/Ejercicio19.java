public class Ejercicio19 {
    public static void main (String[] args) {

        double ValorI;
        double ValorP;
        double años;
        double Interes;
        double Razon;
        double Deuda;

        System.out.println("Digete el valor del prestamos: ");
        ValorI = Double.parseDouble(System.console().readLine());

        System.out.println("Digete el total abonado: ");
        ValorP = Double.parseDouble(System.console().readLine());

        System.out.println("Digete tiempo que ha tenido el prestamos en años: ");
        años = Double.parseDouble(System.console().readLine());

        System.out.println("Digete la razon de interes que genera el prestamos sin simbolo de porcentaje:(Ejmplo:5)"  );
        Razon = Double.parseDouble(System.console().readLine());

        Interes = (ValorI*Razon*años)/100 ;
        Deuda = (ValorI+Interes) - ValorP;

        System.out.println("Los intereses generados son: "+Interes);
        System.out.println("La deuda restante es de: "+Deuda);
    
}
}
