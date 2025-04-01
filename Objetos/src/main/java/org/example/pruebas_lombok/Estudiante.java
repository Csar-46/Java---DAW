package org.example.pruebas_lombok;
import lombok.*;

//Generamos los getter, los setter, el metodo ToString y el constructor
//de manera automatica
@Getter @Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class Estudiante {

    //Obligamos a que el nombre no sea nulo
    @NonNull
    private String nombre;
    private int edad;
    private Curso curso;

}
