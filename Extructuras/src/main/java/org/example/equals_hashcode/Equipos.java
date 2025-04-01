package org.example.equals_hashcode;

import java.util.Objects;

public class Equipos {

    private String nombre;
    private int numero;

    public Equipos(String nombre, int numero){

        this.nombre = nombre;
        this.numero = numero;

    }

    @Override
    public String toString() {
        return "Equipos[" +
                "Nombre = '" + nombre + '\'' +
                ", Numero = " + numero +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipos equipos = (Equipos) o;
        return Objects.equals(nombre, equipos.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
