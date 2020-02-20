package SEMANA_04;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vladimir
 */
class humano{
    protected String nombre;
    protected String apellido;

    public humano() {
    }
    public humano(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public String NombreCompleto(){
        return "NOMBRE :"+this.nombre+"APELLIDO :"+this.apellido;
    }
    public String identificacion(){
        return this.NombreCompleto();
    }
}
class ciudadano extends humano{
    
}
public class SEMANA_04 {
    
}
