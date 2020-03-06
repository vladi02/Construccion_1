/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA_08.ejercicioInterfaz;

/**
 *
 * @author Vladimir
 */
public class Contacto {
    private String codigo;
    private String nombre;
    private String apellidop;
    private String apellidom;
    private String celular;
    private String fijo;

    public Contacto() {
    }

    public Contacto(String codigo,String nombre, String apellidop, String apellidom, String celular, String fijo) {
        this.codigo = codigo;
        this.nombre= nombre;
        this.apellidop = apellidop;
        this.apellidom = apellidom;
        this.celular = celular;
        this.fijo = fijo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getApellidop() {
        return apellidop;
    }

    public void setApellidop(String apellidop) {
        this.apellidop = apellidop;
    }

    public String getApellidom() {
        return apellidom;
    }

    public void setApellidom(String apellidom) {
        this.apellidom = apellidom;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getFijo() {
        return fijo;
    }

    public void setFijo(String fijo) {
        this.fijo = fijo;
    }

    @Override
    public String toString() {
        return "CONTACTO" +"\n**********************************"+
                "\nCODIGO :"+codigo+"\nNOMBRE :"+nombre+ "\nAPELLIDO PATERNO :" + apellidop +
                "\nAPELLIDO MATERNO :" + apellidom + "\nCELULAR :" + celular + "\nTELEFONO FIJO :" + fijo;
    }
    
    
}
