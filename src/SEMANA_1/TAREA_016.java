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
public class TAREA_016 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
       int cantidad,can_notas;
       double sum=0,nota,promedio=0;
        System.out.println("INGRESE LA CANTIDAD DE ALUMNOS :");
        cantidad=cin.nextInt();
        System.out.println("INGRESE LA CANTIDAD DE NOTAS :");
        can_notas=cin.nextInt();
        for(int i=1;i<=cantidad;i++){
            for(int j=0;j<can_notas;j++){
                System.out.println("ALUMNO N°"+i+" :");
                nota=cin.nextDouble();
                sum+=nota;
            }
        }
        promedio=(sum/can_notas);
        System.out.println("EL PROMEDIO TOTAL ES :"+promedio);
    }
}
