/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

public class e3 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.println("INGRESE EL PRECIO DEL METRO DE TELA");
        double MetroTela = cin.nextDouble();
        double telaA = MetroTela +(MetroTela/ 2);
        double telaB = MetroTela + ((8 * MetroTela) / 10);
        System.out.println(telaA);
        System.out.println(telaB);
        double manoA = telaA * 0.8;
        double manoB = telaB * 0.95;
        double gastoA = telaA + manoA;
        double gastoB = telaB + manoB;
        double gananciaA = gastoA * 0.3, gananciaB = gastoA * 0.3;
        double gastototalA = gastoA + gananciaA;
        double gastototalB = gastoB + gananciaB;
        int modelo = 0;
        System.out.println("INGRESE EL MODELO DESEADO : "+ "\n1 : modelo A"+" \n2 : modelo B");
        modelo = cin.nextInt();
        switch (modelo) {
            case 1:
                System.out.println("INGRESE LA CANTIDAD DE PANTALONES A COMPRAR");
                int nPantalosA = cin.nextInt();
                System.out.println("La ganacia de " + nPantalosA + " pantlones es " + nPantalosA * gananciaA);
                System.out.println("Precio de venta de A: " + gastototalA * nPantalosA);

                break;
            case 2:
                System.out.println("INGRESE LA CANTIDAD DE PANTALONES A COMPRAR");
                int nPantalosB = cin.nextInt();
                System.out.println("La ganacia de " + nPantalosB + " pantlones es " + nPantalosB * gananciaB);
                System.out.println("Precio de venta de A: " + gastototalB * nPantalosB);

                break;
        }
    }
    
}
