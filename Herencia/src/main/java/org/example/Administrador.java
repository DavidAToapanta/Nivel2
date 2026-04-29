package org.example;

public class Administrador extends Empledo{
    private String bono;

    public Administrador(String nombre, String cedula, double salario, String bono) {
        super(nombre, cedula, salario);
        this.bono = bono;
    }


    @Override
    public void trabajar(){
        System.out.println(nombre + "Trabaja en Administracion" );
    }

    @Override
    public void mostrarInfoEmpledo() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Cedula: " + getCedula());
        System.out.println("Salario: " + getSalario());
        System.out.println("Bono: " + bono);
    }

}
