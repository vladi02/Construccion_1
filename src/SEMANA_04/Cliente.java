/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA_04;

import java.util.ArrayList;

/**
 *
 * @author Vladimir
 */
public class Cliente extends Persona{
    ArrayList<producto> pc=new ArrayList<producto>();
    private String direccion;
    private float gasto=0;
    producto p;
    public Cliente() {
        super();
    }

    public Cliente(int dni, String nombre, String apellido, int edad, String direccion) {
        super(dni, nombre, apellido, edad);
        this.direccion = direccion;
    }
    
    public void compraProducto(producto p){
        pc.add(p);
        gasto+=p.getPrecio();
    }
    
    public void listaProducto(){
        for (int i = 0; i < pc.size(); i++) {
            pc.get(i).toString();
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public float getGasto() {
        return gasto;
    }

    public void setGasto(float gasto) {
        this.gasto = gasto;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return super.toString()+", direccion: " + direccion + ", gasto: " + gasto + '}';
    }
}