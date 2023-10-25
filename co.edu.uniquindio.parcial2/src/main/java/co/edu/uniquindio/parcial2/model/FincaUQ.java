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

    public void mostrarInformacionEmpleados(FincaUQ fincaUQ) {
        List<Empleado> listaEmpeleados = fincaUQ.getListaEmpleados();
        String mensaje = "";
        int tamanioLista = listaEmpeleados.size();

       /* for (int i = 0; i < tamanioLista; i++) {
            Empleado empleado = listaEmpeleados.get(i);
            mensaje += empleado.toString().replace("Empleado{", "").replace("}", "") + "\n";
            System.out.println(empleado.toString().replace("Empleado{", "").replace("}", ""));
        }*/


        for (Empleado empleado : getListaEmpleados()) {
            mensaje += empleado.toString().replace("Empleado{", "").replace("}", "") + "\n";
            System.out.println(empleado.toString().replace("Empleado{", "").replace("}", ""));
        }

        JOptionPane.showMessageDialog(null, mensaje);

    }

    public void crearTarea(int numTarea, String cedulaEmpleado, Date fechaInicio, Date fechaFin, String descripcion) {
        Tarea tarea = new Tarea();
        tarea.setNumeroTarea(numTarea);

        Empleado empleadoAsociado = ObtenerEmpleado(cedulaEmpleado);

        if (empleadoAsociado != null) {
            tarea.setEmpleadoAsociado(empleadoAsociado);
        }

        getListaTareas().add(tarea);

    }

    private Empleado ObtenerEmpleado(String cedulaEmpleado) {
        Empleado empleadoEncontrado = null;

        for (Empleado empleado:getListaEmpleados()) {
            if (empleado.getCedula().equals(cedulaEmpleado)){
                empleadoEncontrado = empleado;
                break;
            }
        }

        return empleadoEncontrado;

    }


}
