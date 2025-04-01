package org.example.pilas;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class evaluandoExresiones {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String operacion = entrada.next();

        Stack<Character> expresion = new Stack<>();

        for (int i = 0; i < operacion.length(); i++) {

            expresion.push(operacion.charAt(i));

        }

        System.out.println(expresion);

    }

}
