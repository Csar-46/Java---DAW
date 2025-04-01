package org.example.dispositivos;

public abstract class Dispositivos {

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    private String nombre;
    private boolean estado; //Encendido/Apagado

    public Dispositivos(String nombre){

        this.nombre = nombre;
        estado = false;

    }

    abstract void encender();

    public void apagar(){

        if(estado){

            estado = false;
            System.out.println(this.nombre + " apagado.");

        }else{
            System.out.println(this.nombre + " ya está apagado.");
        }
    }

    public void mostrarEstado(){

        System.out.println("El dispositivo está: " + (!estado ? "apagado" : "encendido"));

    }

}
