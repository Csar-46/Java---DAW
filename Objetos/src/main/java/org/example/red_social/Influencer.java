package org.example.red_social;

import java.util.ArrayList;
import java.util.Arrays;

public class Influencer extends Usuario {

    private ArrayList<String> colaboraciones;

    public Influencer(String nombre, int edad, String nom_usu, int seguidores, String...colabos) { //DUDA

        super(nombre, edad, nom_usu, seguidores);
        colaboraciones = new ArrayList<>(Arrays.asList(colabos));

    }


    @Override
    public void mostrarInfo() {
        System.out.println("Información del Influencer:\nNombre: " + super.getNombre() + "\nEdad: " + super.getEdad() + "\nNombre de Usuario: " + super.getNom_usu() + "\nSeguidores: " + super.getSeguidores() + "\nColaboraciones: " + this.colaboraciones);
    }
}
