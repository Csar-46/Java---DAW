package org.example.pokedex;

public class Agua extends Pokemon implements AtaquesAgua{

    public Agua(int nivel) {

        super(nivel);

    }

    @Override
    public void atacar() {

        System.out.println("salpicadura...");

    }

    @Override
    public void pistolaAgua() {

        System.out.println("Flush fluh");

    }

    @Override
    public void sapicadura() {

        System.out.println("poing");

    }

    @Override
    public void surf() {

        System.out.println("fughsiuuu");

    }

    @Override
    public void hidrobombra() {

        System.out.println("bomba");

    }

    @Override
    public void cascada() {

        System.out.println("gulp");

    }
}
