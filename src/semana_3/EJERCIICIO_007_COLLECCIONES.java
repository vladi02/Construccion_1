/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana_3;
class WUR{
    
    String texto = null;
    String palabras[] = null;

    public WUR(String texto) {
        this.texto = texto;
        this.palabras = texto.split(" ");
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void contarTodas() {
        String palabras[] = this.texto.split(" ");//divide una cadena de texto en palabras
        String palabrasB[] = this.texto.split(" ");

        int cantidad = palabras.length;
        String resultado = "";

        for (int i = 0; i < cantidad; i++) {
            int contador = 0;
            resultado += palabras[i];
            String palabra = palabras[i];

            for (int j = 0; j < cantidad; j++) {

                if (palabra.equalsIgnoreCase(palabrasB[j])) {
                    contador++;
                    palabras[j] = "";
                }
                
            }
            if (contador > 0) {
                resultado += ": " + contador + "\n";
            }

        }

        System.out.print(resultado);
    }

    public int contar_Repetidas(String palabra) {
        int contador = 0;
        for (int i = 0; i < this.palabras.length; i++) {
            if (this.palabras[i].equalsIgnoreCase(palabra)) {
                contador++;
            }
        }
        return contador;
    }
}
public class EJERCIICIO_007_COLLECCIONES {
    public static void main(String[] args) {
        WUR w = new WUR("all all we need need is love love");
        w.contarTodas();
        System.out.println(w.contar_Repetidas("love"));
    }
}
