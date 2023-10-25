package co.edu.uniquindio.parcial2.model;

import co.edu.uniquindio.parcial2.enumeracion.Prioridad;

import java.util.Date;

public class Tarea {

    int  numeroTarea;
    Date fechaInicio;
    Date fechaFin;
    Long duracionTarea;
    String descripcion;
    Prioridad prioridad;
    private Empleado empleadoAsociado;

    public Tarea() {
    }

    public Tarea(int numeroTarea, Date fechaInicio, Date fechaFin, Long duracionTarea, String descripcion, Prioridad prioridad, Empleado empleadoAsociado) {
        this.numeroTarea = numeroTarea;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.duracionTarea = duracionTarea;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.empleadoAsociado = empleadoAsociado;
    }

    public int getNumeroTarea() {
        return numeroTarea;
    }

    public void setNumeroTarea(int numeroTarea) {
        this.numeroTarea = numeroTarea;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getDuracionTarea() {
        return duracionTarea;
    }

    public void setDuracionTarea(Long duracionTarea) {
        this.duracionTarea = duracionTarea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Empleado getEmpleadoAsociado() {
        return empleadoAsociado;
    }

    public void setEmpleadoAsociado(Empleado empleadoAsociado) {
        this.empleadoAsociado = empleadoAsociado;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "numeroTarea=" + numeroTarea +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", duracionTarea=" + duracionTarea +
                ", descripcion='" + descripcion + '\'' +
                ", empleadoAsociado=" + empleadoAsociado +
                '}';
    }
}
