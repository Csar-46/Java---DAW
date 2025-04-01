package org.example.netflix;

public class PlataformaStreaming {

    public static void main(String[] args) {

        Suscripcion[] planes = {
                new PlanGratis("Gratis", 0.0)
                , new PlanBasico("Basio", 9.99)
                , new PlanPremium("Premium", 14.99)
                , new PlanFamiliar("Familiar", 19.99)
        };

        System.out.println();

        for(Suscripcion sus : planes){

            sus.mostrarInfo();
            sus.obtenerBeneficios();
            sus.obtenerPeriodoPrueba();
            System.out.println();

        }

    }

}
