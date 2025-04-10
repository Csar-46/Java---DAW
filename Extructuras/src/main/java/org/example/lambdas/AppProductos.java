package main.java.org.example.lambdas;

import java.util.ArrayList;
import java.util.List;

public class AppProductos {

    public static void main(String[] args) {

        List<Producto> listaProductos = new ArrayList<>();

        listaProductos.add(new Producto("Smartphone", 150.0, "Electronica"));
        listaProductos.add(new Producto("Tablet", 72.0, "Electronica"));
        listaProductos.add(new Producto("Perfume árabe", 40.0, "Drogueria"));
        listaProductos.add(new Producto("Kebab", 2.5, "Comida"));

        FiltroProducto filtro = (producto -> {
            if (producto.getCategoria().equals("Electronica") && producto.getPrecio()>100){

                return true;

            }
            return false;
        });

        List<Producto> productosFiltrados = new ArrayList<>();

        for (Producto producto : listaProductos){
            if (filtro.filtrar(producto)){

                productosFiltrados.add(producto);

            }
        }

        for (Producto producto : productosFiltrados){

            System.out.println((producto));

        }
    }
}
