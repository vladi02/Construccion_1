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
public class TAREA_007 {
    public static void main(String[] args) {
         Scanner cin=new Scanner(System.in);
        int n,cont=0;
        do{
        System.out.println("INGRESE EL NUMERO :");
        n=cin.nextInt();}while(n<0);
        for(int i=1;i<=n;i++){
            if((n%i)==0){
                cont++;
            }
        }
        if(cont==2){
            System.out.println("EL NUMERO ES PRIMO");
        }else
            System.out.println("EL NUMERO NO ES PRIMO");
        int a=0,b=1,c=1;
        for(int i=0;i<100;i++){
            a=b;
            b=c;
            c=a+b;
            if(n==c){
                System.out.println("EL NUMERO SI ES DE LA SERIE FIBONACCI");break;
            }else
                System.out.println("EL NUMERO NO ES DE LA SERIE FIBONACCI");break;
    }
 }
}
