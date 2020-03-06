/*
   super("CampoTexto");
        setSize(400, 80);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel etiquetaPagina = new JLabel("Dirección página web: ",JLabel.RIGHT);
        JTextField direccionPagina = new JTextField("Escribe aquí", 30);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        add(etiquetaPagina);
        add(direccionPagina);
        setVisible(true);.
 */
import javax.swing.*;
import java.awt.*;

public class CampoTexto extends JFrame {
    public CampoTexto() {
        super("CampoTexto");
        JLabel lblpagina = new JLabel("Dirección página web: ",JLabel.RIGHT);
        JTextField txtweb = new JTextField("Escribe aquí", 30);
        this.setSize(400,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout fl=new FlowLayout();
        add(lblpagina);
        add(txtweb);
        setLayout(fl);
        this.setVisible(true);
        
    }

    public static void main(String[] arguments) {
        CampoTexto apli = new CampoTexto();
    }
}