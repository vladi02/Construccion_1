/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA_1;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Vladimir
 */
public class TAREA_038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd= new Random();
        System.out.println("Ingrese cantidad de voto:");
        int nvotos=sc.nextInt();
        int votos=0;
        int c1=0,c2=0,c3=0;
        do {     
            votos=(int)(rnd.nextDouble()*3+1);
            
            if (votos==1) {
                c1++;
            }if (votos==2) {
                c2++;
            }if (votos==3) {
                c3++;
            }
            nvotos--;
            
        } while (nvotos!=0);
        System.out.println("votos para el candidato1: "+c1);
        System.out.println("votos para el candidato2: "+c2);
        System.out.println("votos para el candidato3: "+c3);
        if (c1>c2&&c1>c3) {
            System.out.println("Ganador es el candiDATO 1");
        }
        if (c2>c1&&c2>c3) {
            System.out.println("Ganador es el candiDATO 2");
        }
        if (c3>c1&&c3>c2) {
            System.out.println("Ganador es el candiDATO 3");
        }else{
            System.out.println("empate");
        }
    }
    }

