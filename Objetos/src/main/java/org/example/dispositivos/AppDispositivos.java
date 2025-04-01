package org.example.dispositivos;

import java.util.ArrayList;

public class AppDispositivos {

    public static void main(String[] args) {

        ArrayList<Dispositivos> listaDispositivos = new ArrayList<>();

        //CLASE ANÓNIMA DE "Dispositivos"
        Dispositivos proyector = new Dispositivos("Temu") {
            @Override
            void encender() {

                if(!isEstado()){

                    System.out.println("Encendiendo proyector con ajuste automático de brillo...");
                    super.setEstado(true);

                }else{
                    System.out.println("El proyector ya está encendido.");
                }


            }
        };

        //CLASE ANONIMA DE "ControlRemoto"
        ControlRemoto proyector_remoto = new ControlRemoto() {
            @Override
            public void sincronizar() {
                System.out.println("Sincronizando proyector con control remoto de presentación...");
            }
        };

        //CLASE ANÓNIMA DE "Dispositivos"
        Dispositivos hornoInteligente = new Dispositivos("Balay") {
            @Override
            void encender() {

                if(!isEstado()){

                    System.out.println("Calentando horno con ajuste automático de temperatura...");
                    super.setEstado(true);

                }else{
                    System.out.println("El horno ya está encendido.");
                }

            }
        };

        listaDispositivos.add(new Televisor("LG"));
        listaDispositivos.add(new ParlanteInteligente("Alexa"));
        listaDispositivos.add(new AireAcondicionado("Eacon"));
        listaDispositivos.add(proyector);
        listaDispositivos.add(hornoInteligente);

        for (Dispositivos d : listaDispositivos){

            System.out.println();
            System.out.println("=======================================================================");
            d.encender();

            if(d instanceof ControlRemoto){

                ((ControlRemoto) d).sincronizar();

            }else if (d.getNombre().equals("Temu")){ //Cuando encontremos el proyector:

                proyector_remoto.sincronizar();

            }

            d.mostrarEstado();
            d.apagar();
            System.out.println("=======================================================================");
            System.out.println();

        }
    }
}
