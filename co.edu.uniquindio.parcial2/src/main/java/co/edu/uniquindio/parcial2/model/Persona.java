package co.edu.uniquindio.parcial2.model;

public class Persona {

    String nombre;
    String apellido;
    String cedula;
    int edad;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String cedula, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
    }
}
