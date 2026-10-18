package taller_8;

public class Vehiculo {
    private String marca;
    private int velocidadMaxima;

    public Vehiculo(String marca, int velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void mostrarVehiculo(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Velocidad maxima: " + this.velocidadMaxima);
    }

}
