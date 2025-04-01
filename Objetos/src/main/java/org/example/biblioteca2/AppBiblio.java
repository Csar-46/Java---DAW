package org.example.biblioteca2;

/**
 * Clase principal que prueba las funcionalidades de la biblioteca,
 * los libros y los usuarios.
 * @author César Portero PEstaña
 * @version 1.0
 * @see Biblioteca
 * @see Libro
 * @see Usuario
 */
public class AppBiblio {

    /**
     * Metodo principal que ejecuta pruebas sobre el sistema de la biblioteca.
     * @param args Argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) {

        // Creación de libros
        Libro libro1 = new Libro("Lander Adventures", "Lander Vi Ender I", 1916);
        Libro libro2 = new Libro("Java Programming", "James Gosling", 1995);
        Libro libro3 = new Libro("Clean Code", "Robert C. Martin", 2008);

        // Mostrar información inicial de los libros
        System.out.println("Información inicial de los libros:");
        libro1.mostrarInformacion();
        libro2.mostrarInformacion();
        libro3.mostrarInformacion();
        System.out.println();

        // Creación de la biblioteca y agregación de libros
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        System.out.println();

        // Búsqueda de un libro en la biblioteca
        biblioteca.buscarLibro("Lander Adventures");
        biblioteca.buscarLibro("Libro que no existe");
        System.out.println();

        // Creación de usuarios
        Usuario usuario1 = new Usuario("Juan Pérez", 101);
        Usuario usuario2 = new Usuario("Ana Gómez", 102);

        // Registro de usuarios en la biblioteca
        biblioteca.registrarUsuario(usuario1);
        biblioteca.registrarUsuario(usuario2);
        System.out.println();

        // Préstamo de libros por parte de los usuarios
        System.out.println("Préstamos de libros:");
        usuario1.prestarLibro(libro1); // Debería ser exitoso
        usuario1.prestarLibro(libro2); // Debería ser exitoso
        System.out.println();

        // Listado de libros prestados por cada usuario
        System.out.println("Libros prestados por usuarios:");
        usuario1.listarLibrosPrestados();
        usuario2.listarLibrosPrestados();
        System.out.println();

        // Intento de devolver libros
        System.out.println("Devolución de libros:");
        usuario1.devolverLibro(libro1); // Debería ser exitoso
        usuario1.devolverLibro(libro1); // Debería fallar (ya devuelto)
        usuario2.devolverLibro(libro2); // Debería fallar (no lo tiene)
        System.out.println();

        // Mostrar catálogo actualizado
        System.out.println("Catálogo actualizado de la biblioteca:");
        biblioteca.mostrarCatalogo();
    }
}
