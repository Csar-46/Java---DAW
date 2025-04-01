package org.example.impresora_online;

import java.util.LinkedHashSet;
import java.util.Set;

public class AppImpresora {

    private static final String ID_PC = "PC1234";
    static LinkedHashSet<Peticion> listaPeticiones = new LinkedHashSet<>();

    public static void main(String[] args) {

        anyadirDocumento("hola.txt");
        anyadirDocumento("doc.pdf");
        anyadirDocumento("doc2.pdf");
        anyadirDocumento("doc2.pdf");

    }

    public static void anyadirDocumento(String archivo){

        if(archivo.endsWith(".pdf")){

            if (listaPeticiones.add(new Peticion(ID_PC, archivo))) {
                System.out.println("Añadiendo " + archivo + " a la cola de impresion.");
            }else{
                System.out.println("El archivo " + archivo + " ya existe en la cola de impresion.");
            }

        }else{

            System.err.println("ERROR, ARCHIVO INCOMPATIBLE");

        }

    }

    public static void imprimirDocumento(){

        System.out.println("Imprimiendo ... " + listaPeticiones.getFirst());

    }

}
