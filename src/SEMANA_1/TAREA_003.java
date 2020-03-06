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
public class TAREA_003 {
    public static void main(String[] args) {
         Scanner cin=new Scanner(System.in);
       int n;
       double suma=0,fact=1; 
       System.out.println("INGRESE LA CANTIDAD DE SUCESIONES QUE DESEA :");
        n=cin.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                fact*=j;
            }
            suma+=(1/fact);
            fact=1;
        }
        System.out.println("LA SUMA ES :\n"+suma);
    }
}
