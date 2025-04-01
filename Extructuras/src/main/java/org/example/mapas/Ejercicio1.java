package main.java.org.example.mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio1 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Escribe una frase:");
        String frase = entrada.nextLine().toLowerCase();

        String[]palabras = frase.split(" ");

        Map<String, Integer> mapa = new HashMap<>();

        for (String palabra : palabras){

            mapa.put(palabra, mapa.getOrDefault(palabra,0) + 1);

        }

        for (Map.Entry<String, Integer> mapaPalabras : mapa.entrySet()){

            System.out.println(mapaPalabras.getKey() + ":" + mapaPalabras.getValue());

        }

    }

}
