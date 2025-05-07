package mamawebo.demo1;

import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;


@Getter
@ToString
public class Estudiante {

    private int nia;
    private String nombre;
    private LocalDate fecha_nacimiento;

    public Estudiante(int nia, String nombre, LocalDate fecha_nacimiento){

        this.nia = nia;
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;

    }

}
