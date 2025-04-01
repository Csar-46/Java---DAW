package org.example.equals_hashcode;



import java.util.Objects;


public class Persona {

    private int edad;

    public Persona (int edad){

        this.edad = edad;

    }

    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return edad == persona.edad;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(edad);
    }
}
