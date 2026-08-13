public class Ejercicio {
    public static void main (String[] args){
        int Edad1;
        int Edad2;
        int Edad3;
        int Promedio;

        System.out.println("Edad1  ");
        Edad1=Integer.parseInt(System.console().readLine());
        System.out.println("Edad2  ");
        Edad2=Integer.parseInt(System.console().readLine());
        System.out.println("Edad3  ");
        Edad3=Integer.parseInt(System.console().readLine());

        Promedio=(Edad1+Edad2+Edad3)/3;
        System.out.println("El promedio es  "+Promedio);



        


    }
    
}
