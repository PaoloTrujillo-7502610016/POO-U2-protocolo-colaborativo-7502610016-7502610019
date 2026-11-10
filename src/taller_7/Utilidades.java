package taller_7;

public class Utilidades {
    int num1;
    int num2;

    public static double sumar(int num1, int num2) {
        return num1 + num2;
    }

    public static double restar (int num1,int num2){
        return num1 - num2;
    }

    public static double multiplicacion (int num1,int num2){
        return num1 * num2;
    }
    public static double dividir(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("No se puede dividir entre cero.");
            return 0;
        }
        return num1 / num2;
    }

}
