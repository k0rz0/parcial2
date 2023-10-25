package co.edu.uniquindio.parcial2.model;

import co.edu.uniquindio.parcial2.enumeracion.TipoContrato;

public class Recolector extends Empleado{

    public Recolector(String nombre, String apellido, String cedula, int edad, double salario, int numeroHorasTrabajo, TipoContrato tipoContrato) {
        super(nombre, apellido, cedula, edad, salario, numeroHorasTrabajo, tipoContrato);
    }

    @Override
    public String toString() {
        return "Recolector{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cedula='" + cedula + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                ", numeroHorasTrabajo=" + numeroHorasTrabajo +
                ", ownedByFincaUQ=" + ownedByFincaUQ +
                ", tipoContrato=" + tipoContrato +
                '}';
    }
}
