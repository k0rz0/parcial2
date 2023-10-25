package co.edu.uniquindio.parcial2.model;

import co.edu.uniquindio.parcial2.enumeracion.TipoContrato;

public class Jornalero extends Empleado{

    public Jornalero(String nombre, String apellido, String cedula, int edad, double salario, int numeroHorasTrabajo, TipoContrato tipoContrato) {
        super(nombre, apellido, cedula, edad, salario, numeroHorasTrabajo, tipoContrato);
    }

    @Override
    public String toString() {
        return "Jornalero{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cedula='" + cedula + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                ", numeroHorasTrabajo=" + numeroHorasTrabajo +
                ", ownedByFincaUQ=" + ownedByFincaUQ +
                '}';
    }
}
