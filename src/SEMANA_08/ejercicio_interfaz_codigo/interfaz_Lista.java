/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyect.vladimir;

import java.awt.event.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author rojas
 */
public class interfaz_Lista extends JFrame implements ActionListener{
    JPanel panel;
    JTextField txtTexto;
    JButton btnRegresar, btnModificar;
    JScrollPane scroll;
    JTextArea area;
    public interfaz_Lista(){
       this.setSize(500,400);
       this.setTitle("Cuenta de Usuario");
       this.setLocationRelativeTo(null);
       panel();
       
       this.setDefaultCloseOperation(EXIT_ON_CLOSE);
       
    }
    
    public void panel(){
        
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        action();
    }
    public void action(){
        area=new JTextArea();
        scroll=new JScrollPane(area);
        area.setBounds(50, 50, 200, 200);
        panel.add(area);
        
        btnRegresar=new JButton("Regresar");
        btnRegresar.setBounds(80, 300, 100, 20);
        panel.add(btnRegresar);
        
        btnModificar=new JButton("MODIFICAR");
        btnModificar.setBounds(200, 300, 100, 20);
        btnModificar.addActionListener(this);
        panel.add(btnModificar);
        
       
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnRegresar){
            interfaz_menu ok=new interfaz_menu();
            ok.setVisible(true);
            this.dispose();
        }
        
        if(e.getSource()==btnModificar){
            interfaz_modificar_datos ok = new interfaz_modificar_datos();
            ok.setVisible(true);
            this.dispose();
        }
    }
    
}
