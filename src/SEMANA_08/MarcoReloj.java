/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA_08;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Vladimir
 */
public class MarcoReloj extends JFrame {
    public MarcoReloj() {
        super("Reloj");
        setSize(300, 75);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout dis = new FlowLayout();
        setLayout(dis);
        PanelReloj tiempo= new PanelReloj();
        add(tiempo);
        setVisible(true);
    }

    public static void main(String[] arguments) {
        MarcoReloj reloj = new MarcoReloj();
    }
}