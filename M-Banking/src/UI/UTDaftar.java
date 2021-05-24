/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import RoundedField.RoundJPanel;
import java.awt.Color;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import m.banking.Login.Login;
import m.banking.Member;

/**
 *
 * @author maxdr
 */
public class UTDaftar extends javax.swing.JPanel {

    /**
     * Creates new form UTDaftar
     */
    public UTDaftar() {
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

        bgutama = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        submitbtn = new RoundJPanel(35);
        jLabel5 = new javax.swing.JLabel();
        cancelbtn = new RoundJPanel(35);
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        backbtnpanel = new RoundJPanel(25)  ;
        backbtn = new javax.swing.JLabel();
        header = new RoundJPanel(25);
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(500, 750));

        bgutama.setBackground(new java.awt.Color(250, 243, 243));

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setText("Nomor Rekening 1");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setBackground(new java.awt.Color(204, 204, 204));
        jTextField2.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 0, 0));
        jTextField2.setText("Nomor Rekening 2");
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        submitbtn.setBackground(new java.awt.Color(51, 255, 0));
        submitbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submitbtn.setOpaque(false);
        submitbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitbtnMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Submit");

        javax.swing.GroupLayout submitbtnLayout = new javax.swing.GroupLayout(submitbtn);
        submitbtn.setLayout(submitbtnLayout);
        submitbtnLayout.setHorizontalGroup(
            submitbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(submitbtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addContainerGap())
        );
        submitbtnLayout.setVerticalGroup(
            submitbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(submitbtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );

        cancelbtn.setBackground(new java.awt.Color(255, 51, 51));
        cancelbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelbtn.setOpaque(false);
        cancelbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelbtnMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cancel");

        javax.swing.GroupLayout cancelbtnLayout = new javax.swing.GroupLayout(cancelbtn);
        cancelbtn.setLayout(cancelbtnLayout);
        cancelbtnLayout.setHorizontalGroup(
            cancelbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cancelbtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addContainerGap())
        );
        cancelbtnLayout.setVerticalGroup(
            cancelbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cancelbtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTextField3.setBackground(new java.awt.Color(204, 204, 204));
        jTextField3.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(0, 0, 0));
        jTextField3.setText("Nomor Rekening 3");
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField3FocusGained(evt);
            }
        });
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        backbtnpanel.setBackground(new java.awt.Color(255, 255, 255));
        backbtnpanel.setOpaque(false);

        backbtn.setBackground(new java.awt.Color(255, 255, 255));
        backbtn.setForeground(new java.awt.Color(255, 255, 255));
        backbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/m/banking/Asset/Back.png"))); // NOI18N
        backbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout backbtnpanelLayout = new javax.swing.GroupLayout(backbtnpanel);
        backbtnpanel.setLayout(backbtnpanelLayout);
        backbtnpanelLayout.setHorizontalGroup(
            backbtnpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backbtnpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        backbtnpanelLayout.setVerticalGroup(
            backbtnpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backbtnpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Daftar Rekening");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout bgutamaLayout = new javax.swing.GroupLayout(bgutama);
        bgutama.setLayout(bgutamaLayout);
        bgutamaLayout.setHorizontalGroup(
            bgutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgutamaLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(bgutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(bgutamaLayout.createSequentialGroup()
                        .addComponent(cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(submitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgutamaLayout.createSequentialGroup()
                        .addComponent(backbtnpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jTextField2)
                    .addComponent(jTextField1)
                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        bgutamaLayout.setVerticalGroup(
            bgutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgutamaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(bgutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(backbtnpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addGroup(bgutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgutama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgutama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbtnMouseClicked
        // TODO add your handling code here:
        utf.u.getContent().removeAll();
        utf.setVisible(true);
        utf.setBounds(0,0, 500, 750);
        utf.u.getContent().add(utf);
        utf.u.getContent().revalidate();
        utf.u.getContent().repaint();
    }//GEN-LAST:event_backbtnMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed
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
    
    private void submitbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitbtnMouseClicked
        // TODO add your handling code here:
        ArrayList<Member> Account = new ArrayList<>();
        ArrayList<String> temp = new ArrayList<>();
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
        String msg="";
        boolean slot1=false,slot2=false,slot3=false;// false =  ga kembar
        boolean fill1=false,fill2=false,fill3=false;// cek terisi ga
        if(!jTextField1.getText().equals("") && !jTextField1.getText().equals("Nomor Rekening 1")){
            fill1=true;
            if(isNumeric(jTextField1.getText())){
                int cek1 = Integer.parseInt(jTextField1.getText());
                boolean exist = false;
                for(Member cari: Account){
                    if(cari.getNoRekening() == cek1){
                        exist = true;
                        System.out.println("ada di list");
                    }
                }
                if(exist){
                    boolean nemu = false;
                    for(Integer i : utf.u.active.getDaftarrek()){
                        if(cek1== i){
                            nemu = true;
                        }
                    }
                    if(!nemu){
                        utf.u.active.getDaftarrek().add(cek1);
                        msg+="\nNomor Rekening 1 Berhasil Terdaftar";
                    }
                    else{
                        msg+="\nNomor Rekening 1 Sudah Terdaftar";      //berati kembar
                    }
                }
                else{       //ga nemu masal
                    System.out.println("Ga nemu masal");
                }
            }
            else{
                msg +="\nGagal! Nomor Rekening 1 mengandung Huruf";
            }
        }
        if(!jTextField2.getText().equals("") && !jTextField2.getText().equals("Nomor Rekening 2")){
            fill2=true;
            if(isNumeric(jTextField2.getText())){
                int cek2 = Integer.parseInt(jTextField2.getText());
                boolean nemu = false;
                for(Integer i : utf.u.active.getDaftarrek()){
                    if(cek2== i){
                        nemu = true;
                    }
                }
                if(!nemu){
                    utf.u.active.getDaftarrek().add(cek2);
                    msg+="\nNomor Rekening 2 Berhasil Terdaftar";
                }
                else{
                    msg+="\nNomor Rekening 2 Sudah Terdaftar";//berati kembar
                }
            }
            else{
                msg +="\nGagal! Nomor Rekening 2 mengandung Huruf";
            }
        }
        if(!jTextField3.getText().equals("")&&!jTextField3.getText().equals("Nomor Rekening 3")){
            fill3=true;
            if(isNumeric(jTextField3.getText())){
                int cek3 = Integer.parseInt(jTextField3.getText());
                boolean nemu = false;
                for(Integer i : utf.u.active.getDaftarrek()){
                    if(cek3== i){
                        nemu = true;
                    }
                }
                if(!nemu){
                    utf.u.active.getDaftarrek().add(cek3);
                    msg+="\nNomor Rekening 3 Berhasil Terdaftar";
                }
                else{
                    msg+="\nNomor Rekening 3 Sudah Terdaftar";//berati kembar
                }
            }
            else{
                msg +="\nGagal! Nomor Rekening 3 mengandung Huruf";
            }
        }
        if(!fill1&&!fill2&&!fill3){
            JOptionPane.showMessageDialog(this, "Tidak Ada yang mau di Daftarkan");
        }
        else JOptionPane.showMessageDialog(this, "Status : "+ msg);
    }//GEN-LAST:event_submitbtnMouseClicked

    private void cancelbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelbtnMouseClicked
        // TODO add your handling code here:
        utf.u.getContent().removeAll();
        utf.setVisible(true);
        utf.setBounds(0,0, 500, 750);
        utf.u.getContent().add(utf);
        utf.u.getContent().revalidate();
        utf.u.getContent().repaint();
    }//GEN-LAST:event_cancelbtnMouseClicked

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        // TODO add your handling code here:
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        // TODO add your handling code here:
        jTextField2.setText("");
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained
        // TODO add your handling code here:
        jTextField3.setText("");
    }//GEN-LAST:event_jTextField3FocusGained
    
    UserTransfer utf;
        
    public void pass(UserTransfer utf){
        this.utf=utf;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backbtn;
    private javax.swing.JPanel backbtnpanel;
    private javax.swing.JPanel bgutama;
    private javax.swing.JPanel cancelbtn;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JPanel submitbtn;
    // End of variables declaration//GEN-END:variables
}
