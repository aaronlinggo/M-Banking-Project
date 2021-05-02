
package m.banking.Login;

import Image.ImagePanel;
import RoundedField.RoundJPanel;
import RoundedField.RoundJPasswordField;
import RoundedField.RoundJTextField;
import java.awt.Color;
import java.awt.Insets;
import javax.swing.JFrame;


public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new ImagePanel();
        logo = new javax.swing.JLabel();
        labelIDRekening = new javax.swing.JLabel();
        norek = new RoundJTextField(25);
        labelPin = new javax.swing.JLabel();
        pin = new RoundJPasswordField(25);
        jPLogin = new RoundJPanel(25, new Color(4, 0, 154));
        loginBtn = new javax.swing.JLabel();
        jPLogin1 = new RoundJPanel(25, new Color(4, 0, 154));
        loginBtn1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/m/banking/Asset/logo_bank1.png"))); // NOI18N

        labelIDRekening.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N
        labelIDRekening.setForeground(new java.awt.Color(0, 0, 0));
        labelIDRekening.setText("Nomor Rekening");

        norek.setMargin(new Insets(10, 10, 10, 10));
        norek.setBackground(new java.awt.Color(204, 204, 204));
        norek.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        norek.setForeground(new java.awt.Color(102, 102, 102));
        norek.setText("Input here");
        norek.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        norek.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                norekFocusGained(evt);
            }
        });

        labelPin.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N
        labelPin.setForeground(new java.awt.Color(0, 0, 0));
        labelPin.setText("Pin");

        pin.setBackground(new java.awt.Color(204, 204, 204));
        pin.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        pin.setForeground(new java.awt.Color(51, 51, 51));
        pin.setText("pin123");
        pin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pinFocusGained(evt);
            }
        });

        jPLogin.setBackground(new java.awt.Color(4, 0, 154));
        jPLogin.setOpaque(false);

        loginBtn.setFont(new java.awt.Font("Microsoft YaHei", 1, 30)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("                  Log in");
        loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPLoginLayout = new javax.swing.GroupLayout(jPLogin);
        jPLogin.setLayout(jPLoginLayout);
        jPLoginLayout.setHorizontalGroup(
            jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPLoginLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(loginBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPLoginLayout.setVerticalGroup(
            jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 71, Short.MAX_VALUE)
            .addGroup(jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(loginBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
        );

        jPLogin1.setBackground(new java.awt.Color(4, 0, 154));
        jPLogin1.setOpaque(false);

        loginBtn1.setFont(new java.awt.Font("Microsoft YaHei", 1, 30)); // NOI18N
        loginBtn1.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn1.setText("       Buat Rekening Baru");
        loginBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPLogin1Layout = new javax.swing.GroupLayout(jPLogin1);
        jPLogin1.setLayout(jPLogin1Layout);
        jPLogin1Layout.setHorizontalGroup(
            jPLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPLogin1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPLogin1Layout.setVerticalGroup(
            jPLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPLogin1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        jLabel2.setText("Selamat datang di Bank Jago Mobile");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelPin, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelIDRekening, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(norek, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                        .addComponent(pin)
                        .addComponent(jPLogin1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(81, 81, 81))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelIDRekening)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(norek, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelPin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void norekFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_norekFocusGained
        // TODO add your handling code here:
        norek.setText("");
    }//GEN-LAST:event_norekFocusGained

    private void pinFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pinFocusGained
        // TODO add your handling code here:
        pin.setText("");
    }//GEN-LAST:event_pinFocusGained

    private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_loginBtnMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPLogin;
    private javax.swing.JPanel jPLogin1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelIDRekening;
    private javax.swing.JLabel labelPin;
    private javax.swing.JLabel loginBtn;
    private javax.swing.JLabel loginBtn1;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField norek;
    private javax.swing.JPasswordField pin;
    // End of variables declaration//GEN-END:variables
}
