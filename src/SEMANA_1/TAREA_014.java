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
public class TAREA_014 {
    public static int aleatorio(int min,int max){
        return (int)((max+min-1)*Math.random()+1);
    }
    public static void main(String[] args) {
            Scanner cin=new Scanner(System.in);
     int n,sex,cont=0,cont1=0;
        System.out.println("INGRESE LA CANTIDAD TOTAL DE ALUMNOS :");
        n=cin.nextInt();
        Random sexo=new Random();
        for(int i=0;i<n;i++){
            System.out.println("ALUMNO"+(i+1)+" :");
            sex=aleatorio(1,2);
            if(sex==1){
                System.out.println("ES VARON");
                cont++;
            }
            if(sex==2){
                System.out.println("ES MUJER");
                cont1++;
            }
        }
        System.out.println("LA CANTIDAD DE VARONES ES : "+cont);
        System.out.println("LA CANTIDAD DE MUJERES ES :"+cont1);
    }
}
