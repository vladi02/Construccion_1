/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA_2;

public class doctor {
    private int id;
    private String name;

     public doctor(int id, String name) {
        this.id = id;
        this.name = name;
     }

    public doctor() {
    }
     
   

    @Override
    public String toString() {
        return "doctor{" + "id=" + id + ", name=" + name + '}';
    }
   
}
