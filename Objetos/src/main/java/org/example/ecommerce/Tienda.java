package org.example.ecommerce;
import java.util.Scanner;

public class Tienda {

    static Scanner entrada = new Scanner(System.in);


    //Con este metodo recaudamos toda la informacion de pago del usuario.
    public static void iniciarPago(){

        //Declaramos un vector con los metodos de pago disponibles.
        String [] METODOS_PAGO = {"Bizum", "Paypal", "Tarjeta"};


        do {
            System.out.println("¿Qué método de pago quieres usar? [Bizum, Paypal, Tarjeta]");
            String metodo = entrada.next().toUpperCase();

            MetodoPago metodoPago;
            double importe;

            // Dependiendo del metodo de pago elegido solicitamos los datos necesarios.
            for (int i = 0 ; i < METODOS_PAGO.length ; i++) {
                if(metodo.equalsIgnoreCase(METODOS_PAGO[i])){

                    //En caso de coincidir entramos al caso que coincida.
                    switch (metodo){

                        case "BIZUM":
                            System.out.println("Ingrese número de teléfono (9 dígitos):");

                            //Metodo que pide un numero
                            String telf = pedir();

                            //Guardamos el objeto como MetodoPago
                            metodoPago = new Bizum(telf);
                            importe = pedirImporte();
                            realizarPago(metodoPago, importe);
                            return;
                        case "PAYPAL":
                            System.out.println("Introduce la cuenta de PayPal (email).");
                            String cuenta = pedir();
                            metodoPago = new Paypal(cuenta);
                            importe = pedirImporte();
                            realizarPago(metodoPago, importe);
                            return;
                        case "TARJETA":
                            System.out.println("Introduce los datos de tu tarjeta: ");
                            System.out.println("Número (16 dígitos): ");
                            String nro_tarjeta = pedir();
                            System.out.println("¿De qué tipo es tu tarjeta (VISA , MASTERCARD o MAESTRO): ");
                            String tipo = pedir();
                            metodoPago = new Tarjeta(nro_tarjeta, tipo);
                            importe = pedirImporte();
                            realizarPago(metodoPago, importe);
                            return;
                    }
                }
            }
            //En caso de que no se encuentre el metodo introducido saldrá este mensaje y se volverá a pedir.
            System.out.println("Método de pago no reconocido.");
        }while(true);
    }

    //Solicitamos un numero al usuario.
    public static String pedir(){

        return entrada.next();

    }

    //Pedimos el importe que queremos pagar.
    public static double pedirImporte(){

        System.out.println("Introduce el importe a pagar: ");

        double num = 0;
        try {
            num = entrada.nextDouble();
        } catch (Exception e) {
            System.out.println("Error, el importe no es valido.");
            System.exit(0);
        }

        return num;

    }

    //Metodo que procesa el pago con el metodo seleccionado.
    public static void realizarPago(MetodoPago metodo, double importe){

        metodo.procesarPago(importe);
        System.out.println("Pago aceptado. Muchas gracias.");

    }


}
