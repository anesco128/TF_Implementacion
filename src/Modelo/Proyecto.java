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
    private String estado;

    public Proyecto(String codigo, String titulo, LocalDate fechaInicio, 
           String unidadDuracion, byte duracionEstimada, Cliente suCliente, 
           Empleado suGerente, ArrayList<Empleado> suEquipo, String estado) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.fechaInicio = fechaInicio;
        this.unidadDuracion = unidadDuracion;
        this.duracionEstimada = duracionEstimada;
        this.suCliente = suCliente;
        this.suGerente = suGerente;
        this.suEquipo = suEquipo;
        this.estado = estado;
    }

    public Proyecto(String codigo, String titulo, LocalDate fechaInicio, 
           String unidadDuracion, byte duracionEstimada, Cliente suCliente, 
           Empleado suGerente, String estado) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.fechaInicio = fechaInicio;
        this.unidadDuracion = unidadDuracion;
        this.duracionEstimada = duracionEstimada;
        this.suCliente = suCliente;
        this.suGerente = suGerente;
        this.suEquipo = new ArrayList<>();
        this.estado = estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getUnidadDuracion() {
        return unidadDuracion;
    }

    public void setUnidadDuracion(String unidadDuracion) {
        this.unidadDuracion = unidadDuracion;
    }

    public byte getDuracionEstimada() {
        return duracionEstimada;
    }

    public void setDuracionEstimada(byte duracionEstimada) {
        this.duracionEstimada = duracionEstimada;
    }

    public Cliente getSuCliente() {
        return suCliente;
    }

    public void setSuCliente(Cliente suCliente) {
        this.suCliente = suCliente;
    }

    public Empleado getSuGerente() {
        return suGerente;
    }

    public void setSuGerente(Empleado suGerente) {
        this.suGerente = suGerente;
    }

    public ArrayList<Empleado> getSuEquipo() {
        return suEquipo;
    }

    public void setSuEquipo(ArrayList<Empleado> suEquipo) {
        this.suEquipo = suEquipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Proyecto{" 
                + "codigo=" + codigo 
                + ", titulo=" + titulo 
                + ", fechaInicio=" + fechaInicio 
                + ", unidadDuracion=" + unidadDuracion 
                + ", duracionEstimada=" + duracionEstimada 
                + ", suCliente=" + suCliente 
                + ", suGerente=" + suGerente 
                + ", suEquipo=" + suEquipo 
                + ", estado=" + estado + '}';
    }
   
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
