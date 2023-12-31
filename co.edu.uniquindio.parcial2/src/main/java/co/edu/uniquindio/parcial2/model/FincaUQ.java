package co.edu.uniquindio.parcial2.model;

import java.util.Date;

import co.edu.uniquindio.parcial2.enumeracion.TipoContrato;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class FincaUQ {

    String nombre;
    List<Empleado> listaEmpleados = new ArrayList<>();
    List<Tarea> listaTareas = new ArrayList<>();

    public FincaUQ() {
    }

    public FincaUQ(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public List<Tarea> getListaTareas() {
        return listaTareas;
    }

    public void setListaTareas(List<Tarea> listaTareas) {
        this.listaTareas = listaTareas;
    }


    /**
     * Metodo para crear un empleado
     *
     * @param nombre
     * @param apellido
     * @param cedula
     * @param edad
     * @param salario
     * @param numeroHorasTrabajo
     * @param fincaUQ
     */
    public void crearEmpleado(String nombre, String apellido, String cedula, int edad, double salario, int numeroHorasTrabajo, FincaUQ fincaUQ, TipoContrato tipoContrato) {

        String posicion = existenciaEmpleados(cedula);

        if (posicion == null) {
            Empleado empleado = new Empleado(nombre, apellido, cedula, edad, salario, numeroHorasTrabajo, tipoContrato);
            empleado.setOwnedByFicaUQ(fincaUQ);
            getListaEmpleados().add(empleado);
        }

    }

    public void crearAdministrador(String nombre, String apellido, String cedula, int edad, double salario, int numeroHorasTrabajo, FincaUQ fincaUQ, TipoContrato tipoContrato) {

        Administrador administrador = new Administrador(nombre, apellido, cedula, edad, salario, numeroHorasTrabajo, tipoContrato);
        administrador.setOwnedByFicaUQ(fincaUQ);
        getListaEmpleados().add(administrador);
    }

    public void crearJornalero(String nombre, String apellido, String cedula, int edad, double salario, int numeroHorasTrabajo, FincaUQ fincaUQ, TipoContrato tipoContrato) {

        Jornalero jornalero = new Jornalero(nombre, apellido, cedula, edad, salario, numeroHorasTrabajo, tipoContrato);
        jornalero.setOwnedByFicaUQ(fincaUQ);
        getListaEmpleados().add(jornalero);
    }


    public void actualizarEmpleado(String nombre, String apellido, String cedula, int edad, double salario, int numeroHorasTrabajo, FincaUQ fincaUQ) {

        String posicion = existenciaEmpleados(cedula);

        if (!(posicion == null)) {
            Empleado empleado = getListaEmpleados().get(Integer.parseInt(posicion));

            empleado.setNombre(nombre);
            empleado.setApellido(apellido);
            empleado.setEdad(edad);
            empleado.setNumeroHorasTrabajo(numeroHorasTrabajo);
            empleado.setSalario(salario);
            empleado.setCedula(cedula);
            empleado.setOwnedByFicaUQ(fincaUQ);
        }
    }

    public void eliminarEmpleado(String cedula, FincaUQ fincaUQ) {

        String posicion = existenciaEmpleados(cedula);

        if (!(posicion == null)) {
            getListaEmpleados().remove(Integer.parseInt(posicion));
        }
    }

    public String existenciaEmpleados(String cedula) {
        boolean existe = false;
        int tamanioLista = listaEmpleados.size();

        for (int i = 0; i < tamanioLista; i++) {
            Empleado empleado = getListaEmpleados().get(i);
            if (empleado.cedula.equals(cedula)) {
                return Integer.toString(i);
            }
        }

        return null;
    }


    public void crearTarea(int numTarea, String cedulaEmpleado, Date fechaInicio, Date fechaFin, String descripcion, long duracionTarea) {
        Tarea tarea = new Tarea();
        tarea.setNumeroTarea(numTarea);
        tarea.setDuracionTarea(duracionTarea);

        Empleado empleadoAsociado = ObtenerEmpleado(cedulaEmpleado);

        if (empleadoAsociado != null) {
            tarea.setEmpleadoAsociado(empleadoAsociado);
        }

        getListaTareas().add(tarea);

    }

    private Empleado ObtenerEmpleado(String cedulaEmpleado) {
        Empleado empleadoEncontrado = null;

        for (Empleado empleado : getListaEmpleados()) {
            if (empleado.getCedula().equals(cedulaEmpleado)) {
                empleadoEncontrado = empleado;
                break;
            }
        }

        return empleadoEncontrado;

    }

    private void ObtenerEmpleadoMayorCantidadHoras(String cedulaEmpleado) {
        Empleado empleadoEncontrado = null;

        List<Empleado> listaEmpeleados = getListaEmpleados();
        int tamanioLista = listaEmpeleados.size();

        Empleado empleado1 = listaEmpeleados.get(0);
        Empleado empleado2 = listaEmpeleados.get(1);

        if (empleado1.getNumeroHorasTrabajo() > empleado2.getNumeroHorasTrabajo()){
            System.out.println(empleado1.toString().replace("Empleado{", "").replace("}", ""));
        }else {
            System.out.println(empleado2.toString().replace("Empleado{", "").replace("}", ""));
        }

    }

}
