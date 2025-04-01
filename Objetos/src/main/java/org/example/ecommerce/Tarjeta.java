package org.example.ecommerce;
import java.util.Scanner;
import static org.example.ecommerce.Tienda.pedirImporte;

public class Tarjeta extends MetodoPago {

    Scanner entrada = new Scanner(System.in);

    // Atributos de la clase.
    private String nro_tarjeta;
    private String tipo;

    //Constantes de la clase.
    private final String[] TIPOS_VALIDOS = {"VISA", "MASTERCARD", "MAESTRO"};
    private final String DIGITOS_TARJETA = ("\\d{16}");

    public Tarjeta (String nro_tarjeta, String tipo){

        this.nro_tarjeta = nro_tarjeta;
        this.tipo = tipo;

        // Validamos los datos de la tarjeta.
        validarTarjeta(nro_tarjeta, tipo);

    }

    private void validarTarjeta(String num, String tipo){

        System.out.println("Validando tarjeta...");

        // Verificamos si el número tiene la longitud correcta y el formato correcto.
        if (num.matches(DIGITOS_TARJETA)) {

            // Recorremos los tipos válidos para comprobar si coincide.
            for (String t : TIPOS_VALIDOS) {
                if (t.equalsIgnoreCase(tipo)) {
                    System.out.println("Tarjeta válida.");
                    return;
                }
            }
        }
        System.out.println("Los datos de la tarjeta no son correctos.");
        System.exit(0);
    }

    // Implementamos el metodo abstracto para procesar un pago.
    @Override
    public void procesarPago(double importe) {

        System.out.println("Procesando pago de " + importe + "€ con tarjeta de crédito " + tipo);

    }
}
