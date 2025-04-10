package main.java.org.example.lambdas;

public class Prueba {
    public static void main(String[] args) {
        System.out.println("> Profesores \n");

        Profesores patri = new Profesores() {
            @Override
            public boolean calificar(int nota) {
                System.out.println("> Comparando para: " + nota);
                if (nota > 10) {
                    return true;
                } else {
                    return false;
                }
            }
        };

        System.out.println(patri.calificar(10));

        Profesores paco = (nota) -> {
            System.out.println("> Comparando para: " + nota);
            if (nota > 10) {
                return true;
            } else {
                return false;
            }
        };

        boolean notas2 = paco.calificar(0);
        System.out.println(notas2);

        VerificadorVoto verificar = (Profesor) -> {

            System.out.println("Verificando voto para " + Profesor.getNombre() + " con edad " + Profesor.getEdad());
            if (Profesor.getEdad() < 18) {
                return false;
            } else {
                return true;
            }
        };

        System.out.println(verificar.puedeVotar(new Profesor("Patri","programacion",25)));
        System.out.println(verificar.puedeVotar(new Profesor("Paco","sistemas",15)));
    }
}