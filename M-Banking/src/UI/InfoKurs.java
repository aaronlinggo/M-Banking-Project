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
 * @author acxel
 */
public class InfoKurs extends javax.swing.JFrame {

    /**
     * Creates new form InfoKurs
     */
    public InfoKurs() {
        initComponents();
        Color a = new Color(102,255,255);
        jComboBox1.setBackground(a);
        Container.removeAll();
        InfoKursBuy ikb = new InfoKursBuy();
        ikb.setVisible(true);
        ikb.setBounds(0,0,500,620);
        Container.add(ikb);
        Container.revalidate();
        Container.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        Saldo = new javax.swing.JLabel();
        PanelBuy = new RoundJPanel(75);
        Buy = new javax.swing.JLabel();
        PanelSell = new RoundJPanel(75);
        Sell = new javax.swing.JLabel();
        Container = new javax.swing.JPanel();
        PanelFooter = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(55, 53, 61));

        jPanel1.setBackground(new java.awt.Color(55, 53, 61));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 900));

        jComboBox1.setBackground(new java.awt.Color(102, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rupiah", "Dollar", "Euro" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        Saldo.setBackground(new java.awt.Color(245, 245, 245));
        Saldo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Saldo.setForeground(new java.awt.Color(255, 255, 255));
        Saldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Saldo.setText("Saldo");

        PanelBuy.setBackground(new java.awt.Color(245, 245, 245));
        PanelBuy.setOpaque(false);
        PanelBuy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HandlerBuy(evt);
            }
        });

        Buy.setForeground(new java.awt.Color(0, 0, 0));
        Buy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Buy.setText("Buy");

        javax.swing.GroupLayout PanelBuyLayout = new javax.swing.GroupLayout(PanelBuy);
        PanelBuy.setLayout(PanelBuyLayout);
        PanelBuyLayout.setHorizontalGroup(
            PanelBuyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBuyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Buy, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
        );
        PanelBuyLayout.setVerticalGroup(
            PanelBuyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBuyLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Buy)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelSell.setBackground(new java.awt.Color(55, 53, 61));
        PanelSell.setOpaque(false);
        PanelSell.setPreferredSize(new java.awt.Dimension(131, 52));
        PanelSell.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HandlerSell(evt);
            }
        });

        Sell.setForeground(new java.awt.Color(245, 245, 245));
        Sell.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sell.setText("Sell");

        javax.swing.GroupLayout PanelSellLayout = new javax.swing.GroupLayout(PanelSell);
        PanelSell.setLayout(PanelSellLayout);
        PanelSellLayout.setHorizontalGroup(
            PanelSellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSellLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Sell, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelSellLayout.setVerticalGroup(
            PanelSellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSellLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Sell)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        Container.setPreferredSize(new java.awt.Dimension(0, 660));

        javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ContainerLayout.setVerticalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        PanelFooter.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(55, 53, 61));
        jLabel2.setText("SELAMAT DATANG DI INFO KURS");

        javax.swing.GroupLayout PanelFooterLayout = new javax.swing.GroupLayout(PanelFooter);
        PanelFooter.setLayout(PanelFooterLayout);
        PanelFooterLayout.setHorizontalGroup(
            PanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFooterLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel2)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        PanelFooterLayout.setVerticalGroup(
            PanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFooterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(245, 245, 245));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(245, 245, 245));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TOTAL BALANCE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
            .addComponent(PanelFooter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Saldo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(PanelBuy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(PanelSell, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelSell, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(PanelBuy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addComponent(Container, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelFooter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void HandlerBuy(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HandlerBuy
        // TODO add your handling code here:
        Color putih = new Color(245,245,245);
        PanelBuy.setBackground(putih);
        Color hitam = new Color(0,0,0);
        Buy.setForeground(hitam);
        Color back = new Color(55,53,61);
        PanelSell.setBackground(back);
        Sell.setForeground(putih);
    }//GEN-LAST:event_HandlerBuy

    private void HandlerSell(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HandlerSell
        // TODO add your handling code here:
        Color putih = new Color(245,245,245);
        PanelSell.setBackground(putih);
        Color hitam = new Color(0,0,0);
        Sell.setForeground(hitam);
        Color back = new Color(55,53,61);
        PanelBuy.setBackground(back);
        Buy.setForeground(putih);
    }//GEN-LAST:event_HandlerSell

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
            java.util.logging.Logger.getLogger(InfoKurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InfoKurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InfoKurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InfoKurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InfoKurs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Buy;
    private javax.swing.JPanel Container;
    private javax.swing.JPanel PanelBuy;
    private javax.swing.JPanel PanelFooter;
    private javax.swing.JPanel PanelSell;
    private javax.swing.JLabel Saldo;
    private javax.swing.JLabel Sell;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
