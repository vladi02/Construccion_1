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
public class TAREA_020 {
    public static void main(String[] args) {
         Scanner cin=new Scanner(System.in);
       int n,mayor;
       System.out.println("INGRESE LA CANTIDAD DE NUMEROS QUE DESEA :");
       n=cin.nextInt();
       int vector[]=new int[n];
        System.out.println("INGRESE LOS NUMEROS :");
        for(int i=0;i<n;i++){
            vector[i]=cin.nextInt();
        }
       mayor=vector[0];
       for(int i=0;i<n;i++){
           if(mayor<vector[i]){
               mayor=vector[i];
           }
       }
        System.out.println("EL MAYOR ES :"+ mayor);
    }
}
