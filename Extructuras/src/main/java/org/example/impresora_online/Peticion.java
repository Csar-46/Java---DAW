package org.example.impresora_online;


import java.util.Objects;

public class Peticion {

    private String id;
    private String nombre_archivo;

    public Peticion(String id, String nombre_archivo){

        this.id = id;
        this.nombre_archivo = nombre_archivo;

    }

    @Override
    public String toString() {
        return "Peticion{" +
                "id='" + id + '\'' +
                ", nombre_archivo='" + nombre_archivo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Peticion peticion = (Peticion) o;
        return Objects.equals(id, peticion.id) && Objects.equals(nombre_archivo, peticion.nombre_archivo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre_archivo);
    }
}
