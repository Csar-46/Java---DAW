package main.java.org.example.mercadaw;

import java.util.*;

public class Mercadaw {

    static Scanner entrada = new Scanner(System.in);
    static Random aleatorio = new Random();
    public static final int TAMANYO = 8;
    static Set<Cliente> clientes;

    public Mercadaw(){

        clientes = new HashSet<>();

    }

    public void generarClientes(){

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String usuario = "";
        String contrasenya = "";

        for (int i = 0; i < TAMANYO; i++) {

            usuario += caracteres.charAt(aleatorio.nextInt(caracteres.length()));
            contrasenya += caracteres.charAt(aleatorio.nextInt(caracteres.length()));

        }

        clientes.add(new Cliente(usuario, contrasenya));

    }

    public void imprimirClientes(){

        for (Cliente i : clientes){

            System.out.println(i);

        }
    }

    public void autenticacion(Set<Cliente> listaClientes){

        int cont = 0;

        do {
            System.out.print("Usuario: ");
            String usuario = entrada.next();

            System.out.print("Contraseña: ");
            String contra = entrada.next();


            boolean encontrado = false;

            for (Cliente c : listaClientes) {
                if (c.getUsuario().equals(usuario) && c.getContrasena().equals(contra)) {

                    AppZonaClientes.cliente = c;
                    encontrado = true;
                    break;

                }
            }

            if (encontrado) {
                System.out.println("SE HAN VERIFICADO LOS DATOS CORRECTAMENTE!");
                System.out.println();
                AppZonaClientes.iniciarCompra();
                break;

            }else {

                System.out.println("Algo no coincide o no existe! Vuelve a intentarlo...");
                cont++;

                if(cont == 3){

                    System.err.println("ERROR DE AUTENTICACIÓN");
                    //System.exit(0);

                }

            }

        } while (cont < 3);



    }

    public Set<Cliente> getClientes() {
        return Collections.unmodifiableSet(clientes);
    }
}
