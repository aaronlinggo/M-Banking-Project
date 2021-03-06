
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
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import m.banking.DateBankRut;
import m.banking.Dollar;
import m.banking.Euro;
import m.banking.Kurs;
import m.banking.MBanking;
import m.banking.Member;


public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    int mousepX;
    int mousepY;
    public ArrayList<Member> requestMember = new ArrayList<Member>();
    public ArrayList<Member> Account = new ArrayList<Member>();
    //Date d2 = new Date(2021, 1, 1);
    //int dollar = 14230;
    //int euro = 15618;
    public DateBankRut d1 = null;
    String noRek = "";
    public Login() {
        
        String filename = "date.ser";

//        try
//        {
//            FileOutputStream file = new FileOutputStream(filename);
//            ObjectOutputStream out = new ObjectOutputStream(file);
//
//            out.writeObject(d1);
//
//            out.close();
//            file.close();
//
//            System.out.println("Object has been serialized");
//
//        }
//
//        catch(IOException ex)
//        {
//            System.out.println("IOException is caught");
//        }

        ArrayList<Kurs> listKurs = new ArrayList<Kurs>();
//        //listKurs.add(new Dollar(dollar));
//        //listKurs.add(new Euro(euro));
//        try
//        {
//            FileOutputStream file = new FileOutputStream("Kurs.ser");
//            ObjectOutputStream out = new ObjectOutputStream(file);
//
//            out.writeObject(listKurs);
//
//            out.close();
//            file.close();
//
//            System.out.println("Object has been serialized");
//
//        }
//
//        catch(IOException ex)
//        {
//            System.out.println("IOException is caught");
//        }

        try {
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            d1 = (DateBankRut) in.readObject();

            in.close();
            file.close();
        }
        catch(IOException ex) {
            System.out.println("IOException is caught");
        }
        catch(ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }
        
        try {
            FileInputStream file = new FileInputStream("requestMember.ser");
            ObjectInputStream in = new ObjectInputStream(file);

            requestMember = (ArrayList<Member>) in.readObject();

            in.close();
            file.close();
        }
        catch(IOException ex) {
            System.out.println(ex);
            System.out.println("IOException is caught");
        }
        catch(ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }
        
        try {
            FileInputStream file = new FileInputStream("Account.ser");
            ObjectInputStream in = new ObjectInputStream(file);

            Account = (ArrayList<Member>) in.readObject();

            in.close();
            file.close();
        }
        catch(IOException ex) {
            System.out.println(ex);
            System.out.println("IOException is caught");
        }
        catch(ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }
        
        ArrayList<Member> requestUpgrade = new ArrayList<>();
        try {
            FileInputStream file = new FileInputStream("requestUpgrade.ser");
            ObjectInputStream in = new ObjectInputStream(file);

            requestUpgrade = (ArrayList<Member>) in.readObject();

            in.close();
            file.close();
        }
        catch(IOException ex) {
            System.out.println("IOException is caught");
        }
        catch(ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }
      
        
        try {
            FileInputStream file = new FileInputStream("Kurs.ser");
            ObjectInputStream in = new ObjectInputStream(file);

            listKurs = (ArrayList<Kurs>) in.readObject();

            in.close();
            file.close();
        }
        catch(IOException ex) {
            System.out.println("IOException is caught");
        }
        catch(ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }
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

        jPanel2 = new RoundJPanel(150);
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
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setOpaque(false);

        jPanel1 = new ImagePanel("src/m/banking/Asset/image.png");
        jPanel1.setOpaque(false);

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
        pin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinActionPerformed(evt);
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
            .addGap(0, 424, Short.MAX_VALUE)
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
        rekBaruBtn.setText("      Create New Account");
        rekBaruBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rekBaruBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rekBaruBtnMouseClicked(evt);
            }
        });

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
                .addComponent(rekBaruBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addContainerGap())
        );

        footer.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        footer.setText("    Selamat datang di Bank Rut Mobile");

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
                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(footer, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 911, Short.MAX_VALUE))
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
    Member active = null;
    private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseClicked
        if (norek.getText().equals("admin") && new String(pin.getPassword()).equals("admin")) {
            this.setVisible(false);
            AdminHomepage Admin = new AdminHomepage();
            Admin.passData(this);
            Admin.setVisible(true);
            JOptionPane.showMessageDialog(this, "Success Login");
        }
        else if (!norek.getText().equals("") && !new String(pin.getPassword()).equals("")) {
            for(Member acc : Account){
                String norekA = String.valueOf(acc.getNoRekening());
                String pinA = acc.getPin();
                if(norek.getText().equals(norekA) && new String(pin.getPassword()).equals(pinA) ){
                    active = acc;
                }
            }
            if(active!=null){
                this.setVisible(false);
                UserHomepage user = new UserHomepage(active, d1, Account);
                user.passmember(active);
                user.passDateBankrut(d1);
                user.setVisible(true);
                JOptionPane.showMessageDialog(this, "Success Login");
            }
            else{
                JOptionPane.showMessageDialog(this, "gagal Login");
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "gagal Login");
        }
    }//GEN-LAST:event_loginBtnMouseClicked

    private void pinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        int koordinatX = evt.getXOnScreen();
        int koordinatY = evt.getYOnScreen();
        
        this.setLocation(koordinatX-mousepX, koordinatY-mousepY);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        mousepX = evt.getX();
        mousepY = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void rekBaruBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rekBaruBtnMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        int noRek1 = new Random().nextInt(99999999);
        int noRek2 = new Random().nextInt(99999999);
        do{
            if (noRek1 >= 10000000 && noRek2 >= 10000000){
                noRek = String.valueOf(noRek1) + String.valueOf(noRek2);
                boolean cek = false;
                for (int i = 0; i < requestMember.size(); i++){
                    if (noRek.equals(requestMember.get(i).getNoRekening())){
                        cek = true;
                        break;
                    }
                }
                if (!cek){
                    for (int i = 0; i < Account.size(); i++){
                        if (noRek.equals(Account.get(i).getNoRekening())){
                            cek = true;
                            break;
                        }
                    }
                }
                if (!cek){
                    break;
                }
                else {
                    noRek1 = new Random().nextInt(99999999);
                    noRek2 = new Random().nextInt(99999999);
                }
            }
            else {
                noRek1 = new Random().nextInt(99999999);
                noRek2 = new Random().nextInt(99999999);
            }
        }
        while(true);
        newAccount nA = new newAccount(this);
        nA.setVisible(true);
    }//GEN-LAST:event_rekBaruBtnMouseClicked

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
    private javax.swing.JPanel jPanel2;
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
