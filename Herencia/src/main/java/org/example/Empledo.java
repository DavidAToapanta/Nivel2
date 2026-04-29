package org.example;

public class Empledo {
    protected String nombre;
    protected String cedula;
    protected  double salario;


    public Empledo(String nombre, String cedula, double salario) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.salario = salario;
    }

    public void mostrarInfoEmpledo() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Cedula: " + this.cedula);
        System.out.println("Salario: " + this.salario);
    }

    public void trabajar(){
        System.out.println(nombre + "Trabaja en: ");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
