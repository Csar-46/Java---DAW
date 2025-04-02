package main.java.org.example.mercadaw;

import java.util.*;

public class Pedido {

    private final double DESCUENTO = 0.10;

    private HashMap<Producto, Integer> pedido;
    private List<Integer> cantidades;
    private double importe_total;

    public Pedido(double importe_total){

        pedido = new HashMap<>();
        cantidades = new ArrayList<>();
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

    public void resumenOrdenado(){

        System.out.println("RESUMEN DE TU CARRITO DE LA COMPRA:");
        System.out.println();
        System.out.println("Productos ordenados por uds: ");
        System.out.println();

        List<Map.Entry<Producto, Integer>> mapaOrdenado = new ArrayList<>(pedido.entrySet());
        mapaOrdenado.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        for (Map.Entry<Producto,Integer> mapita : mapaOrdenado){

            System.out.println(mapita.getValue() + " " + mapita.getKey() + " " + mapita.getKey().getPrecio());

        }

        System.out.println();
        System.out.println("IMPORTE TOTAL: " + importe_total + "€");
        System.out.println();

    }

    public void aplicarPromo3x2(){

        for (Map.Entry<Producto, Integer> mapaProductos : pedido.entrySet()){

            //Si divido el Value / 3 le resto el resultado al precio.
            if((mapaProductos.getValue() % 3) == 0){



            }
        }
    }

    public void aplicarPromo10(){

        importe_total -= importe_total*DESCUENTO;

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
