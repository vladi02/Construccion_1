/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construccion_1;

/**
 *
 * @author Vladimir
 */
public class personaNatural{
 
   private String DNI;
   private String nombre,apellidoP,apellidoM;
   private String telefono,correo,direccion;

    public personaNatural() {
    }

    public personaNatural(String DNI, String nombre, String apellidoP, String apellidoM, String telefono, String correo, String direccion) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String PersonaNatural() {
        return "DNI :"+DNI+"\nnombre :"+nombre+"\napellido paterno :"+apellidoP+"\napellido materno :"+apellidoM +"\ntelefono :" + telefono 
                +"\ncorreo :"+correo+"\ndireccion :"+direccion;
    }
   
         
 
    
    
}
