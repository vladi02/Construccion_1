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
public class TAREA_018 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
       int cantidad,m,v,promedio1=0,promedio2=0,edad,suma=0,suma1=0; 
       System.out.println("INGRESE LA CANTIDAD DE ALUMNOS");
        cantidad=cin.nextInt();
        System.out.println("INGRESE LA CANTIDAD DE VARONES");
        v=cin.nextInt();
        System.out.println("INGRESE LA CANTIDAD DE MUJERES");
        m=cin.nextInt();
        Random anio=new Random();
        for(int i=0;i<v;i++){
            System.out.println("INGRESE LAS EDADES DE LOS VARONES :");
            edad=(anio.nextInt(18)*1);
            System.out.println("VARON "+(i+1)+":"+edad);
            suma+=edad;
        }
        promedio1=(suma/v);
         for(int i=0;i<m;i++){
            System.out.println("INGRESE LAS EDADES DE LAS MUJERES :");
            edad=(anio.nextInt(18)*1);
            System.out.println("MUJER "+(i+1)+":"+edad);
            suma1+=edad;
        }
        promedio2=(suma1/v);
        System.out.println("EL PROMEDIO DE EDAD DE LOS VARONES ES :"+promedio1);
        System.out.println("EL PROMEDIO DE EDAD DE LAS MUJERES ES :"+promedio2);
        System.out.println("LA EDAD PROMEDIO DEL SALON ENTERO ES :"+((promedio1+promedio2)/cantidad));
    }
}
