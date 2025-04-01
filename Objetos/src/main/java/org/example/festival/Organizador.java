package org.example.festival;

public class Organizador extends Persona implements Organizable, Promocionable{

    private String rol;

    public Organizador(String nombre, int edad, String rol) {
        super(nombre, edad);
        this.rol = rol;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Rol: " + rol);
    }

    @Override
    public void accederEvento(){

        System.out.println("Organizador: Coordinando el evento.");

    }

    @Override
    public void OrganizarEvento() {
        System.out.println("Organza");
    }

    @Override
    public void Promocionar() {
        System.out.println("Promociona");
    }
}
