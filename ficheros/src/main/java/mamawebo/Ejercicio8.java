package mamawebo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Cuántos ficheros quieres?");
        int n = entrada.nextInt();
        entrada.nextLine();

        System.out.println("¿En qué carpeta los quieres?");
        String carpeta = entrada.next();

        File comprobarCarpeta = new File(carpeta);

        if(comprobarCarpeta.exists()){

            for (int i = 1; i <= n; i++) {

                File archivos = new File(carpeta + "/nombre(" + i + ").txt");
                try {
                    archivos.createNewFile();
                    System.out.println("Fichero " + archivos.getName() + " creado.");

                    //Se crea uno para cada archivo.
                    BufferedWriter escritor = new BufferedWriter(new FileWriter(carpeta + "/nombre(" + i + ").txt"));
                    escritor.write("Este es el fichero nombre(" + i + ").txt");

                    escritor.close();

                } catch (IOException e) {
                    System.out.println("Algo ha fallado");
                    e.printStackTrace();
                }
            }
        }else{
            System.out.println("No esta bobito.");
        }

    }
}
