package org.example;

import java.time.LocalDateTime;

/**
 * Clase Invitación
 */
public class Invitacion{
    /**
     * Variable que almacena la hora prevista
     */
    public LocalDateTime hora;
    /**
     * Variable que almacena al empleado invitado
     */
    public Empleado empleado;
    /**
     * Constructor Invitación
     * @param hora Hora prevista
     * @param empleado org.example.Empleado invitado
     */
    public Invitacion(LocalDateTime hora, Empleado empleado){
        this.hora = hora;
        this.empleado = empleado;
    }
}
