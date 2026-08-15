public class Ejercicio5 {
    public static void main(String[] args) {
        float Calificacion1;
        float Calificacion2;
        float Calificacion3;
        float Promedio1;
        float calificacionexamenfinal;
        float calificaciontrabajofinal;
        Float Promediototal;


        System.out.println("Calificacion1  ");
        Calificacion1=Float.parseFloat(System.console().readLine());

        System.out.println("Calificacion2  ");
        Calificacion2=Float.parseFloat(System.console().readLine());

        System.out.println("Calificacion3  ");
        Calificacion3=Float.parseFloat(System.console().readLine());

        Promedio1=((Calificacion1+Calificacion2+Calificacion3)/3)*55/100;
        System.out.println("El promedio es  "+Promedio1);

        System.out.println("calificacionexamenfinal");
        calificacionexamenfinal=Float.parseFloat(System.console().readLine());

        System.out.println("calificaciontrabajofinal");
        calificaciontrabajofinal=Float.parseFloat(System.console().readLine());

        Promediototal=(Promedio1+(calificacionexamenfinal*30/100)+(calificaciontrabajofinal*15/100));
        System.out.println("calificacion final " +Promediototal);
        






        
    }
    
}
