package main.java.org.example.mercadaw;

import java.util.HashMap;
import java.util.Map;

public class Pedido {

    private static HashMap<Producto, Integer> pedido;

    private final double DESCUENTO = 0.10;
    private double importe_total;

    public Pedido(double importe_total){

        pedido = new HashMap<>();
        this.importe_total = importe_total;

    }

    public void resumenCompra(){

        System.out.println("RESUMEN DE TU CARRITO DE LA COMPRA:");
        System.out.println();
        System.out.println("Productos: ");
        System.out.println();



        for (Map.Entry<Producto, Integer> mapaProductos : pedido.entrySet()){

            System.out.println(mapaProductos.getValue() + " " + mapaProductos.getKey() + " " + mapaProductos.getKey().getPrecio());

        }

        System.out.println();
        System.out.println("IMPORTE TOTAL: " + importe_total + "€");
        System.out.println();

    }

    public void aplicarPromo3x2(){

        for (Map.Entry<Producto, Integer> mapaProductos : pedido.entrySet()){

            if((mapaProductos.getValue() % 3) == 0){

                //Hacer lo del contador con multiplos de 3 y volver a calcular el importe total.(do/while)
                importe_total -= mapaProductos.getKey().getPrecio();

            }
        }
    }

    public void aplicarPromo10(){

        importe_total -= importe_total*DESCUENTO;
        System.out.println(importe_total);

    }

    public HashMap<Producto, Integer> getPedido() {
        return pedido;
    }

    public void setPedidoP(String producto) {
        pedido.put(Producto.valueOf(producto), pedido.getOrDefault(Producto.valueOf(producto), 0) + 1);
    }

    public double getImporte_total() {
        return importe_total;
    }

    public void setImporte_total(double importe_total) {
        this.importe_total = importe_total;
    }
}
