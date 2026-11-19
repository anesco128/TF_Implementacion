/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author anss8
  */
public class Empleado {
    private String numeroIdentificacioni;
    private String nombreCompleto;
    private String tituloProfesional;
    private byte aniosExperiencia;
 

    public Empleado(String numeroIdentificacioni, String nombreCompleto, String tituloProfesional, byte aniosExperiencia) {
        this.numeroIdentificacioni = numeroIdentificacioni;
        this.nombreCompleto = nombreCompleto;
        this.tituloProfesional = tituloProfesional;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getNumeroIdentificacioni() {
        return numeroIdentificacioni;
    }

    public void setNumeroIdentificacioni(String numeroIdentificacioni) {
        this.numeroIdentificacioni = numeroIdentificacioni;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getTituloProfesional() {
        return tituloProfesional;
    }

    public void setTituloProfesional(String tituloProfesional) {
        this.tituloProfesional = tituloProfesional;
    }

    public byte getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(byte aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public String toString() {
        return "Empleado{" 
                + "numeroIdentificacioni=" + numeroIdentificacioni 
                + ", nombreCompleto=" + nombreCompleto 
                + ", tituloProfesional=" + tituloProfesional 
                + ", aniosExperiencia=" + aniosExperiencia + '}';
    }
    
    
}
    public String getNumeroIdentificacion() {
       return numeroIdentificacion;
    }
}
