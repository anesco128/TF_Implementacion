/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author anss8
 */
public class Proyecto {
    private String codigo;
    private String titulo;
    private LocalDate fechaInicio;
    private String unidadDuracion;
    private byte duracionEstimada;
    private Cliente suCliente;
    private Empleado suGerente;
    private ArrayList<Empleado> suEquipo;
    private String Estado;

/**
     * Fecha de finalización = fecha de inicio + duración estimada,
     * según la unidad de duración (semanas, meses, años)
     * Retorna null si la unidad no es una de las tres válidas
     */
    public LocalDate determinarFechaFinalizacion() {
        LocalDate res = null;
        if (unidadDuracion.equals("semanas")) {
            res = fechaInicio.plusWeeks(duracionEstimada);
        } else if (unidadDuracion.equals("meses")) {
            res = fechaInicio.plusMonths(duracionEstimada);
        } else if (unidadDuracion.equals("años")) {
            res = fechaInicio.plusYears(duracionEstimada);
        }
        return res;
    }

    /**
     * Agrega un nuevo integrante al equipo del proyecto.
     * Si el proyecto se registró sin equipo, crea la lista primero.
     */
    public void agregarIntegrante(Empleado nuevoIntegrante) {
        if (suEquipo == null) {
            suEquipo = new ArrayList<>();
        }
        suEquipo.add(nuevoIntegrante);
    }

    /**
     * Elimina del equipo al integrante con el numero de identificación dado.
     * Retorna el empleado eliminado, o null si no pertenece al equipo.
     */
    public Empleado eliminarIntegrante(String numeroIdentificacion) {
        Empleado res = null;
        if (suEquipo != null) {
            int i = 0;
            while (i < suEquipo.size() && res == null) {
                if (suEquipo.get(i).getNumeroIdentificacion().equals(numeroIdentificacion)) {
                    res = suEquipo.remove(i);
                }
                i++;
            }
        }
        return res;
    }
}
