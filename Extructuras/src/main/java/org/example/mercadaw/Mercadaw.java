package main.java.org.example.mercadaw;

import java.util.*;

public class Mercadaw {

    static Random aleatorio = new Random();

    //Incida el tamaño del usuario y la contraseña
    static final int TAMANYO = 8;
    static Set<Cliente> clientes;

    //Estos son los caracteres de los que pueden estar compuesto usuario y contraseña.
    static String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    public Mercadaw(){

        clientes = new HashSet<>();

    }

    public void generarClientes(){

        //Se usa "StringBuilder" ya que son cadenas de texto que se van a modificar constantemente.
        StringBuilder usuario = new StringBuilder();
        StringBuilder contrasenya = new StringBuilder();

        //Concatenamos caracteres de la cadena hasta el tamaño maximo.
        for (int i = 0; i < TAMANYO; i++) {

            usuario.append(CARACTERES.charAt(aleatorio.nextInt(CARACTERES.length())));
            contrasenya.append(CARACTERES.charAt(aleatorio.nextInt(CARACTERES.length())));

        }

        //Añadimos el usuario y la contraseña a los clientes.
        clientes.add(new Cliente(usuario.toString(), contrasenya.toString()));

    }

    //Imprimimos la lista de clientes para poder hacer el log-in
    public void imprimirClientes(){

        for (Cliente i : clientes){

            System.out.println(i);

        }
    }

    public Set<Cliente> getClientes() {
        return Collections.unmodifiableSet(clientes);
    }
}
