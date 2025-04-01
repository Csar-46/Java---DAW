package org.example.festival;

public class Concierto {
    public static void main(String[] args) {

        Asistente a1 = new Asistente("Carlos", 25, "VIP");
        Artista art1 = new Artista("Dua Lipa", 28, "Pop");

        System.out.println("Información del asistente:");
        a1.mostrarInfo();

        System.out.println();

        System.out.println("Información del artista:");
        art1.mostrarInfo();

        System.out.println();

        Organizador o1 = new Organizador("Paco", 32, "Seguridad");
        o1.mostrarInfo();

        System.out.println();

        Persona[] personas = {

                new Asistente("Lucas", 18, "VIP"),
                new Artista("Sofía", 25, "Rock Alternativo"),
                new Organizador("Martín", 30, "Producción")

        };

        for (Persona p : personas) {

            p.mostrarInfo();
            System.out.println();

            if (p instanceof Organizable && p instanceof Promocionable){

                ((Organizable) p).OrganizarEvento();
                ((Promocionable) p).Promocionar();
                System.out.println();

            }

        }

        Persona artista = new Artista("Sofía", 25, "Rock Alternativo");
        Persona asistente = new Asistente("Lucas", 18, "VIP");
        Persona organizador = new Organizador("Martín", 30, "Producción");

        mostrarAcceso(artista);
        mostrarAcceso(asistente);
        mostrarAcceso(organizador);

    }

    public static void mostrarAcceso(Persona persona){

        persona.accederEvento();

    }
}
