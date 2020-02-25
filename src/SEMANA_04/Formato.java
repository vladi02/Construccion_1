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
public class Formato extends Genero {
    private String TipoFormato;

    public Formato(String TipoFormato, String TipoGenero, String titulo, String autor) {
        super(TipoGenero, titulo, autor);
        this.TipoFormato = TipoFormato;
    }

    public String getTipoFormato() {
        return TipoFormato;
    }

    public void setTipoFormato(String TipoFormato) {
        this.TipoFormato = TipoFormato;
    }

    public String formato() {
        return this.genero()+"\nFormato :"+TipoFormato;
    }
    
}
