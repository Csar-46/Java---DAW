package mamawebo;

import java.io.File;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int cantidad = 0;

        System.out.println("Escribe la palabra que quieres buscar: ");
        String palabra = entrada.next().toLowerCase();

        File carpeta = new File("src/main/resources/Ejercicio7");
        carpeta.mkdir();

        try {
            File archivo = new File("src/main/resources/Ejercicio7/datos.txt");
            Scanner lector = new Scanner(archivo);


            while(lector.hasNextLine()){

                String linea = lector.nextLine();

                linea = linea.replace(",", "").replace(".", "").toLowerCase();

                String[] partes = linea.split(" ");

                for (int i = 0; i < partes.length; i++) {

                    String nombre = partes[i];

                    if(nombre.equals(palabra)){
                        cantidad++;
                    }
                }
            }

            System.out.println("La palabra '" + palabra + "' se repite " + cantidad + " veces");
            lector.close();
            
        } catch (Exception e) {
            System.out.println("La has cagao makina.");
            e.printStackTrace();
        }

    }
}
