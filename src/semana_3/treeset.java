/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana_3;

import java.util.TreeSet;

/**
 *
 * @author Vladimir
 */
public class treeset {
    public static void main(String[] args) {
        TreeSet<Integer> ts1 = new TreeSet<Integer>(); 
        //INGRESAMOS VALORES AL TREESET
        ts1.add(12); 
        ts1.add(30); 
        ts1.add(14); 
        //INSERTAMOS UN DUPLICADO 
        ts1.add(12); 
        //POR DEFECTO TREESET ORDENA Y ELIMINA DUPLICADOS AL MOMENTO
        //DE MOSTRAR 
        System.out.println(ts1); 
    }
}
