package org.example.netflix;

public class PlanPremium extends Suscripcion{

    public PlanPremium(String nombrePlan, double precio) {

        super(nombrePlan, precio);

    }

    public void obtenerBeneficios() {

        System.out.println("Acceso a todo el contenido en alta definición y descargas offline.");

    }

    public void obtenerPeriodoPrueba() {

        System.out.println("4 días de prueba gratuita.");

    }
}
