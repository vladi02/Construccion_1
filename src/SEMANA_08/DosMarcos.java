/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA_08;

import javax.swing.JFrame;

/**
 *
 * @author Vladimir
 */
public class DosMarcos extends JFrame {
    public DosMarcos() {
        super("Primer Marco");
        setSize(350, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] arguments) {
        DosMarcos tf = new DosMarcos();
        DosMarcos tf1 = new DosMarcos();
    }
}