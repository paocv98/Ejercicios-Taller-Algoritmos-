public class Ejercicio4 {
    public static void main(String[] args) {
        
        float descuento;
        float compra;
        float totalcompra;

        System.out.println("cuanto pagaria inicialmente el cliente por su compra   ");
        compra=Float.parseFloat(System.console().readLine());
        descuento=compra*15/100;
        totalcompra=compra-descuento;

        System.out.println("total compra "+totalcompra);



        

    

    

    }
    
}
