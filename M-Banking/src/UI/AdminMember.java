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
import java.awt.Font;
import java.awt.Insets;
import java.awt.Rectangle;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneLayout;

/**
 *
 * @author LINGGO
 */
public class AdminMember extends javax.swing.JPanel {

    /**
     * Creates new form AdminDashboard
     */
    int total = 0;
    ArrayList<panelMember_Admin> paAdmin = new ArrayList<>();
    public AdminMember() {
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

        content = new javax.swing.JPanel();
        tes = new javax.swing.JScrollPane();
        a = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        content.setBackground(new java.awt.Color(55, 53, 61));

        tes.setBackground(new java.awt.Color(55, 53, 61));
        tes.setBorder(null);
        tes.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        tes.setRequestFocusEnabled(false);
        tes.setLayout(new ScrollPaneLayout() {
            @Override
            public void layoutContainer(Container parent) {
                JScrollPane scrollPane = (JScrollPane) parent;

                Rectangle availR = scrollPane.getBounds();
                availR.x = availR.y = 0;

                Insets parentInsets = parent.getInsets();
                availR.x = parentInsets.left;
                availR.y = parentInsets.top;
                availR.width -= parentInsets.left + parentInsets.right;
                availR.height -= parentInsets.top + parentInsets.bottom;

                Rectangle vsbR = new Rectangle();
                vsbR.width = 12;
                vsbR.height = availR.height;
                vsbR.x = availR.x + availR.width - vsbR.width;
                vsbR.y = availR.y;

                if (viewport != null) {
                    viewport.setBounds(availR);
                }
                if (vsb != null) {
                    vsb.setVisible(true);
                    vsb.setBounds(vsbR);
                }
            }
        });
        tes.getVerticalScrollBar().setUI(new MyScrollBarUI());

        a.setBackground(new java.awt.Color(55, 53, 61));
        a.setPreferredSize(new java.awt.Dimension(387, 390));

        javax.swing.GroupLayout aLayout = new javax.swing.GroupLayout(a);
        a.setLayout(aLayout);
        aLayout.setHorizontalGroup(
            aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 407, Short.MAX_VALUE)
        );
        aLayout.setVerticalGroup(
            aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        tes.setViewportView(a);

        jButton1.setText("add");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jButton1))
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(tes, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(tes, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jButton1)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        
        a.removeAll();
        total++;
        if ((182+10)*total >= 400) {
            a.setPreferredSize(new Dimension(387, 182*total));
        }
        for (int i = 0; i < total; i++) {
            System.out.println(i);
            paAdmin.add(new panelMember_Admin());
            paAdmin.get(i).setBounds(0, 182*i, 390,182);
            paAdmin.get(i).setVisible(true);
            a.add(paAdmin.get(i));
        }
        a.revalidate();
        a.repaint();
    }//GEN-LAST:event_jButton1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel a;
    private javax.swing.JPanel content;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane tes;
    // End of variables declaration//GEN-END:variables
}
