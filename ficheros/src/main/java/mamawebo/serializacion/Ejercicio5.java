package mamawebo.serializacion;

import java.io.*;
import java.util.ArrayList;

public class Ejercicio5 {
    public static void main(String[] args) {

        Empleado steve = new Empleado("Steve", 120);
        Empleado juan = new Empleado("Juan", 400);
        Empleado amancio = new Empleado("Amancio", 380);
        Jefe elon = new Jefe("Elon", 25000,"Cabron");

        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(steve);
        listaEmpleados.add(juan);
        listaEmpleados.add(amancio);
        listaEmpleados.add(elon);

        try {
            ObjectOutputStream serializadorEmpleados = new ObjectOutputStream(new FileOutputStream("src/main/resources/serializacion/empleados.ser"));
            serializadorEmpleados.writeObject(listaEmpleados);
            serializadorEmpleados.close();
        } catch (IOException e) {
            System.out.println("Algo ha salido muy muy mal.");
            e.printStackTrace();
        }

        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream("src/main/resources/serializacion/empleados.ser"));
            ArrayList<Empleado> empleadosLeidos = (ArrayList<Empleado>) lector.readObject();
            lector.close();

            for (Empleado e:empleadosLeidos) {
                System.out.println(e);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Algo ha salido muy muy mal.");
            e.printStackTrace();
        }

    }
}
