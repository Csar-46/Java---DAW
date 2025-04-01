package main.java.org.example.mercadaw;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AppZonaClientes {

    static Cliente cliente;
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        Mercadaw mercadaw = new Mercadaw();

        mercadaw.generarClientes();
        mercadaw.generarClientes();

        mercadaw.imprimirClientes();
        System.out.println();

        mercadaw.autenticacion(mercadaw.getClientes());
        System.out.println();

        menu();

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

            System.out.println();
            System.out.println("===========================================");

            System.out.print("\n   Elige un producto: ");
            String eleccion = entrada.next().toUpperCase();
            entrada.nextLine();
            boolean esta = false;

            System.out.println();
            System.out.println("===========================================");
            System.out.println();

            try {
                for (Producto producto : Producto.values()){
                    if(Producto.valueOf(eleccion).equals(producto)){

                        esta = true;

                        if (esta){

                            //Cambiar y usar el metodo de Cliente.
                            carrito += producto.getPrecio();
                            cliente.getPedido().setImporte_total(carrito);
                            cliente.insertarProducto(producto.name());

                            System.out.print("Has añadido " + producto.name() + " con un precio de " + cliente.getPedido().getImporte_total() + "€. Importe del carrito € " + carrito +
                                    " ¿Quieres añadir más productos a tu carrito de la compra? [S/N]: ");

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
                                    carrito -= producto.getPrecio();
                                    cliente.eliminarProducto(producto.name());
                                    cliente.getPedido().setImporte_total(carrito);
                                    System.out.println("Opcion no reconocida!  vuelve a intentarlo.");
                                    System.out.println();
                            }

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

        System.out.println("===========================================");
        System.out.println();

        System.out.println("¿QUÉ DESEA HACER?");
        System.out.println();
        System.out.println("    [1]. Aplicar promo.");
        System.out.println("    [2]. Mostrar resumen ordenado por uds.");
        System.out.println("    [3]. Terminar pedido.");
        System.out.println();

        System.out.println("===========================================");

        System.out.print("\n   Elige un producto: ");
        String opcion = entrada.next();
        entrada.nextLine();

        System.out.println();
        System.out.println("===========================================");
        System.out.println();

        switch (opcion){
            case "1":
                break;
            case "2":
                break;
            case "3":
                cliente.terminarpedido();
                break;
            default:
                System.out.println("Opcion no reconocida!  vuelve a intentarlo.");
                System.out.println();
        }



    }
}
