package main.java.org.example.equals_hashcode.ejercicio3;

import java.util.Objects;

public class Informe {

    private int codigo;
    private String descripcion;
    private Tipos tipo;

    public Informe(int codigo, String descripcion, Tipos tipo) {

        this.codigo = codigo;
        this.descripcion = descripcion;
        this.tipo = tipo;

    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Tipos getTipo() {
        return tipo;
    }

    public void setTipo(Tipos tipo) {

        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Informe: [" +
                "Código = " + codigo +
                ", Descripción = " + descripcion +
                ", Tipo = " + tipo +
                "]";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Informe informe = (Informe) o;
        return codigo == informe.codigo && tipo == informe.tipo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, tipo);
    }
}

