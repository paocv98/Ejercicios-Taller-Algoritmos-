public class Ejercicio14 {
     public static void main (String[] args) {

        double a;
        double b;
        double c;
        double d;
        double e;
        double f;
        double x;
        double y;

        

        System.out.println("Ingrese el valor de a: ");
        a = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese el valor de b: ");
        b = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese el valor de c: ");
        c = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese el valor de d: ");
        d = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese el valor de e: ");
        e = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese el valor de f: ");
        f = Double.parseDouble(System.console().readLine());

        x = (c*e-b*f)/(a*e-b*d);
        y = (a*f-c*d)/(a*e-b*d);

        System.out.println("El valor de x es: "+x);
        System.out.println("El valor de y es: "+y);
    
}
}
