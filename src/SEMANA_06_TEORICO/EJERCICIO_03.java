/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA_06_TEORICO;

/**
 *
 * @author Vladimir
 *
 */
interface Ipadre{
    void c();
}
abstract class padre implements Ipadre{
    abstract void a();
     abstract void b();
}
class hija implements Ipadre{

    public void c() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
public class EJERCICIO_03 {
    
}
