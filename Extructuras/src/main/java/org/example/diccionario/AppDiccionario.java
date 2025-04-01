package main.java.org.example.diccionario;

import java.util.Scanner;

public class AppDiccionario {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        Diccionario diccionario = new Diccionario();

        diccionario.nuevoPar("Perro", "Dog");
        diccionario.nuevoPar("Mesa", "Table");
        diccionario.nuevoPar("Coche", "Car");
        diccionario.nuevoPar("Casa", "House");
        diccionario.nuevoPar("Libro", "Book");

        int preguntas = 0;
        int aciertos = 0;

        while (true) {

            String palabra = diccionario.palabraAleatoria();
            String traduccion = diccionario.getTraduccion(palabra);
            char letra = traduccion.charAt(0);

            System.out.println(palabra + ": " + letra + "...");
            System.out.print("Indique la respuesta: ");
            String respuesta = entrada.next();

            if (respuesta.equalsIgnoreCase("fin")) {

                break;

            }

            preguntas++;

            if (respuesta.equalsIgnoreCase(traduccion)) {

                System.out.println("¡CORRECTO!");
                aciertos++;

            } else {

                System.out.println("¡NO! La respuesta correcta es " + traduccion);

            }

            System.out.println();
        }

        System.out.println("FIN DEL PROGRAMA");
        System.out.println("Total preguntas: " + preguntas);
        System.out.println("Total aciertos: " + aciertos);
        System.out.println("Total errores: " + (preguntas - aciertos));

        if (preguntas > 0) {

            System.out.println("Aciertos: " + ((aciertos * 100) / preguntas) + "%");

        }
    }
}
