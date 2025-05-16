package mamawebo;

import java.io.*;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in);
        int cantidad = 0;

        System.out.println("Escribe la palabra que quieres buscar: ");
        String palabra = entrada.next().toLowerCase();

        File carpeta = new File("src/main/resources/Ejercicio6");
        carpeta.mkdir();

        try {
            BufferedReader lector = new BufferedReader(new FileReader("src/main/resources/Ejercicio6/datos.txt"));
            String linea;

            while((linea = lector.readLine()) != null){

                linea = linea.replace(",", "").replace(".", "").toLowerCase();

                String [] palabras = linea.split(" ");

                for (int i = 0; i < palabras.length; i++) {

                    if(palabras[i].equals(palabra)){
                        cantidad++;
                    }
                }
            }

            System.out.println("La palabra '" + palabra + "' se repite " + cantidad + " veces");
            lector.close();

        } catch (IOException e) {
            System.out.println("Esto no va nada bien.");
            e.printStackTrace();
        }
    }
}
