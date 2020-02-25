/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana_2_practica;

import java.util.ArrayList;

public class FABRICA {
    ArrayList<personaNatural>ListaPersonaNatural=new ArrayList<>();
     ArrayList<personaJuridica>ListaPersonaJuridica=new ArrayList<>();
      ArrayList<pedido>ListaPedido=new ArrayList<>();
       ArrayList<Producto>ListaProducto=new ArrayList<>();
       public void AgregarPersonaN(personaNatural p1){
          ListaPersonaNatural.add(p1);
      }
       public void AgregarPersonaJ(personaJuridica pj1){
          ListaPersonaJuridica.add(pj1);
      }
        public void AgregarPedido(pedido p){
          ListaPedido.add(p);
      }
        public void AgregarProducto(Producto p){
          ListaProducto.add(p);
      }
      
         public void EliminarPersonaN(personaNatural p1){
          ListaPersonaNatural.add(p1);
      }
       public void EliminarPersonaJ(personaJuridica pj1){
          ListaPersonaJuridica.add(pj1);
      }
       public void EliminarPedido(pedido p){
          ListaPedido.add(p);
       }
       
       
}
        