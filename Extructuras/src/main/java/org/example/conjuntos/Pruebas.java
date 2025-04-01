package org.example.conjuntos;

import java.util.*;

public class Pruebas {

    public static void main(String[] args) {
        //Los Set no permiten añadir datos duplicados

        //El orden es distinto cada vez que lo imprime cuando es tipo HashSet
        Set<String> conjunto = new HashSet<>();

        conjunto.add("Agost FC");
        conjunto.add("Monnegre FC");

        System.out.println(conjunto);
        conjunto.add("Socarrats FC");
        conjunto.add("Gimnatic de San Vicente");

        System.out.println(conjunto);
        conjunto.add("Agost FC");
        conjunto.add("Hercules FC");

        System.out.println(conjunto);
        System.out.println();


        //En cambio cuando est tipo LinkedHashSet la posicion de memoria se guarda de manera ordenada.
        Set<Integer> conjunto_adds = new LinkedHashSet<>();

        conjunto_adds.add(10);
        conjunto_adds.add(5);
        conjunto_adds.add(8);
        conjunto_adds.add(34);
        conjunto_adds.add(8);

        System.out.println(conjunto_adds);
        System.out.println();


        Set<String> conjuntos_orden =  new TreeSet<>();

        conjuntos_orden.add("Solan de cabras");
        conjuntos_orden.add("Font Vella");
        conjuntos_orden.add("Bezolla");
        conjuntos_orden.add("Lanjarón");
        conjuntos_orden.add("bezolla");

        System.out.println(conjuntos_orden);

    }

}
