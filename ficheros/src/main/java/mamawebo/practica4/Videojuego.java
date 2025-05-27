package mamawebo.practica4;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@ToString
public class Videojuego {

    private String nombre;
    private String plataforma;
    private double precio;
    private boolean disponible;
    private List<String> generos;

    public Videojuego(String nombre, String plataforma, double precio, boolean disponible, List<String> generos) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.precio = precio;
        this.disponible = disponible;
        this.generos = new ArrayList<>(generos);
    }

}
