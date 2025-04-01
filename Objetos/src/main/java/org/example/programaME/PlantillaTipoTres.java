package org.example.programaME;

import java.util.Scanner;

public class PlantillaTipoTres {
    static Scanner teclado;

    public static boolean casoDePrueba() {



        if (!teclado.hasNext()) {
            return false;
        }else {
            // CÓDIGO PRINCIPAL AQUÍ
            // (incluyendo la lectura del caso de prueba)
            teclado.nextLine();
            System.out.println("Hola");
            return true;
        }
    } // casoDePrueba

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        while (casoDePrueba()) {
        }
    } // main

}



