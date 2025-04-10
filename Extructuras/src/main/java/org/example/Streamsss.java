package main.java.org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamsss {

    public static void main(String[] args) {

        List<String> coches = new ArrayList<>(Arrays.asList("Forf", "Audi", "Skoda", "BMV", "Mitsubishi"));

        Stream<String> streamsito = Stream.of("Ford", "Citroen");

        List<String> filtrados = coches.stream()
                .filter(marca -> marca.endsWith("i"))
                .filter(marca -> marca.length()>5)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        filtrados.forEach(System.out::println);
    }

}
