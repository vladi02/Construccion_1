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
public class TAREA_019 {
    public static void main(String[] args) {
           Scanner cin=new Scanner(System.in);
       int n,menor;
       System.out.println("INGRESE LA CANTIDAD DE NUMEROS QUE DESEA :");
       n=cin.nextInt();
       int vector[]=new int[n];
        System.out.println("INGRESE LOS NUMEROS :");
        for(int i=0;i<n;i++){
            vector[i]=cin.nextInt();
        }
       menor=vector[0];
       for(int i=0;i<n;i++){
           if(menor>vector[i]){
               menor=vector[i];
           }
       }
        System.out.println("EL MENOR ES :"+ menor);
    }
}
