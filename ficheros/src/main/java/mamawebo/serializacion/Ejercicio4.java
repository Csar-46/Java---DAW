package mamawebo.serializacion;

import java.io.*;
import java.util.HashMap;
import java.util.TreeMap;

public class Ejercicio4 {
    public static void main(String[] args) {

        try {

            ObjectInputStream lectorMapita = new ObjectInputStream(new FileInputStream("src/main/resources/serializacion/mapa.ser"));
            HashMap<String, Juegos> mapa_leido = (HashMap<String, Juegos>) lectorMapita.readObject();
            lectorMapita.close();

            TreeMap<String, Juegos> mapa_ordenado = new TreeMap<>(mapa_leido);
            for (String s : mapa_ordenado.keySet()) {
                System.out.println("Clave: " + s + " - " + mapa_ordenado.get(s));
            }

        } catch (FileNotFoundException e) {

            System.out.println("No hay archivo, generando uno nuevo.");

            Juegos juego1 = new Juegos("Zelda: Breath of the Wild", 59.99, "Nintendo Switch");
            Juegos juego2 = new Juegos("God of War", 49.99, "PlayStation");
            Juegos juego3 = new Juegos("Halo Infinite", 39.99, "Xbox");

            HashMap<String, Juegos> mapita = new HashMap<>();
            mapita.put(juego1.getNombre(), juego1);
            mapita.put(juego2.getNombre(), juego2);
            mapita.put(juego3.getNombre(), juego3);

            File carpeta = new File("src/main/resources/serializacion");
            if (!carpeta.exists()) {
                carpeta.mkdirs();
            }

            try {
                ObjectOutputStream serializadorMapita = new ObjectOutputStream(new FileOutputStream("src/main/resources/serializacion/mapa.ser"));
                serializadorMapita.writeObject(mapita);
                serializadorMapita.close();
            } catch (IOException ex) {
                System.out.println("Error, el archivo se mamó");
                ex.printStackTrace();
            }

            TreeMap<String, Juegos> mapitaOrdenado = new TreeMap<>(mapita);
            for (String s : mapitaOrdenado.keySet()) {
                System.out.println("Clave: " + s + " - " + mapitaOrdenado.get(s));
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Algo ha salido muy muy mal.");
            e.printStackTrace();
        }

    }
}
