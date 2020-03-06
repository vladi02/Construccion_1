/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA_1;

import java.util.Scanner;

public class TAREA_006 {
    public static void main(String[] args) {
         final double galon;
        galon=3.785;
        Scanner cin=new Scanner(System.in);
        int tipo;
        double precio=0,litro=0,total=0;
        System.out.println("INGRESE EL TIPO DE GASOLINA QUE DESEE :");
            System.out.println("INGRESE 1 : TIPO A ");   
            System.out.println("INGRESE 2 : TIPO B ");  
            System.out.println("INGRESE 3 : TIPO C ");
            System.out.println("INGRESE 4 : PARA SALIR");
            tipo=cin.nextInt();  
        //while(tipo!=4){
            System.out.println("INGRESE LA CANTIDAD DE LITROS");
            tipo=cin.nextInt(); 
            litro=cin.nextDouble();  
            total=(litro/galon);
           switch(tipo){
                    case 1:
                        System.out.println("TIPO A");
                        precio=(litro*50);
                        System.out.println("EL PRECIO ES "+precio);
                        System.out.println("LA CANTIDAD DE GALONES ES :"+total);break;
                    case 2:
                        System.out.println("TIPO B");
                        precio=(litro*55);
                        System.out.println("EL PRECIO ES "+precio);
                        System.out.println("LA CANTIDAD DE GALONES ES :"+total);break;
                    case 3:
                        System.out.println("TIPO C");
                        precio=(litro*60);
                        System.out.println("EL PRECIO ES "+precio);
                        System.out.println("LA CANTIDAD DE GALONES ES :"+total);break;
                    default:
                        System.out.println("NO EXISTE ESA OPCION");break;
            }
       // }
           System.out.println("TENGA BUEN DIA");
    }
}
