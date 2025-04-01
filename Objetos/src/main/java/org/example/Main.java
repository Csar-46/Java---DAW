package org.example;

import org.example.biblioteca.Editorial;
import org.example.biblioteca.Estudiante;
import org.example.biblioteca.Libro;
import org.example.biblioteca.Prestamo;

import java.util.Scanner;

public class Main {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {



        Estudiante estudiante1 = new Estudiante("Paco");
        Estudiante estudiante2 = new Estudiante("Paco","2ºESO","noseque@edu.gva.es");

        System.out.println(estudiante1);
        System.out.println(estudiante2);


        if(Estudiante.validarEmail(estudiante2.getEmail())){
            System.out.println("El email es correcto");
        }else{
            System.out.println("El email no cumple con el formato");
        }

        Editorial editorial1 = new Editorial("ANAYA","ESPAÑA");
        System.out.println(editorial1);

        Libro libro1 = new Libro("el principito","quevedo",editorial1);
        System.out.println(libro1);
        Libro libro2 = new Libro("tiburon","torres", editorial1);
        System.out.println(libro2);

        System.out.println(Libro.getLibrosDisponibles());
        Prestamo prestamo1 = libro1.prestar(estudiante2);
        System.out.println(prestamo1);
        System.out.println(estudiante2);
        System.out.println(libro1);
        System.out.println(Libro.getLibrosDisponibles());

        libro1.devolver(estudiante2);
        System.out.println(libro1);
        System.out.println(estudiante2);
        System.out.println(Libro.getLibrosDisponibles());
        libro1.devolver(estudiante2);

        libro1.estaDisponible();




//        Persona persona1 = new Persona("Marta", "Poveda", "123454678T", "Alicante", "Carpintero", 'M', 18);
//        Persona persona2 = new Persona("Kiko", "Perez", "87456321E", "Alicante", "Astronauta", 'H', 20);
//
//        Equipo equipo1 = new Equipo("Innova");
//
//        System.out.println(persona1);
//        System.out.println(equipo1);
//
//        equipo1.insertarIntegrantes(persona1);
//
//        System.out.println(equipo1);
//
//        equipo1.insertarIntegrantes(persona2);
//
//        System.out.println(equipo1);
//
//        equipo1.borrarIntegrantes(persona1);
//
//        System.out.println(equipo1);




    }
    //        Estudiante estudiante1 = new Estudiante("Paco");
//        Estudiante estudiante2 = new Estudiante("Paco","2ºESO","noseque@edu.gva.es");
//
//        System.out.println(estudiante1);
//        System.out.println(estudiante2);
//
//        if(Estudiante.validarEmail(estudiante2.getEmail())){
//            System.out.println("El email es correcto");
//        }else{
//            System.out.println("El email no cumple con el formato");
//        }
//
//        Libro libro1 = new Libro("el principito","quevedo");
//        System.out.println(libro1);
//        Libro libro2 = new Libro("tiburon","torres");
//        System.out.println(libro2);
//
//
//        System.out.println(Libro.getLibrosDisponibles());
//        libro2.prestar(estudiante2);
//        System.out.println(Libro.getLibrosDisponibles());
//        System.out.println(libro1);
//        libro1.devolver(estudiante2);
//        System.out.println(Libro.getLibrosDisponibles());
//        libro2.devolver(estudiante2);
//        System.out.println(libro2);


    //Ejemplos de uso Objetos: Persona, Paciente, Televisor.
//        System.out.println("Introduce el nombre");
//        String nombre = entrada.next();
//
//        System.out.println("Introduce el edad");
//        int edad = entrada.nextInt();
//
//        System.out.println("Introduce el género");
//        char genero = entrada.next().charAt(0);
//
//        System.out.println("Introduce el peso");
//        double peso = entrada.nextDouble();
//
//        System.out.println("Introduce el altura");
//        double altura = entrada.nextDouble();

//
//        Paciente paciente1 = new Paciente(nombre, edad, genero, peso, altura);
//        Paciente paciente2 = new Paciente(nombre, edad, genero);
//        Paciente paciente3 = new Paciente();
//
//        paciente3.setNombre("Llados");
//        paciente3.setEdad(16);
//        paciente3.setGenero('H');
//        paciente3.setPeso(120);
//        paciente3.setAltura(1.70);
//
//        System.out.println(paciente3);

//        mostrarIMC(paciente1);
//        mostrarIMC(paciente2);
//        mostrarIMC(paciente3);

//        edad(paciente1);
//        edad(paciente2);
//        edad(paciente3);






//        Paciente paciente = new Paciente("Luis", 35, 'H',90, 1.90);
//        paciente.imprimirInfo();
//
//        Paciente paciente1 = new Paciente();
//        paciente1.imprimirInfo();

//        Persona persona1 = new Persona();
//        Persona persona2 = new Persona("Paco", "Ruiz", "12345678A", "Alicante", "Inormatico", 'H', 45);
//
//        Televisor televisor = new Televisor();
//
//        System.out.println("Canal: " + televisor.getCanal() + " Volumen: "+ televisor.getVolumen());
//
//        televisor.subirCanal(televisor.getCanal());
//        televisor.subirVolumen(televisor.getVolumen());


//        persona1.imprimir();
//        persona2.imprimir();
//
//        System.out.println(persona2.concatenar());
//
//        System.out.println("La edad de " + persona2.concatenar() + " es: " + persona2.getEdad());
//        persona1.setApellido("Sin Nombre");
//        System.out.println(persona1.getApellido());

//        persona1.setEdad(16);

//        if (persona1.getEdad() < persona2.getEdad()){
//
//            System.out.println(persona1.getApellido() + " es menor que " + persona2.getApellido());
//
//        }

    //Metodos de paciente
//    public static void mostrarIMC (Paciente paciente){
//
//        int estado = paciente.calcularIMC();
//
//        switch (estado){
//
//            case BAJO_PESO:
//                System.out.println("Estas mu delga/o maj@");
//                break;
//            case PESO_IDEAL:
//                System.out.println("Pero que saludable te veo maquinilla!");
//                break;
//            case SOBREPESO:
//                System.out.println("Sobran un par de doritos my g");
//                break;
//        }
//    }
//
//    public static void edad(Paciente paciente){
//
//        if(paciente.mayorEdad()){
//
//            System.out.println("El paciente " + paciente.getNombre() +" tiene pelos en los miembros.");
//
//        }else System.out.println("El paciente " + paciente.getNombre() +" es alevín.");
//
//    } //

}