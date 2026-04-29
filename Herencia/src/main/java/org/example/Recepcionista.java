package org.example;

public class Recepcionista extends Empledo{
    public Recepcionista(String nombre, String cedula, double salario){
        super(nombre,cedula,salario);
    }

    @Override
    public void trabajar(){
        System.out.println(nombre + "Trabaja en Recepcion" );
    }
}
