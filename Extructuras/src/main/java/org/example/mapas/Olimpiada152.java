package org.example.mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Olimpiada152 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){

        while(pedirNumero()){}

    }

    public static boolean pedirNumero(){

        int  numero = teclado.nextInt();
        teclado.nextLine();

        if (numero==0){

            return false;

        }else{

            String [] numeros_vector = teclado.nextLine().split(" ");

            Map<String,Integer> mapa = new HashMap<>();

            int max = 0;
            String clave = "0";

            for(String k_numero : numeros_vector){

                if(mapa.containsKey(k_numero)){

                    mapa.put(k_numero, mapa.get(k_numero)+1);

                }else{

                    mapa.put(k_numero,1);

                }

                if (mapa.get(k_numero) > max){

                    max = mapa.get(k_numero);
                    clave = k_numero;

                }

            }

            System.out.println(clave);

            return true;
        }
    }
}
