package org.example.programaME;


import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner teclado;

    public static void casoDePrueba() {

        String [] grados = teclado.nextLine().split(" ");
        int num1 = Integer.parseInt(grados[0]);
        if(num1 == 0){
            num1 = 360;
        }
        int num2 = Integer.parseInt(grados[1]);
        if(num2 == 0){
            num2 = 360;
        }

        if (((num1 - num2)*-1) > (num1 + num2)){

            System.out.println("DESCENDENTE");

        }else if ((num2 - num1) > 180){

            System.out.println("ASCENDENTE");

        }else {

            System.out.println("DA IGUAL");

        }

    } // casoDePrueba

    public static void main(String[] args) {

        teclado = new Scanner(System.in);

        int numCasos = teclado.nextInt();

        teclado.nextLine();

        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    } // main
}
