/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyect.vladimir;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author rojas
 */
    
public class interfaz_ver_modificado extends JFrame implements ActionListener{
    JPanel panel;
    JTextField txtTexto;
    JButton btnRegresar;
    JScrollPane scroll;
    JTextArea area;
    public interfaz_ver_modificado(){
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
        btnRegresar.addActionListener(this);
        panel.add(btnRegresar);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnRegresar){
            interfaz_menu ok=new interfaz_menu();
            ok.setVisible(true);
            this.dispose();
        }
     
    }
    
}
