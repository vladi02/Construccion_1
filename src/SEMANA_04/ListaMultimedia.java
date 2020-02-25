/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA_04;

import java.util.ArrayList;

public class ListaMultimedia {
  ArrayList<Valor>ListMulti=new ArrayList<>();
  
  public void agregar(Valor v1){
    
      if(ListMulti.size()<20){
          ListMulti.add(v1);
      }else
          throw new RuntimeException("ARIO ES CABRO");
     
     
  }
      
  public void mostrar(){
      for(int i=0;i<ListMulti.size();i++){
          System.out.println(ListMulti.get(i).toString());
          System.out.println("****************************");
      }
  }
}
