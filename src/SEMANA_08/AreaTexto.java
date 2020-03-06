/*
  super("AreaTexto");//LE ASIGANA UN NOMBRE
        setSize(500, 180);//ASIGNA EL TAMAÑO
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//ESPECIFICA QUE CAUNDO CIEERES LA INTERFAZ ACABE DE CORRER EL PROGRAMA
        JTextArea comentarios = new JTextArea(8, 40);//INGRESA LOS VALORES POR DEFECTO COMO SI FUERA UN CONSTRUCTOR
        FlowLayout dis = new FlowLayout();//INSTANCIAMOS UNA FUNCION LAYOUT QUE NOS PERMITIRA ASIGNAR LA POSICION
        setLayout(dis);//DAMOS EL VALOR DIS
        add(comentarios);
        setVisible(true);
 */
package SEMANA_08;

/**
 *
 * @author Vladimir*/
import javax.swing.*;
import java.awt.*;

public class AreaTexto extends JFrame {
    public AreaTexto() {
      super("AREA DE TEXTO");
      this.setSize(500, 180);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      JTextArea txtarea=new JTextArea(8,40);
      FlowLayout fl = new FlowLayout();//ES PARA QUE SE ADAPRE A LAS MEDIDAS
      setLayout(fl);
      this.add(txtarea);
      this.setVisible(true);
      
    }



    public static void main(String[] arguments) {
        AreaTexto app = new AreaTexto();
    }
}