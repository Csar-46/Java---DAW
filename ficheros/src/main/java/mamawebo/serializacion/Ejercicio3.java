package mamawebo.serializacion;

import java.io.*;
import java.util.ArrayList;

public class Ejercicio3 {
    public static void main(String[] args) {

        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream("src/main/resources/serializacion/juegos.ser"));
            ArrayList<Juegos> juegosLeidos = (ArrayList<Juegos>) lector.readObject();
            lector.close();

            for (Juegos j : juegosLeidos) {
                System.out.println(j);
            }

        } catch (FileNotFoundException e) {
            System.out.println("No hay archivo, generando uno nuevo.");

            ArrayList<Juegos> jueguitos = new ArrayList<>();
            jueguitos.add(new Juegos("Zelda: Breath of the Wild", 59.99, "Nintendo Switch"));
            jueguitos.add(new Juegos("God of War", 49.99, "PlayStation"));
            jueguitos.add(new Juegos("Halo Infinite", 39.99, "Xbox"));

            File carpeta = new File("src/main/resources/serializacion");
            if (!carpeta.exists()) {
                carpeta.mkdirs();
            }

            try {
                ObjectOutputStream serializador = new ObjectOutputStream(new FileOutputStream("src/main/resources/serializacion/juegos.ser"));
                serializador.writeObject(jueguitos);
                serializador.close();
            } catch (IOException ex) {
                System.out.println("Error, el archivo se mamó");
                ex.printStackTrace();
            }

            for (Juegos j : jueguitos) {
                System.out.println(j);
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Algo ha salido muy muy mal.");
            e.printStackTrace();
        }

    }
}
