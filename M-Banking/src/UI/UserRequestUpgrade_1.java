/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import RoundedField.RoundJPanel;
import ScrollBar.MyScrollBarUI;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JViewport;
import javax.swing.ScrollPaneLayout;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import m.banking.Member;

/**
 *
 * @author acxel
 */
public class UserRequestUpgrade_1 extends javax.swing.JPanel {

    UserProfile up;
    
    /**
     * Creates new form UserProfileTagihan
     */
    public UserRequestUpgrade_1(UserProfile up) {
        this.up = up;
        initComponents();
    }
    
    public void passData(UserProfile up) {
        this.up = up;
    }
    
    public String priceWithoutDecimal (Double price) {
        DecimalFormat formatter = new DecimalFormat("###,###,###.##");
        return formatter.format(price);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Upgrade = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        backPanel = new RoundJPanel(25);
        back = new javax.swing.JLabel();
        jPanel2 = new RoundJPanel(25);
        title = new javax.swing.JLabel();
        content = new RoundJPanel(35);
        bgTitle = new RoundJPanel(35);
        titlebar = new javax.swing.JLabel();
        goldBtn = new javax.swing.JRadioButton();
        platinumBtn = new javax.swing.JRadioButton();
        image = new javax.swing.JLabel();
        Reset = new RoundJPanel(25);
        jLabel1 = new javax.swing.JLabel();
        OK = new RoundJPanel(25);
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(250, 243, 243));

