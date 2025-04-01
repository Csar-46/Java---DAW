package org.example.casa;

import java.util.Scanner;

class Habitacion {

    Scanner entrada = new Scanner(System.in);

    private String nombre;
    private double metrosCuadrados;
    private Electrodomestico electrodomestico;

    public Habitacion(String nombre, double metrosCuadrados) {
        this.nombre = nombre;
        this.metrosCuadrados = metrosCuadrados;
        setElectrodomestico();
    }

    public void setElectrodomestico() {
        System.out.println("Introduce el nombre del electrodoméstico");
        String nombre = entrada.next();
        System.out.println("Introduce su consumo");
        int consumo = entrada.nextInt();

        this.electrodomestico = new Electrodomestico(nombre,consumo);
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public String getNombre() {
        return nombre;
    }



    @Override
    public String toString() {
        return "[Nombre = " + getNombre() + " Metros = " + getMetrosCuadrados() + " ]";
    }
}
