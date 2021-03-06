/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import RoundedField.RoundJPanel;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author jonat
 */
public class UserInfoSaldo extends javax.swing.JPanel
{

    /**
     * Creates new form UserMInfo
     */
    UserMInfo umi;
    public UserInfoSaldo(UserMInfo umi)
    {
        initComponents();
        this.newRupiah.setText(priceWithoutDecimal(umi.umm.uh.active.getRupiah()));
        this.newEuro.setText(priceWithoutDecimal(umi.umm.uh.active.getEuro()));
        this.newUSD.setText(priceWithoutDecimal(umi.umm.uh.active.getUsd()));
    }
    
    public void passUserMInfo(UserMInfo umi)
    {
        this.umi = umi ;
    }
    
    public String priceWithoutDecimal (Double price) 
    {
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
    private void initComponents()
    {

        Back = new RoundJPanel(25);
        jLabel1 = new javax.swing.JLabel();
        Judul = new RoundJPanel(25);
        jLabel2 = new javax.swing.JLabel();
        IDR = new RoundJPanel(25);
        BalRupiah = new javax.swing.JLabel();
        jPanel3 = new RoundJPanel(25);
        newRupiah = new javax.swing.JLabel();
        Euro = new RoundJPanel(25);
        BalEuro = new javax.swing.JLabel();
        jPanel2 = new RoundJPanel(25);
        newEuro = new javax.swing.JLabel();
        USD = new RoundJPanel(25);
        BalUSD = new javax.swing.JLabel();
        jPanel1 = new RoundJPanel(25);
        newUSD = new javax.swing.JLabel();

        setBackground(new java.awt.Color(250, 243, 243));

        Back.setBackground(new java.awt.Color(255, 255, 255));
        Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back.setOpaque(false);
        Back.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                BackMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/m/banking/Asset/Back.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BackLayout = new javax.swing.GroupLayout(Back);
        Back.setLayout(BackLayout);
        BackLayout.setHorizontalGroup(
            BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BackLayout.setVerticalGroup(
            BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Judul.setBackground(new java.awt.Color(255, 255, 255));
        Judul.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Info Saldo");

        javax.swing.GroupLayout JudulLayout = new javax.swing.GroupLayout(Judul);
        Judul.setLayout(JudulLayout);
        JudulLayout.setHorizontalGroup(
            JudulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JudulLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        JudulLayout.setVerticalGroup(
            JudulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JudulLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        IDR.setBackground(new java.awt.Color(87, 202, 247));
        IDR.setOpaque(false);

        BalRupiah.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        BalRupiah.setForeground(new java.awt.Color(0, 0, 0));
        BalRupiah.setText("Balance Rupiah :");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setOpaque(false);

        newRupiah.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        newRupiah.setForeground(new java.awt.Color(0, 0, 0));
        newRupiah.setText("jLabel3");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newRupiah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newRupiah, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout IDRLayout = new javax.swing.GroupLayout(IDR);
        IDR.setLayout(IDRLayout);
        IDRLayout.setHorizontalGroup(
            IDRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IDRLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BalRupiah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        IDRLayout.setVerticalGroup(
            IDRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IDRLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BalRupiah, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(IDRLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Euro.setBackground(new java.awt.Color(249, 117, 218));
        Euro.setOpaque(false);

        BalEuro.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        BalEuro.setForeground(new java.awt.Color(0, 0, 0));
        BalEuro.setText("Balance Euro   :");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);

        newEuro.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        newEuro.setForeground(new java.awt.Color(0, 0, 0));
        newEuro.setText("jLabel4");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newEuro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newEuro, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout EuroLayout = new javax.swing.GroupLayout(Euro);
        Euro.setLayout(EuroLayout);
        EuroLayout.setHorizontalGroup(
            EuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EuroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BalEuro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        EuroLayout.setVerticalGroup(
            EuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EuroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BalEuro, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addGroup(EuroLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        USD.setBackground(new java.awt.Color(93, 130, 228));
        USD.setOpaque(false);

        BalUSD.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        BalUSD.setForeground(new java.awt.Color(0, 0, 0));
        BalUSD.setText("Balance USD    :");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(100, 28));

        newUSD.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        newUSD.setForeground(new java.awt.Color(0, 0, 0));
        newUSD.setText("jLabel5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newUSD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newUSD, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout USDLayout = new javax.swing.GroupLayout(USD);
        USD.setLayout(USDLayout);
        USDLayout.setHorizontalGroup(
            USDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(USDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BalUSD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                .addContainerGap())
        );
        USDLayout.setVerticalGroup(
            USDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, USDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(USDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BalUSD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(USDLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Euro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IDR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Judul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(USD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Judul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addComponent(IDR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Euro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(USD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(473, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel1MouseClicked
    {//GEN-HEADEREND:event_jLabel1MouseClicked
        umi.umm.uh.getContent().removeAll();
        umi.setBounds(0,0,500,750);
        umi.setVisible(true);
        umi.umm.uh.getContent().add(umi);
        umi.umm.uh.getContent().revalidate();
        umi.umm.uh.getContent().repaint();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void BackMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_BackMouseClicked
    {//GEN-HEADEREND:event_BackMouseClicked
        // TODO add your handling code here:
        umi.umm.uh.getContent().removeAll();
        umi.setBounds(0,0,500,750);
        umi.setVisible(true);
        umi.umm.uh.getContent().add(umi);
        umi.umm.uh.getContent().revalidate();
        umi.umm.uh.getContent().repaint();
    }//GEN-LAST:event_BackMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Back;
    private javax.swing.JLabel BalEuro;
    private javax.swing.JLabel BalRupiah;
    private javax.swing.JLabel BalUSD;
    private javax.swing.JPanel Euro;
    private javax.swing.JPanel IDR;
    private javax.swing.JPanel Judul;
    private javax.swing.JPanel USD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel newEuro;
    private javax.swing.JLabel newRupiah;
    private javax.swing.JLabel newUSD;
    // End of variables declaration//GEN-END:variables
}
