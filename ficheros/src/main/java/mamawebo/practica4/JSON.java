package mamawebo.practica4;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JSON {

    static Scanner entrada = new Scanner(System.in);
    static List<Videojuego> videojuegos = new ArrayList<>();

    public static void main(String[] args) {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        for (int i = 0; i < 3; i++) {
            System.out.println("Datos del videojuego número " + (i+1) + ":");
            introducirJuego();
        }

        System.out.println("Videojuegos registrados con exiouuuu!!");
        System.out.println();

        try (FileWriter archivo = new FileWriter("src/main/resources/cesar/videojuegos.json")) {
            gson.toJson(videojuegos, archivo);
        } catch (IOException e) {
            System.out.println("Cagada de las gordas chavalin");
            e.printStackTrace();
        }

        for (Videojuego v : videojuegos){
            System.out.println(v);
        }

        System.out.println();
        introducirJuego();

        for (Videojuego v : videojuegos){
            if (v.getPrecio() < 30){
                System.out.println(v);
            }else{
                videojuegos.remove(v);
            }
        }

        try (FileWriter archivo = new FileWriter("src/main/resources/cesar/videojuegos.json")) {
            gson.toJson(videojuegos, archivo);
        } catch (IOException e) {
            System.out.println("Cagada de las gordas chavalin");
            e.printStackTrace();
        }

    }

    public static void introducirJuego(){

        System.out.println("Nombre del Juego: ");
        String nombre = entrada.nextLine();

        System.out.println("Plataforma: ");
        String plataforma = entrada.nextLine();

        System.out.println("Precio: ");
        double precio = entrada.nextDouble();

        System.out.println("Está disponible? (true or false): ");
        boolean disponible = entrada.nextBoolean();

        entrada.nextLine();

        System.out.println("Lista de géneros del juego separados por una ','");
        List<String> generos = Arrays.asList(entrada.nextLine().split(","));

        videojuegos.add(new Videojuego(nombre, plataforma, precio, disponible, generos));

    }

}
