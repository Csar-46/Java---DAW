package org.example.programaME;

import java.util.Scanner;

public class PantillaTipoUno {
    static Scanner teclado;

    public static void casoDePrueba() {

        String [] potencia = teclado.nextLine().split(" ");

        long [] potenciaNum = new long [potencia.length];

        for (int i = 0; i < potencia.length; i++) {
            potenciaNum[i] = Integer.parseInt(potencia[i]);
        }

        if(potenciaNum[0] < 1 || potenciaNum[0] > 100){
            return;
        }

        if (potenciaNum[1] < 1 || potenciaNum[1] > 100){
            return;
        }

        if (potenciaNum[2] < 1 || potenciaNum[2] > 100000){
            return;
        }

        if((potenciaNum[0]*potenciaNum[1]) < potenciaNum[2]){
            System.out.println(0);
            return;
        }

        long cont = 0;

        while(potenciaNum[2] > cont){

            cont += potenciaNum[1];

        }

        System.out.println(cont);

    } // casoDePrueba

    public static void main(String[] args) {

        teclado = new Scanner(System.in);

        int numCasos = teclado.nextInt();
        teclado.nextLine();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    } // main
}