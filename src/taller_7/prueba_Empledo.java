package taller_7;

public class prueba_Empledo {
    public static void main(String[] args){

        Empleado empleado1 = new Empleado("bella",3000000);

        System.out.println("Nombre: "+ empleado1.nombre);
        System.out.println("Salario:"+ empleado1.getSalario() );

    }

}
