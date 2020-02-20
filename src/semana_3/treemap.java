/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana_3;

import java.util.TreeMap;

/**
 *
 * @author Vladimir
 */
public class treemap {
    //CREAMOS UNA FUNCION TREEMAP
    static void TREEMAP_CONSTRUCTOR() 
    { 
        //CREAMOS UN TREEMAP COMO SI FUERA UN ARRAYLIST
        TreeMap<Integer, String> tree_map= new TreeMap<Integer, String>(); 
        // ASIGNAMOS VALORES DE STRING A INT 
        tree_map.put(10, "Geeks"); 
        tree_map.put(15, "4"); 
        tree_map.put(20, "Geeks"); 
        tree_map.put(25, "Welcomes"); 
        tree_map.put(30, "You"); 
        // MOSTRAMOS EL TREEMAP
        System.out.println("TreeMap: "
                           + tree_map); 
    } 
    // USAMOS EL MAIN
    public static void main(String[] args) 
    { 
        TREEMAP_CONSTRUCTOR(); 
    } 
}
