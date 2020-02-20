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
public class producto {
    private String codigo;
    private String nombre;
    private float precio;
    proveedor pr;
    ArrayList<proveedor>p1=new ArrayList<>();

    public producto(String codigo, String nombre, float precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        pr=new proveedor();
    }
    
    public producto(producto p){
        codigo=p.getCodigo();
        nombre=p.getNombre();
        precio=p.getPrecio();
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public proveedor getPr() {
        return pr;
    }

    public void setPr(proveedor pr) {
        this.pr = pr;
    }
       
    @Override
    public String toString() {
        return " codigo: " + codigo + ", nombre: " + nombre + ", precio: " + precio;
    }
    
}