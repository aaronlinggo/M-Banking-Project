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
 * @author LINGGO
 */
public class CardBill extends javax.swing.JPanel {

    /**
     * Creates new form CardBill
     */
    public CardBill() {
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

        border = new RoundJPanel(25);
        detail = new RoundJPanel(25);
        info = new javax.swing.JLabel();

        border.setBackground(new java.awt.Color(0, 0, 0));
        border.setOpaque(false);

        detail.setBackground(new java.awt.Color(250, 243, 243));
        detail.setOpaque(false);
        detail.setRequestFocusEnabled(false);

        info.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        info.setForeground(new java.awt.Color(0, 0, 0));
        info.setText("<No VA> - Harga");

        javax.swing.GroupLayout detailLayout = new javax.swing.GroupLayout(detail);
        detail.setLayout(detailLayout);
        detailLayout.setHorizontalGroup(
            detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(info, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                .addContainerGap())
        );
        detailLayout.setVerticalGroup(
            detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(info, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout borderLayout = new javax.swing.GroupLayout(border);
        border.setLayout(borderLayout);
        borderLayout.setHorizontalGroup(
            borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(detail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );
        borderLayout.setVerticalGroup(
            borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(detail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(border, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(border, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public void setInfo(String txt){
        this.info.setText(txt);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel border;
    private javax.swing.JPanel detail;
    private javax.swing.JLabel info;
    // End of variables declaration//GEN-END:variables
}