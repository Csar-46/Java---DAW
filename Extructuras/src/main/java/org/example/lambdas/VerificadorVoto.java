package main.java.org.example.lambdas;

@FunctionalInterface
public interface VerificadorVoto {
    boolean puedeVotar(Profesor profesor);
}
