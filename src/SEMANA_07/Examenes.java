/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA_07;
import java.util.ArrayList;

/**
 *
 * @author Vladimir
 */
class numeros1{
    int n;

    public numeros1() {
    }

    public numeros1(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
}
public class Examenes extends javax.swing.JFrame {
    ArrayList<numeros1>examen1=new ArrayList<>();
    ArrayList<numeros1>examen2=new ArrayList<>();
    ArrayList<numeros1>examen3=new ArrayList<>();
    ArrayList<numeros1>orden=new ArrayList<>();    
    int conta=0;
    public Examenes() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblnestudiante = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblexamen1 = new javax.swing.JLabel();
        lblexamen2 = new javax.swing.JLabel();
        lblexamen3 = new javax.swing.JLabel();
        btncalcular = new javax.swing.JButton();
        btngrabar = new javax.swing.JButton();
        lblpromedio = new javax.swing.JLabel();
        lblmayor = new javax.swing.JLabel();
        lblcantidad = new javax.swing.JLabel();
        lnlnaprobados = new javax.swing.JLabel();
        lbldesaprobados = new javax.swing.JLabel();
        lbldesapruebaexamen = new javax.swing.JLabel();
        txtnestudiante = new javax.swing.JTextField();
        txtexamen1 = new javax.swing.JTextField();
        txtexamen2 = new javax.swing.JTextField();
        txtexamen3 = new javax.swing.JTextField();
        txtpromedio = new javax.swing.JTextField();
        txtmayor = new javax.swing.JTextField();
        txtcantidad = new javax.swing.JTextField();
        txtaprobados = new javax.swing.JTextField();
        txtdesaprobados = new javax.swing.JTextField();
        txtdesapruebaexamen = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblnestudiante.setText("Numero de orden del estudiante");

        lblexamen1.setText("Examen 1");

        lblexamen2.setText("Examen 2");

        lblexamen3.setText("Examen 3");

