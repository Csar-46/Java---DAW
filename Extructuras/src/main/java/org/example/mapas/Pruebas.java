package org.example.mapas;

import java.util.HashMap;
import java.util.Map;

public class Pruebas {

    public static void main(String[] args) {

        Map<String, Integer> notas = new HashMap<>();

        notas.put("Ismael", 3);
        notas.put("David", 5);
        notas.put("Antonio", 1);
        notas.put("Cesar", 5);

        System.out.println(notas);

        notas.put("Ismael", 6);
        System.out.println("Nota de Ismael: " + notas.get("Ismael"));

        notas.remove("Antonio");

        System.out.println(notas);

        if(notas.containsKey("Cesar")){

            System.out.println("César existe.");

        }

        if(notas.containsValue(10)){

            System.out.println("Que no David, que no hay 10 para ti.");

        }

        for (Map.Entry<String,Integer> mapa : notas.entrySet()){

            System.out.println("Alumno: " + mapa.getKey() + ", con nota: " + mapa.getValue());

        }



    }
}
