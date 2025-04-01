package main.java.org.example.mercadaw;

public enum Producto {

    MANZANA(2.30),PERAS(1.30),PAN(1.00), ARROZ(3.50), POLLO(4.30),
    LECHE(1.30), ACEITE(8.30), HUEVOS(3.30), TOMATES(4.00), PASTA(0.89);

    private double precio;

    Producto(double precio) {

        this.precio = precio;

    }

    public double getPrecio() {
        return precio;
    }

}
