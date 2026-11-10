package taller_7;

public class PruebaUtilidades {
    public static void main(String[] args){
        int num1 = 12;
        int num2 = 7;

        System.out.println("Prueba el metodo matematica");
        System.out.println("Numero 1: "+ num1);
        System.out.println("Numero 2: "+ num2);

        double suma = Utilidades.sumar(num1, num2);
        double resta = Utilidades.restar(num1, num2);
        double multiplicacion = Utilidades.multiplicacion(num1, num2);
        double division = Utilidades.dividir(num1, num2);

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
    }
}
