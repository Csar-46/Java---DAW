package main.java.org.example;

import java.util.Collection;
import java.util.Scanner;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //ejercicio1();
        //ejercicio2();
        //ejercicio3();

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

    public static boolean esBalanceado(String operacion) {

        Stack<Character> pila = new Stack<>();

        for (String i : operacion.split("")) {

            if (i.equals("(")) {

                pila.push('(');

            }

            if (i.equals("[")) {

                pila.push('[');

            }

            if (i.equals("{")) {

                pila.push('{');

            }

            if (i.equals(")")) {

                pila.push(')');

                if (pila.contains('(')) {

                    pila.remove((Character) '(');
                    pila.pop();

                }
            }

            if (i.equals("]")) {

                pila.push(']');

                if (pila.contains('[')) {

                    pila.remove((Character) '[');
                    pila.pop();

                }
            }

            if (i.equals("}")) {

                pila.push('}');

                if (pila.contains('{')) {

                    pila.remove((Character) '{');
                    pila.pop();

                }
            }
        }

        return pila.isEmpty();
    }
}