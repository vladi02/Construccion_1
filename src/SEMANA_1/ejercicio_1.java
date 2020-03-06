/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class ejercicio_1 {
    public static void main(String[] args)throws IOException {
        System.out.println("HOLA MUNDO");
        System.out.println("************************");
        int n1,n2,suma;
        Scanner cin=new Scanner(System.in);
        n1=cin.nextInt();n2=cin.nextInt();
        suma=n1+n2;
        System.out.println("LA SUMA ES :"+suma);
        System.out.println("************************");
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
         BufferedReader bf1=new BufferedReader(new InputStreamReader(System.in));
        String n;
        n=bf.readLine();
        System.out.println("UN SALUDO PARA : "+ n);
        System.out.println("************************");
        int n3=Integer.parseInt(bf.readLine());
        int n4=Integer.parseInt(bf.readLine());
        int sum=n3+n4;
        System.out.println("LA SUMA CON BUFFEREDREADER ES :"+sum);
        
    }
}
