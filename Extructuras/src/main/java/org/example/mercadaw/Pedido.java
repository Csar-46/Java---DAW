package main.java.org.example.mercadaw;

import java.util.*;

public class Pedido {

    //Establecemos el descuento general que se hara al total
    private final double DESCUENTO = 0.10;

    private HashMap<Producto, Integer> pedido;
    private double importe_total;

    public Pedido(double importe_total){

        pedido = new HashMap<>();
        this.importe_total = importe_total;

    }

    //Mostramos el resumen de la compra.
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

    public void resumenOrdenado(){

        System.out.println("RESUMEN DE TU CARRITO DE LA COMPRA:");
        System.out.println();
        System.out.println("Productos ordenados por uds: ");
        System.out.println();

        //Guardamos nuestra para poder ordenarla.
        List<Map.Entry<Producto, Integer>> mapaOrdenado = new ArrayList<>(pedido.entrySet());

        //La ordenamos de mayor a menos y la imprimimos.
        mapaOrdenado.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        for (Map.Entry<Producto,Integer> mapita : mapaOrdenado){

            System.out.println(mapita.getValue() + " " + mapita.getKey() + " " + mapita.getKey().getPrecio());

        }

        System.out.println();
        System.out.println("IMPORTE TOTAL: " + importe_total + "€");
        System.out.println();

    }

    public void aplicarPromo3x2(){

        //Recalculamos el precio total considerando las cantidades para aplicar el 3x2
        importe_total = 0;
        for (Map.Entry<Producto,Integer> mapita : pedido.entrySet()) {

            importe_total += ((mapita.getValue()) - (mapita.getValue()/3)) * mapita.getKey().getPrecio();

        }
    }

    public void aplicarPromo10(){

        //Aplicamos el 10% de descuento.
        importe_total -= importe_total*DESCUENTO;

    }

    public HashMap<Producto, Integer> getPedido() {
        return pedido;
    }

    //Guardamos el producto en la lista y sumamos 1 a la cantidad (en caso de ser el primero ponemos 1)
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
