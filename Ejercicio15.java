public class Ejercicio15 {
     public static void main (String[] args) {

        double Lectura1;
        double Lectura2;
        double ValorKwh=750;
        double ValorL1;
        double ValorL2;

        

        System.out.println("Ingrese el valor de la lectura anterior de Kilovatios hora: ");
        Lectura1 = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese el valor de la lectura actual de Kilovatios hora: ");
        Lectura2 = Double.parseDouble(System.console().readLine());

        ValorL1 = Lectura1*ValorKwh;
        ValorL2 = Lectura2*ValorKwh;

        System.out.println("El valor de la lectura anterior es: "+ValorL1);
        System.out.println("El valor de la lectura actual es: "+ValorL2);
    
}
}
