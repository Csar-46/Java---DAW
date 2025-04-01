package org.example.red_social;

public class Streamer extends  Usuario{

    private int numero_retransmisiones;
    private int horas_directo;

    public Streamer(String nombre, int edad, String nom_usu, int seguidores, int numero_retransmisiones, int horas_directo) {

        super(nombre, edad, nom_usu, seguidores);
        this.numero_retransmisiones = numero_retransmisiones;
        this.horas_directo = horas_directo;

    }

    public void mostrarInfo(){

        System.out.println("Información del Streamer:\nNombre: " + super.getNombre() + "\nEdad: " + super.getEdad() + "\nNombre de Usuario: " + super.getNom_usu() + "\nRetransmisiones realizadas: " + numero_retransmisiones + "\nHoras de directo: " + horas_directo);

    }

}
