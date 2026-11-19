/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author anss8
 */
public class Contacto {
    private String nombreCompleto;
    private String Cargo;
    private String numeroTelefono;
    private String correoElectronico;

    public Contacto(String nombreCompleto, String Cargo, String numeroTelefono, String correoElectronico) {
        this.nombreCompleto = nombreCompleto;
        this.Cargo = Cargo;
        this.numeroTelefono = numeroTelefono;
        this.correoElectronico = correoElectronico;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String toString() {
        return "Contacto{" 
                + "nombreCompleto=" + nombreCompleto 
                + ", Cargo=" + Cargo 
                + ", numeroTelefono=" + numeroTelefono 
                + ", correoElectronico=" + correoElectronico + '}';
    }
    
    
}
