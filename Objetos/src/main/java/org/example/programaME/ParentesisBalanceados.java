package org.example.programaME;

import java.util.Scanner;
import java.util.Stack;

public class ParentesisBalanceados {

    static Scanner teclado;

    public static boolean casoDePrueba() {

        if (!teclado.hasNext()) {
            return false;
        } else {

            String operacion = teclado.nextLine();
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

            if (i.equals("(") || i.equals("[") || i.equals("{")) {
                pila.push(i.charAt(0));

            }

            else if (i.equals(")") || i.equals("]") || i.equals("}")) {

                if (pila.isEmpty()) {
                    return false;

                }

                char primero = pila.pop();

                if ((i.equals(")") && primero != '(') ||
                        (i.equals("]") && primero != '[') ||
                        (i.equals("}") && primero != '{')) {
                    return false;
                }
            }
        }

        return pila.isEmpty();
    }

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        while (casoDePrueba()) {
        }
    }
}
