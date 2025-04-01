package org.example.pilas;

import java.util.Scanner;
import java.util.Stack;


public class ParentesisBalanceados {

    static Scanner entrada;

    public static boolean casoDePrueba() {

        if (!entrada.hasNext()) {

            return false;

        } else {

            String operacion = entrada.next();
            boolean balanceado = esBalanceado(operacion);

            if (balanceado) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            return true;
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

    public static void main(String[] args) {
        entrada = new Scanner(System.in);
        while (casoDePrueba()) {
        }
    }

}







