package mamawebo.serializacion;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data@AllArgsConstructor
public class Juegos implements Serializable {

    private String nombre;
    private double precio;
    private transient String consola;

}
