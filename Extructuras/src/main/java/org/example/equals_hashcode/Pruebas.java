package org.example.equals_hashcode;

import java.util.HashSet;
import java.util.Set;

public class Pruebas {

    public static void main(String[] args) {

        Equipos equipo1 = new Equipos("PC001", 1);
        Equipos equipo2 = new Equipos("PC002", 2);
        Equipos equipo3 = new Equipos("PC003", 3);
        Equipos equipo4 = new Equipos("PC003", 10);

        Set<Equipos> listaEquipos = new HashSet<>();

        listaEquipos.add(equipo1);
        listaEquipos.add(equipo2);
        listaEquipos.add(equipo3);
        listaEquipos.add(equipo4);

        System.out.println(equipo3.hashCode());
        System.out.println(equipo4.hashCode());

        System.out.println(listaEquipos);

    }
}
