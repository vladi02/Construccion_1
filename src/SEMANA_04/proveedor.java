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
public class proveedor extends Persona {
    
    private String Ruc;

    public proveedor() {
    super();
    }

    public proveedor(String Ruc, int dni, String nombre, String apellido, int edad) {
        super(dni, nombre, apellido, edad);
        this.Ruc = Ruc;
    }

    public String getRuc() {
        return Ruc;
    }

    public void setRuc(String Ruc) {
        this.Ruc = Ruc;
    }
   
    
}
