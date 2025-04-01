package org.example.pruebas_lombok;
import lombok.*;
import java.util.ArrayList;
import java.util.Objects;


//Generamos los getter, los setter, el metodo ToString y el constructor
//de manera automatica
@Getter @Setter
@ToString
@AllArgsConstructor
public class Instituto {

    //Obligamos a que el nombre no sea nulo y que no se pueda cambiar despues de su creacion
    @NonNull
    private final String nombre;
    private String poblacion;
    private String direccion;
    private ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    private ArrayList<Curso> listaCursos = new ArrayList<>();


    //En caso de que el nombre sea nulo se le pone un nombre por defecto.
    public Instituto (String nombre) {
        this.nombre = Objects.requireNonNullElse(nombre, "Instituto sin nombre");
    }

    //Este metodo sirve para agregar estudantes a una lista segun 3 condiciones.
    public void agregarEstudiante(Estudiante estudiante) {

        //Si la lista ya contiene al estudiante no se añade.
        if (listaEstudiantes.contains(estudiante)) {
            System.out.println("El estudiante ya existe.");

        //Si el estudiante creado tiene atributos nulos tampoco e añade.
        }else if (estudiante == null){
            System.out.println("No se puede agregar un estudiante nulo.");

        //En cualquier otro caso lo añadiremos a la lista.
        }else{
            listaEstudiantes.add(estudiante);
        }


    }

    public void agregarCurso(Curso curso) {
        // Verificar si el curso es nulo
        if (curso == null) {
            System.out.println("No se puede agregar un curso nulo.");
            return;
        }

        // Verificar si ya existe un curso con el mismo nombre y horas
        for (Curso c : listaCursos) {
            if (c.getNombre().equalsIgnoreCase(curso.getNombre()) && c.getHoras() == curso.getHoras()) {
                System.out.println("El curso con el mismo nombre y horas ya existe.");
                return;
            }
        }

        // Agregar el curso si no está duplicado
        listaCursos.add(curso);
    }

}


