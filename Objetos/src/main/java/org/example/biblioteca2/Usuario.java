package org.example.biblioteca2;

import java.util.ArrayList;

/**
 * Representa un usuario de la biblioteca.
 * Cada usuario tiene un nombre, un ID único y una lista de libros prestados.
 * @author César Portero Pestaña
 * @version 1.0
 * @see Libro
 */
public class Usuario {

    /** Nombre del usuario */
    private String nombre;

    /** Identificador único del usuario */
    private int idUsuario;

    /** Lista de libros que el usuario ha tomado prestados */
    private ArrayList<Libro> librosPrestados;

    /**
     * Constructor de la clase Usuario.
     * @param nombre El nombre del usuario.
     * @param idUsuario Identificador único del usuario.
     */
    public Usuario(String nombre, int idUsuario) {
        this.nombre = nombre;
        this.idUsuario = idUsuario;
        this.librosPrestados = new ArrayList<>();
    }

    /**
     * Permite al usuario tomar prestado un libro de la biblioteca.
     * @param libro El libro que el usuario desea prestar.
     */
    public void prestarLibro(Libro libro) {
        if (this.librosPrestados.contains(libro)) {
            System.out.println("El libro ya ha sido prestado por este usuario.");
            return;
        }

        if (!libro.isDisponible()) {
            System.out.println("El libro no está disponible para préstamo.");
            return;
        }

        this.librosPrestados.add(libro);
        libro.prestarLibro  ();
        System.out.println("El libro se ha prestado con éxito.");
    }

    /**
     * Permite al usuario devolver un libro previamente prestado.
     * @param libro El libro que el usuario desea devolver.
     */
    public void devolverLibro(Libro libro) {
        if (!this.librosPrestados.contains(libro)) {
            System.out.println("Este libro no ha sido prestado por este usuario.");
            return;
        }

        if (libro.isDisponible()) {
            System.out.println("El libro ya está en la biblioteca.");
            return;
        }

        this.librosPrestados.remove(libro);
        libro.devolverLibro();
        System.out.println("El libro se ha devuelto con éxito.");
    }

    /**
     * Muestra en la consola la lista de libros prestados por el usuario.
     */
    public void listarLibrosPrestados() {
        System.out.println("Libros prestados por " + nombre + ":");
        for (Libro l : this.librosPrestados) {
            System.out.println("Título: " + l.getTitulo() + ", Autor: " + l.getAutor()
                    + ", Año: " + l.getAnyoPublicacion() + ".");
        }
    }

    /**
     * Obtiene el identificador del usuario.
     * @return El ID del usuario.
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * Establece un nuevo identificador para el usuario.
     * @param idUsuario El nuevo ID del usuario.
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * Obtiene la lista de libros que el usuario tiene prestados
     * @return Una lista de libros prestados.
     */
    public ArrayList<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    /**
     * Establece una nueva lista de libros prestados por el usuario.
     * @param librosPrestados La nueva lista de libros prestados.
     */
    public void setLibrosPrestados(ArrayList<Libro> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    /**
     * Obtiene el nombre del usuario.
     * @return El nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del usuario.
     * @param nombre El nuevo nombre del usuario.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve una representación en cadena del usuario.
     * @return Una cadena con la información del usuario.
     */
    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", idUsuario=" + idUsuario +
                ", librosPrestados=" + librosPrestados +
                '}';
    }
}
