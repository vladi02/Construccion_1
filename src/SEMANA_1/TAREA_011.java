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
public class TAREA_011 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
     int animal,cantidad=0,edad,cont=0,cont1=0,cont2=0;   
     System.out.println("ESCOGE EL ANIMAL :");
        System.out.println("1: JIRAFAS");
        System.out.println("2: ELEFANTES");
        System.out.println("3: CHIMPANCES");
     animal=cin.nextInt();
     Random e=new Random();
     switch(animal){
         case 1:
             cantidad=15;
             
             for(int i=0;i<cantidad;i++){
             edad=(e.nextInt(10)*1);
             if(edad<2){
                 cont++;
             }
             if((edad>=2)&&(edad<3)){
                 cont1++;
             }
             if(edad>=3){
                 cont2++;
             }
                 System.out.println("ANIMAL :"+(i+1)+" EDAD :"+edad);
            }
             System.out.println("EL PORCENTAJE DE ANIMALES MENORES A 2 AÑOS ES :"+((cont*100)/cantidad));
             System.out.println("EL PORCENTAJE DE ANIMALES MAYORES A 2 AÑOS Y MENORES A 3 ES :"+((cont1*100)/cantidad));
             System.out.println("EL PORCENTAJE DE ANIMALES MAYORES A 2 AÑOS ES :"+((cont2*100)/cantidad));break;
         case 2:
            cantidad=20;
             edad=(e.nextInt(10)*1);
            for(int i=0;i<cantidad;i++){
             edad=(e.nextInt(10)*1);
             if(edad<2){
                 cont++;
             }
             if((edad>=2)&&(edad<3)){
                 cont1++;
             }
             if(edad>=3){
                 cont2++;
             }
                 System.out.println("ANIMAL :"+(i+1)+" EDAD :"+edad);
            }
             System.out.println("EL PORCENTAJE DE ANIMALES MENORES A 2 AÑOS ES :"+((cont*100)/cantidad));
             System.out.println("EL PORCENTAJE DE ANIMALES MAYORES A 2 AÑOS Y MENORES A 3 ES :"+((cont1*100)/cantidad));
             System.out.println("EL PORCENTAJE DE ANIMALES MAYORES A 2 AÑOS ES :"+((cont2*100)/cantidad));break;
          case 3:
            cantidad=40;
             edad=(e.nextInt(10)*1);
            for(int i=0;i<cantidad;i++){
             edad=(e.nextInt(10)*1);
             if(edad<2){
                 cont++;
             }
             if((edad>=2)&&(edad<3)){
                 cont1++;
             }
             if(edad>=3){
                 cont2++;
             }
                 System.out.println("ANIMAL :"+(i+1)+" EDAD :"+edad);
            }
              System.out.println("EL PORCENTAJE DE ANIMALES MENORES A 2 AÑOS ES :"+((cont*100)/cantidad));
             System.out.println("EL PORCENTAJE DE ANIMALES MAYORES A 2 AÑOS Y MENORES A 3 ES :"+((cont1*100)/cantidad));
             System.out.println("EL PORCENTAJE DE ANIMALES MAYORES A 2 AÑOS ES :"+((cont2*100)/cantidad));break;
          default :
              System.out.println("NO EXISTE ESE TIPO DE ANIMAL");break;
    }
}
}