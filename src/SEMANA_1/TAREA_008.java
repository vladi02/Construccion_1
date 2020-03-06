/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA_1;

import java.util.Random;
import java.util.Scanner;


public class TAREA_008 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
     final int precio=3;
     int kilos,total=0,ganancia=0,ganancia1=0;
     Random k=new Random();
     System.out.println("CANTIDAD DE CLIENTES : 15");
     for(int i=0;i<15;i++){
         System.out.println("CLIENTE "+(i+1)+":");
         System.out.println("INGRESE LA CANTIDAD DE KILOS QUE COMPRARA :");
         kilos=(k.nextInt(50)*1);
         System.out.println("KILOS :"+kilos);
         if(kilos>=10){
             total=(int)((precio*kilos)-(precio*kilos)*(0.15));
             System.out.println("CANTIDAD A PAGAR :"+total);
             ganancia+=total;
         }
         if(kilos<10){
             total=precio*kilos;
             System.out.println("CANTIDAD A PAGAR :"+total);
             ganancia1+=total;
         }        
     }
        System.out.println("LA GANANCIA TOTAL DE LA TIENDA ES :"+(ganancia+ganancia1));
    }
}
