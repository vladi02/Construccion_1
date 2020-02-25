/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana_2_practica;

/**
 *
 * @author Vladimir
 */
public class Asistente extends Expositor{
    private int telefono;
    private String direccion;

    public Asistente() {
    }

    public Asistente(int telefono, String direccion) {
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public Asistente(int telefono, String direccion, String codigo, String nombre, String apellido, String correo) {
        super(codigo, nombre, apellido, correo);
        this.telefono = telefono;
        this.direccion = direccion;
    }
  


    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Asistente{" + "telefono=" + telefono + ", direccion=" + direccion + '}';
    }


    
}
