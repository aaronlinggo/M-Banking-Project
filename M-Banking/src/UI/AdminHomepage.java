/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Image.ImagePanel;
import RoundedField.RoundJPanel;
import java.awt.Color;
import javax.swing.JPanel;
import m.banking.Login.Login;

/**
 *
 * @author LINGGO
 */
public class AdminHomepage extends javax.swing.JFrame {

    /**
     * Creates new form AdminHomepage
     */
    int mousepX;
    int mousepY;
    Login l;
    public AdminHomepage() {
        initComponents();
        this.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        member.setIcon(new javax.swing.ImageIcon(getClass().getResource("/m/banking/Asset/member_white.png")));
        dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/m/banking/Asset/dashboard_teal.png")));
        gift.setIcon(new javax.swing.ImageIcon(getClass().getResource("/m/banking/Asset/gift_white.png")));
        content.removeAll();
        AdminDashboard ad = new AdminDashboard();
        ad.getAdmin(this);
        ad.setVisible(true);
        ad.setBounds(0,0, 500, 717);
        content.add(ad);
        content.revalidate();
        content.repaint();
    }
    
    public void passData(Login l){
        this.l = l;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frame = new RoundJPanel(140);
        jPanel3 = new RoundJPanel(140);
        background = new RoundJPanel(140);
        content = new javax.swing.JPanel();
        notch = new javax.swing.JLabel();
        member = new javax.swing.JLabel();
        gift = new javax.swing.JLabel();
        dashboard = new javax.swing.JLabel();

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

        frame.setBackground(new java.awt.Color(0, 0, 0));
        frame.setOpaque(false);

        jPanel3.setBackground(new java.awt.Color(73, 79, 88));
        jPanel3.setOpaque(false);

        background.setBackground(new java.awt.Color(250, 243, 243));
        background.setOpaque(false);

        content.setBackground(new java.awt.Color(250, 243, 243));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 717, Short.MAX_VALUE)
        );

        notch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        notch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/m/banking/Asset/notch.png"))); // NOI18N

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(notch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(notch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        member.setIcon(new javax.swing.ImageIcon(getClass().getResource("/m/banking/Asset/member_white.png"))); // NOI18N
        member.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        member.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                memberMouseClicked(evt);
            }
        });

        gift.setIcon(new javax.swing.ImageIcon(getClass().getResource("/m/banking/Asset/gift_white.png"))); // NOI18N
        gift.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gift.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                giftMouseClicked(evt);
            }
        });

        dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/m/banking/Asset/dashboard_teal.png"))); // NOI18N
        dashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(dashboard)
                .addGap(119, 119, 119)
                .addComponent(member)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gift)
                .addGap(70, 70, 70))
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(member, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gift, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout frameLayout = new javax.swing.GroupLayout(frame);
        frame.setLayout(frameLayout);
        frameLayout.setHorizontalGroup(
            frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        frameLayout.setVerticalGroup(
            frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(frame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(frame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void memberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_memberMouseClicked
        member.setIcon(new javax.swing.ImageIcon(getClass().getResource("/m/banking/Asset/member_teal.png")));
        dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/m/banking/Asset/dashboard_white.png")));
        gift.setIcon(new javax.swing.ImageIcon(getClass().getResource("/m/banking/Asset/gift_white.png")));
        content.removeAll();
        AdminMember am = new AdminMember();
        am.setVisible(true);
        am.setBounds(0,0, 500, 717);
        content.add(am);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_memberMouseClicked

    private void dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseClicked
        member.setIcon(new javax.swing.ImageIcon(getClass().getResource("/m/banking/Asset/member_white.png")));
        dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/m/banking/Asset/dashboard_teal.png")));
        gift.setIcon(new javax.swing.ImageIcon(getClass().getResource("/m/banking/Asset/gift_white.png")));
        content.removeAll();
        AdminDashboard ad = new AdminDashboard();
        ad.getAdmin(this);
        ad.passData(l);
        ad.setVisible(true);
        ad.setBounds(0,0, 500, 717);
        content.add(ad);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_dashboardMouseClicked

    private void giftMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_giftMouseClicked
        member.setIcon(new javax.swing.ImageIcon(getClass().getResource("/m/banking/Asset/member_white.png")));
        dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/m/banking/Asset/dashboard_white.png")));
        gift.setIcon(new javax.swing.ImageIcon(getClass().getResource("/m/banking/Asset/gift_teal.png")));
        content.removeAll();
        AdminGift ag = new AdminGift();
        ag.setVisible(true);
        ag.setBounds(0,0, 500, 717);
        content.add(ag);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_giftMouseClicked

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
            java.util.logging.Logger.getLogger(AdminHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHomepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel content;
    private javax.swing.JLabel dashboard;
    private javax.swing.JPanel frame;
    private javax.swing.JLabel gift;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel member;
    private javax.swing.JLabel notch;
    // End of variables declaration//GEN-END:variables

    public JPanel getContent() {
        return content;
    }

    public void setContent(JPanel content) {
        this.content = content;
    }
    
}
