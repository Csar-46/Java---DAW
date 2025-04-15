package org.example.demo;

import lombok.Getter;

@Getter
public class Calzado {

    private String marca;
    private int talla;
    private double precio;

    public Calzado(String marca, int talla, double precio){

        this.marca = marca;
        this.talla = talla;
        this.precio = precio;

    }

}
