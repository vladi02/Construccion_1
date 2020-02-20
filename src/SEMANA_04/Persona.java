/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA_04;

/**
 *
 * @author Vladimir
 */
public abstract class Persona {
    protected int dni;
    protected String nombre;
    protected String apellido;
    protected int edad;

    public Persona() {
    }
  
    public Persona(int dni, String nombre, String apellido, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return " dni: " + dni + ", nombre: " + nombre + ", apellido: " + apellido + ", edad: " + edad;
    }
  
}