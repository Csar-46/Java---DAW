package org.example.netflix;

public class PlanBasico extends Suscripcion{
    public PlanBasico(String nombrePlan, double precio) {

        super(nombrePlan, precio);

    }

    public void obtenerBeneficios() {

        System.out.println("Acceso a todo el contenido en calidad estándar sin anuncios.");

    }

    public void obtenerPeriodoPrueba() {

        System.out.println("30 días de prueba gratuita.");

    }
}
