/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA_08;

/**
 *
 * @author Vladimir
 */
public class  Animal {
    private String cod;
    private String nombre;
    private String especie;
    public Animal() {
    }
    public Animal(String cod, String nombre, String especie) {
        this.cod = cod;
        this.nombre = nombre;
        this.especie = especie;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Animal"+"\nCODIGO :"+cod+"\nNOMBRE :"+nombre+"\nESPECIE :"+especie;
    }    
}
