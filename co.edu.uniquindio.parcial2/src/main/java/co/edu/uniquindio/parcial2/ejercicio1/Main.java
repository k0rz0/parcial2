package co.edu.uniquindio.parcial2.ejercicio1;

import co.edu.uniquindio.parcial2.enumeracion.TipoContrato;
import co.edu.uniquindio.parcial2.model.FincaUQ;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        boolean continuar = true;
        int valorSeleccion;
        FincaUQ fincaUQ = inicializarDatosPrueba();

        //Create
        crearEmpleado(fincaUQ, "Leonardo", "Gallego", "10978246", 26, 1500000, 42, TipoContrato.MEDIO_TIEMPO);
        crearEmpleado(fincaUQ,"Ana", "Rodríguez", "40892176", 24, 1400000, 37, TipoContrato.HORAS);
        crearEmpleado(fincaUQ,"Carlos", "Gómez", "30876521", 28, 1600000, 40, TipoContrato.TIEMPO_COMPLETO);
        //solicitarDatosClienteCrear(fincaUQ);

        crearTarea(fincaUQ);


        //Information create
        System.out.println("\nCreate");
        mostrarInformacionClientes(fincaUQ);

        //Update
        actualizarEmpleado(fincaUQ, "10978246");
        //solicitarDatosClienteEditar(supermercado);

        //Information update
        System.out.println("\nUpdate");
        mostrarInformacionClientes(fincaUQ);

        //Delete
        EliminarEmpleado(fincaUQ, "10978246");

        //Information delete
        System.out.println("\nDelete");
        mostrarInformacionClientes(fincaUQ);

        //Read
        //mostrarInformacionClientes(fincaUQ);


    }

    private static FincaUQ inicializarDatosPrueba() {
        return new FincaUQ("Uniquindio");
    }

    private static void crearEmpleado(FincaUQ fincaUQ, String nombre, String apellido, String cedula, int edad,
                                      double salario, int numeroHorasTrabajo, TipoContrato tipoContrato) {
        fincaUQ.crearEmpleado(nombre, apellido, cedula, edad, salario, numeroHorasTrabajo, fincaUQ, tipoContrato);
    }

    private static void actualizarEmpleado(FincaUQ fincaUQ, String cedula) {

        fincaUQ.actualizarEmpleado( "Leo", "Rios", cedula, 26, 1500000, 42, fincaUQ);

    }

    private static void EliminarEmpleado(FincaUQ fincaUQ, String cedula) {

        fincaUQ.eliminarEmpleado(cedula, fincaUQ);

    }


    private static void crearTarea(FincaUQ fincaUQ) {
        /*SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        String fechaInicial = "23/10/2023";
        String fechaFinal = "30/10/2023";

        Date fecha = formato.parse(fechaInicial);

        Date fechaIni = Date.parse(fechaInicial, "dd/MM/yyyy");
        Date fechaFin = Date.parse(fechaFinal, "dd/MM/yyyy");

        fincaUQ.crearTarea(1, "123", fechaIni, fechaFin, "Pintar el hangar");*/

    }


    //-------------------------------------------------------------------------------

    public static int leerEntero(String mensaje) {
        int dato = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        return dato;
    }

    private static void solicitarDatosClienteCrear(FincaUQ fincaUQ) {
        String nombres = leerString("Ingrese los nombres");
        String apellidos = leerString("Ingrese los apellidos");
        String cedula = leerString("Ingrese la cedula");
        int edad = leerEntero("Ingrese la edad");
        double salario = leerDouble("Ingrese el salario");
        int numHorasTrabajo = leerEntero("Ingrese las horas de trabajo");

        //fincaUQ.crearEmpleado(nombres, apellidos, cedula, edad, salario, numHorasTrabajo, fincaUQ);

    }

    public static double leerDouble(String mensaje) {
        double dato = Double.parseDouble(JOptionPane.showInputDialog(mensaje));
        return dato;
    }

    public static String leerString(String mensaje) {
        String respuesta = "";
        respuesta = JOptionPane.showInputDialog(mensaje);
        return respuesta;
    }

    private static void mostrarInformacionClientes(FincaUQ fincaUQ) {
        fincaUQ.mostrarInformacionEmpleados(fincaUQ);
    }

}