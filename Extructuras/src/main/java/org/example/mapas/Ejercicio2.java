package org.example.mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio2 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Escribe una palabra...");
        String palabra = entrada.next();

        Map<Character, Integer> mapa = new HashMap<>();

        for (Character letra : palabra.toCharArray()){

            if(mapa.containsKey(letra)){

                mapa.put(letra, mapa.get(letra)+1);

            }else{
                mapa.put(letra,1);
            }

            //mapa.put(letra, mapa.getOrDefault(letra,0) + 1);

        }

        for (Map.Entry<Character, Integer> mapaLetras : mapa.entrySet()){

            System.out.println(mapaLetras.getKey() + ":" + mapaLetras.getValue());

        }

    }

}
