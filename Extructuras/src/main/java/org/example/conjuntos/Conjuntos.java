package org.example.conjuntos;

import java.util.*;

public class Conjuntos {

    static Scanner entrada = new Scanner(System.in);
    static Random aleatorio = new Random();

    public static void main(String[] args) {

        //ejercicio1();
        //ejercicio3();
        ejercicio4();

    }

    public static void ejercicio1(){

        Set<String> frase = new HashSet<>();

        System.out.print("Ingresa una frase: ");
        String [] fra = entrada.nextLine().toLowerCase().split(" ");

        for (int i = 0; i < fra.length; i++) {

            frase.add(fra[i]);

        }

        System.out.println(frase);

    }

    public static void ejercicio2(){



    }

    public static void ejercicio3(){

        Set<String> historial = new LinkedHashSet<>();
        String web;
        int cont = 0;

        do {

            System.out.print("Introduce una URL (o 'salir' para terminar): ");
            web = entrada.next();

            if (!web.equals("salir")) {

                historial.add(web);

            }

        }while (!web.equals("salir"));

        System.out.println();
        System.out.println("Historial de navegación:");

        for (String webs : historial) {

            ++cont;
            System.out.println(cont + ". " + webs);

        }

    }

    public static void ejercicio4(){

        Set<Integer> ordenados1 = new TreeSet<>();
        Set<Integer> ordenados2 = new TreeSet<>();

        for (int i = 0; i <= 10; i++) {

            ordenados1.add(aleatorio.nextInt(10) + 1);
            ordenados2.add(aleatorio.nextInt(10) + 1);

        }

        System.out.println("Primera Lista: " + ordenados1);
        System.out.println("Segunda Lista: " + ordenados2);

        mezclados(ordenados1, ordenados2);

    }

    public static void mezclados(Set<Integer> ordenados1, Set<Integer> ordenados2){

        Set<Integer> ordenados = new TreeSet<>();

        ordenados.addAll(ordenados1);
        ordenados.addAll(ordenados2);

        System.out.println("\nLista Mixta: " + ordenados);

    }
    
}
