package org.example.casa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Casa {

    Scanner entrada = new Scanner(System.in);

    private String direccion;
    private List<Habitacion> habitaciones; // COMPOSICIÓN: la Casa tiene habitaciones
    private Propietario propietario;

    public Casa(String direccion) {
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
        setPropietarios();

    }

    public void agregarHabitacion(String nombre, double metros) {

        for (Habitacion habitacion: habitaciones){

            if(habitacion.getNombre().equals(nombre)){
                System.out.println("La habitación ya existe.");
                return;
            }

        }
        Habitacion habitacion = new Habitacion(nombre, metros); //solamente la Casa crea las habitaciones
        habitaciones.add(habitacion);
    }

    public void eliminarHabitacion(String nombre){

        for (Habitacion habitacion: habitaciones){

            if(habitacion.getNombre().equals(nombre)){
                habitaciones.remove(habitacion);
                return;
            }
        }
    }

    public void mostrarHabitaciones() {
        System.out.println("Casa en " + direccion + " tiene: " + habitaciones.size() + " habitaciones.");

        for (Habitacion habitacion : habitaciones){

            System.out.println("- " + habitacion.getNombre() + " (" + habitacion.getMetrosCuadrados() + " m²)");

        }
        System.out.println("Propietario = " + propietario);
    }

    public Habitacion getHabitacionMasGrande(){

        Habitacion aux = habitaciones.get(0);

        for(Habitacion habitacion : habitaciones){

            if(habitacion.getMetrosCuadrados() > aux.getMetrosCuadrados()){

                aux = habitacion;

            }
        }

        return aux;
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietarios() {
        System.out.println("Introduce el nombre del propietario");
        String nombre = entrada.next();
        System.out.println("Introduce su edad");
        int edad = entrada.nextInt();

        this.propietario = new Propietario(nombre,edad);
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
