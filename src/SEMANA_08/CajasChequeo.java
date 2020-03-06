/*
 super("Cajas Chequeo");//ASIGNAS EL NOMBRE
        setSize(345, 120);//ASIGNAS EL TAMAÑO
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//ESPECIFICA QUE CAUNDO CIEERES LA INTERFAZ ACABE DE CORRER EL PROGRAMA
        JCheckBox cursoJava = new JCheckBox("Curso de Java",true);//INCIALIZAS DANDOLE UN NOMBRE
        JCheckBox cursoFlash = new JCheckBox("Curso de Flash",true);//INCIALIZAS DANDOLE UN NOMBRE
        JCheckBox cursoPHP = new JCheckBox("Curso de PHP",false);//INCIALIZAS DANDOLE UN NOMBRE
        JCheckBox cursoRuby = new JCheckBox("Curso de Ruby",false);//INCIALIZAS DANDOLE UN NOMBRE
        FlowLayout dis = new FlowLayout();
        ButtonGroup cursos = new ButtonGroup();
        cursos.add(cursoJava);
        cursos.add(cursoFlash);
        cursos.add(cursoPHP);
        cursos.add(cursoRuby);
        setLayout(dis);
        add(cursoJava);
        add(cursoFlash);
        add(cursoPHP);
        add(cursoRuby);
        setVisible(true);
 */
package SEMANA_08;

import java.awt.FlowLayout;
import javax.swing.*;


/**
 *
 * @author Vladimir
 */
public class CajasChequeo extends JFrame {
      public CajasChequeo() {
       super("CAJAS CHEQUEO");
       this.setSize(300,150);
       this.setVisible(true);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       JCheckBox cursoJava=new JCheckBox("CURSO JAVA",true);
       JCheckBox cursoFlash=new JCheckBox("CURSO FLASH",true);
       JCheckBox cursoPhp=new JCheckBox("CURSO PHP",false);
       JCheckBox cursoRuby=new JCheckBox("CURSO RUBY",false);
       ButtonGroup cursos = new ButtonGroup();
       cursos.add(cursoJava);
       cursos.add(cursoFlash);
       cursos.add(cursoPhp);
       cursos.add(cursoRuby);
       this.add(cursoJava);
       this.add(cursoFlash);
       this.add(cursoPhp);
       this.add(cursoRuby);
       FlowLayout fl=new FlowLayout();
       this.setLayout(fl);
       
    }

    public static void main(String[] arguments) {
        CajasChequeo app = new CajasChequeo();
    }
}

