package org.example.practica1;
import java.time.LocalDate;
import java.util.Scanner;

public class Invitado {

    Scanner entrada = new Scanner(System.in);

    //Declaramos los atibutos que vamos a usar
    private String nombre;
    private String profesion;
    private LocalDate fecha_visita;
    private int temporada;
    private int anyo;
    private int mes;
    private int dia;

    //Creamos el constructor del Invitado
    public Invitado(String nombre, String profesion, int temporada) {
        this.nombre = nombre;
        this.profesion = profesion;
        pedirFecha();
        this.temporada = temporada;
    }

    //Creamos el metodo que pide la fecha en la que ha venido el invitado
    public void pedirFecha(){

        //Pedimos la fecha y la guardamos en tres varibles

        //Para cada variable, controlamos que el valor introducido es válido
        //Además controlamos qu el formato de entrada es numérico
        //Aumimos que todos los meses tienen 31 días por simplificar
         do{
             System.out.println("Introduce el año en el que acudirá el invitado " + getNombre() + ":");
            try {
                anyo = entrada.nextInt();
                if(anyo >= 1900 && anyo <= 2100){
                    break;
                }
                System.out.println("Error, el año no es válido.");
            } catch (Exception e) {
                System.out.println("ERROR. El formato debe ser numérico");
                entrada.nextLine();

            }
        }while (true);

        do{
            System.out.println("Introduce el mes:");
            try {
                mes = entrada.nextInt();
                if(mes >= 1 && mes <= 12){
                    break;
                }
                System.out.println("Error, el mes no es válido.");
            } catch (Exception e) {
                System.out.println("ERROR. El formato debe ser numérico");
                entrada.nextLine();

            }
        }while (true);

        do{
            System.out.println("Introduce el día:");
            try {
                dia = entrada.nextInt();
                if(dia >= 1 && dia <= 31){
                    break;
                }
                System.out.println("Error, el día no es válido.");
            } catch (Exception e) {
                System.out.println("ERROR. El formato debe ser numérico");
                entrada.nextLine();
            }
        }while (true);

        //Guardamos la fecha indicada en nuestro atributo "fecha_visita"
        this.fecha_visita = LocalDate.of(anyo,mes,dia);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public LocalDate getFecha_visita() {
        return fecha_visita;
    }

    public void setFecha_visita(LocalDate fecha_visita) {
        this.fecha_visita=fecha_visita;
    }

    @Override
    public String toString() {
        return "Invitado{" +
                "nombre='" + nombre + '\'' +
                ", profesion='" + profesion + '\'' +
                ", fecha_visita=" + fecha_visita +
                ", temporada=" + temporada +
                '}';
    }
}
