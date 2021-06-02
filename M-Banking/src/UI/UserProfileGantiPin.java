/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Image.ImagePanel;
import RoundedField.RoundJPanel;
import java.awt.color.ICC_Profile;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import m.banking.Captcha;
import m.banking.Log;

public class UserProfileGantiPin extends javax.swing.JPanel {

    UserProfile up;
    Captcha c = new Captcha();
    String textCaptcha;
    /**
     * Creates new form UserProfileGantiPin
     */
    public UserProfileGantiPin(UserProfile up) {
        this.up = up;
        initComponents();
        textCaptcha = c.isiCaptcha();
        lblIsiCaptcha.setText(textCaptcha);
    }
    
    public void passData(UserProfile up) {
        this.up = up;
    }
    
    public boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
    
    public void ResetSubmit() {
        FieldPinLama.setText("");
        FieldPinBaru.setText("");
        FieldConfirmPin.setText("");
        textCaptcha = c.isiCaptcha();
        lblIsiCaptcha.setText(textCaptcha);
        FieldCaptcha.setText("");
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
        panelBack = new javax.swing.JPanel();
        lblBack = new javax.swing.JLabel();
        jPanel2 = new RoundJPanel(35);
        jLabel7 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(250, 243, 243));

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(103, 91, 232));
        jLabel2.setText("OLD PIN");

        jLabel3.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(87, 202, 247));
        jLabel3.setText("NEW PIN");

        FieldPinLama.setBackground(new java.awt.Color(255, 255, 255));
        FieldPinLama.setForeground(new java.awt.Color(0, 0, 0));
        FieldPinLama.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 91, 232)));
        FieldPinLama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldPinLamaActionPerformed(evt);
            }
        });

        FieldPinBaru.setBackground(new java.awt.Color(255, 255, 255));
        FieldPinBaru.setForeground(new java.awt.Color(0, 0, 0));
        FieldPinBaru.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 202, 247)));
        FieldPinBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldPinBaruActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(249, 117, 218));
        jLabel4.setText("CONFIRM PIN");

        FieldConfirmPin.setBackground(new java.awt.Color(255, 255, 255));
        FieldConfirmPin.setForeground(new java.awt.Color(0, 0, 0));
        FieldConfirmPin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 117, 218)));

        jLabel5.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(93, 130, 228));
        jLabel5.setText("CAPTCHA");

        panelCaptcha.setBackground(new java.awt.Color(204, 204, 204));

        lblIsiCaptcha.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        lblIsiCaptcha.setForeground(new java.awt.Color(103, 91, 232));
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
        FieldCaptcha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(87, 202, 247)));

        panelRefresh.setBackground(new java.awt.Color(255, 255, 255));
        panelRefresh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 117, 218)));
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

        Submit.setBackground(new java.awt.Color(249, 117, 218));
        Submit.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        Submit.setForeground(new java.awt.Color(0, 0, 0));
        Submit.setText("Submit");
        Submit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        Reset.setBackground(new java.awt.Color(87, 202, 247));
        Reset.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        Reset.setForeground(new java.awt.Color(0, 0, 0));
        Reset.setText("Reset");
        Reset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        panelBack.setBackground(new java.awt.Color(255, 255, 255));
        panelBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelBackMouseClicked(evt);
            }
        });

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/m/banking/Asset/Back.png"))); // NOI18N
        lblBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBackLayout = new javax.swing.GroupLayout(panelBack);
        panelBack.setLayout(panelBackLayout);
        panelBackLayout.setHorizontalGroup(
            panelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBack, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBackLayout.setVerticalGroup(
            panelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBack, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);

        jLabel7.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Ganti PIN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(Reset)
                            .addGap(43, 43, 43)
                            .addComponent(Submit))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(71, 71, 71)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(FieldCaptcha)
                                        .addGap(18, 18, 18)
                                        .addComponent(panelRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(panelCaptcha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)))
                            .addComponent(jLabel4))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FieldPinBaru, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(FieldPinLama, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(FieldConfirmPin)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(panelBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(FieldPinLama, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FieldPinBaru, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FieldConfirmPin, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(132, Short.MAX_VALUE))
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
        if(!up.uh.active.getPin().equals(FieldPinLama.getText())) {
            //Pin Lama tidak sama dengan yang lama
            JOptionPane.showMessageDialog(null, "Old Pin did not match");
            ResetSubmit();
        } else if(!isNumeric(FieldPinBaru.getText()) || FieldPinBaru.getText().length()!=6) {
            //Pin Baru tidak numerik dan Pin Baru tdk 6 digit
            JOptionPane.showMessageDialog(null, "PIN must 6 digit and character from PIN must number");
            ResetSubmit();
        } else if (!textCaptcha.equals(FieldCaptcha.getText())) {
            //Captcha salah
            JOptionPane.showMessageDialog(null, "Captcha did not match");
            ResetSubmit();
        } else if (!FieldPinBaru.getText().equals(FieldConfirmPin.getText())) {
            //Pin dan confirm salah
            JOptionPane.showMessageDialog(null, "New PIN and Confirm PIN did not match");
            ResetSubmit();
        } else {
            //berhasil
            JOptionPane.showMessageDialog(null, "PIN has changed");
            up.uh.active.setPin(FieldPinBaru.getText());
            ResetSubmit();
            try {
                FileOutputStream file = new FileOutputStream("Account.ser");
                ObjectOutputStream out = new ObjectOutputStream(file);

                out.writeObject(up.uh.Account);

                out.close();
                file.close();

                System.out.println("Object has been serialized");

            }
            catch(IOException ex) {
                System.out.println("IOException is caught");
            }
            
            ArrayList<Log> logAdmin = new ArrayList<>();
            try {
                FileInputStream file = new FileInputStream("logAdmin.ser");
                ObjectInputStream in = new ObjectInputStream(file);

                logAdmin = (ArrayList<Log>) in.readObject();

                in.close();
                file.close();
            }
            catch(IOException ex) {
                System.out.println("IOException is caught");
            }
            catch(ClassNotFoundException ex) {
                System.out.println("ClassNotFoundException is caught");
            }
            //<No>. <Date> <Nama> <Activity>
            String date = up.uh.d1.getD1().getDate() + "/" + up.uh.d1.getD1().getMonth() + "/" + up.uh.d1.getD1().getYear();
            logAdmin.add(0, new Log(date + "-" + up.uh.active.getNoRekening() + " Changed A Pin"));
            System.out.println(date);
            System.out.println(logAdmin.get(0).getLog());
            try {
                FileOutputStream file = new FileOutputStream("logAdmin.ser");
                ObjectOutputStream out = new ObjectOutputStream(file);

                out.writeObject(logAdmin);

                out.close();
                file.close();

                System.out.println("Object has been serialized");

            }
            catch(IOException ex) {
                System.out.println("IOException is caught2");
                System.out.println(ex);
            }
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

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        // TODO add your handling code here:
        up.uh.getContent().removeAll();
        up.uh.getContent().add(up);
        up.uh.getContent().revalidate();
        up.uh.getContent().repaint();
    }//GEN-LAST:event_lblBackMouseClicked

    private void panelBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBackMouseClicked
        // TODO add your handling code here:
        up.uh.getContent().removeAll();
        up.uh.getContent().add(up);
        up.uh.getContent().revalidate();
        up.uh.getContent().repaint();
    }//GEN-LAST:event_panelBackMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FieldCaptcha;
    private javax.swing.JPasswordField FieldConfirmPin;
    private javax.swing.JPasswordField FieldPinBaru;
    private javax.swing.JPasswordField FieldPinLama;
    private javax.swing.JButton Reset;
    private javax.swing.JButton Submit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblIsiCaptcha;
    private javax.swing.JPanel panelBack;
    private javax.swing.JPanel panelCaptcha;
    private javax.swing.JPanel panelRefresh;
    // End of variables declaration//GEN-END:variables
}
