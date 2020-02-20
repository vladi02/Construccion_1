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
public class e2 {
    public static void main(String[] args) {
        Scanner cin= new Scanner(System.in);
        int n1,n2,n3;
        System.out.println("INGRESE LA PRIMERA NOTA :");
        n1=cin.nextInt();
        System.out.println("INGRESE LA SEGUNDA NOTA :");
        n2=cin.nextInt();
        System.out.println("INGRESE LA TERCERA NOTA :");
        n3=cin.nextInt();
        int promedio=(n1+n2+n3)/3;
        e2 obj = new e2();
        obj.mensaje(promedio);
        
    }
     public void mensaje(int promedio){
        if (promedio>=13) {
            System.out.println("Promocionado");
        }else{
            if (promedio>=11) {
                System.out.println("Regular");
            }else{
                System.out.println("Reprobado");
            }
        }
        
    }
 }

