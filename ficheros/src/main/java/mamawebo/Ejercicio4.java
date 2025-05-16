package mamawebo;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

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
