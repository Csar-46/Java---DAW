package org.example;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class PatoDonald {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){

        int numero = pedirNumero();

        if (numero==0){

            System.exit(0);

        }else{

            Set<String> fechas = new LinkedHashSet<>();

            String [] cumple = new String[numero];

            for (int i = 0; i < numero; i++) {

                cumple[i] = teclado.next();

            }

            for (int i = 0; i < cumple.length; i++) {

                if(fechas.isEmpty()){

                    fechas.add(cumple[i]);
                    continue;

                }

                if(fechas.contains(cumple[i])){

                    System.out.println("SI");
                    return;

                }else{

                    fechas.add(cumple[i]);

                }

            }

            System.out.println("NO");
            System.out.println(fechas);

        }
    }

    public static int pedirNumero(){

        return teclado.nextInt();

    }
}
