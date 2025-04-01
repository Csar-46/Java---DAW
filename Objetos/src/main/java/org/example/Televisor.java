package org.example;

public class Televisor {

    @Override
    public String toString(){

        return "Paciente : [Canal = " + this.canal + ", Volumen = " + this.volumen +  "]" ;

    }

    private int canal;
    private int volumen;

    public Televisor(){

        setCanal(1);
        setVolumen(5);

    }

    public Televisor(int canal, int volumen){

        setCanal(canal);

    }

    public void subirCanal(int canal){

        this.canal = canal++;

        setCanal(canal);
        System.out.println("Canal: " + getCanal());

    }
    public void bajarCanal(int canal){

        this.canal = canal--;

        setCanal(canal);
        System.out.println("Canal: " + getCanal());

    }


    public int getCanal(){

        return this.canal;

    }
    public void setCanal(int canal){

        if (canal >= 1 && canal <= 99){

            this.canal = canal;

        }
    }


    public int getVolumen(){

        return this.volumen;

    }
    public void setVolumen (int volumen){

        if (volumen >= 1 && volumen <= 99) {

            this.volumen = volumen;

        }

    }


    public void subirVolumen(int volumen){

        this.volumen = volumen++;

        setVolumen(volumen);
        System.out.println("Volumen: " + getVolumen());

    }
    public void bajarVolumen(int volumen){

        this.volumen = volumen--;

        setVolumen(volumen);
        System.out.println("Volumen: " + getVolumen());

    }

}
