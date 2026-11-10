package taller_7;

public class prueba_CBancaria {
    public static void main(String[] args){

        CuentaBancaria cuenta1 = new CuentaBancaria(23586,300000,"ahorro");

        System.out.println("Tipo de cuenta: " + cuenta1.tipoCuenta);

        cuenta1.setSaldo(500000);
        System.out.println("El saldo es: "+ cuenta1.getSaldo());

        cuenta1.mostrarDetalle();

        /*System.out.println(cuenta1.numeroCuenta);
        *
        * Esta línea genera un error porque numeroCuenta es privado
        * y estamo intentando acceder a él desde otra clase
        * sin utilizar un metodo de acceso.
        *  */

    }
}
