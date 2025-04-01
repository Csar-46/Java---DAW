package org.example.dispositivos;

public class ParlanteInteligente extends Dispositivos{

    public ParlanteInteligente(String nombre) {

        super(nombre);

    }

    @Override
    void encender() {

        if(!isEstado()){

            System.out.println("Activando " + getNombre() + " con comando de voz...");
            super.setEstado(true);

        }else{
            System.out.println("El parlante ya está encendido.");
        }

    }
}
