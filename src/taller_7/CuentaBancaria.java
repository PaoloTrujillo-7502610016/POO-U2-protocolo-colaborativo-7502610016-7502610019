package taller_7;

public class CuentaBancaria {
    private int numeroCuenta;
    private double saldo;
    public String tipoCuenta;

    public CuentaBancaria(int numeroCuenta, double saldo, String tipoCuenta){
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;

        setSaldo(saldo);
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("el salario no puede ser negativo");
        }
    }

    public void mostrarDetalle(){
        System.out.println("Numero de cuenta: "+ numeroCuenta);
        System.out.println("Saldo: "+ saldo);
        System.out.println("Tipo de cuenta: "+ tipoCuenta);
    }
}
