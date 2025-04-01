package org.example.red_social;

public class Usuario {

    private String nombre;
    private int edad;
    private String nom_usu;
    private int seguidores;

    public Usuario(String nombre, int edad, String nom_usu, int seguidores) {
        this.nombre = nombre;
        this.edad = edad;
        this.nom_usu = nom_usu;
        this.seguidores = seguidores;
    }

    public void mostrarInfo(){

        System.out.println("Información del Usuario:\nNombre: " + nombre + "\nEdad: " + edad + "\nNombre de Usuario: " + nom_usu + "\nSeguidores: " + seguidores);

    }

    public String getNom_usu() {
        return nom_usu;
    }

    public void setNom_usu(String nom_usu) {
        this.nom_usu = nom_usu;
    }

    public int getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
