package org.example.enum_asignaturas;

import java.util.Arrays;
import java.util.Scanner;

public class AppAsignaturas {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        Asignaturas ipe = Asignaturas.IPE;
        System.out.println(ipe);

        for(Asignaturas a : Asignaturas.values()){

            System.out.println("Asigatura: " + a + ", tiene " + a.getHoras() + " anuales.");

        }

        System.out.println("Introduce tu módulo favorito: " + Arrays.toString(Asignaturas.values()));
        String modulo = entrada.next();

        try {
            Asignaturas modulo_enum = Asignaturas.valueOf(modulo);
            System.out.println(modulo_enum);
        } catch (Exception e) {
            System.err.println("ERROR CAZURO, PONLO EN MAYÚSCULAS!");
        }

        String ipe_string = ipe.name();
        System.out.println(ipe_string + " como String");

        int posicion = Asignaturas.BASE_DE_DATOS.ordinal();
        System.out.println("Posicion: " + posicion + ".");

    }



}
