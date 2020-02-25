/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana_3;

import java.util.ArrayList;

/**
 *
 * @author Vladimir
 */
class dato{
    private String nombre;

    public dato() {
    }

    public dato(String nombre) {
        this.nombre = nombre;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

     @Override
    public String toString() {
        return "nombre :"+ nombre;
    }
}
class clase{
      ArrayList<dato>ListaAlum=new ArrayList<>();
    
    public void agregar(dato d){
        ListaAlum.add(d);
    }
    public void eliminar(dato d){
        ListaAlum.remove(d);
    }
    public void modificar(int pos,dato d){
         ListaAlum.set(pos, d);
     }
    public void mostrar(){
        for(int i=0;i<ListaAlum.size();i++){
            System.out.println(ListaAlum.get(i).toString());
        }
   }
}
public class alumno {
    public static void main(String[] args) {
        clase c=new clase();
        dato d1=new dato("JUAN");
        dato d2=new dato("LUIS");
        dato d3=new dato("JORGE");
        dato d4=new dato("ANITA");
        c.agregar(d1);
        c.agregar(d2);
        c.agregar(d3);
        c.agregar(d4);
        //c.eliminar(d2);
        c.modificar(0, d2);
        c.mostrar();
    }
}
