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
public class personaJuridica {
    private String nombreT;
    private String Ruc,direccion,correo,telefono;

    public personaJuridica() {
    }

    public personaJuridica(String nombreT, String Ruc, String direccion, String correo, String telefono) {
        this.nombreT = nombreT;
        this.Ruc = Ruc;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getNombreT() {
        return nombreT;
    }

    public void setNombreT(String nombreT) {
        this.nombreT = nombreT;
    }

    public String getRuc() {
        return Ruc;
    }

    public void setRuc(String Ruc) {
        this.Ruc = Ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String personaJ() {
        return "nombreT :"+nombreT+"\nRuc :"+Ruc+"\ndireccion :"+direccion+"\ncorreo :" + correo + "\ntelefono :" + telefono;
    }
    
}
