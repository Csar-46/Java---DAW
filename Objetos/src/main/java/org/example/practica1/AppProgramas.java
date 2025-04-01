package org.example.practica1;

public class AppProgramas {

    public static void main(String[] args) {

        //creamos una cadena de tv
        Cadena antena3 = new Cadena("Antena 3");
        System.out.println(antena3);
        System.out.println();

        //creamos un programa
        Programa el_hormiguero = new Programa("El Hormiguero",antena3,"Director1");
        System.out.println(el_hormiguero);
        System.out.println();

        System.out.println(antena3);
        System.out.println();

        //insertamos empleados en el programa
        el_hormiguero.insertarEmpleado("Pablo Motos","presentador",null);
        System.out.println(el_hormiguero);
        System.out.println();

        //ver empleados del programa
        System.out.println(el_hormiguero.getListaEmpleados());
        System.out.println();

        //insertamos invitados en el programa
        el_hormiguero.insertarInvitado("Aitana","cantante",1);
        el_hormiguero.insertarInvitado("Aitana","cantante",8);

        //ver invitados del programa
        System.out.println(el_hormiguero.getListaInvitados());
        System.out.println(el_hormiguero);
        System.out.println();

        //Probamos los metodos de informacion sobre los invitados creados en la clase Programa
        el_hormiguero.invitadosTemporada(1);
        el_hormiguero.vecesInvitado("Aitana");
        el_hormiguero.rastrearInvitados("Aitana");

    }
}
