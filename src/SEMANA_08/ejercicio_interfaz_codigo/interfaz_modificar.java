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
public class interfaz_modificar extends JFrame implements ActionListener{
    static int valor;
    JPanel panel;
    JLabel lbltexto;
    JTextField txtTexto;
    JButton btnBuscar, btnRegresar;
    public interfaz_modificar(){
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
        lbltexto.setBounds(20, 50, 120, 20);
        panel.add(lbltexto);
        
        txtTexto = new JTextField();
        txtTexto.setBounds(130, 50, 120, 20);
        panel.add(txtTexto);
        
        btnBuscar =new JButton("GUARDAR");
        btnBuscar.setBounds(90, 100, 100, 20);
        btnBuscar.addActionListener(this);
        panel.add(btnBuscar);
        
        
        btnRegresar =new JButton("REGRESAR");
        btnRegresar.setBounds(220, 100, 100, 20);
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
        
        if(e.getSource()==btnBuscar){
            interfaz_menu in=new interfaz_menu();
            
            for(int i=0;i<in.contactos.size();i++){
                if(in.contactos.get(i).getCodigo()==Integer.parseInt(txtTexto.getText())){
                    valor=in.contactos.get(i).getCodigo();
                    interfaz_Lista ok=new interfaz_Lista();
                    ok.setVisible(true);
                    ok.area.append(in.contactos.toString());
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "No se encontro el contacto!!");
                }
            }
            
        }
    }
}
