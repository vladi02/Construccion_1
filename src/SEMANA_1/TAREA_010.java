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
public class TAREA_010 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int suma =0;
        int tiempo;
        int promedio;
        for (int i = 0; i < 10; i++) {
            System.out.println("digite tiempo: ");
            tiempo=sc.nextInt();
            if (tiempo>16) {
                System.out.println("NO puedes...");
            }else{
                System.out.println("Si puedes...");
            }
            suma +=tiempo;
        }
        promedio=suma/10;
        if (promedio<=15) {
            System.out.println("NO puedes ...");
        }else{
            System.out.println("Su promedio es : "+promedio);
            System.out.println("Si puedes");
    }
}
}
