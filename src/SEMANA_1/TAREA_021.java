/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA_1;

import java.util.Scanner;

/**
 *
 * @author Vladimir
 */
public class TAREA_021 {
    public static void main(String[] args) {
             Scanner cin=new Scanner(System.in);
        int suma,acu=0,n,cantidad,precio;
         System.out.println("--------------------BIENVENIDO------------------------");   
           do{    
           System.out.println("REGISTRO \n INGRESE 1 PARA SEGUIR \nINGRESE 2 PARA FINALIZAR");
           n=cin.nextInt();
           while(n==1){
           System.out.println("INGRESE LA CANTIDAD");
           cantidad=cin.nextInt();
            System.out.println("INGRESE EL PRECIO :");
           precio=cin.nextInt();
               suma=cantidad*precio;
               acu+=suma;
               System.out.println("EL PRECIO DEL ARTICULO ES :"+ suma);break;
              }
           }while(n==1);
            System.out.println("LA VENTA TOTAL DEL DIA ES :"+acu);
           System.out.println("QUE TENGA BUENA DIA");
    }
}
