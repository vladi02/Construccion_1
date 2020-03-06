/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA_06_TEORICO;

import java.util.ArrayList;

interface Iservice{
    public void imprimir(padron p);
}
class Persona{
   String nombre;
   double sueldo;

    public Persona(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

   
   public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", sueldo=" + sueldo + '}';
    }
   
}
class padron{
    ArrayList<Persona>ListaPersona=new ArrayList<>();
    public void agregar(Persona p){
        ListaPersona.add(p);
    }
}
class ServicioImpresion {
    Iservice is;
    public void setIs(Iservice is) {
        this.is = is;
    }
    public void imprimir(padron p){
        is.imprimir(p);
    }
}
class tinta implements Iservice{
    public void imprimir(padron p) {
        for(int i=0;i<p.ListaPersona.size();i++){
            System.out.println(p.ListaPersona.get(i).toString());
        }
        System.out.println("IMPRIMIENDO CON TINTA");
    }
}
class laser implements Iservice{
    public void imprimir(padron p) {
         for(int i=0;i<p.ListaPersona.size();i++){
            System.out.println(p.ListaPersona.get(i).toString());
        }
        System.out.println("IMPRIMIENDO CON LASER");
    }
}
class termica implements Iservice{
    public void imprimir(padron p) {
         for(int i=0;i<p.ListaPersona.size();i++){
            System.out.println(p.ListaPersona.get(i).toString());
        }
        System.out.println("IMPRIMIENDO CON TERMICA");
    }
}
public class EJERCICIO_006 {
    public static void main(String[] args) {
        ServicioImpresion si=new ServicioImpresion(); 
        Persona pe=new Persona("JUAN",200);
        padron p=new padron();
        p.agregar(pe);
        si.setIs(new termica());
        si.imprimir(p);
    }
}
