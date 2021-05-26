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
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JViewport;
import javax.swing.ScrollPaneLayout;
import javax.swing.SwingUtilities;
import m.banking.Login.Login;
import m.banking.Member;
/**
 *
 * @author maxdr
 */
public class UserAntarRek extends javax.swing.JPanel {

    /**
     * Creates new form UserMainmenu
     */
    UTTransfer ut;
    public UserAntarRek(UTTransfer ut) {
        this.ut = ut;
        initComponents();
        this.setBackground(new Color(0.0f,0.0f,0.0f,0.0f));
        this.setBounds(0, 0, 500, 750);
        
    }

    public void passData(UTTransfer ut){
        this.ut = ut;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgutama = new javax.swing.JPanel();
        title = new RoundJPanel(25);
        jLabel1 = new javax.swing.JLabel();
        back = new RoundJPanel(25);
        backbtn = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        Cancel = new RoundJPanel(35);
        jLabel4 = new javax.swing.JLabel();
        OK = new RoundJPanel(35);
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        nameshow = new RoundJPanel(25);
        jPanel2 = new RoundJPanel(25);
        jLabel6 = new javax.swing.JLabel();
        nama = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(500, 768));
        setPreferredSize(new java.awt.Dimension(500, 768));

        bgutama.setBackground(new java.awt.Color(250, 243, 243));
        bgutama.setMaximumSize(new java.awt.Dimension(500, 750));
        bgutama.setMinimumSize(new java.awt.Dimension(500, 750));
        bgutama.setPreferredSize(new java.awt.Dimension(500, 750));

        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Transfer");

        javax.swing.GroupLayout titleLayout = new javax.swing.GroupLayout(title);
        title.setLayout(titleLayout);
        titleLayout.setHorizontalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        titleLayout.setVerticalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setOpaque(false);

        backbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/m/banking/Asset/Back.png"))); // NOI18N
        backbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout backLayout = new javax.swing.GroupLayout(back);
        back.setLayout(backLayout);
        backLayout.setHorizontalGroup(
            backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backLayout.setVerticalGroup(
            backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 0, 0));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Jumlah Transfer");
        jTextField2.setBorder(null);
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
        });

        Cancel.setBackground(new java.awt.Color(255, 51, 102));
        Cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cancel.setOpaque(false);
        Cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cancel");

        javax.swing.GroupLayout CancelLayout = new javax.swing.GroupLayout(Cancel);
        Cancel.setLayout(CancelLayout);
        CancelLayout.setHorizontalGroup(
            CancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CancelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addContainerGap())
        );
        CancelLayout.setVerticalGroup(
            CancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CancelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
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

        jLabel5.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("OK");

        javax.swing.GroupLayout OKLayout = new javax.swing.GroupLayout(OK);
        OK.setLayout(OKLayout);
        OKLayout.setHorizontalGroup(
            OKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OKLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addContainerGap())
        );
        OKLayout.setVerticalGroup(
            OKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OKLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );

        String[] array = new String[ut.utf.u.active.getDaftarrek().size()];
        for(int i = 0; i < array.length; i++) {
            array[i] = ut.utf.u.active.getDaftarrek().get(i);
        }
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(array));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        nameshow.setBackground(new java.awt.Color(255, 255, 255));
        nameshow.setOpaque(false);

        jPanel2.setBackground(new java.awt.Color(103, 91, 232));
        jPanel2.setOpaque(false);

        jLabel6.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Nama Pemilik Rekening");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        nama.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        nama.setForeground(new java.awt.Color(0, 0, 0));
        nama.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout nameshowLayout = new javax.swing.GroupLayout(nameshow);
        nameshow.setLayout(nameshowLayout);
        nameshowLayout.setHorizontalGroup(
            nameshowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(nameshowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        nameshowLayout.setVerticalGroup(
            nameshowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nameshowLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nama, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout bgutamaLayout = new javax.swing.GroupLayout(bgutama);
        bgutama.setLayout(bgutamaLayout);
        bgutamaLayout.setHorizontalGroup(
            bgutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgutamaLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(bgutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(bgutamaLayout.createSequentialGroup()
                        .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(OK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgutamaLayout.createSequentialGroup()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField2)
                    .addComponent(nameshow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        bgutamaLayout.setVerticalGroup(
            bgutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgutamaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(bgutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(nameshow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addGroup(bgutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(128, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgutama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgutama, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbtnMouseClicked
        // TODO add your handling code here:
        ut.utf.u.getContent().removeAll();
        ut.setVisible(true);
        ut.setBounds(0,0, 500, 750);
        ut.utf.u.getContent().add(ut);
        ut.utf.u.getContent().revalidate();
        ut.utf.u.getContent().repaint();
    }//GEN-LAST:event_backbtnMouseClicked

    private void CancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelMouseClicked
        // TODO add your handling code here:
        ut.utf.u.getContent().removeAll();
        ut.setVisible(true);
        ut.setBounds(0,0, 500, 750);
        ut.utf.u.getContent().add(ut);
        ut.utf.u.getContent().revalidate();
        ut.utf.u.getContent().repaint();
    }//GEN-LAST:event_CancelMouseClicked
    public boolean isNumeric(String str)
    {
        for (char c : str.toCharArray())
        {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
    private void OKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OKMouseClicked
        // TODO add your handling code here:
        ArrayList<Member> Account = new ArrayList<>();
        try {
            FileInputStream file = new FileInputStream("Account.ser");
            ObjectInputStream in = new ObjectInputStream(file);

            Account = (ArrayList<Member>) in.readObject();

            in.close();
            file.close();
        }
        catch(IOException ex) {
            System.out.println("IOException is caught");
        }
        catch(ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }
        String msg ="";
        Member target = null;
        Member saya = ut.utf.u.active;
        boolean sukses = false;
        if(!jTextField2.getText().equals("")&& !jTextField2.getText().equals("Jumlah Transfer")){
            if(isNumeric(jTextField2.getText())){
                double tf_amount = Double.parseDouble(jTextField2.getText()); 
                for(Member cari : ut.utf.u.Account){
                    if(cari.getNoRekening().equals(jComboBox1.getSelectedItem().toString())){
                        target = cari;
                    }
                }
                if(tf_amount >= 10000){
                    if(saya.getRupiah() > tf_amount+50000){
                        if(saya.getCurrentUsage() +(int)tf_amount < saya.getLimitTransfer()){
                            System.out.println("kriteria tf terpenuhi");
                        }
                        else{
                            msg+="\nDaily Transfer Limit Has been Reached!";
                        }
                    }
                    else{
                        msg += "\nInsufficient Balance";
                    }
                }
                else{
                    msg += "\nMinimum Transfer Amount is Rp,10.000";
                }
            }
            else{
                msg += "\nPlease Input Numbers";
            }
        }
        else{
            msg+="\nPlease Input Transfer Amount";
        }
        JOptionPane.showMessageDialog(this,  msg);
        
    }//GEN-LAST:event_OKMouseClicked

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        // TODO add your handling code here:
        jTextField2.setText("");
    }//GEN-LAST:event_jTextField2FocusGained

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        ArrayList<Member> Account = new ArrayList<>();
        try {
            FileInputStream file = new FileInputStream("Account.ser");
            ObjectInputStream in = new ObjectInputStream(file);

            Account = (ArrayList<Member>) in.readObject();

            in.close();
            file.close();
        }
        catch(IOException ex) {
            System.out.println("IOException is caught");
        }
        catch(ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }
        String chosen = jComboBox1.getSelectedItem().toString(); //dapet norek
        String display ="";
        for(Member cari: Account){
            if(cari.getNoRekening().equals(chosen)){
                display = cari.getNama();
            }
        }
        nama.setText(display);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cancel;
    private javax.swing.JPanel OK;
    private javax.swing.JPanel back;
    private javax.swing.JLabel backbtn;
    private javax.swing.JPanel bgutama;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel nama;
    private javax.swing.JPanel nameshow;
    private javax.swing.JPanel title;
    // End of variables declaration//GEN-END:variables
}
