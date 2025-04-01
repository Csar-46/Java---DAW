package main.java.org.example.mercadaw;

import java.util.*;

public class Mercadaw {

    static Scanner entrada = new Scanner(System.in);
    static Random aleatorio = new Random();
    static final int TAMANYO = 8;
    static Set<Cliente> clientes;
    static String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    public Mercadaw(){

        clientes = new HashSet<>();

    }

    public void generarClientes(){

        String usuario = "";
        String contrasenya = "";

        for (int i = 0; i < TAMANYO; i++) {

            usuario += CARACTERES.charAt(aleatorio.nextInt(CARACTERES.length()));
            contrasenya += CARACTERES.charAt(aleatorio.nextInt(CARACTERES.length()));

        }

        clientes.add(new Cliente(usuario, contrasenya));

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
