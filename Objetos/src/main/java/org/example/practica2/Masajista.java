package org.example.practica2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.practica1.Programa;

import java.util.ArrayList;

@Getter @Setter
public class Masajista extends MutxamelIFC {

    private String titulacion;
    private int anyosExperiencia;

    public static ArrayList<Masajista> masajistas = new ArrayList<>();

    public Masajista(String nombre, int edad, String titulacion, int anyosExperiencia) {

        super(nombre, edad);
        this.titulacion = titulacion;
        this.anyosExperiencia = anyosExperiencia;
        agregarMasajista(this);

    }

    private void agregarMasajista(Masajista masajista) {

        if (masajistas.contains(masajista)) {

            System.out.println("El masajista ya existe.");

        }else{

            masajistas.add(masajista);

        }
    }

    public void darMasaje(Jugador jugador) {

        System.out.println(getNombre() + " está tratando a " + jugador.getNombre());

    }

    @Override
    public String toString() {
        return "Masajista [" +
                "Nombre: " + super.getNombre() +
                ", Edad: " + super.getEdad() +
                ", Titulacion: " + titulacion  +
                ", Años Experiencia: " + anyosExperiencia +
                "]";
    }
}
