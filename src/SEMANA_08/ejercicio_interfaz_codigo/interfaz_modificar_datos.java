/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyect.vladimir;

/**
 *
 * @author rojas
 */

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author rojas
 */
class interfaz_modificar_datos extends JFrame implements ActionListener{
    JPanel panel;
    JLabel lblNombre,lblApellidoP, lblApellidoM, lblCelular, lblFijo, lblCodigo; 
    JTextField txtNombre,txtApellidoP, txtApellidoM, txtCelular, txtFijo, txtCodigo; 
    JButton btnRegresar, btnModificar;
    public interfaz_modificar_datos(){
       this.setSize(400,500);
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
      
        lblNombre = new JLabel("NOMBRE: ");
        lblNombre.setBounds(50, 100, 100, 20);
        panel.add(lblNombre);
        
        lblApellidoP = new JLabel("APELLIDO PATERNO: ");
        lblApellidoP.setBounds(50, 130, 100, 20);
        panel.add(lblApellidoP);
        
        lblApellidoM = new JLabel("APELLIDO MATERNO: ");
        lblApellidoM.setBounds(50, 160, 100, 20);
        panel.add(lblApellidoM);
        
        lblCelular = new JLabel("CELULAR: ");
        lblCelular.setBounds(50, 190, 100, 20);
        panel.add(lblCelular);
        
        lblFijo = new JLabel("FIJO: ");
        lblFijo.setBounds(50, 210, 100, 20);
        panel.add(lblFijo);
        
  
        txtNombre = new JTextField();
        txtNombre.setBounds(220, 100, 100, 20);
        panel.add(txtNombre);
        
        txtApellidoP = new JTextField();
        txtApellidoP.setBounds(220, 130, 100, 20);
        panel.add(txtApellidoP);
        
        txtApellidoM = new JTextField();
        txtApellidoM.setBounds(220, 160, 100, 20);
        panel.add(txtApellidoM);
        
        txtCelular = new JTextField();
        txtCelular.setBounds(220, 190, 100, 20);
        panel.add(txtCelular);
        
        txtFijo = new JTextField();
        txtFijo.setBounds(220, 220, 100, 20);
        panel.add(txtFijo);
        
        
        btnRegresar =new JButton("REGRESAR");
        btnRegresar.setBounds(90, 250, 100, 20);
        btnRegresar.addActionListener(this);
        panel.add(btnRegresar);
        
        btnModificar =new JButton("GUARDAR");
        btnModificar.setBounds(200, 250, 100, 20);
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
            interfaz_menu in=new interfaz_menu();
            interfaz_modificar in1=new interfaz_modificar();
            
            for(int i=0;i<in.contactos.size();i++){
                if(in1.valor==in.contactos.get(i).getCodigo()){
                    in.contactos.get(i).setNombre(txtNombre.getText());
                    in.contactos.get(i).setApellidop(txtApellidoP.getText());
                    in.contactos.get(i).setApellidom(txtApellidoM.getText());
                    in.contactos.get(i).setCelular(txtCelular.getText());
                    in.contactos.get(i).setFijo(txtFijo.getText());
                    interfaz_ver_modificado ok=new interfaz_ver_modificado();
                     ok.setVisible(true);
                     ok.area.append(in.contactos.get(i).toString());
                     this.dispose();
                }
            }
            
        }  
    }
    
}