        btncalcular.setText("CALCULAR");
        btncalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalcularActionPerformed(evt);
            }
        });

        btngrabar.setText("GRABAR");
        btngrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngrabarActionPerformed(evt);
            }
        });

        lblpromedio.setText("Promedio del examen 3");

        lblmayor.setText("Mayor promedio");

        lblcantidad.setText("N° de estudiantes");

        lnlnaprobados.setText("N° de aprobados");

        lbldesaprobados.setText("N° de desaprobados");

        lbldesapruebaexamen.setText("N° de desaprobados de examen 1");

        txtnestudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnestudianteActionPerformed(evt);
            }
        });

        txtexamen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtexamen1ActionPerformed(evt);
            }
        });

        txtexamen2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtexamen2ActionPerformed(evt);
            }
        });

        txtexamen3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtexamen3ActionPerformed(evt);
            }
        });

        txtpromedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpromedioActionPerformed(evt);
            }
        });

        txtmayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmayorActionPerformed(evt);
            }
        });

        txtcantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidadActionPerformed(evt);
            }
        });

        txtaprobados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaprobadosActionPerformed(evt);
            }
        });

        txtdesaprobados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdesaprobadosActionPerformed(evt);
            }
        });

        txtdesapruebaexamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdesapruebaexamenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbldesapruebaexamen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdesapruebaexamen, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btngrabar)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btncalcular))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblexamen2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtexamen2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblexamen3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtexamen3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblpromedio)
                            .addComponent(lblmayor)
                            .addComponent(lblcantidad)
                            .addComponent(lnlnaprobados)
                            .addComponent(lbldesaprobados))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdesaprobados, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtaprobados, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmayor, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnestudiante)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblexamen1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtexamen1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnestudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblnestudiante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblexamen1)
                            .addComponent(txtexamen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtnestudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblexamen2)
                    .addComponent(txtexamen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblexamen3)
                    .addComponent(txtexamen3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btngrabar)
                    .addComponent(btncalcular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblpromedio)
                    .addComponent(txtpromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblmayor)
                    .addComponent(txtmayor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcantidad)
                    .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lnlnaprobados)
                    .addComponent(txtaprobados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldesaprobados)
                    .addComponent(txtdesaprobados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldesapruebaexamen)
                    .addComponent(txtdesapruebaexamen, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(162, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalcularActionPerformed
      txtpromedio.setText(""+promedioexamen());
      txtmayor.setText(""+this.mayorpromedio());
      txtcantidad.setText(""+ nestudiantes());
      txtaprobados.setText(""+ naprobados());
      txtdesaprobados.setText(""+ ndesaprobados());
      txtdesapruebaexamen.setText(""+desaprobadoexamen1());
    }//GEN-LAST:event_btncalcularActionPerformed
    int promedioexamen(){
        int suma=0;
        int promedio=0;
        for(int i=0;i<examen3.size();i++){
            suma+=(examen3.get(i).getN());
        }
        promedio=suma/examen3.size();
        
        return promedio;
    }
    int mayorpromedio(){
        int suma=0,suma1=0,suma2=0,mayor=0;
        int promedio1=0,promedio2=0,promedio3=0;
         for(int i=0;i<examen1.size();i++){
            suma+=(examen1.get(i).getN());
        }
         for(int i=0;i<examen2.size();i++){
            suma1+=(examen2.get(i).getN());
        }
          for(int i=0;i<examen3.size();i++){
            suma2+=(examen3.get(i).getN());
        }
        promedio1=suma/examen1.size();
        promedio2=suma1/examen2.size();
        promedio3=suma2/examen3.size();
        if((promedio1 >promedio2)&&(promedio1>promedio3)){
           return promedio1;
        }
        else if((promedio2 >promedio1)&&(promedio2>promedio3)){
            return promedio2;
        }
         else if((promedio3 >promedio1)&&(promedio3>promedio2)){
            return promedio3;
        }
         
        return 0;
    }
    int nestudiantes(){
        int cont=0;
        for(int i=0;i<orden.size();i++){
            cont++;
        }
        return cont;
    }
    int naprobados(){
        int suma=0;
         int cont=0,cont1=0,cont2=0,total =0;
        for(int i=0;i<examen1.size();i++){
              suma+=examen1.get(i).getN();
              if((suma/examen1.size())>10){
                  cont++;
              }
        }
          for(int i=0;i<examen2.size();i++){
              suma+=examen2.get(i).getN();
              if((suma/examen2.size())>10){
                  cont1++;
              }
        }
            for(int i=0;i<examen3.size();i++){
              suma+=examen3.get(i).getN();
              if((suma/examen3.size())>10){
                  cont2++;
              }
        }
            total=cont+cont1+cont2;
            return total;
    }
     int ndesaprobados(){
        int suma=0;
         int cont=0,cont1=0,cont2=0,total =0;
        for(int i=0;i<examen1.size();i++){
              suma+=examen1.get(i).getN();
              if((suma/examen1.size())<=10){
                  cont++;
              }
        }
          for(int i=0;i<examen2.size();i++){
              suma+=examen2.get(i).getN();
              if((suma/examen2.size())<=10){
                  cont1++;
              }
        }
            for(int i=0;i<examen3.size();i++){
              suma+=examen3.get(i).getN();
              if((suma/examen3.size())<=10){
                  cont2++;
              }
        }
            total=cont+cont1+cont2;
            return total;
    }
     int desaprobadoexamen1(){
        int suma=0,cont=0;
        int promedio=0;
        for(int i=0;i<examen1.size();i++){
            suma+=(examen1.get(i).getN());
             if((promedio=suma/examen1.size())<=10){
                 cont++;
              }
        }
        
       return cont;
     }
    
    
    private void txtnestudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnestudianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnestudianteActionPerformed

    private void txtexamen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtexamen1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtexamen1ActionPerformed

    private void txtexamen2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtexamen2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtexamen2ActionPerformed

    private void txtexamen3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtexamen3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtexamen3ActionPerformed

    private void txtpromedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpromedioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpromedioActionPerformed

    private void txtmayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmayorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmayorActionPerformed

    private void txtcantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidadActionPerformed

    private void txtaprobadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaprobadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaprobadosActionPerformed

    private void txtdesaprobadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdesaprobadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdesaprobadosActionPerformed

    private void txtdesapruebaexamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdesapruebaexamenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdesapruebaexamenActionPerformed

    private void btngrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngrabarActionPerformed
        int a = Integer.parseInt(txtnestudiante.getText());
        int ex1= Integer.parseInt(txtexamen1.getText());
        int ex2= Integer.parseInt(txtexamen2.getText());
        int ex3= Integer.parseInt(txtexamen3.getText());
        numeros1 n1=new numeros1(a);
        numeros1 n2=new numeros1(ex1);
        numeros1 n3=new numeros1(ex2);
        numeros1 n4=new numeros1(ex3);
        orden.add(n1);
        examen1.add(n2);
        examen2.add(n3);
        examen3.add(n4);
        txtnestudiante.setText("");
        txtexamen1.setText("");
        txtexamen2.setText("");
        txtexamen3.setText("");

    }//GEN-LAST:event_btngrabarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Examenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Examenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Examenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Examenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Examenes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncalcular;
    private javax.swing.JButton btngrabar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblcantidad;
    private javax.swing.JLabel lbldesaprobados;
    private javax.swing.JLabel lbldesapruebaexamen;
    private javax.swing.JLabel lblexamen1;
    private javax.swing.JLabel lblexamen2;
    private javax.swing.JLabel lblexamen3;
    private javax.swing.JLabel lblmayor;
    private javax.swing.JLabel lblnestudiante;
    private javax.swing.JLabel lblpromedio;
    private javax.swing.JLabel lnlnaprobados;
    private javax.swing.JTextField txtaprobados;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtdesaprobados;
    private javax.swing.JTextField txtdesapruebaexamen;
    private javax.swing.JTextField txtexamen1;
    private javax.swing.JTextField txtexamen2;
    private javax.swing.JTextField txtexamen3;
    private javax.swing.JTextField txtmayor;
    private javax.swing.JTextField txtnestudiante;
    private javax.swing.JTextField txtpromedio;
    // End of variables declaration//GEN-END:variables
}
