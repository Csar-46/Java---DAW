package main.java.org.example.equals_hashcode.ejercicio3;

import java.util.*;

public class AppInformes {

    static Stack<Informe> tareas = new Stack<>();
    static Set<Informe> tareasRegistradas = new HashSet<>();

    public static void main(String[] args) {

        //Agrego 5 informes a la lista.
        agregarInforme(1, "Invierte en bolsa y sé tu propio jefe", Tipos.EMPRESARIAL);
        agregarInforme(2, "Vuelve a ducharte marrano", Tipos.PERSONAL);
        agregarInforme(3, "Vacía la papelera", Tipos.ADMINISTRATIVO);
        agregarInforme(2, "Dúchate cochino", Tipos.PERSONAL);
        agregarInforme(1, "Invierte en bolsa y sé tu propio jefe", Tipos.EMPRESARIAL);

        //Muestro cuantas tareas quedan por realizar (agrupadas por codigo y tipo).
        tareasRestantes();

        //Terminamos todas las tareas en orden.
        realizarTareas();

        //Repetimos lo mismo que antes pero solo con 3 tareas.
        agregarInforme(5, "Deja el trabajo de una vez", Tipos.PERSONAL);
        agregarInforme(3, "Borra la base de datos de la empresa", Tipos.ADMINISTRATIVO);
        agregarInforme(5, "Llamar al jefe para dejar el trabajo y ser Llados", Tipos.PERSONAL);

        tareasRestantes();
        realizarTareas();

    }

    public static void agregarInforme(int codigo, String descripcion, Tipos tipo) {

        Informe informe = new Informe(codigo, descripcion, tipo);

        //Añado la tarea a la lista de tareas que va por orden y a la general (en la que cuento las restantes).
        tareas.push(informe);
        tareasRegistradas.add(informe);

    }

    public static void realizarTareas() {

        int cont = 1;

        //Imprimimps las tareas y las retiramos de las listas.
        while (!tareas.isEmpty()) {

            Informe tarea = tareas.pop();
            System.out.println("Tarea " + cont + ": " + tarea + ".");
            cont++;

            //En caso de que no quede ninguna tarea igual en la lista general, la eliminamos tambien.
            if (!tareas.contains(tarea)) {

                tareasRegistradas.remove(tarea);
                System.out.println("--- Retiro del set solo si es la ultima tarea del mismo tipo con el mismo codigo. ---");

            }
        }

        System.out.println();
        System.out.println("Se han finalizado todas las tareas.");

    }

    //Miramos el tamaño de la lista para saber cuantas tareas quedan.
    public static void tareasRestantes() {

        System.out.println();
        System.out.println("Quedan " + tareasRegistradas.size() + " tareas (codigo y tipo) pendientes.");
        System.out.println();

    }
}

