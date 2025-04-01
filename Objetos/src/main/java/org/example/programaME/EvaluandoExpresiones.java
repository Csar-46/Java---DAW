package org.example.programaME;

import java.util.Scanner;
import java.util.Stack;

public class EvaluandoExpresiones {

    static Scanner teclado;

    public static boolean casoDePrueba() {

        if (!teclado.hasNext()) {
            return false;
        } else {

            String operacion = teclado.nextLine();
            String resultado1 = evaluarExpresion(operacion);
            String resultado2 = evaluarExpresion(operacion);

            if (resultado1.equals(resultado2)) {
                System.out.println(resultado1 + " = " + resultado2);
            } else {
                System.out.println(resultado1 + " != " + resultado2);
            }

            return true;
        }
    }

    public static String evaluarExpresion(String operacion) {

        Stack<Integer> pila = new Stack<>();

        for (String i : operacion.split("")) {

            if (i.matches("\\d")) {
                pila.push(Integer.parseInt(i));
            }

            else if (i.matches("[+\\-*/]")) {

                if (pila.size() < 2) {
                    return "ERROR";
                }

                int b = pila.pop();
                int a = pila.pop();

                if (i.equals("/") && b == 0) {
                    return "ERROR";
                }

                pila.push(operar(a, b, i));
            }
        }

        return (pila.size() == 1) ? String.valueOf(pila.pop()) : "ERROR";
    }

    public static int operar(int a, int b, String operador) {
        switch (operador) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        while (casoDePrueba()) {
        }
    }
}
