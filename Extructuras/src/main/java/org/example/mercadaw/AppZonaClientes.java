package main.java.org.example.mercadaw;

import java.util.Scanner;
import java.util.Set;

public class AppZonaClientes {

    static Scanner entrada = new Scanner(System.in);
    static Cliente cliente;
    static final int INTENTOS = 3;

    public static void main(String[] args) {

        Mercadaw mercadaw = new Mercadaw();

        mercadaw.generarClientes();
        mercadaw.generarClientes();

        mercadaw.imprimirClientes();
        System.out.println();

        autenticacion(mercadaw.getClientes());
        System.out.println();

        menu();

    }

    public static void autenticacion(Set<Cliente> listaClientes){

        int cont = 0;

        do {
            System.out.print("Usuario: ");
            String usuario = entrada.next();

            System.out.print("Contraseña: ");
            String contra = entrada.next();


            boolean encontrado = false;

            for (Cliente c : listaClientes) {
                if (c.getUsuario().equals(usuario) && c.getContrasena().equals(contra)) {

                    cliente = c;
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

                if(cont == INTENTOS){

                    System.err.println("ERROR DE AUTENTICACIÓN");

                }

            }
        } while (cont < INTENTOS);



    }

    public static void iniciarCompra (){

        cliente.crearPedido();
        imprimirProductos();

    }

    public static void imprimirProductos(){

        double carrito = 0;
        boolean llave = true;

        System.out.println("BIENVENID@ " + cliente.getUsuario());
        do {
            System.out.println("Añade productos a tu lista de la compra...");

            for(Producto producto : Producto.values()){

                System.out.println("\n  " + producto.name() + " precio (" + producto.getPrecio() + "€).");

            }

            String eleccion = opcion();

            try {
                for (Producto producto : Producto.values()){
                    if(Producto.valueOf(eleccion).equals(producto)){

                        //Cambiar y usar el metodo de Cliente.
                        carrito += producto.getPrecio();

                        cliente.importePedido(carrito);

                        cliente.insertarProducto(producto.name());

                        System.out.print("Has añadido " + producto.name() + " con un precio de " + producto.getPrecio() + "€. Importe del carrito " + carrito +
                                "€ ¿Quieres añadir más productos a tu carrito de la compra? [S/N]: ");

                        String opcion = entrada.next().toUpperCase();
                        entrada.nextLine();

                        switch (opcion){
                            case "S":
                                cliente.getPedido().setImporte_total(carrito);
                                break;
                            case "N":
                                cliente.getPedido().resumenCompra();
                                llave = false;
                                break;
                            default:

                                System.out.println("Opcion no reconocida!  vuelve a intentarlo.");
                                System.out.println();
                                break;
                        }
                    }
                }
            } catch (IllegalArgumentException e) {
                System.out.println("ERROR, EL PRODUCTO INDICADO NO EXISTE!! Porfavor, vuelve a intentarlo.");
                System.out.println();
            }
        } while (llave);
    }

    public static void menu(){

        boolean llave = false;

        do {
            System.out.println("===========================================");
            System.out.println();

            System.out.println("¿QUÉ DESEA HACER?");
            System.out.println();
            System.out.println("    [1]. Aplicar promo.");
            System.out.println("    [2]. Mostrar resumen ordenado por uds.");
            System.out.println("    [3]. Terminar pedido.");

            String opcion = opcion();

            switch (opcion){
                case "1":
                    if (cliente.isPromociones()){

                        System.out.println("YA HAS APLICADO TUS PROMOS");
                        System.out.println();

                    }else{

                        cliente.getPedido().aplicarPromo3x2();
                        cliente.getPedido().aplicarPromo10();
                        cliente.setPromociones(true);
                        cliente.getPedido().resumenCompra();

                    }
                    break;
                case "2":
                    cliente.getPedido().resumenOrdenado();
                    break;
                case "3":
                    cliente.terminarpedido();
                    llave = true;
                    break;
                default:
                    System.out.println("Opcion no reconocida! Vuelve a intentarlo.");
                    System.out.println();
                    break;
            }
        } while (!llave);
    }

    public static String opcion(){

        System.out.println();
        System.out.println("===========================================");

        System.out.print("\n   Elige un producto: ");
        String eleccion = entrada.next().toUpperCase();
        entrada.nextLine();

        System.out.println();
        System.out.println("===========================================");
        System.out.println();

        return eleccion;

    }

}
