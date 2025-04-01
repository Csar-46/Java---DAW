package org.example;

public class Persona {

    @Override
    public String toString(){

        return "Persona : [Nombre = " + this.nombre + ", Apellido = " + this.apellido + ", DNI = " + this.DNI + ", Residencia = " + this.residendia + ", Profesion = " + this.profesion + ", Sexo = " + this.sexo + ", Edad = " + this.edad + "]" ;

    }

    private String nombre;
    private String apellido;
    private String DNI;
    private String residendia;
    private String profesion;
    private int edad;
    private char sexo;

    public Persona (){



    }

    public Persona (String nombre, String apellido, String DNI, String resicendia, String profesion, char sexo, int edad){

        setNombre(nombre);
        this.apellido = apellido;
        this.DNI = DNI;
        this.residendia = residendia;
        this.profesion = profesion;
        this.sexo = sexo;
        this.edad = edad;

    }

    public String getNombre(){

        return this.nombre;
    }
    public void setNombre(String nombre){

        if (!nombre.equalsIgnoreCase("MESSI")){
            this.nombre = nombre;
        }
    }

    public String getApellido(){

        return this.apellido;
    }
    public void setApellido(String apellido){

        this.apellido = apellido;

    }

    public String getDNI(){

        return this.DNI;
    }
    public void setDNI(String DNI){

        this.DNI = DNI;

    }

    public String getResidendia(){

        return this.residendia;
    }
    public void setResidendia(String residendia){

        this.residendia = residendia;

    }

    public String getProfesion(){

        return this.profesion;
    }
    public void setProfesion(String profesion){

        this.profesion = profesion;

    }

    public char getSexo(){

        return this.sexo;
    }
    public void setSexo(char sexo){

        this.sexo = sexo;

    }

    public int getEdad(){

        return this.edad;
    }
    public void setEdad(int edad){

        this.edad = edad;

    }


    public String concatenar(){



        return this.nombre + " " + this.apellido;
    }

}
