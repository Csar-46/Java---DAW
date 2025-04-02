package main.java.org.example.mercadaw;

import java.util.*;

public class Mercadaw {

    static Random aleatorio = new Random();
    static final int TAMANYO = 8;
    static Set<Cliente> clientes;
    static String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    public Mercadaw(){

        clientes = new HashSet<>();

    }

    public void generarClientes(){

        //Se usa "StringBuilder" ya que son cadenas de texto que se van a modificar constantemente.
        StringBuilder usuario = new StringBuilder();
        StringBuilder contrasenya = new StringBuilder();

        for (int i = 0; i < TAMANYO; i++) {

            usuario.append(CARACTERES.charAt(aleatorio.nextInt(CARACTERES.length())));
            contrasenya.append(CARACTERES.charAt(aleatorio.nextInt(CARACTERES.length())));

        }

        clientes.add(new Cliente(usuario.toString(), contrasenya.toString()));

    }

    public void imprimirClientes(){

        for (Cliente i : clientes){

            System.out.println(i);

        }
    }

    public Set<Cliente> getClientes() {
        return Collections.unmodifiableSet(clientes);
    }
}
