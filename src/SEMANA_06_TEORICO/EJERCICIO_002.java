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
interface IRectangulo{
  int calcularArea();
}
class rectangulo implements IRectangulo{
    int x;
    int y;

    public rectangulo(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int calcularArea() {
        return x*y;
    }
    
    
}
public class EJERCICIO_002 {
    
}
