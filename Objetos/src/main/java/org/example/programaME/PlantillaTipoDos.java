package org.example.programaME;

import java.util.Scanner;

public class PlantillaTipoDos {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){

        int numero = pedirNumero();

        if (numero==0){
            System.exit(0);
        }else{



        }


    }

    public static int pedirNumero(){

           int  numero = teclado.nextInt();

        return numero;

    }


}
