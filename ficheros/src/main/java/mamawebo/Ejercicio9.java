package mamawebo;

import java.io.*;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        try {

            File archivo = new File("./src/main/resources/Ejercicio9/datos.txt");
            File archivoMayus = new File("src/main/resources/Ejercicio9/datosMayus.txt");

            FileWriter writer = new FileWriter(archivoMayus);
            Scanner lector = new Scanner(archivo);

            while(lector.hasNextLine()){

                String linea = lector.nextLine();
                linea = linea.replace(",", "").replace(".", "").toLowerCase();

                String[] frases = linea.split(" ");

                for (int i = 0; i < frases.length; i++) {

                    String palabra = frases[i];

                    if (palabra.isEmpty()){
                        continue;
                    }

                    String letra = palabra.substring(0, 1).toUpperCase();
                    palabra = palabra.replaceFirst(palabra.substring(0, 1), letra);

                    writer.write(palabra);
                    writer.write(" ");

                }

                writer.write("\n");

            }

            lector.close();
            writer.close();

            if (archivo.delete()) {

                archivoMayus.renameTo(archivo);
                System.out.println("Archivo modificado correctamente.");

            } else {
                System.out.println("No se ha podido reemplazar el archivo original.");
            }

        } catch (IOException e) {
            System.out.println("Caca de la vaca");
            e.printStackTrace();
        }
    }
}
