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
public class interfaz_eliminar_codigo extends JFrame implements ActionListener{
    JPanel panel;
    JLabel lbltexto;
    JTextField txtTexto;
    JButton btnEliminarr, btnRegresar;
    public interfaz_eliminar_codigo(){
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
        lbltexto = new JLabel("INGRESA EL CODIGO: ");
        lbltexto.setBounds(20, 200, 120, 20);
        panel.add(lbltexto);
        
        txtTexto = new JTextField();
        txtTexto.setBounds(130, 200, 120, 20);
        panel.add(txtTexto);
        
        btnEliminarr =new JButton("ELIMINAR");
        btnEliminarr.setBounds(90, 250, 100, 20);
        btnEliminarr.addActionListener(this);
        panel.add(btnEliminarr);
        
        
        btnRegresar =new JButton("REGRESAR");
        btnRegresar.setBounds(220, 250, 100, 20);
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
        
        if(e.getSource()==btnEliminarr){
            interfaz_menu in=new interfaz_menu();
            for(int i=0;i<in.contactos.size();i++){
                if(in.contactos.get(i).getCodigo()==Integer.parseInt(txtTexto.getText())){
                    JOptionPane.showMessageDialog(null, "El contacto : "+in.contactos.get(i).getCodigo()+ "  fue elimminado");
                    in.contactos.remove(in.contactos.get(i));
                    interfaz_menu OK=new interfaz_menu();
                    OK.setVisible(true);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "No se encontro el contacto");
                    interfaz_menu OK=new interfaz_menu();
                    OK.setVisible(true);
                    this.dispose();
                }
            }
        }
    }
}