/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrera_autos;

import java.awt.Image;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.net.URL;
import javax.swing.JLabel;
import carrera_autos.Autopodio;

/**
 *
 * @author Edisson Leon
 */
public class Podiomariokart extends javax.swing.JFrame {

    /**
     * Creates new form Podiomariokart
     */
    public Podiomariokart() {
        initComponents();
        setLocationRelativeTo(null);

        ImageIcon marioo = createImageIcon("/Images/mario1.png");
        ImageIcon peach = createImageIcon("/Images/peach1.png");
        ImageIcon yoshii = createImageIcon("/Images/Yoshipng.png");
        ImageIcon mono = createImageIcon("/Images/dkey.png");

        if (Carrera_Autos.ordenLlegada.size() == 4) {
            for (int i = 0; i < Carrera_Autos.ordenLlegada.size(); i++) {
                System.out.println("Orden llegada" + Carrera_Autos.ordenLlegada.get(i));

                switch (i) {
                    case 0:
                        setIconAndText(jLabel5, jLabel11, time1, Carrera_Autos.ordenLlegada.get(i), peach, yoshii, marioo, mono);
                        break;
                    case 1:
                        setIconAndText(jLabel4, jLabel12, jLabel8, Carrera_Autos.ordenLlegada.get(i), peach, yoshii, marioo, mono);
                        break;
                    case 2:
                        setIconAndText(jLabel2, jLabel13, jLabel9, Carrera_Autos.ordenLlegada.get(i), peach, yoshii, marioo, mono);
                        break;
                    case 3:
                        jLabel14.setText(Carrera_Autos.ordenLlegada.get(3).getNombre());
                        jLabel10.setText(Carrera_Autos.ordenLlegada.get(3).getTiempo());
                        break;
                }
            }
        }
    }

    private void setIconAndText(JLabel label, JLabel name, JLabel time, Autopodio auto, ImageIcon peach, ImageIcon yoshii, ImageIcon marioo, ImageIcon mono) {
        String nombre = auto.getNombre();
        label.setIcon(getIconForName(nombre, peach, yoshii, marioo, mono));
        name.setText(nombre);
        time.setText(auto.getTiempo());
    }

    private ImageIcon getIconForName(String nombre, ImageIcon peach, ImageIcon yoshii, ImageIcon marioo, ImageIcon mono) {
        if (nombre.equalsIgnoreCase("PEACH")) {
            return peach;
        } else if (nombre.equalsIgnoreCase("YOSHI")) {
            return yoshii;
        } else if (nombre.equalsIgnoreCase("MARIO")) {
            return marioo;
        } else if (nombre.equalsIgnoreCase("DONKEY KONG")) {
            return mono;
        }
        return null;
    }

    private ImageIcon createImageIcon(String path) {
        URL imageURL = getClass().getResource(path);
        if (imageURL != null) {
            return new ImageIcon(imageURL);
        } else {
            System.err.println("No se pudo encontrar el archivo de imagen: " + path);
            return null;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRect1 = new org.edisoncor.gui.panel.PanelRect();
        panelCurves1 = new org.edisoncor.gui.panel.PanelCurves();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        time1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelRect1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelRect1.add(panelCurves1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 383, 480, 100));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        panelRect1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 70, 70));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CONGRATULATIONS");
        panelRect1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 11, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PODIO-removebg-preview.png"))); // NOI18N
        panelRect1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 300, 120));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        panelRect1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 114, 70, 70));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        panelRect1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 90, 80));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("COPA");
        panelRect1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        time1.setForeground(new java.awt.Color(255, 255, 255));
        time1.setText("Tiempo1");
        panelRect1.add(time1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tiempo2");
        panelRect1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("tiempo3");
        panelRect1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, -1, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("tiempo4");
        panelRect1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, -1, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("nombre1");
        panelRect1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("nombre2");
        panelRect1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, -1));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("nombre3");
        panelRect1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, -1, -1));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("nombre4");
        panelRect1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ESTADISTICAS");
        panelRect1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 130, -1));

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelRect1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRect1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRect1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Pista_de_Carreras pist = new Pista_de_Carreras();
        pist.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Podiomariokart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Podiomariokart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Podiomariokart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Podiomariokart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Podiomariokart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private org.edisoncor.gui.panel.PanelCurves panelCurves1;
    private org.edisoncor.gui.panel.PanelRect panelRect1;
    private javax.swing.JLabel time1;
    // End of variables declaration//GEN-END:variables
}
