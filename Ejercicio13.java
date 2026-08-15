public class Ejercicio13 {
    public static void main (String[] args) {

        

        double N1;
        double N2;
        double N3;
        double N4;
        double N5;
        double N6;
        double N7;
        double N8;
        double M1=50000;
        double M2=20000;
        double M3=10000;
        double M4=5000;
        double M5=2000;
        double M6=1000;
        double M7=500;
        double M8=100;
        double total;

        System.out.println("Ingrese la cantidad de billetes de "+M1+": ");
        N1 = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese la cantidad de billetes de "+M2+": ");
        N2 = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese la cantidad de billetes de "+M3+": ");
        N3 = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese la cantidad de billetes de "+M4+": ");
        N4 = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese la cantidad de billetes de "+M5+": ");
        N5 = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese la cantidad de billetes de "+M6+": ");
        N6 = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese la cantidad de billetes de "+M7+": ");
        N7 = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese la cantidad de billetes de "+M8+": ");
        N8 = Double.parseDouble(System.console().readLine());

        total = (N1*M1)+(N2*M2)+(N3*M3)+(N4*M4)+(N5*M5)+(N6*M6)+(N7*M7)+(N8*M8);

        System.out.println("El total de dinero es: "+total);

       
    }  
    
}
