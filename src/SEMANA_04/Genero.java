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
public class Genero extends Disco {
    private String TipoGenero;

    public Genero(String TipoGenero, String titulo, String autor) {
        super(titulo, autor);
        this.TipoGenero = TipoGenero;
    }

    public String getTipoGenero() {
        return TipoGenero;
    }

    public void setTipoGenero(String TipoGenero) {
        this.TipoGenero = TipoGenero;
    }

     public String genero() {
        return  this.disco()+"\nGenero :"+TipoGenero;
    }
  
}
