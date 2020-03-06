/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA_06_TEORICO;


class person{
    String nombre;

    public person(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
class dataMysql{
  public void saveperson(person p){
            System.out.println("LA PERSONA SE ALMACENO");
  }
}
class sevicioPerson{
    public void saveperson(person p){
        dataMysql m=new dataMysql();
        m.saveperson(p);
    }
}
public class EJERCICIO_005 {
    
}
