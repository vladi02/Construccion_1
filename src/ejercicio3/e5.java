/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Vladimir
 */
public class e5 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int suma=0,n,f,promedio=0,i=10;
        suma=0;
        do {            
            System.out.println("INGRESE VALORES :");
            n=cin.nextInt();
            suma=suma+n;
            i--;
        } while (i!=0);
        System.out.println("SUMA :");
        System.out.println(suma);
        promedio=suma/10;
        System.out.println("PROMEDIO :"+ promedio);
    }
}
