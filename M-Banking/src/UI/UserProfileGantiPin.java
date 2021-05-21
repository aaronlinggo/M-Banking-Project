/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Image.ImagePanel;
import java.awt.color.ICC_Profile;
import javax.swing.JOptionPane;
import m.banking.Captcha;

public class UserProfileGantiPin extends javax.swing.JPanel {

    UserProfile up;
    Captcha c = new Captcha();
    String textCaptcha;
    /**
     * Creates new form UserProfileGantiPin
     */
    public UserProfileGantiPin() {
        initComponents();
        textCaptcha = c.isiCaptcha();
        lblIsiCaptcha.setText(textCaptcha);
    }
    
    public void passData(UserProfile up) {
        this.up = up;
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
        back = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        FieldPinLama = new javax.swing.JPasswordField();
        FieldPinBaru = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        FieldConfirmPin = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        panelCaptcha = new javax.swing.JPanel();
        lblIsiCaptcha = new javax.swing.JLabel();
        FieldCaptcha = new javax.swing.JTextField();
        panelRefresh = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Submit = new javax.swing.JButton();
        Reset = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(55, 53, 61));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/m/banking/Asset/BackBlue.png"))); // NOI18N
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GANTI PIN");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PIN LAMA");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PIN BARU");

        FieldPinLama.setBackground(new java.awt.Color(255, 255, 255));
        FieldPinLama.setForeground(new java.awt.Color(0, 0, 0));
        FieldPinLama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldPinLamaActionPerformed(evt);
            }
        });

        FieldPinBaru.setBackground(new java.awt.Color(255, 255, 255));
        FieldPinBaru.setForeground(new java.awt.Color(0, 0, 0));
        FieldPinBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldPinBaruActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CONFIRM PIN");

        FieldConfirmPin.setBackground(new java.awt.Color(255, 255, 255));
        FieldConfirmPin.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CAPTCHA");

        panelCaptcha.setBackground(new java.awt.Color(204, 204, 204));

        lblIsiCaptcha.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        lblIsiCaptcha.setForeground(new java.awt.Color(102, 102, 102));
        lblIsiCaptcha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIsiCaptcha.setText("Captcha");

        panelCaptcha = new ImagePanel("src/m/banking/Asset/bgCaptcha.png");

        javax.swing.GroupLayout panelCaptchaLayout = new javax.swing.GroupLayout(panelCaptcha);
        panelCaptcha.setLayout(panelCaptchaLayout);
        panelCaptchaLayout.setHorizontalGroup(
            panelCaptchaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIsiCaptcha, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
        );
        panelCaptchaLayout.setVerticalGroup(
            panelCaptchaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIsiCaptcha, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
        );

        FieldCaptcha.setBackground(new java.awt.Color(255, 255, 255));

        panelRefresh.setBackground(new java.awt.Color(255, 255, 255));
        panelRefresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRefreshMouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/m/banking/Asset/refresh.png"))); // NOI18N

        javax.swing.GroupLayout panelRefreshLayout = new javax.swing.GroupLayout(panelRefresh);
        panelRefresh.setLayout(panelRefreshLayout);
        panelRefreshLayout.setHorizontalGroup(
            panelRefreshLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRefreshLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRefreshLayout.setVerticalGroup(
            panelRefreshLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRefreshLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Submit.setBackground(new java.awt.Color(255, 255, 255));
        Submit.setForeground(new java.awt.Color(0, 0, 0));
        Submit.setText("Submit");
        Submit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        Reset.setBackground(new java.awt.Color(255, 255, 255));
        Reset.setForeground(new java.awt.Color(0, 0, 0));
        Reset.setText("Reset");
        Reset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(back)
                        .addGap(109, 109, 109)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(18, 18, 18))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jLabel4)))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FieldPinBaru, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(FieldPinLama, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(FieldConfirmPin)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(Reset)
                            .addGap(43, 43, 43)
                            .addComponent(Submit))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(71, 71, 71)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(FieldCaptcha)
                                    .addGap(18, 18, 18)
                                    .addComponent(panelRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(panelCaptcha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(back))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(FieldPinLama, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(FieldPinBaru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FieldConfirmPin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(70, 70, 70)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(panelCaptcha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FieldCaptcha))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Submit)
                    .addComponent(Reset))
                .addContainerGap(161, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void FieldPinBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldPinBaruActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldPinBaruActionPerformed

    private void FieldPinLamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldPinLamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldPinLamaActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:
        if (!textCaptcha.equals(FieldCaptcha.getText())) {
            //Captcha salah
            JOptionPane.showMessageDialog(null, "Text pada captcha Salah");
        } else if (!FieldPinBaru.equals(FieldConfirmPin.getText())) {
            //Pin dan confirm salah
            JOptionPane.showMessageDialog(null, "Pin Baru dan Confirm Tidak sama");
        } else {
            //berhasil
            JOptionPane.showMessageDialog(null, "Pin berhasil diubah");
        }
    }//GEN-LAST:event_SubmitActionPerformed

    private void panelRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRefreshMouseClicked
        // TODO add your handling code here:
        textCaptcha = c.isiCaptcha();
        lblIsiCaptcha.setText(textCaptcha);
    }//GEN-LAST:event_panelRefreshMouseClicked

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
        FieldPinLama.setText("");
        FieldPinBaru.setText("");
        FieldConfirmPin.setText("");
        FieldCaptcha.setText("");
    }//GEN-LAST:event_ResetActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        up.uh.getContent().removeAll();
        up.uh.getContent().add(up);
        up.uh.getContent().revalidate();
        up.uh.getContent().repaint();
    }//GEN-LAST:event_backMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FieldCaptcha;
    private javax.swing.JPasswordField FieldConfirmPin;
    private javax.swing.JPasswordField FieldPinBaru;
    private javax.swing.JPasswordField FieldPinLama;
    private javax.swing.JButton Reset;
    private javax.swing.JButton Submit;
    private javax.swing.JLabel back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblIsiCaptcha;
    private javax.swing.JPanel panelCaptcha;
    private javax.swing.JPanel panelRefresh;
    // End of variables declaration//GEN-END:variables
}
