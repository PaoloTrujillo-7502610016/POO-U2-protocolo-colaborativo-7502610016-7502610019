package taller_8;

public class Estudiante extends Persona{
    String matricula;

    Estudiante(String nombre, int edad, String matricula){
        super(nombre, edad);
        this.matricula = matricula;
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Matricula: "+matricula);
    }

}
