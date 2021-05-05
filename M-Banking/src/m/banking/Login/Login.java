
package m.banking.Login;

import Image.ImagePanel;
import RoundedField.RoundJPanel;
import RoundedField.RoundJPasswordField;
import RoundedField.RoundJTextField;
import UI.AdminHomepage;
import UI.UserHomepage;
import java.awt.Color;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new RoundJPanel(75);
        logo = new javax.swing.JLabel();
        labelIDRekening = new javax.swing.JLabel();
        norek = new RoundJTextField(25);
        labelPin = new javax.swing.JLabel();
        pin = new RoundJPasswordField(25);
        jPLogin = new RoundJPanel(25, new Color(4, 0, 154));
        loginBtn = new javax.swing.JLabel();
        jPRekBaru = new RoundJPanel(25, new Color(4, 0, 154));
        rekBaruBtn = new javax.swing.JLabel();
        footer = new javax.swing.JLabel();
        notch = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1 = new ImagePanel("src/m/banking/Asset/image.png");
        jPanel1.setOpaque(false);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/m/banking/Asset/logo_bank1.png"))); // NOI18N

        labelIDRekening.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N
        labelIDRekening.setForeground(new java.awt.Color(255, 255, 255));
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
        labelPin.setForeground(new java.awt.Color(255, 255, 255));
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
            .addGap(0, 65, Short.MAX_VALUE)
            .addGroup(jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(loginBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
        );

        jPRekBaru.setBackground(new java.awt.Color(4, 0, 154));
        jPRekBaru.setOpaque(false);

        rekBaruBtn.setFont(new java.awt.Font("Microsoft YaHei", 1, 30)); // NOI18N
        rekBaruBtn.setForeground(new java.awt.Color(255, 255, 255));
        rekBaruBtn.setText("       Buat Rekening Baru");
        rekBaruBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPRekBaruLayout = new javax.swing.GroupLayout(jPRekBaru);
        jPRekBaru.setLayout(jPRekBaruLayout);
        jPRekBaruLayout.setHorizontalGroup(
            jPRekBaruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPRekBaruLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rekBaruBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPRekBaruLayout.setVerticalGroup(
            jPRekBaruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRekBaruLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rekBaruBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addContainerGap())
        );

        footer.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        footer.setText("    Selamat datang di Bank Jago Mobile");

        notch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/m/banking/Asset/notch.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelPin, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelIDRekening, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(norek, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPRekBaru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pin))
                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
            .addComponent(footer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(notch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(notch)
                .addGap(36, 36, 36)
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
                .addGap(18, 18, 18)
                .addComponent(jPRekBaru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(footer, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
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
        System.out.println(norek.getText());
        System.out.println(pin.getPassword());
        
        if (norek.getText().equals("admin") && new String(pin.getPassword()).equals("admin")) {
            this.setVisible(false);
            AdminHomepage Admin = new AdminHomepage();
            Admin.setVisible(true);
            JOptionPane.showMessageDialog(this, "Success Login");
        }
        else if (norek.getText().equals("tes") && new String(pin.getPassword()).equals("tes")) {
            this.setVisible(false);
            UserHomepage user = new UserHomepage();
            user.setVisible(true);
            JOptionPane.showMessageDialog(this, "Success Login");
        }
        else{
            JOptionPane.showMessageDialog(this, "gagal Login");
        }
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
    private javax.swing.JLabel footer;
    private javax.swing.JPanel jPLogin;
    private javax.swing.JPanel jPRekBaru;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelIDRekening;
    private javax.swing.JLabel labelPin;
    private javax.swing.JLabel loginBtn;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField norek;
    private javax.swing.JLabel notch;
    private javax.swing.JPasswordField pin;
    private javax.swing.JLabel rekBaruBtn;
    // End of variables declaration//GEN-END:variables
}
