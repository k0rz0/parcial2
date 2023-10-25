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
        crearAdministrador(fincaUQ, "José", "Strombord", "123", 26, 1500000, 42, TipoContrato.MEDIO_TIEMPO);
        crearJornalero(fincaUQ,"Ana", "Rodríguez", "456", 24, 1400000, 37, TipoContrato.HORAS);


        crearTarea(fincaUQ);
        empleadoConMayorcantidadHoras(fincaUQ);


    }

    private static void empleadoConMayorcantidadHoras(FincaUQ fincaUQ) {


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
       /*
       *Creación Tarea 1
       */
        Date fechaInicial = new Date(2023, 10, 01);
        Date fechaFinal = new Date(2023, 10, 30);

        LocalDate localDatefechaInicial = LocalDate.parse("2018-05-01", DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate localDatefechaFinal = LocalDate.parse("2018-05-30", DateTimeFormatter.ISO_LOCAL_DATE);

        long duracionTarea = ChronoUnit.DAYS.between(localDatefechaInicial, localDatefechaFinal);

        fincaUQ.crearTarea(1, "123", fechaInicial, fechaFinal, "Pintar el hangar", duracionTarea);

        /*
         *Creación Tarea 1
         */
        Date fechaInicial2 = new Date(2023, 10, 01);
        Date fechaFinal2 = new Date(2023, 10, 05);

        LocalDate localDatefechaInicial2 = LocalDate.parse("2018-05-01", DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate localDatefechaFinal2 = LocalDate.parse("2018-05-30", DateTimeFormatter.ISO_LOCAL_DATE);

        long duracionTarea2 = ChronoUnit.DAYS.between(localDatefechaInicial2, localDatefechaFinal2);

        fincaUQ.crearTarea(2, "123", fechaInicial2, fechaFinal2, "Barrer", duracionTarea2);

        /*
         *Creación Tarea 3
         */

        Date fechaInicial3 = new Date(2023, 10, 15);
        Date fechaFinal3 = new Date(2023, 10, 20);

        LocalDate localDatefechaInicial3 = LocalDate.parse("2018-05-01", DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate localDatefechaFinal3 = LocalDate.parse("2018-05-30", DateTimeFormatter.ISO_LOCAL_DATE);

        long duracionTarea3 = ChronoUnit.DAYS.between(localDatefechaInicial3, localDatefechaFinal3);

        fincaUQ.crearTarea(3, "456", fechaInicial3, fechaFinal3, "Limpiar", duracionTarea3);

        /*
         *Creación Tarea 4
         */

        Date fechaInicial4 = new Date(2023, 10, 29);
        Date fechaFinal4 = new Date(2023, 10, 30);

        LocalDate localDatefechaInicial4 = LocalDate.parse("2018-05-01", DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate localDatefechaFinal4 = LocalDate.parse("2018-05-30", DateTimeFormatter.ISO_LOCAL_DATE);

        long duracionTarea4 = ChronoUnit.DAYS.between(localDatefechaInicial4, localDatefechaFinal4);

        fincaUQ.crearTarea(4, "456", fechaInicial4, fechaFinal4, "Coger café", duracionTarea4);

        /*
         *Creación Tarea 4
         */

        Date fechaInicial5 = new Date(2023, 10, 28);
        Date fechaFinal5 = new Date(2023, 10, 30);

        LocalDate localDatefechaInicial5 = LocalDate.parse("2018-05-01", DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate localDatefechaFinal5 = LocalDate.parse("2018-05-30", DateTimeFormatter.ISO_LOCAL_DATE);

        long duracionTarea5 = ChronoUnit.DAYS.between(localDatefechaInicial5, localDatefechaFinal5);

        fincaUQ.crearTarea(5, "456", fechaInicial5, fechaFinal5, "Podar", duracionTarea5);



    }



}