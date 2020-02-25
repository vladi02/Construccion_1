/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA_04;

/**
 *
 * @author Vladimir
 */
public class principalDisco {
    public static void main(String[] args) {
        Valor v1=new Valor(100,"MP4","Rock","LOS INADAPTADOS","BUNBURY");
        Valor v2=new Valor(300,"MP3","REGUAETTON","LOS MALDITOS","OZUNA");
        Valor v3=new Valor(400,"AVI","POP","BURN","JUSTIN BIEBER");
       ListaMultimedia lm=new ListaMultimedia();
        lm.agregar(v1);
        lm.agregar(v2);
        lm.agregar(v3);
        lm.mostrar();
    }
}
