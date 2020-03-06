/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA_06_TEORICO;

import java.util.Scanner;

/**
 *
 * @author Vladimir
 */
public class EJERCICIO_007 {
    public static void main(String[] args) {
          Scanner cin=new Scanner(System.in);
        int x=9;
        int y=0;
    try{    
        double div=x/y;
        System.out.println(div);
    }catch(ArithmeticException exception){
        System.out.println("BURRO¡¡¡¡¡¡¡");
    }
    }
    
}
