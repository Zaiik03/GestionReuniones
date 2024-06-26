package org.example;

import java.io.*;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        // Departamentos de ejemplo
        Departamento dep1 = new Departamento("dep1");
        Departamento dep2 = new Departamento("dep2");

        // Empleados de ejemplo
        Empleado emp1 = new Empleado("1", "Oliver1", "Penailillo1", "hola1@123.cl");
        Empleado emp2 = new Empleado("2", "Oliver2", "Penailillo2", "hola2@123.cl");
        Empleado emp3 = new Empleado("3", "Oliver3", "Penailillo3", "hola3@123.cl");
        Empleado emp4 = new Empleado("4", "Oliver4", "Penailillo4", "hola4@123.cl");

        // Asignación departamentos
        dep1.addEmpleados(emp1);
        dep1.addEmpleados(emp2);
        dep2.addEmpleados(emp3);
        dep2.addEmpleados(emp4);

        // Creación de la reunión
        ReunionPresencial reunion = new ReunionPresencial(LocalDate.of(2024, 5, 7), LocalDateTime.of(2024, 5, 7, 10, 0), Duration.ofMinutes(120), "A411", emp1, TipoReunion.MARKETING.getString());

        // Invitaciones a usuarios y departamentos
        emp1.invitar(reunion, LocalDateTime.of(2024, 5, 7,10,0));
        emp2.invitar(reunion, LocalDateTime.of(2024, 5, 7,10,0));
        dep2.invitar(reunion, LocalDateTime.of(2024, 5, 7,10,0));

        // Iniciar reunión
        reunion.iniciar(LocalDateTime.of(2024, 5, 7, 10, 0));

        // Confirmacion Asistencia
        emp1.confirmarAsistencia(LocalDateTime.of(2024,5,7,10,0), reunion);
        emp2.confirmarAsistencia(LocalDateTime.of(2024,5,7,11,0), reunion);
        emp3.confirmarAsistencia(LocalDateTime.of(2024,5,7,9,40), reunion);

        //Notas
        reunion.notas.add(new Nota("Primera nota"));
        reunion.notas.add(new Nota("Segunda nota"));
        reunion.notas.add(new Nota("Tercera nota"));

        // test
        ArrayList<Invitacion> invitaciones = reunion.listaInvitaciones();
        ArrayList<Presente> presentes = reunion.obtenerAsistencias();
        ArrayList<Retraso> retrasos = reunion.obtenerRetrasos();
        ArrayList<Ausente> ausentes = reunion.obtenerAusentes();

        // Finalizacion de la reunión
        reunion.finalizar(LocalDateTime.of(2024, 5, 7, 11, 30));

        // Lista Ausentes
        reunion.obtenerAusentes();
    }
}