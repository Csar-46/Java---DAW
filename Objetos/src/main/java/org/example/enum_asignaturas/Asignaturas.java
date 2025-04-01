package org.example.enum_asignaturas;

public enum Asignaturas {

    //Se crean enmayusculas
        //SON CONSTANTES
    PROGRAMACION(256),
    IPE(96),
    SISTEMAS(160),
    ENTORNOS(96),
    PROYECTO(32),
    BASE_DE_DATOS(224),
    LENGUAJES(96);

    private int horas;

    Asignaturas(int horas){

        this.horas = horas;

    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

}
