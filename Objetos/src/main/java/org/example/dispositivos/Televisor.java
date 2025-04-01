package org.example.dispositivos;

public class Televisor extends Dispositivos implements ControlRemoto{

    public Televisor(String nombre) {

        super(nombre);

    }



    @Override
    public void sincronizar() {

        System.out.println("Sincronizando " + getNombre() + " con control remoto...");

    }

    @Override
    void encender() {

        if(!isEstado()){

            System.out.println("Encendiendo televisor...");
            super.setEstado(true);

        }else{
            System.out.println("El televisor ya está encendido.");
        }

    }
}
