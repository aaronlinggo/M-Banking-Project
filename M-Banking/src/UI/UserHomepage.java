/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import RoundedField.RoundJPanel;
import java.awt.Color;
import javax.accessibility.AccessibleContext;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import m.banking.Member;

/**
 *
 * @author LINGGO
 */
public class UserHomepage extends javax.swing.JFrame {

    /**
     * Creates new form AdminHomepage
     */
    Member active;
    public UserHomepage(Member active) {
        this.active = active;
        initComponents();
        this.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        content.removeAll();
        UserMainmenu uh = new UserMainmenu(this);
        uh.passUserHomepage(this);
        uh.getUser(this);
        uh.setVisible(true);
        uh.setBounds(0,0, 500, 750);
        content.add(uh);
        content.revalidate();
        content.repaint();
    }
    
    public UserHomepage() {
        initComponents();
        this.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        content.removeAll();
        UserMainmenu uh = new UserMainmenu(this);
        uh.passUserHomepage(this);
        uh.getUser(this);
        uh.setVisible(true);
        uh.setBounds(0,0, 500, 750);
        content.add(uh);
        content.revalidate();
        content.repaint();
    }
    public void passmember(Member active){
        this.active = active;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new RoundJPanel(135);
        jPanel1 = new RoundJPanel(140);
        notch = new javax.swing.JLabel();
        content = new RoundJPanel(75);
        navbar_dashboard = new RoundJPanel(95, new java.awt.Color(80,76,92));
        home = new javax.swing.JLabel();
        transfer = new javax.swing.JLabel();
        profile = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setOpaque(false);

        jPanel1.setBackground(new java.awt.Color(55, 53, 61));
        jPanel1.setOpaque(false);

        notch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/m/banking/Asset/notch.png"))); // NOI18N

        content.setBackground(new java.awt.Color(55, 53, 61));
        content.setOpaque(false);

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );

        navbar_dashboard.setBackground(new java.awt.Color(80, 76, 92));
        navbar_dashboard.setOpaque(false);

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/m/banking/Asset/home_nav_biru.png"))); // NOI18N
        home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });

        transfer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/m/banking/Asset/trans_nav_putih.png"))); // NOI18N
        transfer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        transfer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transferMouseClicked(evt);
            }
        });

        profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/m/banking/Asset/profile_nav_putih.png"))); // NOI18N
        profile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout navbar_dashboardLayout = new javax.swing.GroupLayout(navbar_dashboard);
        navbar_dashboard.setLayout(navbar_dashboardLayout);
        navbar_dashboardLayout.setHorizontalGroup(
            navbar_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbar_dashboardLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(home)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(transfer)
                .addGap(104, 104, 104)
                .addComponent(profile)
                .addGap(87, 87, 87))
        );
        navbar_dashboardLayout.setVerticalGroup(
            navbar_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbar_dashboardLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(navbar_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(profile, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transfer, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(notch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(navbar_dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(notch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(navbar_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void transferMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transferMouseClicked
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/m/banking/Asset/home_nav_putih.png")));
        transfer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/m/banking/Asset/trans_nav_biru.png")));
        profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/m/banking/Asset/profile_nav_putih.png")));
        content.removeAll();
        UserTransfer uh = new UserTransfer();
        uh.getUser(this);
        uh.setVisible(true);
        uh.setBounds(0,0, 500, 750);
        content.add(uh);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_transferMouseClicked

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/m/banking/Asset/home_nav_biru.png")));
        transfer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/m/banking/Asset/trans_nav_putih.png")));
        profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/m/banking/Asset/profile_nav_putih.png")));
        content.removeAll();
        UserMainmenu uh = new UserMainmenu(this);
        uh.passUserHomepage(this);
        uh.getUser(this);
        uh.setVisible(true);
        uh.setBounds(0,0, 500, 750);
        content.add(uh);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_homeMouseClicked

    private void profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseClicked
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/m/banking/Asset/home_nav_putih.png")));
        transfer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/m/banking/Asset/trans_nav_putih.png")));
        profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/m/banking/Asset/profile_nav_biru.png")));
        content.removeAll();
        UserProfile uh = new UserProfile();
        uh.passData(this);
        uh.setVisible(true);
        uh.setBounds(0,0, 500, 750);
        content.add(uh);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_profileMouseClicked

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
            java.util.logging.Logger.getLogger(UserHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserHomepage().setVisible(true);
            }
        });
    }

    public JPanel getContent() {
        return content;
    }

    public void setContent(JPanel content) {
        this.content = content;
    }

    public JLabel getHome() {
        return home;
    }

    public void setHome(JLabel home) {
        this.home = home;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getNavbar_dashboard() {
        return navbar_dashboard;
    }

    public void setNavbar_dashboard(JPanel navbar_dashboard) {
        this.navbar_dashboard = navbar_dashboard;
    }

    public JLabel getNotch() {
        return notch;
    }

    public void setNotch(JLabel notch) {
        this.notch = notch;
    }

    public JLabel getProfile() {
        return profile;
    }

    public void setProfile(JLabel profile) {
        this.profile = profile;
    }

    public JLabel getTransfer() {
        return transfer;
    }

    public void setTransfer(JLabel transfer) {
        this.transfer = transfer;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel content;
    private javax.swing.JLabel home;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel navbar_dashboard;
    private javax.swing.JLabel notch;
    private javax.swing.JLabel profile;
    private javax.swing.JLabel transfer;
    // End of variables declaration//GEN-END:variables
}
