package mamawebo;

import java.io.File;

public class Listar {
    public static void main(String[] args) {

        File carpeta = new File("src/main/resources/Ejercicio4");
        String [] ficheros = carpeta.list();

        if(ficheros != null && ficheros.length > 0){

            for (String i : ficheros){

                if(i.endsWith(".txt")){
                    System.out.println(i);
                }
            }
        }else{
            System.out.println("El directorio esta vacio");
        }

        System.out.println();
        File [] ficheritos = carpeta.listFiles();

        if(ficheritos != null && ficheritos.length > 0){

            for (File i:ficheritos){

                if(i.isFile()){
                    System.out.println("Fichero " + i.getName() + " con tamaño " + i.length() + " bytes");
                }
            }
        }else{
            System.out.println("El directorio esta vacío.");
        }
    }
}
