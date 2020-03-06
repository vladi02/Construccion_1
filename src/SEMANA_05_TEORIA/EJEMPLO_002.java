/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA_05_TEORIA;

/**
 *
 * @author Vladimir
 */
//EJEMPLO DEL TERCER PRINCIPIO DE SOLID DE LISKOV   
abstract class padre{
    int x;
    int y;
   String saludar(){
       return "buenos dias";
   }        
   abstract void cortePelo();
}
class hija extends padre{
  String saludar(){
      return "GOOD MOORNING";
  }
    @Override
    void cortePelo() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
public class EJEMPLO_002 {
    public static void main(String[] args) {
        padre p=new hija();
        System.out.println(p.saludar());
    }
}
