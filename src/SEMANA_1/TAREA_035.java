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
public class TAREA_035 {
    public static void main(String[] args) {
           Scanner cin=new Scanner(System.in);
       int notas=0,cont1=0,cont=0,porcentaje=0; 
       System.out.println("CANTIDAD DE ALUMNOS = 50");
       Random n=new Random();
       for(int i=0;i<50;i++){
        notas=(n.nextInt(100)*1);
        System.out.println("ALUMNO "+(i+1)+": "+notas);
        if(notas>=70){
            cont1++;
        }
        if(notas<70){
            cont++;
        }
       }
         porcentaje=(int)((cont*100)/50);
        System.out.println("ALUMNOS APROBADOS :"+cont1);
        System.out.println("ALUMNOS DESAPROBADOS :"+cont);
        System.out.println("EL PORCENTAJE DE DESAPROBADOS ES :"+porcentaje+"%");
    }
}
