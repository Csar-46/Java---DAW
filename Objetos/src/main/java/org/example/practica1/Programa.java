package org.example.practica1;

import java.util.ArrayList;

public class Programa {


    //Creamos los atributos
    private String nombre;
    private Cadena cadena;
    private int temporada;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    private Empleado director;

    //Creamos la varible contador que usaremos en varios metodos mas adelante.
    private static int cont = 0;

    //Creamos el constructor de Programa con todos atributos
    public Programa(String nombre, Cadena cadena, String director) {
        this.nombre = nombre;
        this.cadena = cadena;
        this.listaEmpleados = new ArrayList<>();
        this.listaInvitados = new ArrayList<>();

        //Llamamos al constructor de Empleado para crear al direector del programa.
        //Solo le pasamos el nombre ya que el constructor solo necesita eso para crear un director.
        this.director = new Empleado(director);

        //Agregamos El programa a la lista de programas que tenemos en cadena.
        cadena.agregarPrograma(this);
    }

    //Metodo para añadir invitados al programa.
        //Este metodo llama al constructor de la clase "Invitado" y lo genera desde ahi.
        //Además guarda el invitado el "listaInvitados"
    public void insertarInvitado(String nombre, String profesion, int temporada) {
        Invitado invitado = new Invitado(nombre, profesion, temporada);
        listaInvitados.add(invitado);
    }


    //Este metodo cuenta cuantos invitados hemos tenido en ua temporada concreta.
    public void invitadosTemporada (int temporada) {

        //Al inicio le damos a cotador el valor de 0 para no arrartrar valores anteriores.
        cont = 0;

        //Recorremos la lista en busca de los invitados que han acudido a una misma temporada.
        for (Invitado invitado : listaInvitados){

            //Cada vez que encuentra uno, suma 1 al contador.
            if (invitado.getTemporada() == temporada){

                //Enseñaremos el nombre y la profesión de cada invitado que haya acudido.
                System.out.println("[Nombre = " + invitado.getNombre() + " Profesión = " + invitado.getProfesion() + "]");
                cont++;
            }

        }

        //En caso de cont=0, sabremos que no h venido nadie
        //En cualquier otro caso se enseñará cuantos invitados ha tenido la temporada.
        if (cont == 0){
            System.out.println("Nadie ha querido venir a la temporada " + temporada + " :C");
        } else {
            System.out.println("¡SIUU! En la temporada " + temporada + " hemos tenido " + cont + " invitados :D");
        }

    }

    //Este metodo cuenta cuantas vece ha venido el mismo invitado al programa.
    public void vecesInvitado (String nombre) {

        //Al inicio le damos a cotador el valor de 0 para no arrartrar valores anteriores.
        cont = 0;

        //Recorremos la lista de invitados buscando si encontramos al invitado indicado.
        for (Invitado invitado : listaInvitados){

            //En caso de encontrarlo, sumamos uno al contador
            if (invitado.getNombre().equalsIgnoreCase(nombre)){
                cont++;
            }
        }

        //En caso de que el contador esté en 0 sabremos que no ha venido a ningún programa
        //En cualquier otro caso imprimiremos cuantas veces ha venido.
        if (cont == 0){
            System.out.println("Por desgracia no tenemos el placer de que " + nombre + " haya venido a visitarnos.");
        } else {
            //En este "sout" usamos un operador ternario para ser capaces de diferenciar entre singular y plural.
            //Con es "cont == 1 ? "vez!" le decimos que si cont es igual a 1 imprima "vez"
            //En cualquier otro caso, imprimirá "veces"
            System.out.println(nombre + " ha venido a vernos " + cont + " " + (cont == 1 ? "vez!" : "veces (Vaya pesadit@)"));
        }

    }

    //Con este metodo vamos a buscar las veces que ha venido un invitado en general.
    //No tendremos e cuenta la temporada ni la fecha.
    public void rastrearInvitados(String nombre) {

        //Recorremos la lista de invitados en busca del nombre del invitado indicado.
        for (Invitado invitado : listaInvitados){

            //En caso de encontrarlo, imprimiremos e que temporada ha estado y cuando ha sido.
            if(invitado.getNombre().equalsIgnoreCase(nombre)){
                System.out.println("[Temporada = " + invitado.getTemporada() + ", Fecha = " + invitado.getFecha_visita() + "]");
            }

        }
        //Además contaremos cuantas veces ha venido en total.
        vecesInvitado(nombre);
    }


    //Con est metodo insertamos los empleados del programa en "listaEmpleados"
    public void insertarEmpleado(String nombre, String cargo, Empleado director) {
        for (Empleado empleado : listaEmpleados) {

            //En caso de que ya tengamos a ese empleado registrado, no se añade y muestra el siguiente mensaje
            if (empleado.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("El empleado ya está registrado.");
                return;
            }
        }

        //Si el cargo del empleado no es director, guardamos como su director al que le hemos pasado al metodo.
        if (!cargo.equals("director")) {
            director = this.director;
        }
        Empleado empleado = new Empleado(nombre, cargo, director);
        listaEmpleados.add(empleado);
    }



    public ArrayList<Empleado> getListaEmpleados() {
        return new ArrayList<>(listaEmpleados);
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = new ArrayList<>(listaEmpleados);
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }

    public ArrayList<Invitado> getListaInvitados() {
        return new ArrayList<>(listaInvitados);
    }

    public void setListaInvitados(ArrayList<Invitado> listaInvitados) {
        this.listaInvitados = new ArrayList<>(listaInvitados);
    }

    public Cadena getCadena() {
        return cadena;
    }

    public void setCadena(Cadena cadena) {
        this.cadena = cadena;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Programa{" +
                "nombre='" + nombre + '\'' +
                ", cadena=" + cadena.getNombre() +
                ", temporada=" + temporada +
                ", listaEmpleados=" + listaEmpleados +
                ", listaInvitados=" + listaInvitados +
                ", director=" + getDirector() +
                '}';
    }
}
