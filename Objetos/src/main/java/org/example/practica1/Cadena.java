package org.example.practica1;
import java.util.ArrayList;


public class Cadena {

    //Creamos los atributos
    private String nombre;
    private ArrayList<Programa> listaProgramas;

    //Creamos el constructor de cadena y la lista de programas que tendra la cadena.
    public Cadena(String nombre) {
        this.nombre = nombre;
        this.listaProgramas = new ArrayList<>();
    }

    //Metodo que agrega un programa a la lista.
    public void agregarPrograma(Programa programa) {

        //En caso de ya exixtir, no lo agrega y muesta el siguiente mensaje
        if (listaProgramas.contains(programa)) {
            System.out.println("El programa ya existe.");
        }else{
            listaProgramas.add(programa);
            programa.setCadena(this);
        }
    }

    

    public ArrayList<Programa> getListaProgramas() {
        return new ArrayList<>(listaProgramas);
    }

    public void setListaProgramas(ArrayList<Programa> listaProgramas) {
        this.listaProgramas = new ArrayList<>(listaProgramas);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cadena{" +
                "nombre='" + nombre + '\'' +
                ", listaProgramas=" + listaProgramas +
                '}';
    }
}