package main.java.org.example.mercadaw;

import java.util.HashMap;

public class Pedido {

    private HashMap<Producto, Integer> pedido;
    private double importe_total;

    public Pedido(double importe_total){

        pedido = new HashMap<>();
        this.importe_total = importe_total;

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
