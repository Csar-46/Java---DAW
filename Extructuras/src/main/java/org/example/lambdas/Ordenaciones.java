package main.java.org.example.lambdas;

import java.util.*;

public class Ordenaciones {

    public static void main(String[] args) {

        List<String> listaCiudades = new ArrayList<>(Arrays.asList("Alicante", "Benidorm", "Albatera", "Cuenca"));

        //Collections.sort(listaCiudades,(a,b) -> a.compareTo(b));
        listaCiudades.sort(Comparator.comparing(s -> s));
        System.out.println(listaCiudades);

        Profesor patri = new Profesor("Patricia", "Programacion", 20);
        Profesor paco = new Profesor("Paco", "Sistemas", 40);

        List<Profesor> listaProfes = new ArrayList<>(Arrays.asList(patri, paco));

        listaProfes.sort(Comparator.comparing(profesor -> profesor.getNombre()));
        System.out.println(listaProfes);
        Collections.sort(listaProfes, (profe1,profe2) -> profe1.getNombre().compareTo(profe2.getNombre()));
        System.out.println(listaProfes);

    }
}
