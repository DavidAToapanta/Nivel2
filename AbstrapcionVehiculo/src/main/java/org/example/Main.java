package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo("Toyota", "Corolla", "ATC20230", "Rojo");
        Vehiculo vehiculo2 = new Vehiculo("Kia", "Sportage", "PHT2014", "Verde");
        Vehiculo vehiculo3 = new Vehiculo("Ford", "Sportage", "PlT2015", "Negro");

        System.out.println("Vehiculo 1: Arranque y se detenga");
        vehiculo1.arrancar();
        vehiculo1.detener();
        vehiculo1.estado();

        System.out.println("Veiculo 2: intentente arrancar dos veces");
        vehiculo2.arrancar();
        vehiculo2.arrancar();
        vehiculo2.estado();

        System.out.println("Veiculo 3: intente detenerse estando apagado");
        vehiculo3.detener();
        vehiculo3.estado();
    }
}
