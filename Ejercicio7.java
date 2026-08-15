public class Ejercicio7 {
    public static void main(String[] args) {
        double Metros;
        double Pies;
        double Pulgadas;
        System.out.println("Ingrese Los Metros Requeridos");
        Metros=Double.parseDouble(System.console().readLine());

        Pulgadas=(Metros*39.27);
        Pies=Metros*(39.27/12);
        System.out.println("Pulgadas"+ Pulgadas);
        System.out.println("Pies"+ Pies);

        
    }
}
