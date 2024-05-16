package org.example;

import java.time.LocalDateTime;

/**
 * Subclase de Asistencia
 */
public class Retraso extends Asistencia{
    /**
     * Variable que almacena la hora de llegada del org.example.Empleado con atraso
     */
    private LocalDateTime horaLlegada;

    /**
     * Método constructor de Retraso
     * @param e es un org.example.Empleado
     * @param horaLlegada es LocalDateTime
     */
    public Retraso(Empleado e, LocalDateTime horaLlegada){
        super(e);
        this.horaLlegada = horaLlegada;
    }

    /**
     * Método getter
     * @return retorna id del empleado
     */
    public String getIdInvitado(){
        return super.usuario.toString();
    }

    /**
     * Método getter
     * @return retorna la hora de llegada del empleado con atraso
     */
    public LocalDateTime getHoraLlegada(){
        return this.horaLlegada;
    }

}