/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package carrera_autos;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class Pista_de_Carreras extends javax.swing.JFrame {

    /**
     * Creates new form Pista_de_Carreras
     */
    Cronometro cronome;
    Carrera_Autos mar, prin, yosh, mono;
    static boolean inicio = false;
    static boolean proceso = false;
    static int minutos = 0, segundo = 0;
    ArrayList<Autopodio> ordenLlegada = new ArrayList<>();    
    public Pista_de_Carreras() {
        initComponents();
        pausar.setEnabled(false);
        reanudar.setEnabled(false);
        setLocationRelativeTo(null);
        jInternalFrame1.setBorder(null);
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.jInternalFrame1.getUI();
        bui.setNorthPane(null);
        prin = new Carrera_Autos(Peach, this, ordenLlegada, "Peach");
        yosh = new Carrera_Autos(Yoshi, this, ordenLlegada, "Yoshi");
        mar = new Carrera_Autos(Mario, this, ordenLlegada, "Mario");
        mono = new Carrera_Autos(DK, this, ordenLlegada, "Donkey Kong");
        cronome = new Cronometro(tiempo);
    }

    public JLabel getPeach() {
        return Peach;
    }

    public JLabel getYoshi() {
        return Yoshi;
    }

    public JLabel getMario() {
        return Mario;
    }

    public JLabel getDkong() {
        return DK;
    }

    public void parar() {
        prin.Proceso();
        yosh.Proceso();
        mar.Proceso();
        mono.Proceso();
        cronome.parar();
        proceso = false;
    }

    public void reiniciar() {
        Pista_de_Carreras.segundo = 0;
        Pista_de_Carreras.minutos = 0;
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
        pausar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        tiempo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        reanudar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

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
        getContentPane().add(jBStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 510, 80, -1));

        pausar.setText("PAUSE");
        pausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pausarActionPerformed(evt);
            }
        });
        getContentPane().add(pausar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/peach.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 80, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/yoshi.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 80, 80));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mario.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 80, 80));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dk.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 80, 80));

        jInternalFrame1.setVisible(true);

        tiempo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel5.setText("TIME:");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        getContentPane().add(jInternalFrame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 80));

        reanudar.setText("REANUDAR");
        reanudar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reanudarActionPerformed(evt);
            }
        });
        getContentPane().add(reanudar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 510, -1, -1));

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 510, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pausarActionPerformed
        // TODO add your handling code here:
        parar();
        reanudar.setEnabled(true);
    }//GEN-LAST:event_pausarActionPerformed

    private void jBStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBStartActionPerformed
        pausar.setEnabled(true);
        ordenLlegada.clear();
        cronome.iniciar();
        if (inicio == false) {
            prin.Inicio();
            yosh.Inicio();
            mar.Inicio();
            mono.Inicio();
            inicio = true;
        }
    }//GEN-LAST:event_jBStartActionPerformed

    private void reanudarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reanudarActionPerformed
        // TODO add your handling code here:
        if (proceso == false) {
            prin.renaudar();
            yosh.renaudar();
            mar.renaudar();
            mono.renaudar();
            cronome.iniciar();
            proceso = true;
        }
    }//GEN-LAST:event_reanudarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
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
            java.util.logging.Logger.getLogger(Pista_de_Carreras.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pista_de_Carreras.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pista_de_Carreras.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pista_de_Carreras.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton pausar;
    private javax.swing.JButton reanudar;
    public static javax.swing.JLabel tiempo;
    // End of variables declaration//GEN-END:variables
}