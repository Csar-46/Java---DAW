package org.example.empresa;

public class AppEmpresa {

    public static void main(String[] args) {

        Empleado desarrollador = new Desarrollador();
        Empleado disenyador = new Disenyador();
        Empleado gerente = new Gerente();

        Empleado[] empleados = {desarrollador = new Desarrollador(), disenyador = new Disenyador(), gerente = new Gerente()};

        System.out.println();
        System.out.println("=== Usando el array polimórfico ===");

        for (Empleado emp : empleados) {

            emp.realizarTarea();

        }
        System.out.println();

        Empleado emp1 = new Desarrollador();
        asignarTarea(emp1);
        System.out.println();

        Empleado emp2 = new Gerente();
        asignarTarea(emp2);
        System.out.println();

    }

    public static void asignarTarea(Empleado empleado){

        System.out.println("Asignando tarea al empleado...");
        empleado.realizarTarea();

    }

}
