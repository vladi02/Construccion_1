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
public class e6 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        double suma = 0.0;
        int i, n, impar;
        System.out.println("INGRESE EL VALOR DE N :");
        n = cin.nextInt();
        System.out.println("INGRESE EL VALOR DE X :");
        int x = cin.nextInt();
        for (i = 1; i <= n; i++) {
            impar = 2 * i - 1;
            System.out.print(impar+" - ");
            suma = suma + Math.pow(x, impar);
        }
        System.out.println(suma);
    }
}
