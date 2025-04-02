package main.java.org.example.stringbuilder;

public class Estring {

    public static void main(String[] args) {

        StringBuilder texto = new StringBuilder("Hola ");
        texto.append("Mundo");
        texto.append(", soy César");

        System.out.println("\n"+texto+"\n");

        texto.insert(0, "He nacido, ");

        System.out.println("\n"+texto+"\n");

        texto.replace(27, texto.length(), "Pepe");

        System.out.println("\n"+texto+"\n");

        texto.delete(16,23);

        System.out.println("\n"+texto+"\n");

        texto.reverse();

        System.out.println("\n"+texto+"\n");

    }

}
