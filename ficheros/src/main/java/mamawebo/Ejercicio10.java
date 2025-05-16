package mamawebo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        try {
            File archivo1 = new File("src/main/resources/Ejercicio10/archivo1.txt");
            File archivo2 = new File("src/main/resources/Ejercicio10/archivo2.txt");

            File fusion = new File("src/main/resources/Ejercicio10/fusion.txt");

            Scanner lector1 = new Scanner(archivo1);
            Scanner lector2 = new Scanner(archivo2);
            FileWriter writer = new FileWriter(fusion);

            String texto1 = "";
            String texto2 = "";

            while(lector1.hasNextLine() || lector2.hasNextLine()){

                texto1 = lector1.nextLine();
                texto2 = lector2.nextLine();

                texto1 = texto1.replace(",", "").replace(".", "").toLowerCase();
                texto2 = texto2.replace(",", "").replace(".", "").toLowerCase();

            }

            String[] palabras1 = texto1.split(" ");
            String[] palabras2 = texto2.split(" ");

            int i = 0;
            int j = 0;

            while (i < palabras1.length || j < palabras2.length) {
                if (i < palabras1.length) {
                    writer.write(palabras1[i] + " ");
                    i++;
                }
                if (j < palabras2.length) {
                    writer.write(palabras2[j] + " ");
                    j++;
                }
            }

            lector1.close();
            lector2.close();
            writer.close();

            System.out.println("Fuuuuuusiooooooon.");

        } catch (IOException e) {
            System.out.println("La kagaste weon.");
            e.printStackTrace();
        }
    }
}
