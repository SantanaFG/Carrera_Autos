/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package carrera_autos;

import javax.swing.JLabel;

/**
 *
 * @author DELL
 */
public class Pista_de_Carreras extends javax.swing.JFrame {
    
    /**
     * Creates new form Pista_de_Carreras
     */
    public Pista_de_Carreras() {
        initComponents();
        setLocationRelativeTo(this);      
    }
        
    public JLabel getPeach(){
        return Peach;
    }
    public JLabel getYoshi(){
        return Yoshi;
    }
    public JLabel getMario(){
        return Mario;
    }
    public JLabel getDK(){
        return DK;
    }
    public JLabel getMeta(){
        return Meta;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BanderaD = new javax.swing.JLabel();
        Bandera_Iz = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        Meta = new javax.swing.JLabel();
        Peach = new javax.swing.JLabel();
        Pista1 = new javax.swing.JLabel();
        Yoshi = new javax.swing.JLabel();
        Mario = new javax.swing.JLabel();
        Pista2 = new javax.swing.JLabel();
        DK = new javax.swing.JLabel();
        Pista3 = new javax.swing.JLabel();
        Pista4 = new javax.swing.JLabel();
        jBStart = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Carrera de Autos");
        setBackground(new java.awt.Color(51, 51, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BanderaD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Banderas.png"))); // NOI18N
        getContentPane().add(BanderaD, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, -1, -1));

        Bandera_Iz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Banderas.png"))); // NOI18N
        getContentPane().add(Bandera_Iz, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo_1.png"))); // NOI18N
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 810, 81));

        Meta.setBackground(new java.awt.Color(255, 255, 102));
        Meta.setOpaque(true);
        getContentPane().add(Meta, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 100, 10, 400));

        Peach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/peachsprite.png"))); // NOI18N
        getContentPane().add(Peach, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 100, 80));

        Pista1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pista.png"))); // NOI18N
        Pista1.setOpaque(true);
        getContentPane().add(Pista1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 820, 100));

        Yoshi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/yoshisprite.png"))); // NOI18N
        getContentPane().add(Yoshi, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 100, 80));

        Mario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mariosprite.png"))); // NOI18N
        getContentPane().add(Mario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 100, 80));

        Pista2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pista.png"))); // NOI18N
        getContentPane().add(Pista2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 820, 100));

        DK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dksprite.png"))); // NOI18N
        getContentPane().add(DK, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 100, 80));

        Pista3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pista.png"))); // NOI18N
        getContentPane().add(Pista3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 820, 100));

        Pista4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pista.png"))); // NOI18N
        getContentPane().add(Pista4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 820, 100));

        jBStart.setText("START");
        jBStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBStartActionPerformed(evt);
            }
        });
        getContentPane().add(jBStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 520, -1, -1));

        jButton2.setText("PAUSE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 520, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/peach.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 80, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/yoshi.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 80, 80));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mario.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 80, 80));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dk.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 80, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jBStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBStartActionPerformed
        Peach.setLocation(90,Peach.getLocation().y);
        Yoshi.setLocation(90,Yoshi.getLocation().y);
        Mario.setLocation(90,Mario.getLocation().y);
        DK.setLocation(90,DK.getLocation().y);
        
        Carrera_Autos auto1 = new Carrera_Autos(Peach, this);
        Carrera_Autos auto2 = new Carrera_Autos(Yoshi, this);
        Carrera_Autos auto3 = new Carrera_Autos(Mario, this);
        Carrera_Autos auto4 = new Carrera_Autos(DK, this);
        
        auto1.start();
        auto2.start();
        auto3.start();
        auto4.start();
    }//GEN-LAST:event_jBStartActionPerformed

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
            java.util.logging.Logger.getLogger(Pista_de_Carreras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pista_de_Carreras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pista_de_Carreras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pista_de_Carreras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pista_de_Carreras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BanderaD;
    private javax.swing.JLabel Bandera_Iz;
    private javax.swing.JLabel DK;
    private javax.swing.JLabel Mario;
    private javax.swing.JLabel Meta;
    private javax.swing.JLabel Peach;
    private javax.swing.JLabel Pista1;
    private javax.swing.JLabel Pista2;
    private javax.swing.JLabel Pista3;
    private javax.swing.JLabel Pista4;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Yoshi;
    private javax.swing.JButton jBStart;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
