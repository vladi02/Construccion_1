/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA_08;

import java.awt.FlowLayout;
import javax.swing.*;

/**
 *
 * @author Vladimir
 */
public class ComboBoxes extends JFrame {
    public ComboBoxes(){
      super("COMBO BOXES");
      this.setSize(400,180);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       JComboBox curso = new JComboBox();
        FlowLayout dis = new FlowLayout();
        curso.addItem("Curso de Java");
        curso.addItem("Curso de C++");
        curso.addItem("Curso de PHP");
        curso.addItem("Curso de Flash");
        curso.addItem("Curso de JavaScript");
        curso.addItem("Curso de Java");
        setLayout(dis);
        add(curso);
         this.setVisible(true);
      
    }
    public static void main(String[] args) {
        ComboBoxes cb=new ComboBoxes();
    }
}
