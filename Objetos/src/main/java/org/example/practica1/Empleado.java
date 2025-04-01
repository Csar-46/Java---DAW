package org.example.practica1;

import java.util.Scanner;

public class Empleado {

    //Creamos las variables que vamos a usar en la clase
    private static int contador = 0;
    private static final String ID_EMP = "EP";
    private static final String[] CARGOS_VALIDOS = {"director", "tecnico", "presentador", "colaborador"};
    private static final String CARGO_DEFECTO = "pte";

    //Declaramos los atributos
    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;

    //Creamos el constructor que creará al empleado director
    public Empleado(String nombre) {
        this.nombre = nombre;
        this.cargo = "director";
        this.director = null;
        //Siempre que creamos un empleado de cualquier tipo actualizamos el contador
        contador++;
        this.id = generarID();
    }

    //Creamos el constructor de empleado general
    public Empleado(String nombre, String cargo, Empleado director) {
        this.nombre = nombre;
        setCargo(cargo);
        setDirector(director);
        contador++;
        this.id = generarID();
    }

    //Este metodo sirve para generar las id de manera automatica. Se usa la variable final ID_EMP
    private String generarID() {
        return ID_EMP + String.format("%03d", contador);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    //Setter de "cargo"
        //Este setter tiene un bucle que reorre el vector "CARGOS_VALIDOS".
        //Solo guarda el "cargo" si lo encuentra en el vector anterior. Si no le pone el rango por defecto "pte"
    public void setCargo(String cargo) {
        for (String cargoValido : CARGOS_VALIDOS) {
            if (cargoValido.equalsIgnoreCase(cargo)) {
                this.cargo = cargo;
                return;
            }
        }
        this.cargo = CARGO_DEFECTO;
    }

    public Empleado getDirector() {
        return director;
    }

    //Setter de "director"
        //En caso de ya ser director le da el valor de NULL
        //En cualquier otro caso lo guarda.
    public void setDirector(Empleado director) {
        if (cargo.equals("director")) {
            this.director = null;
        } else {
            this.director = director;
        }
    }

    public String getId() {
        return id;
    }

    //Cambiamos el metodo toString para poder mostrar los objetos.
    @Override
    public String toString() {
        return "Empleado{" +
                "id='" + id + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", cargo='" + cargo + '\'' +
                ", director=" + director +
                '}';
    }
}
