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
public class TAREA_013 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int horat,horap,sueldo,horaex;
        horat=cin.nextInt();
        while(horat>=1){
            if(horat<=40){
                horap=horat*20;
                System.out.println("EL SUELDO ES :"+horap);break; 
            }
            if(horat>40){
                 sueldo=40*20;
                 horaex=(horat-40)*25;
                 horap=sueldo+horaex; 
                 System.out.println("EL SUELDO ES :"+horap);break; 
                }
    }
}
}
