package taller_8;

public class Vehiculo {
    protected String marca;
    protected int velocidadMaxima;

    public Vehiculo(String marca, int velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void mostrarVehiculo(){
        System.out.println("Marca del vehiculo: " + this.marca);
        System.out.println("Velocidad maxima: " + this.velocidadMaxima);
    }

}
