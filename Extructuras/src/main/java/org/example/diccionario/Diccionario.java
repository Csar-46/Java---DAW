package main.java.org.example.diccionario;

import java.util.*;

public class Diccionario {

    private Map<String, String> diccionario;
    private ArrayList<String> listaPalabras;

    public Diccionario(){

        diccionario = new HashMap<>();
        listaPalabras = new ArrayList<>();

    }

    public void nuevoPar(String palabra_esp, String palabra_ing){

        diccionario.put(palabra_esp,palabra_ing);
        listaPalabras.add(palabra_esp);

    }

    public String getTraduccion(String palabra_esp) {

        return diccionario.get(palabra_esp);

    }


    public String palabraAleatoria() {

        Random aleatorio = new Random();
        int posicion = aleatorio.nextInt(diccionario.size());

        return listaPalabras.get(posicion);
    }


    public void primeraLetraTraduccion(String palabra_esp) {

        for (int i = 0; i < listaPalabras.size(); i++) {

            if(listaPalabras.get(i).equals(palabra_esp)){

                System.out.println("La primera letra de tu palabra es: " + diccionario.get(palabra_esp).charAt(0));

            }
        }
    }
}
