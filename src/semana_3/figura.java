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
class datos{
   private String nombre;
   public datos(){
   }
    public datos(String nombre) {
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
        return "nombre :"+nombre;
    }
    
}
class admin_figura{
    ArrayList<datos>ListaFigura=new ArrayList<>();
    
    public void agregar(datos f){
        ListaFigura.add(f);
    }
    public void eliminar(datos f){
        ListaFigura.remove(f);
    }
    public void mostrar(){
        for(int i=(ListaFigura.size()-1);i>=0;i--){
            System.out.println(ListaFigura.get(i).toString());
        }
   }
}
public class figura{
    public static void main(String[] args) {
        admin_figura a1=new admin_figura();
        datos d1=new datos("CUADRADO");
        datos d2=new datos("CIRCULO");
        datos d3=new datos("RECTANGULO");
        datos d4=new datos("CUADRILATERO");
        a1.agregar(d1);
        a1.agregar(d2);
        a1.agregar(d3);
        a1.agregar(d4);
        a1.eliminar(d2);
        a1.mostrar();
    }
}