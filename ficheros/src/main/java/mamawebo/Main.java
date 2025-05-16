package mamawebo;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        File fichero = new File("src/main/resources/prueba.txt");

        try {
            fichero.createNewFile();
        } catch (IOException e) {
            System.out.println("Algo ha ido mal.");
            e.printStackTrace();
        }

        if(fichero.exists()){
            System.out.println(fichero.getName() + " existe");
            System.out.println("Tamaño del fichero: " + fichero.length());
            System.out.println("Ruta del fichero: " + fichero.getAbsolutePath());
        }else{
            System.out.println(fichero.getName() + " no existe");
        }

        System.out.println();

        File carpeta = new File("src/main/resources/cesar");

        carpeta.mkdir();

        if(fichero.exists()){
            System.out.println(carpeta.getName() + " existe, que guay!");
        }else{
            System.out.println(carpeta.getName() + " no existe");
        }

        System.out.println();
        fichero.delete();

        if(fichero.exists()){
            System.out.println(fichero.getName() + " existe");
            System.out.println("Tamaño del fichero: " + fichero.length());
            System.out.println("Ruta del fichero: " + fichero.getAbsolutePath());
        }else{
            System.out.println(fichero.getName() + " no existe");
        }

    }
}