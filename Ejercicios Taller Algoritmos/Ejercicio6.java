public class Ejercicio6 {
    public static void main(String[] args) {
        int NumerodeMujeres;
        int NumerodeHombres;
        int PorcentajeM;
        int PorcentajeH;


        System.out.println(" NumerodeMujeres ");
        NumerodeMujeres=Integer.parseInt(System.console().readLine());

        System.out.println("NumerodeHombres");
        NumerodeHombres=Integer.parseInt(System.console().readLine());

        PorcentajeM=(NumerodeMujeres*100)/(NumerodeMujeres+NumerodeHombres);
        PorcentajeH=(NumerodeHombres*100)/(NumerodeHombres+NumerodeMujeres);
        System.out.println("El porcentaje de Mujeres es" +PorcentajeM+"%");
        System.out.println("El porcentaje de Hombres es" + PorcentajeH+"%");


        


        
    }
}
