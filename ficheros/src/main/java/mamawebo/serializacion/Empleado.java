package mamawebo.serializacion;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data @AllArgsConstructor
public class Empleado implements Serializable {

    private String nombre;
    private double salario;

}
