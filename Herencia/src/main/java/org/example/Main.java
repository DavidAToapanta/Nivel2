package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
        Administrador administrador1 = new Administrador("David", "05037910220", 4565,"Tiene bono");
        Recepcionista recepcionista1 = new Recepcionista("Samira", "0503791025", 10000);

        administrador1.trabajar();
        administrador1.mostrarInfoEmpledo();

        System.out.println("=================");

        recepcionista1.trabajar();
        recepcionista1.mostrarInfoEmpledo();
    }
}
