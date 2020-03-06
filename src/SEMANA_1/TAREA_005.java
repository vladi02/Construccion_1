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
public class TAREA_005 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n,cont;
        System.out.println("INGRESA LA CANTIDAD DEL NUMERO QUE DESEA");
        n=cin.nextInt();
        for(int i=1;i<=n;i++){
            cont=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    cont++;
                }
            }
            if(i==1){
                System.out.println(i);
            }
            if(cont==2){
                System.out.println(i);
            }
        }
    }
}
