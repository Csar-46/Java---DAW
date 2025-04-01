package org.example.red_social;

public class Basico extends Usuario{

    public Basico(String nombre, int edad, String nom_usu, int seguidores) {

        super(nombre, edad, nom_usu, seguidores);

    }

    public void mostrarInfo(){

        System.out.println("Información de la Persona normal:\nNombre: " + super.getNombre() + "\nEdad: " + super.getEdad() + "\nNombre de Usuario: " + super.getNom_usu() + "\nSeguidores: " + super.getSeguidores());

    }

}
