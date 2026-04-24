package org.example;

public class Vehiculo {
    private String marca;
    private String modelo;
    private boolean encendido;
    private String placa;
    private String color;


    public Vehiculo(String marca, String modelo, String placa, String color) {
        this.marca = marca;       // Guarda la marca que llega al crear el objeto
        this.modelo = modelo;     // Guarda el modelo que llega al crear el objeto
        this.encendido = false;   // Todo vehículo empieza apagado
        this.placa = placa;
        this.color = color;
    }


    public void arrancar() {
        if (!encendido) {
            encendido = true;
            System.out.println("El vehículo " + marca + " " + modelo + " está arrancando.");
        } else {
            System.out.println("El vehículo " + marca + " " + modelo + " ya está encendido.");
        }
    }


    public void detener() {
        if (encendido) {
            encendido = false;
            System.out.println("El vehículo " + marca + " " + modelo + " se ha detenido.");
        } else {
            System.out.println("El vehículo " + marca + " " + modelo + " ya está apagado.");
        }
    }

    public void estado(){
        if (encendido) {
            System.out.println("Disponible para salir:");
        }else{
            System.out.println("Estacionado");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void mostrarEstado() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Encendido: " + encendido);
        System.out.println("Placa: " + placa);
        System.out.println("Color: " + color);
    }
}
