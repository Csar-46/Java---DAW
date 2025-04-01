package org.example.practica2;

import java.util.Scanner;
import java.util.SortedMap;

public class AppMantenimiento {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        String opcion;

        // crear varios jugadores para el equipo SENIOR

        Jugador mark = new Jugador("Mark", 20, Equipos.SENIOR, 1, Posiciones.PORTERO);
        Jugador axel = new Jugador("Axel", 17, Equipos.SENIOR, 10, Posiciones.DELANTERO);
        Jugador jack = new Jugador("Jack", 19, Equipos.SENIOR, 3,Posiciones.DEFENSA);

        // crear al entrenador del equipo SENIOR

        Entrenador seymour = new Entrenador("Seymour", 80, Equipos.SENIOR, "3-4-3");

        // crear a los masajistas del club

        Masajista jim = new Masajista("Jim", 24, "Tecnico", 4);

        // crear a algún acompañante para un par de jugadores

        Acompanyante nelly = new Acompanyante("Nelly", 21, mark, "Pareja");
        Acompanyante silvia = new Acompanyante("Silvia", 18, axel, "Pareja");

        do {
            System.out.println("=== App de mantenimiento del MUTXAMEL FC ===");
            System.out.println("[1]. Mantenimiento de jugadores");
            System.out.println("[2]. Mantenimiento de entrenadores ");
            System.out.println("[3]. Mantenimiento masajistas ");
            System.out.println("[4]. Consultar equipos");
            System.out.println("[X]. Salir");
            System.out.println("=================================================");
            System.out.print("Selecciona una opcion: ");

            opcion = entrada.next().toUpperCase();

            switch (opcion) {
                case "1":
                    gestionarJugadores();
                    break;

                case "2":
                    gestionarEntrenadores();
                    break;

                case "3":
                    gestionarMasajistas();
                    break;

                case "4":
                    consultarEquipos();
                    break;

                case "X":
                    System.out.println("Saliendo de la aplicacion...");
                    break;

                default:
                    System.out.println("Error opcion no valida. Intentalo de nuevo.");
            }
        } while (!opcion.equals("X"));

        // concentrarse()

        jack.concentrarse();
        System.out.println();

        // entrenar()

        mark.entrenar();
        System.out.println();

        // darMasaje() a algún jugador

        jim.darMasaje(axel);
        System.out.println();

        // viajar() a Madrid

        seymour.viajar("Madrid");
        mark.viajar("Madrid");
        axel.viajar("Madrid");
        jack.viajar("Madrid");
        jim.viajar("Madrid");
        System.out.println();

        // planificarEntrenamiento()

        seymour.planificarEntrenamiento();
        System.out.println();

        // entrenar()

        mark.entrenar();
        System.out.println();

        // descansar()

        axel.descarsar();
        System.out.println();

        // calentar()

        jack.descarsar();
        System.out.println();

        // jugarPartido()

        seymour.jugarpartidos("Barcelona");
        System.out.println();

        // animarEquipo()

        nelly.animarEquipo();
        System.out.println();

        // hacerCambios()

        seymour.hacerCambios();
        System.out.println();

        // marcarGol()

        axel.marcarGol();
        System.out.println();

        // celebrarGol()

        axel.celebrarGol();
        System.out.println();

        // darMasaje() a varios jugadores

        jim.darMasaje(mark);
        jim.darMasaje(jack);
        System.out.println();

        // viajar() a Mutxamel

        seymour.viajar("Mutxamel");
        mark.viajar("Mutxamel");
        axel.viajar("Mutxamel");
        jack.viajar("Mutxamel");
        jim.viajar("Mutxamel");
        System.out.println();

        // descansar()

