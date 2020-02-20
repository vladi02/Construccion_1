/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construccion_1;

import java.util.Calendar;
import java.util.Date;


public class pedido {
    private Date fecha;
    private int numero_pedido;
    private int cantidad;

    public pedido() {
    }

    public pedido(Date fecha, int numero_pedido, int cantidad) {
        this.fecha = fecha;
        this.numero_pedido = numero_pedido;
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNumero_pedido() {
        return numero_pedido;
    }

    public void setNumero_pedido(int numero_pedido) {
        this.numero_pedido = numero_pedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
    
    
    @Override
    public String toString() {
        return "fecha :"+fecha+"\nnumero_pedido :"+numero_pedido+"\ncantidad :"+cantidad;
    }
     
    
}
