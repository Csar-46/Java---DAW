package org.example.ecommerce;

import java.util.Random;
import java.util.Scanner;

public class Bizum extends MetodoPago{

    Random aleatorio = new Random();
    Scanner entrada = new Scanner(System.in);

    // Atributos de la clase.
    private String telefono;
    private String pin;

    //Constante de la clase.
    private final int DIGITOS_PIN = 6;

    public Bizum(String telefono) {

        this.telefono = telefono;
        this.pin = generarPIN();
        System.out.println("PIN generado para Bizum: " + this.pin);

        // Validamos si el teléfono y el PIN son correctos.
        validarBizum(telefono);

    }

    //Creamos un PIN de 6 digitos
    private String generarPIN(){

        String combinacion = "";

        for(int i = 0 ; i < DIGITOS_PIN ; i++){

            // Generamos un número aleatorio entre 0 y 9 y lo concatenamos.
            combinacion += aleatorio.nextInt(10);

        }
        return combinacion;
    }

    private void validarBizum(String telefono){

        String pinUsuario = pedirPIN();

        //En caso de tener el formato esperado y coincider los pines es correcto.
        if(telefono.matches("\\d{9}") && this.pin.equals(pinUsuario)){

            System.out.println("PIN y teléfono introducidos correctamente.");

        }else if (!pin.equals(pinUsuario)){

            System.out.println("El PIN introducido no es correcto.");
            System.exit(0);

        }else{

            System.out.println("El número de telefono no tiene el formato correcto.");
            System.exit(0);

        }

    }

    //Con este metodo pedimos el PIN al usuario
    private String pedirPIN(){

        System.out.println("Introduce el PIN de tu cuenta de Bizum: ");

        return entrada.next();
    }

    // Implementamos el metodo abstracto para procesar un pago.
    @Override
    public void procesarPago(double importe) {

        System.out.println("Procesando el pago de " + importe + "€ de Bizum");

    }
}
