package org.example.mapas.ejercicio3;

public class AppTemperatura {

    public static void main(String[] args) {

        Registro_Temp registro = new Registro_Temp();


        registro.insertar("Mutxamel", 18.6);
        registro.actualizar("Mutxamel");
        registro.insertar("Alicante", 19.7);
        registro.insertar("Campello", 13.0);

        registro.consultar();
        registro.verTodas();

    }

}
