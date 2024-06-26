package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * Clase departamento
 */
public class Departamento implements Invitable {
    /**
     * ArrayList con los empleados que pertenecen al departamento
     */
    private ArrayList<Empleado> empleados;
    /**
     * ArrayList con los empleados pero de manera auxiliar
     */
    private ArrayList<Empleado> aux;
    /**
     * String con el nombre del org.example.Departamento
     */
    private String nombre;

    /**
     * Constructor org.example.Departamento
     * @param nombre_depa se le ingresa el nombre del org.example.Departamento
     */
    public Departamento(String nombre_depa){
        empleados = new ArrayList<Empleado>();
        nombre = nombre_depa;
    }

    /**
     * Metodo para agragar empleado al departamento
     * @param e Se le pasa un empleado
     */
    public void addEmpleados(Empleado e){
        boolean verificar = true;
        for(Empleado a : empleados){
            if(a.getId().equals(e.getId())){
                verificar = false;
                break;
            }
        }
        if(verificar){
            empleados.add(e);
            aux = (ArrayList<Empleado>) empleados.clone();
        }
    }

    /**
     * Metodo para obtener la cantidad de empleados
     * @return Retorna un int con el numero de integrantes
     */
    public int obtenerCantidadEmpleados(){
        return empleados.size();
    }

    /**
     * Metodo para mostrar los datos de los empleados pertenecientes al departamento
     */
    public ArrayList datosEmpleados(){
        return empleados;
    }

    /**
     * Metodo getter
     * @return Retorna un empleado
     */
    public Empleado getEmpleado(){
        return aux.remove(0);
    }

    /**
     * Metodo para invitar un departamento a una reunión
     * @param reunion Es la reunion a la que asistirán
     * @param horita Hora a la que se invito
     */
    @Override
    public void invitar(Reunion reunion, LocalDateTime horita) {
        for(Empleado e : empleados){
            reunion.invitaciones.add(new Invitacion(horita, e));
        }
    }
}