        mark.descarsar();
        axel.descarsar();
        jack.descarsar();

    }

    public static void gestionarJugadores() {

        String opcion;

        do {
            System.out.println("=== Mantenimiento de Jugadores ===");
            System.out.println("[1]. Añadir nuevo jugador");
            System.out.println("[2]. Modificar datos de un jugador existente");
            System.out.println("[3]. Crear acompañantes (SENIOR)");
            System.out.println("[X]. Volver al menu principal");
            System.out.println("=====================================================");
            System.out.print("Selecciona una opcin: ");

            opcion = entrada.next().toUpperCase();

            switch (opcion) {

                case "1":
                    agregarJugador();
                    break;

                case "2":
                    modificarJugador();
                    break;

                case "3":
                    crearAcompanyante();
                    break;
                case "X":
                    System.out.println("Volviendo al menu principal...");
                    break;

                default:
                    System.out.println("Error, opcion no valida. Intentalo de nuevo.");

            }
        } while (!opcion.equals("X"));
    }

    public static void agregarJugador(){

        System.out.print("Nombre del jugador: ");
        String nombre = entrada.next();

        System.out.print("Edad del jugador: ");
        int edad = entrada.nextInt();

        System.out.print("Categoria (BENJAMIN, ALEVIN, INFANTIL, CADETE, JUVENIL, SENIOR): ");
        String categoria = entrada.next().toUpperCase();

        Equipos e;
        try {

            e = Equipos.valueOf(categoria);

        } catch (IllegalArgumentException i) {

            System.out.println("Error, la categoria no existe.");
            return;

        }

        System.out.print("Dorsal del jugador: ");
        int dorsal = entrada.nextInt();

        System.out.print("Posicion (PORTERO, DEFENSA, CENTROCAMPISTA, DELANTERO): ");
        String posicion = entrada.next().toUpperCase();

        Posiciones p;
        try {

            p = Posiciones.valueOf(posicion);

        } catch (IllegalArgumentException i) {

            System.out.println("Error, la posicion no existe.");
            return;

        }

        new Jugador(nombre, edad, e, dorsal, p);
        System.out.println("Jugador añadido correctamente.");

    }

    public static void modificarJugador() {

        System.out.println("=== Mantenimiento de Jugadores. Modificar datos de un Jugador existente ===");

        if (Jugador.jugadores.isEmpty()) {

            System.out.println("No hay Jugadores registrados.");
            return;

        }


        System.out.println("¿De que Jugador quieres hacer cambios?");

        for (int i = 0; i < Jugador.jugadores.size(); i++) {

            System.out.println("[" + i + "] " + Jugador.jugadores.get(i));

        }

        System.out.println("==========================================");
        System.out.print("Selecciona una opcion: ");

        int posicion = entrada.nextInt();
        try {

            if (posicion < 0 || posicion >= Jugador.jugadores.size()) {

                System.out.println("Error, el Jugador no esta en la lista.");
                return;

            }

        } catch (NumberFormatException e) {

            System.out.println("Error, formato incorrecto.");
            return;

        }

        Jugador j = Jugador.jugadores.get(posicion);

        System.out.println("=== Mantenimiento de Jugadores. Modificar datos de un Jugador existente ===");
        System.out.println("Modificando jugador: " + j);
        System.out.println("¿Que quieres modificar? [nombre, edad, categoria, dorsal, posicion]:");
        System.out.println("=============================================");
        System.out.print("Selecciona una opcion: ");

        String opcion = entrada.next().toUpperCase();

        switch (opcion) {

            case "NOMBRE":
                System.out.print("Nuevo nombre: ");
                j.setNombre(entrada.next());
                System.out.println("Nombre actualizado correctamente.");
                break;

            case "EDAD":
                System.out.print("Nueva edad: ");

                try {

                    j.setEdad(entrada.nextInt());
                    System.out.println("Edad actualizada correctamente.");

                } catch (NumberFormatException e) {

                    System.out.println("Error, introduce un numero.");

                }
                break;

            case "CATEGORIA":
                System.out.print("Nueva categoria (BENJAMIN, ALEVIN, INFANTIL, CADETE, JUVENIL, SENIOR): ");

                try {

                    j.setCategoria(Equipos.valueOf(entrada.next()));
                    System.out.println("Categoría actualizada correctamente.");

                } catch (IllegalArgumentException e) {

                    System.out.println("Error, la categoria no existe o es incorrecta.");

                }
                break;

            case "DORSAL":
                System.out.print("Nuevo dorsal: ");

                try {

                    j.setDorsal(entrada.nextInt());
                    System.out.println("Dorsal actualizado correctamente.");

                } catch (NumberFormatException e) {

                    System.out.println("Error, formato incorrecto.");

                }
                break;

            case "POSICION":
                System.out.print("Nueva posicion (PORTERO, DEFENSA, CENTROCAMPISTA, DELANTERO): ");

                try {

                    j.setPosicion(Posiciones.valueOf(entrada.next()));
                    System.out.println("Posicion actualizada correctamente.");

                } catch (IllegalArgumentException e) {

                    System.out.println("Error, la posicion no existe o es incorrecta.");

                }
                break;
            default:
                System.out.println("Error, opcion no valida. Intentalo de nuevo.");

        }
    }

    public static void crearAcompanyante(){

        System.out.println("=== Crear Acompañante (SENIOR) ===");

        boolean llave = false;

        for (Jugador j : Jugador.jugadores){
            if(j.getCategoria() == Equipos.SENIOR){

                llave = true;
                break;

            }
        }

        if (!llave){

            System.out.println("No hay jugadores SENIOR disponibles.");
            return;

        }

        System.out.println("Lista de jugadores SENIOR:");

        for (int i = 0; i < Jugador.jugadores.size(); i++) {

            Jugador jugador = Jugador.jugadores.get(i);

            if (jugador.getCategoria() == Equipos.SENIOR) {

                System.out.println("[" + i + "] " + jugador);

            }
        }

        System.out.println("Seleccione el numero de jugador que tendra un acompañante.");

        int num;

        try{

            num = entrada.nextInt();

        }catch (NumberFormatException e){

            System.out.println("Error, formato incorrecto.");
            return;

        }

        Jugador acompanyado = Jugador.jugadores.get(num);

        System.out.println("Nombre del Acompañante: ");
        String nombre = entrada.next();

        System.out.println("Edad del Acompañante: ");
        int edad;
        try {

            edad = entrada.nextInt();

        } catch (NumberFormatException e) {

            System.out.println("Error, formato incorrecto.");
            return;
        }

        System.out.println("Parentesco con el Jugador: ");
        String parentesco = entrada.next();

        new Acompanyante(nombre, edad, acompanyado, parentesco);
        System.out.println("El acompanyante ha sido agregado correctamente.");

    }

    public static void gestionarEntrenadores() {
        String opcion;

        do {
            System.out.println("=== Mantenimiento de Entrenadores ===");
            System.out.println("[1]. Añadir nuevo entrenador");
            System.out.println("[2]. Modificar datos de un entrenador existente");
            System.out.println("[X]. Volver al menu principal");
            System.out.println("=====================================================");
            System.out.print("Selecciona una opcion: ");

            opcion = entrada.next().toUpperCase();

            switch (opcion) {
                case "1":
                    agregarEntrenador();
                    break;
                case "2":
                    modificarEntrenador();
                    break;
                case "X":
                    System.out.println("Volviendo al menu principal...");
                    break;
                default:
                    System.out.println("Error, opcion no valida. Intentalo de nuevo.");
            }
        } while (!opcion.equals("X"));
    }

    public static void agregarEntrenador() {

        System.out.print("Nombre del entrenador: ");
        String nombre = entrada.next();

        System.out.print("Edad del entrenador: ");
        int edad = entrada.nextInt();

        System.out.print("Equipo a entrenar (BENJAMIN, ALEVIN, INFANTIL, CADETE, JUVENIL, SENIOR): ");
        String equipo = entrada.next().toUpperCase();

        Equipos e;
        try {
            e = Equipos.valueOf(equipo);
        } catch (IllegalArgumentException i) {
            System.out.println("Error, el equipo no existe.");
            return;
        }

        System.out.print("Formacion preferida (ejemplo: 4-3-3): ");
        String formacion = entrada.next();

        if (!formacion.matches("\\d-\\d-\\d")) {
            System.out.println("Error, la formacion debe seguir el formato N-N-N.");
            return;
        }

        new Entrenador(nombre, edad, e, formacion);
        System.out.println("Entrenador añadido correctamente.");
    }

    public static void modificarEntrenador() {

        System.out.println("=== Mantenimiento de Entrenadores. Modificar datos de un Entrenador existente ===");

        if (Entrenador.entrenadores.isEmpty()) {

            System.out.println("No hay Entrenadores registrados.");
            return;

        }

        System.out.println("¿De que Entrenador quieres hacer cambios?");

        for (int i = 0; i < Entrenador.entrenadores.size(); i++) {
            System.out.println("[" + i + "] " + Entrenador.entrenadores.get(i));
        }

        System.out.println("==========================================");
        System.out.print("Selecciona el numero del entreador que quieres modificaar: ");

        int num;
        try {

            num = entrada.nextInt();

        } catch (NumberFormatException e) {

            System.out.println("Error, formato incorrecto.");
            return;

        }

        Entrenador e = Entrenador.entrenadores.get(num);

        System.out.println("=== Mantenimiento de Entrenadores. Modificar datos de un Entrenador existente ===");
        System.out.println("Modificando entrenador: " + e);
        System.out.println("¿Que quieres modificar? [nombre, edad, equipo, formacion]:");
        System.out.println("=============================================");
        System.out.print("Selecciona una opcien: ");

        String opcion = entrada.next().toUpperCase();

        switch (opcion) {
            case "NOMBRE":
                System.out.print("Nuevo nombre: ");
                e.setNombre(entrada.next());
                System.out.println("Nombre actualizado correctamente.");
                break;

            case "EDAD":
                System.out.print("Nueva edad: ");

                try {

                    e.setEdad(entrada.nextInt());
                    System.out.println("Edad actualizada correctamente.");

                } catch (NumberFormatException n) {

                    System.out.println("Error, introduce un número.");

                }
                break;

            case "EQUIPO":
                System.out.print("Nuevo equipo (BENJAMIN, ALEVIN, INFANTIL, CADETE, JUVENIL, SENIOR): ");

                try {

                    e.setEquipo(Equipos.valueOf(entrada.next().toUpperCase()));
                    System.out.println("Equipo actualizado correctamente.");

                } catch (IllegalArgumentException i) {

                    System.out.println("Error, el equipo no existe o es incorrecto.");

                }
                break;

            case "FORMACION":
                System.out.print("Nueva formación preferida (ejemplo: 4-3-3): ");
                String nuevaFormacion = entrada.next();

                if (nuevaFormacion.matches("\\d-\\d-\\d")) {

                    e.setFormacionPreferida(nuevaFormacion);
                    System.out.println("Formación actualizada correctamente.");

                } else {

                    System.out.println("Error, la formación debe seguir el formato N-N-N (ejemplo: 4-3-3).");

                }
                break;

            default:
                System.out.println("Error, opción no válida. Inténtalo de nuevo.");
        }
    }

    public static void gestionarMasajistas() {
        String opcion;

        do {
            System.out.println("=== Mantenimiento de Masajistas ===");
            System.out.println("[1]. Añadir nuevo masajista");
            System.out.println("[2]. Modificar datos de un masajista existente");
            System.out.println("[X]. Volver al menu principal");
            System.out.println("=====================================================");
            System.out.print("Selecciona una opcion: ");

            opcion = entrada.next().toUpperCase();

            switch (opcion) {
                case "1":
                    agregarMasajista();
                    break;
                case "2":
                    modificarMasajista();
                    break;
                case "X":
                    System.out.println("Volviendo al menu principal...");
                    break;
                default:
                    System.out.println("Error, opcion no valida. Intentalo de nuevo.");
            }
        } while (!opcion.equals("X"));
    }

    public static void agregarMasajista() {

        System.out.print("Nombre del masajista: ");
        String nombre = entrada.next();

        System.out.print("Edad del masajista: ");
        int edad = entrada.nextInt();

        System.out.print("Titulacion del masajista: ");
        String titulacion = entrada.next();

        System.out.print("Años de experiencia del masajista: ");
        int anyosExperiencia;

        try {

            anyosExperiencia = entrada.nextInt();

        } catch (NumberFormatException e) {

            System.out.println("Error, introduce un numero.");
            return;

        }

        new Masajista(nombre, edad, titulacion, anyosExperiencia);
        System.out.println("Masajista añadido correctamente.");

    }

    public static void modificarMasajista() {

        System.out.println("=== Mantenimiento de Masajistas. Modificar datos de un Masajista existente ===");

        if (Masajista.masajistas.isEmpty()) {

            System.out.println("No hay Masajistas registrados.");
            return;

        }

        System.out.println("¿De que Masajista quieres hacer cambios?");

        for (int i = 0; i < Masajista.masajistas.size(); i++) {

            System.out.println("[" + i + "] " + Masajista.masajistas.get(i));

        }

        System.out.println("==========================================");
        System.out.print("Selecciona una opcion: ");

        int num;
        try {

            num = entrada.nextInt();

        } catch (NumberFormatException e) {

            System.out.println("Error, formato incorrecto.");
            return;

        }

        Masajista m = Masajista.masajistas.get(num);

        System.out.println("=== Mantenimiento de Masajistas. Modificar datos de un Masajista existente ===");
        System.out.println("Modificando masajista: " + m);
        System.out.println("¿Que quieres modificar? [nombre, edad, titulacion, experiencia]:");
        System.out.println("=============================================");
        System.out.print("Selecciona una pcion: ");

        String opcion = entrada.next().toUpperCase();

        switch (opcion) {
            case "NOMBRE":
                System.out.print("Nuevo nombre: ");
                m.setNombre(entrada.next());
                System.out.println("Nombre actualizado correctamente.");
                break;

            case "EDAD":
                System.out.print("Nueva edad: ");

                try {

                    m.setEdad(entrada.nextInt());
                    System.out.println("Edad actualizada correctamente.");

                } catch (NumberFormatException e) {

                    System.out.println("Error, introduce un numero.");

                }
                break;

            case "TITULACION":
                System.out.print("Nueva titulacion: ");
                m.setTitulacion(entrada.next());
                System.out.println("Titulacion actualizada correctamente.");
                break;

            case "EXPERIENCIA":
                System.out.print("Nuevos años de experiencia: ");

                try {

                    m.setAnyosExperiencia(entrada.nextInt());
                    System.out.println("Años de exeriencia actualizados correctamente.");

                } catch (NumberFormatException e) {

                    System.out.println("Error, introduce un numero.");

                }
                break;

            default:
                System.out.println("Error, opcion no vlida. Intentalo de nuevo.");
        }
    }

    public static void consultarEquipos() {

        System.out.println("=== Consulta de Equipos ===");

        for (Equipos equipo : Equipos.values()) {

            System.out.println("- " + equipo);

        }

        System.out.print("Selecciona un equipo para ver sus jugadores: ");
        String opcion = entrada.next().toUpperCase();

        try {
            Equipos e = Equipos.valueOf(opcion);
            System.out.println("Jugadores en el equipo " + e + ":");
            System.out.println();

            boolean encontrado = false;

            for (Jugador jugador : Jugador.jugadores) {
                if (jugador.getCategoria() == e) {
                    System.out.println(jugador);
                    encontrado = true;
                }
            }

            if (!encontrado) {
                System.out.println("No hay jugadores en este equipo.");
                return;
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error, equipo no valido. Intentalo de nuevo.");
        }

    }

}