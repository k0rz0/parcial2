package co.edu.uniquindio.parcial2.ejercicio1;
import co.edu.uniquindio.parcial2.enumeracion.TipoContrato;
import co.edu.uniquindio.parcial2.model.FincaUQ;
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        boolean continuar = true;
        int valorSeleccion;
        FincaUQ fincaUQ = inicializarDatosPrueba();

        //Create
        crearAdministrador(fincaUQ, "José", "Strombord", "124578", 26, 1500000, 42, TipoContrato.MEDIO_TIEMPO);
        crearJornalero(fincaUQ,"Ana", "Rodríguez", "235689", 24, 1400000, 37, TipoContrato.HORAS);


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

    private static void crearAdministrador(FincaUQ fincaUQ, String nombre, String apellido, String cedula, int edad,
                                      double salario, int numeroHorasTrabajo, TipoContrato tipoContrato) {

        fincaUQ.crearAdministrador(nombre, apellido, cedula, edad, salario, numeroHorasTrabajo, fincaUQ, tipoContrato);
    }

    private static void crearJornalero(FincaUQ fincaUQ, String nombre, String apellido, String cedula, int edad,
                                           double salario, int numeroHorasTrabajo, TipoContrato tipoContrato) {

        fincaUQ.crearJornalero(nombre, apellido, cedula, edad, salario, numeroHorasTrabajo, fincaUQ, tipoContrato);
    }

    private static void actualizarEmpleado(FincaUQ fincaUQ, String cedula) {

        fincaUQ.actualizarEmpleado( "Leo", "Rios", cedula, 26, 1500000, 42, fincaUQ);

    }

    private static void EliminarEmpleado(FincaUQ fincaUQ, String cedula) {

        fincaUQ.eliminarEmpleado(cedula, fincaUQ);

    }


    private static void crearTarea(FincaUQ fincaUQ) {
        /*SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        Date fechaInicial = formato.parse("23-10-2023");
        Date fechaFinal = formato.parse("23/10/2023");

        long duracionTarea = fechaInicial.getTime() - fechaFinal.getTime();

        TimeUnit time = TimeUnit.DAYS;
        long duracionTareaDias = time.convert(duracionTarea, TimeUnit.MILLISECONDS);
*/

        Date fechaInicial = 23-10-2023;
        Date fechaFinal = formato.parse("23/10/2023");

        LocalDate localDatefechaInicial = LocalDate.parse("2018-05-06", DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate localDatefechaFinal = LocalDate.parse("2018-05-30", DateTimeFormatter.ISO_LOCAL_DATE);

        long diff = ChronoUnit.DAYS.between(fechaInicial, fechaFinal);
        System.out.println("difference is : " + diff);

        fincaUQ.crearTarea(1, "123", fechaInicial, fechaFinal, "Pintar el hangar");



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