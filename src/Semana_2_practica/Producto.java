/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana_2_practica;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;
    private String unidadMedida;

    public Producto() {
    }

    public Producto(String nombre, double precio, int stock, String unidadMedida) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.unidadMedida = unidadMedida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }
    public double TotalPagar(double cantidad){
        return this.precio*cantidad;
    }

    @Override
    public String toString() {
        return "nombre :"+nombre+"\nprecio :"+precio+"\nstock :"+stock+"\nunidadMedida :"+unidadMedida;
    }
    
}
