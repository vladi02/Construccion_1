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
class interfaz_agregar extends JFrame implements ActionListener{
    JPanel panel;
    JLabel lblNombre,lblApellidoP, lblApellidoM, lblCelular, lblFijo, lblCodigo; 
    JTextField txtNombre,txtApellidoP, txtApellidoM, txtCelular, txtFijo, txtCodigo; 
    JButton btnRegresar, btnGuardar;
    
    public interfaz_agregar(){
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
        lblCodigo = new JLabel("CODIGO: ");
        lblCodigo.setBounds(50, 70, 100, 20);
        panel.add(lblCodigo);
        
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
        
        txtCodigo = new JTextField();
        txtCodigo.setBounds(220, 70, 100, 20);
        panel.add(txtCodigo);
        
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
        
        btnGuardar =new JButton("GUARDAR");
        btnGuardar.setBounds(200, 250, 100, 20);
        btnGuardar.addActionListener(this);
        panel.add(btnGuardar);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnRegresar){
            interfaz_menu ok=new interfaz_menu();
            ok.setVisible(true);
            this.dispose();
        }
        if(e.getSource()==btnGuardar){
            
            interfaz_menu in=new interfaz_menu();
            in.contactos.add(new contacto(Integer.parseInt(txtCodigo.getText()), txtNombre.getText(), txtApellidoP.getText(), txtApellidoM.getText(), txtCelular.getText(), txtFijo.getText()));
            interfaz_menu ok=new interfaz_menu();
            ok.setVisible(true);
            this.dispose();
        }  
    }
    
}
