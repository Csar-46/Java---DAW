package mamawebo.serializacion;

import java.io.*;
import java.util.ArrayList;

public class Ejercicio1_2 {
    public static void main(String[] args) {

        Juegos juego1 = new Juegos("Zelda: Breath of the Wild", 59.99, "Nintendo Switch");
        Juegos juego2 = new Juegos("God of War", 49.99, "PlayStation");
        Juegos juego3 = new Juegos("Halo Infinite", 39.99, "Xbox");

        ArrayList<Juegos> jueguitos = new ArrayList<>();
        jueguitos.add(juego1);
        jueguitos.add(juego2);
        jueguitos.add(juego3);

        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("src/main/resources/serializacion/juegos.ser"))) {
            salida.writeObject(jueguitos);
        } catch (IOException e) {
            System.out.println("Error al serializar los juegos");
            e.printStackTrace();
        }

        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("src/main/resources/serializacion/juegos.ser"))) {
            ArrayList<Juegos> juegosLeidos = (ArrayList<Juegos>) entrada.readObject();
            for (Juegos j : juegosLeidos) {
                System.out.println(j);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al deserializar los juegos");
            e.printStackTrace();
        }

    }
}
