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
public class TAREA_004 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n,limite,resultado=0;
        System.out.println("INGRESA EL NUMERO DE LA TABLA DE MULTIPLICAR QUE DESEAS :");
        n=cin.nextInt();
        System.out.println("INGRESE UN LIMITE HASTA DONDE DESEA LA TABLA DE MULTIPLICAR");
        limite=cin.nextInt();
        for(int i=0;i<=limite;i++){
            resultado=n*i;
            System.out.println(n+"*"+i+"="+resultado);
        }
    }
}
