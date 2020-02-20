/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana_3;

import sun.misc.FloatingDecimal;

class operacion<N>{
     N x;
     N y;

    public operacion() {
    }

    public operacion(N x, N y) {
        this.x = x;
        this.y = y;
    }

      public double suma(){
         if(x instanceof Number && y instanceof Number){
            return (Double.parseDouble(x.toString())+Double.parseDouble(y.toString()));
         }
         else
             return 0.0;
      }

     public double resta(){
         if(x instanceof Number && y instanceof Number){
            return (Double.parseDouble(x.toString())-Double.parseDouble(y.toString()));
         }
         else
             return 0.0;
   }
    public double producto(){
         if(x instanceof Number && y instanceof Number){
            return (Double.parseDouble(x.toString())*Double.parseDouble(y.toString()));
         }
         else
             return 0.0;
}

}
public class generics {
    public static void main(String[] args) {
            operacion<Float> op=new operacion(5,5);  
            operacion<Integer> op1=new operacion(4,3);
            System.out.println("LA SUMA ES :"+op.suma());
            System.out.println("LA RESTA ES :"+op.resta());
            System.out.println("EL PRODUCTO ES:"+op.producto());
            System.out.println("LA SUMA ES :"+op1.suma());
            System.out.println("LA RESTA ES :"+op1.resta());
            System.out.println("EL PRODUCTO ES:"+op1.producto());
    }
}
