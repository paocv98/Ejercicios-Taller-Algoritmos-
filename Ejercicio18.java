public class Ejercicio18 {
    public static void main (String[] args){

        double Ginecologia;
        double Traumatologia;
        double Pediatria;
        double Presupuesto;

        

        System.out.println("Digite el presupuesto anual: ");
        Presupuesto = Double.parseDouble(System.console().readLine());

        Ginecologia = Presupuesto * 0.4;
        Traumatologia = Presupuesto * 0.3;
        Pediatria = Presupuesto * 0.3;

        System.out.println("El presupuesto para Ginecología es de: "+Ginecologia);
        System.out.println("El presupuesto para Traumatología es de: "+Traumatologia);
        System.out.println("El presupuesto para Pediatría es de: "+Pediatria);
    
}
}
