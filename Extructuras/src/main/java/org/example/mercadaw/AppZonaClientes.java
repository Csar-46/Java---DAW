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

            System.out.println("===========================================");

            System.out.print("\n   Elige un producto: ");
            String eleccion = entrada.next().toUpperCase();
            entrada.nextLine();
            boolean esta = false;

            System.out.println("===========================================");

            try {
                for (Producto producto : Producto.values()){
                    if(Producto.valueOf(eleccion).equals(producto)){

                        esta = true;

                        if (esta){

                            //Cambiar y usar el metodo de Cliente.
                            carrito += producto.getPrecio();

                            cliente.getPedido().setImporte_total(carrito);
                            cliente.insertarProducto(producto.name());

                            System.out.print("Has añadido " + producto.name() + " con un precio de " + carrito + "€. Importe del carrito € " + cliente.getPedido().getImporte_total()  +
                                    " ¿Quieres añadir más productos a tu carrito de la compra? [S/N]: ");

                            String opcion = entrada.next().toUpperCase();
                            entrada.nextLine();

                            switch (opcion){
                                case "S":
                                    break;
                                case "N":
                                    resumenCompra();
                                    llave = false;
                                    break;
                                default:
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

    public static void resumenCompra(){

        System.out.println("RESUMEN DE TU CARRITO DE LA COMPRA:");
        System.out.println();
        System.out.println("Productos: ");
        System.out.println();


//        Como accedo al mapa de Pedido? Me tengo que crear otro mapa aqui?
//        for (Map.Entry<Producto, Integer> mapaProductos : ){
//
//
//
//        }

    }

}
