package org.example.ecommerce;

//Esta clase la usamos para definir los distintos metodos de pago del programa.
public abstract class MetodoPago {

    //Con este metodo obligamos que cada clase tenga si propio procesarPago.
    public abstract void procesarPago(double importe);

}
