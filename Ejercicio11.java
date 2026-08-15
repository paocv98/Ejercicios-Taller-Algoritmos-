public class Ejercicio11 {
    public static void main (String [] args) {

        String Nombre;
        double Nhoras;
        double ValorHora;
        double CantidadExtras;
        double Hextra;
        double Subtotal;
        double Paro;
        double Habitacional;
        double Ahorro;
        double Academica;
        double NHijos;
        double Hijo;
        double Hogar;
        double Total;

        

        System.out.println("Ingrese el nombre del trabajador: ");
        Nombre = System.console().readLine();

        System.out.println("Ingrese el número de horas trabajadas: ");
        Nhoras = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese el valor de la hora trabajada: ");
        ValorHora = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese la cantidad de horas extras trabajadas: ");
        CantidadExtras = Double.parseDouble(System.console().readLine());

        Hextra = (CantidadExtras * (ValorHora * 1.25));

        Subtotal = (Nhoras * ValorHora) + Hextra;

        Paro = Subtotal * 0.05;
        Habitacional = Subtotal * 0.02;
        Ahorro = Subtotal * 0.07;

        Academica = 25000;

        System.out.println("Ingrese el número de hijos: ");
        NHijos = Double.parseDouble(System.console().readLine());

        Hijo = NHijos * 17300;

        Hogar = 18000;

        Total = Subtotal - (Paro + Habitacional + Ahorro)+ Academica + Hijo + Hogar;
    
        System.out.println("Asignaciones:\n Horas Extras: " + Hextra + "\n Actualización Académica: " + Academica + "\n Asignación por hijos: " + Hijo + "\n Asignación por hogar: " + Hogar);
        System.out.println("Deducciones:\n Paro Forzoso: " + Paro + "\n Politica Habitacional: " + Habitacional + "\n Caja Ahorro: " + Ahorro);
        System.out.println("El salario final del trabajador " + Nombre + " es: " + Total);

        

    }
    
}
