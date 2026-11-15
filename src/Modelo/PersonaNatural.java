/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author anss8
 */
public final class PersonaNatural extends Cliente {
    private String numeroTelefonico;
    private String correoElectronico;

    public PersonaNatural(String numeroTelefonico, String correoElectronico, 
           String numeroIdentificacion, String nombre, String nombreCiudad) {
        super(numeroIdentificacion, nombre, nombreCiudad);
        this.numeroTelefonico = numeroTelefonico;
        this.correoElectronico = correoElectronico;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String toString() {
        return super.toString()+"PersonaNatural{" 
                + "numeroTelefonico=" + numeroTelefonico 
                + ", correoElectronico=" + correoElectronico + '}';
    }
    
    
}
