package org.example.equals_hashcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Ejercicio2 {

    static Random aleatorio = new Random();
    static Queue<Persona> cola = new LinkedList<>();

    public static void main(String[] args) {

        generarCola();
        System.out.println("CINE EL POBLE");
        System.out.println("En la cola hay " + cola.size() + " personas.");

        System.out.println("La recaudación ha sido de " + pagar() + "€.");

    }

    public static void generarCola(){

        int personas = aleatorio.nextInt(251);

        for (int i = 0; i < personas; i++) {

            cola.offer(new Persona(aleatorio.nextInt(97) + 3));

        }

    }

    public static double pagar(){

        double total = 0;

        while (!cola.isEmpty()) {

            //total += pagar(cola.poll().getEdad());

        }

        return total;
    }

    public static double pagar(int edad){

        if(edad >= 3 && edad <= 10){

            return 1;

        } else if (edad >= 11 && edad <= 17) {

            return 2.5;

        }else{

            return 3.5;

        }
    }
}
