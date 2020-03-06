/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyect.vladimir;

import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author rojas
 */
class contacto{
    int codigo;
    String nombre;
    String apellidop;
    String apellidom;
    String celular;
    String fijo; 

    public contacto(int codigo, String nombre, String apellidop, String apellidom, String celular, String fijo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidop = apellidop;
        this.apellidom = apellidom;
        this.celular = celular;
        this.fijo = fijo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidop() {
        return apellidop;
    }

    public void setApellidop(String apellidop) {
        this.apellidop = apellidop;
    }

    public String getApellidom() {
        return apellidom;
    }

    public void setApellidom(String apellidom) {
        this.apellidom = apellidom;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getFijo() {
        return fijo;
    }

    public void setFijo(String fijo) {
        this.fijo = fijo;
    }

    @Override
    public String toString() {
        return "contacto{" + "codigo=" + codigo + ", nombre=" + nombre + ", apellidop=" + apellidop + ", apellidom=" + apellidom + ", celular=" + celular + ", fijo=" + fijo + '}';
    }
    
    
}
public class interfaz_menu extends JFrame implements ActionListener{
    
    static ArrayList<contacto> contactos=new ArrayList<>();
    JPanel panel;
    JButton btnAgregar, btnModificar, btnEliminar;
    interfaz_agregar ok;
    public interfaz_menu(){
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
        menu();
    }
    public void menu(){
        btnAgregar=new JButton("AGREGAR CONTACTO");
        btnAgregar.setBounds(100, 150, 170, 20);
        btnAgregar.addActionListener(this);
        panel.add(btnAgregar);
        
        btnModificar=new JButton("MODIFICAR CONTACTO");
        btnModificar.setBounds(100, 180, 170, 20);
        btnModificar.addActionListener(this);
        panel.add(btnModificar);
        
        btnEliminar=new JButton("ELIMINAR CONTACTO");
        btnEliminar.setBounds(100, 210, 170, 20);
        btnEliminar.addActionListener(this);
        panel.add(btnEliminar);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnAgregar){
            ok=new interfaz_agregar();
            ok.setVisible(true);
            this.dispose();
        }
        if(e.getSource()==btnModificar){
            interfaz_modificar ok=new interfaz_modificar();
            ok.setVisible(true);
            this.dispose();
        }
        if(e.getSource()==btnEliminar){
            interfaz_eliminar_codigo ok=new interfaz_eliminar_codigo();
            ok.setVisible(true);
            this.dispose();
            
        }
    }
}
