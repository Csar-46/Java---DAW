package org.example.practica2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

@Getter @Setter @ToString
public class Acompanyante extends MutxamelIFC {

    private Jugador jugador;
    private String parentesco;

    private static ArrayList<Acompanyante> acompanyantes = new ArrayList<>();


    public Acompanyante(String nombre, int edad, Jugador jugador, String parentesco) {

        super(nombre, edad);
        this.jugador = jugador;
        this.parentesco = parentesco;

        agregarAcompanyante(this);
    }

    private void agregarAcompanyante(Acompanyante acompanyante) {

        if (acompanyantes.contains(acompanyante)) {

            System.out.println("El entrenador ya existe.");

        }else{

            acompanyantes.add(acompanyante);

        }
    }

    public void animarEquipo() {

        System.out.println(getNombre() + " anima mucho al equipo, sobre todo a su " + getParentesco() + " " + getJugador().getNombre());

    }
}
