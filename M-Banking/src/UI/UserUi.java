/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import RoundedField.RoundJPanel;
import java.awt.Color;
/**
 *
 * @author maxdr
 */
public class UserUi extends javax.swing.JFrame {

    /**
     * Creates new form UserUi
     */
    public UserUi() {
        initComponents();
        this.setBackground(new Color(0.0f,0.0f,0.0f,0.0f));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgUtama = new RoundJPanel(75);
        footer = new RoundJPanel(75);
        daftar = new RoundJPanel(25);
        jLabel1 = new javax.swing.JLabel();
        transfer = new RoundJPanel(25);
        jLabel2 = new javax.swing.JLabel();
        exchange = new RoundJPanel(25);
        jLabel3 = new javax.swing.JLabel();
        notch = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 900));
        setUndecorated(true);

        bgUtama.setBackground(new java.awt.Color(58, 53, 61));
        bgUtama.setForeground(new java.awt.Color(102, 102, 102));
        bgUtama.setMaximumSize(null);
        bgUtama.setOpaque(false);
        bgUtama.setPreferredSize(new java.awt.Dimension(500, 900));

        footer.setBackground(new java.awt.Color(80, 76, 92));
        footer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        footer.setMaximumSize(new java.awt.Dimension(500, 100));
        footer.setOpaque(false);
        footer.setPreferredSize(new java.awt.Dimension(500, 72));

        javax.swing.GroupLayout footerLayout = new javax.swing.GroupLayout(footer);
        footer.setLayout(footerLayout);
        footerLayout.setHorizontalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        footerLayout.setVerticalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        daftar.setBackground(new java.awt.Color(88, 188, 228));
        daftar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        daftar.setFont(new java.awt.Font("Microsoft YaHei", 0, 36)); // NOI18N
        daftar.setOpaque(false);
        daftar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                daftarMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("DAFTAR");

        javax.swing.GroupLayout daftarLayout = new javax.swing.GroupLayout(daftar);
        daftar.setLayout(daftarLayout);
        daftarLayout.setHorizontalGroup(
            daftarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, daftarLayout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        daftarLayout.setVerticalGroup(
            daftarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(daftarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        transfer.setBackground(new java.awt.Color(88, 188, 228));
        transfer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        transfer.setFont(new java.awt.Font("Microsoft YaHei", 0, 36)); // NOI18N
        transfer.setOpaque(false);
        transfer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transferMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("TRANSFER");

        javax.swing.GroupLayout transferLayout = new javax.swing.GroupLayout(transfer);
        transfer.setLayout(transferLayout);
        transferLayout.setHorizontalGroup(
            transferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transferLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        transferLayout.setVerticalGroup(
            transferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transferLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        exchange.setBackground(new java.awt.Color(88, 188, 228));
        exchange.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exchange.setFont(new java.awt.Font("Microsoft YaHei", 0, 36)); // NOI18N
        exchange.setOpaque(false);
        exchange.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exchangeMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei", 1, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Exchange Point");

        javax.swing.GroupLayout exchangeLayout = new javax.swing.GroupLayout(exchange);
        exchange.setLayout(exchangeLayout);
        exchangeLayout.setHorizontalGroup(
            exchangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exchangeLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        exchangeLayout.setVerticalGroup(
            exchangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exchangeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        notch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/m/banking/Asset/notch.png"))); // NOI18N

        javax.swing.GroupLayout bgUtamaLayout = new javax.swing.GroupLayout(bgUtama);
        bgUtama.setLayout(bgUtamaLayout);
        bgUtamaLayout.setHorizontalGroup(
            bgUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(footer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgUtamaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bgUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(exchange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(daftar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transfer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgUtamaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(notch))
        );
        bgUtamaLayout.setVerticalGroup(
            bgUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgUtamaLayout.createSequentialGroup()
                .addComponent(notch)
                .addGap(128, 128, 128)
                .addComponent(daftar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(transfer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(exchange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 329, Short.MAX_VALUE)
                .addComponent(footer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgUtama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(bgUtama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void transferMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transferMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_transferMouseClicked

    private void daftarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_daftarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_daftarMouseClicked

    private void exchangeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exchangeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_exchangeMouseClicked

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
            java.util.logging.Logger.getLogger(UserUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserUi().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgUtama;
    private javax.swing.JPanel daftar;
    private javax.swing.JPanel exchange;
    private javax.swing.JPanel footer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel notch;
    private javax.swing.JPanel transfer;
    // End of variables declaration//GEN-END:variables
}
