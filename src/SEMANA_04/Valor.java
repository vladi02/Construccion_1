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
public class Valor extends Formato  {
  private double precio;

    public Valor(double precio, String TipoFormato, String TipoGenero, String titulo, String autor) {
        super(TipoFormato, TipoGenero, titulo, autor);
        this.precio = precio;
    }

      public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return this.formato()+"\nValor :"+precio;
    }
    
  
}
