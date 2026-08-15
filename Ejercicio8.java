public class Ejercicio8 {
 public static void main(String[] args) {
    double a;
    double b;
    double c;
    double semi;
    double aux;
    double area;
    System.out.println("longitud lado 1a");
     a=Integer.parseInt(System.console().readLine());
    System.out.println("longitud lado 2b");
    b=Integer.parseInt(System.console().readLine());
    System.out.println("longitud lado 3c");
    c=Integer.parseInt(System.console().readLine());

    semi=(a+b+c)/2;
    System.out.println("el valor de la semi area es" +semi);
    aux = (a-b) *(semi-b )* (semi-c);
    System.out.println("el valor del area sin raiz es"+aux);
    area = (double) Math.sqrt(aux); 
    System.out.println(" area es igual a"+ area);





 }   
}
