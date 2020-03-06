/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA_06_TEORICO;

/**
 *
 * @author Vladimir
 */
class MiPropioError extends Exception{
    public MiPropioError(String t){
       super(t);
    }
}
public class EJERCICIO_00 {
    public static void main(String[] args) {
        try{
           MiPropioError e=new MiPropioError("YA PERDISTE PE MANITO FUISTE HAKIADO :)¡¡¡");
           throw e;
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
