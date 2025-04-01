package org.example.biblioteca2;

import java.util.ArrayList;

/**
 * Clase que representa una biblioteca con un catálogo de libros y usuarios registrados.
 * Permite agregar libros, registrar usuarios, buscar libros y mostrar el catálogo disponible.
 * @author César Portero Pestaña
 * @version 1.0
 * @see Libro
 * @see Usuario
 */
public class Biblioteca {

    /**
     * Lista de libros disponibles en la biblioteca.
     */
    private ArrayList<Libro> catalogo;

    /**
     * Lista de usuarios registrados en la biblioteca.
     */
    private ArrayList<Usuario> usuariosRegistrados;

    /**
     * Constructor de la clase Biblioteca.
     * Inicializa las listas de libros y usuarios registrados.
     */
    public Biblioteca() {
        this.catalogo = new ArrayList<>();
        this.usuariosRegistrados = new ArrayList<>();
    }

    /**
     * Agrega un libro al catálogo de la biblioteca si no está ya registrado.
     * @param libro El libro a agregar al catálogo.
     */
    public void agregarLibro(Libro libro) {
        if (catalogo.contains(libro)) {
            System.out.println("El libro ya está en el catálogo de la biblioteca :C");
            return;
        }
        catalogo.add(libro);
        System.out.println("El libro se ha añadido correctamente al catálogo!!");
    }

    /**
     * Registra un usuario en la biblioteca si no ha sido registrado previamente.
     *
     * @param usuario El usuario a registrar.
     */
    public void registrarUsuario(Usuario usuario) {
        if (usuariosRegistrados.contains(usuario)) {
            System.out.println("El usuario ya ha sido registrado :C");
            return;
        }
        usuariosRegistrados.add(usuario);
        System.out.println("El usuario se ha registrado con éxito a la biblioteca!!");
    }

    /**
     * Busca un libro en el catálogo por su título e informa si está disponible.
     * @param titulo El título del libro a buscar.
     */
    public void buscarLibro(String titulo) {
        for (Libro l : catalogo) {
            if (titulo.equalsIgnoreCase(l.getTitulo())) {
                System.out.println("El libro '" + l.getTitulo() + "' está en el catálogo!");
                return;
            }
        }
        System.out.println("El libro no está en el catálogo :C");
    }

    /**
     * Muestra la lista de libros disponibles en el catálogo.
     */
    public void mostrarCatalogo() {
        System.out.println("Libros disponibles:");
        for (Libro l : this.catalogo) {
            if (l.isDisponible()) {
                System.out.println("Título: " + l.getTitulo() + ", Autor: " + l.getAutor() + ", Año: " + l.getAnyoPublicacion() + ".");
            }
        }
    }

    /**
     * Obtiene el catálogo de libros de la biblioteca.
     * @return La lista de libros en el catálogo.
     */
    public ArrayList<Libro> getCatalogo() {
        return catalogo;
    }

    /**
     * Establece un nuevo catálogo de libros.
     * @param catalogo La nueva lista de libros a establecer.
     */
    public void setCatalogo(ArrayList<Libro> catalogo) {
        this.catalogo = catalogo;
    }

    /**
     * Obtiene la lista de usuarios registrados en la biblioteca.
     * @return La lista de usuarios registrados.
     */
    public ArrayList<Usuario> getUsuariosRegistrados() {
        return usuariosRegistrados;
    }

    /**
     * Establece una nueva lista de usuarios registrados.
     * @param usuariosRegistrados La nueva lista de usuarios.
     */
    public void setUsuariosRegistrados(ArrayList<Usuario> usuariosRegistrados) {
        this.usuariosRegistrados = usuariosRegistrados;
    }
}
