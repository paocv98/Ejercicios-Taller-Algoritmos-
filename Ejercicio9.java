public class Ejercicio9 {
    public static void main(String[] args) {
        double Salarioneto;
        double Numerodehorastrabajadas;
        double Preciodelahora;
        double Descuento20;
        double Totalpago;

        
        
        System.out.println("Ingrese el numero de horas trabajadas");
        Numerodehorastrabajadas=Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese el precio de la hora");
        Preciodelahora=Double.parseDouble(System.console().readLine());

        Salarioneto=Numerodehorastrabajadas*Preciodelahora;

        Totalpago=Salarioneto-(Salarioneto*0.2);

        System.out.println("Total a pagar con descuento"+Totalpago);
        


    }
    
}
