package org.example.colas;

import java.util.*;

public class Colas {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        //ejecririo1();
        //ejercicio2();
        //ejercicio3();
        ejercicio4();
        //ejercicio5();
        //cosas();

    }

    public static void ejecririo1(){

        Queue<Character> cola = new LinkedList<>();

        cola.offer('A');
        cola.offer('B');
        cola.offer('C');
        cola.offer('D');
        cola.offer('E');

        if(!cola.isEmpty()){

            System.out.println("El tamaño de la cola es: " + cola.size());
            System.out.println("El primer elemento de la cola es: " + cola.peek());

        }

        while (!cola.isEmpty()){

            System.out.println("Eliminando el emelento... " + cola.poll());

        }

    }

    public static void ejercicio2(){

        Queue<String> impresion = new LinkedList<>();

        impresion.offer("Impimir documento 1");
        impresion.offer("Impimir documento 2");
        impresion.offer("Impimir documento 3");
        impresion.offer("Impimir documento 4");
        impresion.offer("Impimir documento 5");

        System.out.println("Estado inicial de la cola de impresion: " + impresion);
        System.out.println();

        while (!impresion.isEmpty()){

            System.out.println("Procesando: " + impresion.poll());

            if(impresion.size()>1) {

                System.out.println("Estado actual de la cola de impresion: " + impresion);
                System.out.println();

            }else{

                System.out.println();
                System.out.println("La cola de impresion esta vacia.");

            }

        }

    }

    public static void ejercicio3(){

        Queue<String> playlist = new LinkedList<>();

        playlist.offer("A");
        playlist.offer("B");
        playlist.offer("C");
        playlist.offer("D");
        playlist.offer("E");

        System.out.println("Estado inicial de la playlist " + playlist);
        System.out.println();

        while (!playlist.isEmpty()){

            System.out.println("Reproduciendo... " + playlist.poll());
            System.out.println("Estado de la playlist: " + playlist);
            System.out.println();

        }

        System.out.println("la playlist ha terminado.");

    }

    public static void ejercicio4(){

        menu();

        acciones();

    }

    public static void menu(){

        System.out.println("--- LISTA DE LA COMPRA ---");
        System.out.println("1. Añadir producto al final.");
        System.out.println("2. Eliminar primer producto.");
        System.out.println("3. Eliminar producto por nombre.");
        System.out.println("4. Ver el primer producto.");
        System.out.println("5. Buscar producto.");
        System.out.println("6. Mostrar lista actual.");
        System.out.println("X. Salir");

    }

    public static void acciones(){

        Deque<String> productos = new LinkedList<>();

        String item;
        boolean salir = false;

        while (!salir) {


            System.out.print("\n    Seleccione una opción: ");
            String eleccion = entrada.next().toUpperCase();

            System.out.println("---------------------------------");


            switch (eleccion){

                case "1":
                    System.out.println("Producto a añadir: ");
                    item = entrada.next();
                    productos.offerLast(item);
                    break;
                case "2":
                    if(!productos.isEmpty()){

                        productos.pollFirst();

                    }else{

                        System.out.println("No hay productos en la lista.");

                    }
                    break;
                case "3":
                    System.out.println("Introduce el producto que quieres eliminar: ");
                    item = entrada.next();
                    if(productos.contains(item)){

                        productos.remove(item);

                    }else{

                        System.out.println("El producto no esta en la lista.");

                    }
                    break;
                case "4":
                    System.out.println("El primer producto de la lista es: " + productos.peekFirst());
                    break;
                case "5":
                    System.out.println("Introduce el producto que quieres buscar.");
                    item = entrada.next();

                    if(productos.contains(item)){
                        System.out.println("El producto esta en la lista!");
                    }else{
                        System.out.println("El producto no esta en la lista!");
                    }
                    break;
                case  "6":
                    if(!productos.isEmpty()){
                        System.out.println("La lista actual es: " + productos);
                    }else{
                        System.out.println("La lista esta vacia");
                    }
                    break;
                case "X":
                    System.out.println("Saliendo de la lista... ");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no reconocida;");
                    break;
            }
        }


    }

    public static void ejercicio5(){

        Scanner entrada = new Scanner(System.in);

        String palabra = entrada.next().toUpperCase();

        Deque<Character> palindromos = new LinkedList<>();

        for (int i = 0; i < palabra.length(); i++) {

            palindromos.offer(palabra.charAt(i));

        }

        if(esPalindromo(palindromos)){

            System.out.println("ES PALINDROMO!!");

        }else{

            System.err.println("NO ES PALINDROMO!!");

        }

    }

    public static boolean esPalindromo(Deque<Character> palindromos){

        while (palindromos.size()>1){

            if(palindromos.peekFirst() == palindromos.peekLast()){

                palindromos.pollFirst();
                palindromos.pollLast();

            }else{

                return false;

            }
        }

        return true;

    }

    public static void cosas(){

        Deque<String> burger = new LinkedList<>();

        burger.offer("Madame");
        burger.offerFirst("Fitzgerald");
        burger.offerLast("McPollo");

        System.out.println(burger);

    }

}
