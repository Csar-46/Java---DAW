package mamawebo;

import java.io.File;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe la ruta de la carpeta en la que quieres buscar:");
        String ruta = entrada.next();

        File carpeta = new File(ruta);

        System.out.println("¿Que formato quieres buscar?");
        String tipo = entrada.next();

        if(tipo.equals(".txt")){
            filtrar(carpeta);
        }else{
            filtrar(carpeta, tipo);
        }
    }

    public static void filtrar(File carpeta){

        String [] ficheros = carpeta.list();

        if(ficheros != null && ficheros.length > 0){

            for (String i : ficheros){

                if(i.endsWith(".txt")) {
                    System.out.println(i);
                }
            }
        }else{
            System.out.println("El directorio esta vacio");
        }
    }

    public static void filtrar (File carpeta, String tipo){

        String [] ficheros = carpeta.list();

        if(ficheros != null && ficheros.length > 0){

            for (String i : ficheros){

                if(i.endsWith(tipo)) {
                    System.out.println(i);
                }
            }
        }else{
            System.out.println("El directorio esta vacio");
        }
    }
}
