package org.example.ecommerce;
import java.util.Scanner;
public class Paypal extends MetodoPago{

    Scanner entrada = new Scanner(System.in);

    //Atributos de Paypal.
    private String cuenta;
    private double saldo;

    //Constantes de la clase.
    private final double SALDO_DEF = 23;
    public static final String CORREO_VALIDO = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.com$";



    public Paypal(String cuenta){

        this.cuenta = cuenta;
        this.saldo = SALDO_DEF;

        // Validamos si el correo introducido es correcto.
        validarPaypal();

    }


    private void validarPaypal(){

        System.out.println("Validando tarjeta...");

        if(!cuenta.matches(CORREO_VALIDO) ){

            System.out.println("El formato de la cuenta no es correcto (xxx@xxx.com).");
            System.exit(0);

        }else{

            System.out.println("Cuenta creada correctamente.");

        }
    }

    // Implementamos el metodo abstracto para procesar un pago.
    @Override
    public void procesarPago(double importe) {

        //Verificamos si hay saldo suficiente en la cuenta antes de pagar.
        if(saldo > importe){

            this.saldo -= importe;
            System.out.println("Procesando pago de "+ importe +"€ con Paypal");

        }else{

            System.out.println("El saldo es insuficiente para completar el pago...");
            System.exit(0);

        }
    }
}
