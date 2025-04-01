package org.example.practica2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

@Getter @Setter
public class Jugador extends MutxamelIFC implements AccionesDeportivas {

    private Equipos categoria;
    private int dorsal;
    private Posiciones posicion;

    public static ArrayList<Jugador> jugadores = new ArrayList<>();

    public Jugador(String nombre, int edad, Equipos categoria, int dorsal, Posiciones posicion) {

        super(nombre, edad);
        setCategoria(categoria);
        setDorsal(dorsal);
        setPosicion(posicion);
        agregarJugador(this);

    }

    private void agregarJugador(Jugador jugador) {

        if (jugadores.contains(jugador)) {

            System.out.println("El jugador ya existe.");

        }else{

            jugadores.add(jugador);

        }
    }

    public void calentar() {

        System.out.println("CALIENTA, " + getNombre() + " QUE SALES!");

    }

    public void descarsar() {

        System.out.println(getNombre() + " está muy cansado, es hora de mimir");

    }

    public void marcarGol() {

        System.out.println(getNombre() + " se acerca peligrosamente a la porteria rival y....... GOOOOOOOOL!!!");

    }

    public void entrenar() {

        System.out.println( getNombre() + " esta entrenando muy duro");

    }

    public void jugarpartidos(String rival) {

        System.out.println(rival + " no tiene nada que hacer contra nosotros");

    }

    public void setCategoria(Equipos categoria) {

        boolean error = false;

        for (Equipos e : Equipos.values()) {
            if (e == categoria) {

                this.categoria = categoria;
                error = true;
                break;

            }
        }
        if (!error) {

            System.out.println("Categoria no encontrada");

        }

    }

    public void setPosicion(Posiciones posicion) {

        boolean error = false;

        for (Posiciones p : Posiciones.values()) {
            if (p == posicion) {

                this.posicion = posicion;
                error = true;
                break;

            }
        }
        if (!error) {

            System.out.println("Posicion no encontrada");

        }
    }

    public void setDorsal(int dorsal) {

        for (Jugador jugador : jugadores) {

            if (jugador.getCategoria() == this.categoria && jugador.getDorsal() == dorsal) {
                System.out.println("Dorsal ya asignado en esta categoria.");
                throw new ComprobarDorsal();
            }

        }
        this.dorsal = dorsal;
    }

    @Override
    public String toString() {
        return "Jugador [" +
                "Nombre: " + super.getNombre() +
                ", Edad: " + super.getEdad() +
                ", Categoria: " + categoria +
                ", Dorsal: " + dorsal +
                ", Posicion: " + posicion +
                "]";
    }
}
