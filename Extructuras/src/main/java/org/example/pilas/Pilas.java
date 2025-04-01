package org.example.pilas;

import java.util.Scanner;
import java.util.Stack;

public class Pilas {

    public static void main(String[] args) {

        //ejercicio1();
        //ejercicio2();
        ejercicio3();

    }

    public static void ejercicio1 (){

        Stack<Character> caracteres = new Stack<>();

        caracteres.push('A');
        caracteres.push('B');
        caracteres.push('C');
        caracteres.push('D');
        caracteres.push('E');

        if (!caracteres.isEmpty()) {

            System.out.println(caracteres.size());
            System.out.println();
            System.out.println(caracteres.peek());
            System.out.println();

        }

        while (!caracteres.isEmpty()){

            System.out.println(caracteres.pop());

        }

    }

    public static void ejercicio2 (){

        Scanner entrada = new Scanner(System.in);
        Stack<Integer> numeros = new Stack<>();

        System.out.println("Introduce el primer numero: ");
        numeros.push(entrada.nextInt());
        System.out.println("Introduce el segundo numero: ");
        numeros.push(entrada.nextInt());
        System.out.println("Introduce el tercer numero: ");
        numeros.push(entrada.nextInt());

        while (!numeros.isEmpty()){
            System.out.println(numeros.pop());
        }

    }

    public static void ejercicio3 (){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce la operación a comprobar:");
        String operacion = entrada.next();

        boolean balanceado = esBalanceado(operacion);

        if(balanceado){

            System.out.println("YES");

        }else{

            System.out.println("NO");

        }

    }

    public static boolean esBalanceado(String operacion){

        Stack<Character> parentesis = new Stack<>();

        for(String i : operacion.split("")){

            if (i.equals("(")){

                parentesis.push('(');

            }

            //Duda, si solo hay un ")" dará la respuesta como valida como pasa en este caso: :), ¿Como hcer para que de mal?
            if(i.equals(")")){

                parentesis.push(')');

                if (parentesis.contains('(')) {

                    parentesis.pop();
                    parentesis.pop();

                }
            }
        }

        return parentesis.isEmpty();

    }

}
