public class Ejercicio3 {
    public static void main (String[] args){
        double Sueldobase;
        double Totalpago;
        double Venta1;
        double Venta2;
        double Venta3;
        double Comision;

        System.out.println("Valor sueldo base");
        Sueldobase=Double.parseDouble(System.console().readLine());
       
        System.out.println("Valor venta 1");
       Venta1=Double.parseDouble(System.console().readLine());

       System.out.println("Valor venta 2");
       Venta2=Double.parseDouble(System.console().readLine());

       System.out.println("Valor venta 3");
       Venta3=Double.parseDouble(System.console().readLine());


       Comision=(Venta1*0.1)+(Venta2*0.1)+(Venta3*0.1);
       Totalpago=Sueldobase+Comision;

        
       
       System.out.println("El total a pagar es "+Totalpago);

    

    }
}
