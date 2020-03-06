/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA_1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Vladimir
 */
public class TAREA_028 {
    public static void main(String[] args) {
          Scanner cin=new Scanner(System.in);
       int n,peso=0,altura=0,calidad=0,precio=0,nhuevos=0;
        System.out.println("INGRESE LA CANTIDAD DE GALLINAS :");
        n=cin.nextInt();
        Random carac=new Random();
            for(int i=0;i<n;i++){
            System.out.println("GALLINA "+(i+1)+":");
            peso=(carac.nextInt((10)*1));
            altura=(carac.nextInt(12)*1);
            nhuevos=(carac.nextInt(20)*1);
            System.out.println("PESO DE LA GALLINA :"+peso);
            System.out.println("ALTURA DE LA GALLINA :"+altura);
            calidad=((peso*altura)/nhuevos);
        }
        if(calidad>=15){
            precio=(int)(calidad*1.2);
            System.out.println("EL PRECIO POR KILO DE HUEVO ES "+precio);
        }
        if(calidad>8 && calidad<15){
            precio=(int)(calidad*1);
            System.out.println("EL PRECIO POR KILO DE HUEVO ES "+precio);
        }
        if(calidad<=8){
            precio=(int)(calidad*0.8);
            System.out.println("EL PRECIO POR KILO DE HUEVO ES "+precio);
        }
    }
}
