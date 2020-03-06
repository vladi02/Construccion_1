/*
 public CursoVideotutoriales() {
 super("Curso Videotutoriales Java");
 setSize(350, 100);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setVisible(true);
 }
 public static void main(String[] arguments) {
 CursoVideotutoriales curso = new CursoVideotutoriales();
 */
package SEMANA_08;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.*;

/**
 *
 * @author Vladimir
 */
public class CursoVideotutoriales extends JFrame {

    public CursoVideotutoriales()  {
     super("CURSO DE VIDEO TUTORIALES");
     this.setSize(400,150);
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     FlowLayout fl=new FlowLayout();
     this.setLayout(fl);   
     this.setVisible(true);
     
    }
      public static void main(String[] args) {
        CursoVideotutoriales cv =new CursoVideotutoriales();
    }
}
