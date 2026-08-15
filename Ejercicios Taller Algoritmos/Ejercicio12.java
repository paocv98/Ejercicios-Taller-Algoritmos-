public class Ejercicio12 {
    
    public static void main (String[] args) {

        double Matematicas;
        double examen1;
        double tareaM1;
        double tareaM2;
        double tareaM3;
        double Fisica;
        double examen2;
        double tareaF1;
        double tareaF2;
        double Quimica;
        double examen3;
        double tareaQ1;
        double tareaQ2;
        double tareaQ3;
        double Promedio;

        

        System.out.println("Ingrese la nota del examen de matemáticas: ");
        examen1 = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese la nota de la primera tarea de matemáticas: ");
        tareaM1 = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese la nota de la segunda tarea de matemáticas: ");
        tareaM2 = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese la nota de la tercera tarea de matemáticas: ");
        tareaM3 = Double.parseDouble(System.console().readLine());

        Matematicas = (examen1 * 0.9) + (((tareaM1 + tareaM2 + tareaM3)/3) * 0.1);

        System.out.println("Ingrese la nota del examen de física: ");
        examen2 = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese la nota de la primera tarea de física: ");
        tareaF1 = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese la nota de la segunda tarea de física: ");
        tareaF2 = Double.parseDouble(System.console().readLine());

        Fisica = (examen2 * 0.8) + (((tareaF1 + tareaF2)/2) * 0.2);

        System.out.println("Ingrese la nota del examen de química: ");
        examen3 = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese la nota de la primera tarea de química: ");
        tareaQ1 = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese la nota de la segunda tarea de química: ");
        tareaQ2 = Double.parseDouble(System.console().readLine());

        System.out.println("Ingrese la nota de la tercera tarea de química: ");
        tareaQ3 = Double.parseDouble(System.console().readLine());

        Quimica = (examen3 * 0.85) + (((tareaQ1 + tareaQ2 + tareaQ3)/3) * 0.15);

        Promedio = (Matematicas + Fisica + Quimica)/3;

        System.out.println("La nota final de matemáticas es: " + Matematicas);
        System.out.println("La nota final de física es: " + Fisica);
        System.out.println("La nota final de química es: " + Quimica);
        System.out.println("El promedio final del estudiante en las tres materias es: " + Promedio);
    }

        
    
}
