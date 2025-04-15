package org.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Pantalla2Controller {

    @FXML
    private TextField marca;
    @FXML
    private TextField talla;
    @FXML
    private TextField precio;

    public void volverAPantallaHello() throws IOException {

        HelloApplication.setRoot("hello-view");

    }

    public void guardar(){

        String tipo_calzado = marca.getText();
        int talla_calzado = Integer.parseInt(talla.getText());
        double presio_calzado = Double.parseDouble(precio.getText());

        Calzado calzado = new Calzado(tipo_calzado, talla_calzado, presio_calzado);

        System.out.println("Calzado creado: " + calzado.getMarca() + ", talla: " + calzado.getTalla() + ", precio: " + calzado.getPrecio() + "€.");

        marca.clear();
        talla.clear();
        precio.clear();

    }
}
