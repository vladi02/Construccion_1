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
public class TAREA_001 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
       int cant,indice=1;
       double n,sum=0,promedio=0;
        System.out.println("INGRESE LA CANTIDAD DE NUMERO QUE DESEAS");
        cant=cin.nextInt();
        while(indice<=cant){
            n=cin.nextDouble();
            if(n>0){
                sum+=n;
                promedio=(sum/cant);
                indice++;
            }
        }
        System.out.println("PROMEDIO :"+promedio);
   
    }
}