        backPanel.setBackground(new java.awt.Color(255, 255, 255));
        backPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backPanel.setOpaque(false);
        backPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backPanelMouseClicked(evt);
            }
        });

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/m/banking/Asset/Back.png"))); // NOI18N

        javax.swing.GroupLayout backPanelLayout = new javax.swing.GroupLayout(backPanel);
        backPanel.setLayout(backPanelLayout);
        backPanelLayout.setHorizontalGroup(
            backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back)
                .addContainerGap())
        );
        backPanelLayout.setVerticalGroup(
            backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);

        title.setBackground(new java.awt.Color(0, 0, 0));
        title.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 0));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Upgrade Member");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        content.setBackground(new java.awt.Color(219, 219, 229));
        content.setOpaque(false);

        bgTitle.setBackground(new java.awt.Color(103, 91, 232));
        bgTitle.setOpaque(false);

        titlebar.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        titlebar.setForeground(new java.awt.Color(0, 0, 0));
        titlebar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titlebar.setText("Choose a Card you want to Upgrade");

        javax.swing.GroupLayout bgTitleLayout = new javax.swing.GroupLayout(bgTitle);
        bgTitle.setLayout(bgTitleLayout);
        bgTitleLayout.setHorizontalGroup(
            bgTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bgTitleLayout.setVerticalGroup(
            bgTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgTitleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titlebar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        goldBtn.setBackground(new java.awt.Color(219, 219, 229));
        Upgrade.add(goldBtn);
        goldBtn.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        goldBtn.setForeground(new java.awt.Color(0, 0, 0));
        goldBtn.setText("Gold");
        goldBtn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/m/banking/Asset/gold.png"))); // NOI18N
        goldBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goldBtnActionPerformed(evt);
            }
        });

        platinumBtn.setBackground(new java.awt.Color(219, 219, 229));
        Upgrade.add(platinumBtn);
        platinumBtn.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        platinumBtn.setForeground(new java.awt.Color(0, 0, 0));
        platinumBtn.setText("Platinum");
        platinumBtn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/m/banking/Asset/gold.png"))); // NOI18N
        platinumBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                platinumBtnActionPerformed(evt);
            }
        });

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/m/banking/Asset/silver.png"))); // NOI18N

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bgTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(goldBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(platinumBtn)
                .addGap(66, 66, 66))
            .addGroup(contentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bgTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goldBtn)
                    .addComponent(platinumBtn))
                .addGap(18, 18, 18)
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        Reset.setBackground(new java.awt.Color(255, 51, 102));
        Reset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Reset.setOpaque(false);
        Reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reset");

        javax.swing.GroupLayout ResetLayout = new javax.swing.GroupLayout(Reset);
        Reset.setLayout(ResetLayout);
        ResetLayout.setHorizontalGroup(
            ResetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addContainerGap())
        );
        ResetLayout.setVerticalGroup(
            ResetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        OK.setBackground(new java.awt.Color(51, 255, 51));
        OK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        OK.setOpaque(false);
        OK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OKMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("OK");

        javax.swing.GroupLayout OKLayout = new javax.swing.GroupLayout(OK);
        OK.setLayout(OKLayout);
        OKLayout.setHorizontalGroup(
            OKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OKLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        OKLayout.setVerticalGroup(
            OKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OKLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(backPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(OK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(backPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(156, Short.MAX_VALUE))
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

    private void backPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backPanelMouseClicked
        // TODO add your handling code here:
        up.uh.getContent().removeAll();
        up.uh.getContent().add(up);
        up.uh.getContent().revalidate();
        up.uh.getContent().repaint();
    }//GEN-LAST:event_backPanelMouseClicked

    private void goldBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goldBtnActionPerformed
        // TODO add your handling code here:
        image.setIcon(new ImageIcon("src/m/banking/Asset/gold.png"));
    }//GEN-LAST:event_goldBtnActionPerformed

    private void platinumBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_platinumBtnActionPerformed
        // TODO add your handling code here:
        image.setIcon(new ImageIcon("src/m/banking/Asset/platinum.png"));
    }//GEN-LAST:event_platinumBtnActionPerformed

    private void ResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetMouseClicked
        // TODO add your handling code here:
        goldBtn.setSelected(false);
        platinumBtn.setSelected(false);
        Upgrade.clearSelection();
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/m/banking/Asset/silver.png")));
    }//GEN-LAST:event_ResetMouseClicked

    private void OKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OKMouseClicked
        // TODO add your handling code here:
        if (goldBtn.isSelected() && !platinumBtn.isSelected()){
            up.uh.active.setCekUpgrade(true);
            up.uh.active.setUpgrade(1);
            JOptionPane.showMessageDialog(this, "Your request upgrade sent to Admin.. Waiting Confirm from Admin");
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
            requestUpgrade.add(up.uh.active);
            
            try {
                FileOutputStream file = new FileOutputStream("requestUpgrade.ser");
                ObjectOutputStream out = new ObjectOutputStream(file);

                out.writeObject(requestUpgrade);

                out.close();
                file.close();

                System.out.println("Object has been serialized");

            }
            catch(IOException ex) {
                System.out.println("IOException is caught");
            }
            up.uh.getContent().removeAll();
            up.uh.getContent().add(up);
            up.uh.getContent().revalidate();
            up.uh.getContent().repaint();
        }
        else if (!goldBtn.isSelected() && platinumBtn.isSelected()){
            up.uh.active.setCekUpgrade(true);
            up.uh.active.setUpgrade(2);
            JOptionPane.showMessageDialog(this, "Your request upgrade sent to Admin.. Waiting Confirm from Admin");
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
            requestUpgrade.add(up.uh.active);
            
            try {
                FileOutputStream file = new FileOutputStream("requestUpgrade.ser");
                ObjectOutputStream out = new ObjectOutputStream(file);

                out.writeObject(requestUpgrade);

                out.close();
                file.close();

                System.out.println("Object has been serialized");

            }
            catch(IOException ex) {
                System.out.println("IOException is caught");
            }
            up.uh.getContent().removeAll();
            up.uh.getContent().add(up);
            up.uh.getContent().revalidate();
            up.uh.getContent().repaint();
        }
        else if (!goldBtn.isSelected() && !platinumBtn.isSelected()){
            JOptionPane.showMessageDialog(this, "Choose a card pls");
        }
    }//GEN-LAST:event_OKMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel OK;
    private javax.swing.JPanel Reset;
    private javax.swing.ButtonGroup Upgrade;
    private javax.swing.JLabel back;
    private javax.swing.JPanel backPanel;
    private javax.swing.JPanel bgTitle;
    private javax.swing.JPanel content;
    private javax.swing.JRadioButton goldBtn;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton platinumBtn;
    private javax.swing.JLabel title;
    private javax.swing.JLabel titlebar;
    // End of variables declaration//GEN-END:variables
}
