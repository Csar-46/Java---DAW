package org.example.biblioteca2;

/**
 * Representa un libro dentro de la biblioteca.
 * Cada libro tiene un título, un autor, un año de publicación
 * y un estado de disponibilidad.
 *
 * @author César Portero Pestaña
 * @version 1.0
 * @see Biblioteca
 */
public class Libro {

    /** Título del libro */
    private String titulo;

    /** Autor del libro */
    private String autor;

    /** Año de publicación del libro */
    private int anyoPublicacion;

    /** Indica si el libro está disponible para préstamo */
    private boolean disponible;

    /**
     * Constructor de la clase Libro.
     * @param titulo El título del libro.
     * @param autor El autor del libro.
     * @param anyoPublicacion El año en que se publicó el libro.
     */
    public Libro(String titulo, String autor, int anyoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anyoPublicacion = anyoPublicacion;
        this.disponible = true;
    }

    /**
     * Marca el libro como prestado si está disponible.
     */
    public void prestarLibro() {
        if (!this.disponible) {
            System.out.println("El libro no está disponible.");
        } else {
            this.disponible = false;
            System.out.println("El libro ha sido prestado.");
        }
    }

    /**
     * Marca el libro como devuelto si estaba prestado.
     */
    public void devolverLibro() {
        if (this.disponible) {
            System.out.println("El libro ya está en la biblioteca.");
        } else {
            this.disponible = true;
            System.out.println("El libro ha sido devuelto.");
        }
    }

    /**
     * Muestra la información del libro en la consola.
     */
    public void mostrarInformacion() {
        System.out.println("Libro = [ Título: " + this.getTitulo() + ", Autor: "
                + this.getAutor() + ", Año: " + this.getAnyoPublicacion()
                + ", Disponible: " + (disponible ? "Está disponible!]"
                : "No lo tenemos actualmente :C]"));
    }

    /**
     * Obtiene el autor del libro.
     * @return El autor del libro.
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Establece el autor del libro.
     * @param autor El nombre del autor.
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Verifica si el libro está disponible.
     * @return true si el libro está disponible, false en caso contrario.
     */
    public boolean isDisponible() {
        return disponible;
    }

    /**
     * Establece el estado de disponibilidad del libro.
     * @param disponible true si el libro está disponible, false en caso contrario.
     */
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    /**
     * Obtiene el año de publicación del libro.
     * @return El año de publicación del libro.
     */
    public int getAnyoPublicacion() {
        return anyoPublicacion;
    }

    /**
     * Establece el año de publicación del libro.
     * @param anyoPublicacion Año de publicación.
     */
    public void setAnyoPublicacion(int anyoPublicacion) {
        this.anyoPublicacion = anyoPublicacion;
    }

    /**
     * Obtiene el título del libro.
     * @return El título del libro.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Establece el título del libro.
     * @param titulo Título del libro.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Devuelve una representación en cadena del libro.
     * @return Una cadena con la información del libro.
     */
    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anyoPublicacion=" + anyoPublicacion +
                ", disponible=" + disponible +
                '}';
    }
}
