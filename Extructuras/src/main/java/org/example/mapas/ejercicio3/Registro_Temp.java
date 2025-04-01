package org.example.mapas.ejercicio3;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Registro_Temp {

    private Map<String, Double> mapaTemperaturas;

    public Registro_Temp(){

        mapaTemperaturas = new HashMap<>();

    }

    public void insertar(String ciudad, Double temperatura){

        mapaTemperaturas.put(ciudad,temperatura);
        System.out.println("Se han registrado " + temperatura + "º en " + ciudad + ".");

    }

    public void actualizar(String ciudad){

        Scanner etrada = new Scanner(System.in);

        System.out.println("¿Que temperatura hace en " + ciudad + "?");
        Double temp = etrada.nextDouble();

        mapaTemperaturas.put(ciudad, temp);

        System.out.println("Temperatura de " + ciudad + " actualizada a " + temp + "º.");

    }

    public void consultar (){

        Scanner etrada = new Scanner(System.in);

        System.out.println("Introduce la ciudad a consultar: ");
        String ciudad = etrada.next();

        if(mapaTemperaturas.containsKey(ciudad)){


            System.out.println("En " + ciudad + " la temperatura es de " + mapaTemperaturas.get(ciudad) + "º.");

        }else{

            System.out.println("La ciudad que has indicado no existe!");
            consultar();

        }

    }

    public void verTodas(){

        System.out.println("*** TEMPERATURAS REGISTRADAS ***");
        for (Map.Entry<String, Double> mapa : mapaTemperaturas.entrySet()){

            System.out.println(mapa.getKey() + ": " + mapa.getValue() + "º.");

        }

    }

}
