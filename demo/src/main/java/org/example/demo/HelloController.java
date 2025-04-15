package org.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.io.IOException;

public class HelloController {

    @FXML
    private Label welcomeText;
    @FXML
    private Button contar;
    @FXML
    private Label etiqueta_contar;

    @FXML
    public void initialize(){
        Contador contador = new Contador();
        contar.setOnAction(a -> {
            contador.contar();
            System.out.println(contador.getContador());
            etiqueta_contar.setText(Integer.toString(contador.getContador()));
        });
    }

    @FXML
    protected void onHelloButtonClick() {

        welcomeText.setText("Welcome to JavaFX Application!");

    }

    public void irAPantalla2() throws IOException {

        HelloApplication.setRoot("pantalla2");

    }
}