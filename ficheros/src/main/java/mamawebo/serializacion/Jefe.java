package mamawebo.serializacion;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Jefe extends Empleado{

    private String departamento;

    public Jefe(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }
}
