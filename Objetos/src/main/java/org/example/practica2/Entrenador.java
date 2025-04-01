package org.example.practica2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

@Getter @Setter
public class Entrenador extends MutxamelIFC implements AccionesDeportivas {

    private Equipos equipo;
    private String formacionPreferida;

    public static ArrayList<Entrenador> entrenadores = new ArrayList<>();

    public Entrenador(String nombre, int edad, Equipos equipo, String formacionPreferida) {
        super(nombre, edad);
        this.equipo = equipo;
        setFormacionPreferida(formacionPreferida);

        agregarEntrenador(this);
    }

    private void agregarEntrenador(Entrenador entrenador) {

        if (entrenadores.contains(entrenador)) {

            System.out.println("El entrenador ya existe.");
            throw new FormacionIncorrecta();

        }else{

            entrenadores.add(entrenador);

        }
    }

    public void setFormacionPreferida(String formacionPreferida) {

        if (formacionPreferida.matches("\\d-\\d-\\d")) {

            this.formacionPreferida = formacionPreferida;

        } else {

            System.out.println("Formato de formación incorrecto. Debe ser N-N-N (ej: 4-3-3).");
            throw new FormacionIncorrecta();
        }

    }

    public void planificarEntrenamiento() {
        System.out.println(getNombre() + " esta planificando el entrenamiento con formacion " + formacionPreferida);
    }

    public void hacerCambios() {
        System.out.println(getNombre() + " esta realizando cambios en el partido.");
    }

    @Override
    public void entrenar() {
        System.out.println(getNombre() + " esta dirigiendo el entrenamiento.");
    }

    @Override
    public void jugarpartidos(String rival) {
        System.out.println(getNombre() + " esta dirigiendo el partido contra " + rival + ".");
    }

    @Override
    public String toString() {
        return "Entrenador [" +
                "Nombre: " + super.getNombre() +
                ", Edad: " + super.getEdad() +
                ", Equipo: " + equipo +
                ", Formacion Preferida: " + formacionPreferida + '\'' +
                "]";
    }
}
