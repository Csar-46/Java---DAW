package org.example.netflix;

public class PlanGratis extends Suscripcion{
    public PlanGratis(String nombrePlan, double precio) {

        super(nombrePlan, precio);

    }

    public void obtenerBeneficios() {

        System.out.println("Acceso limitado con anuncios.");

    }

    public void obtenerPeriodoPrueba() {

        System.out.println("Sin periodo de prueba.");

    }
}
