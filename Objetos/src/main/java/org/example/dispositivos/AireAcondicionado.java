package org.example.dispositivos;

public class AireAcondicionado extends Dispositivos implements ControlRemoto{

    public AireAcondicionado(String nombre) {

        super(nombre);

    }

    @Override
    public void sincronizar() {

        System.out.println("Sincronizando " + getNombre() + " con control remoto...");

    }

    @Override
    void encender() {

        if(!isEstado()){

            System.out.println("Encendiendo aire acondicionado...");
            super.setEstado(true);

        }else{
            System.out.println("El aire acondicionado ya está encendido.");
        }

    }
}
