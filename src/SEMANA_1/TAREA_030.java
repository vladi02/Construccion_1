/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA_1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 *
 * @author Vladimir
 */
public class TAREA_030 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        System.out.println("Ingrese cuantos productos desea comprar:  ");
        int cantidad=cin.nextInt();
        
        String[][] producto=new String[cantidad][3];
        for(int i=0;i<cantidad;i++){
            double precioDes=0;
            for(int j=0;j<3;j++){
                if(j==0){
                    producto[i][j]="Producto"+(i+1);
                }if(j==1){
                   producto[i][j] =String.valueOf(retornar(precioaleatorio(100.0, 1.0)));
                     precioDes=((Double.parseDouble(producto[i][j])*20)/100);
                }
                if(j==2){
                     producto[i][j]=String.valueOf(retornar(precioDes));
                }
            }
        }
        System.out.println("TIENDA ENANO S.A");
        double total=0;
        for(int i=0;i<cantidad;i++){
            for(int j=0;j<3;j++){
                if(j==0){
                    System.out.print("Nombre:  "+ producto[i][j]);
                }
                
                if(j==1){
                    System.out.print("  Precio Normal:  "+ "S/"+producto[i][j]);
                }
                if(j==2){
                    System.out.println("  Precio Descuento:  "+"S/"+producto[i][j]);
                    total+=Double.parseDouble(producto[i][j]);
                }
            }
        }
        System.out.println("PRECIO TOTAL A PAGAR ES:  "+"S/"+total);
        
    }
    public static double precioaleatorio(double max,double min){
            return (double)((max+min-1)*Math.random()+1);
        }
    public static double retornar(double numero){
        BigDecimal bigDecimal = new BigDecimal(numero).setScale(2, RoundingMode.UP);
        return bigDecimal.doubleValue();
    }
}

