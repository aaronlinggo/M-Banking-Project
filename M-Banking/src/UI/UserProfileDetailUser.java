/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import RoundedField.RoundJPanel;

/**
 *
 * @author acxel
 */
public class UserProfileDetailUser extends javax.swing.JPanel {

    UserProfile up;
    /**
     * Creates new form UserProfileDetailUser
     */
    public UserProfileDetailUser(UserProfile up) {
        initComponents();
        this.up = up;
        isiData();
    }
    
    public void isiData() {
        lblNama.setText(up.uh.active.getNama());
        lblAlamat.setText(up.uh.active.getAlamat());
        lblGender.setText(up.uh.active.getGender());
        lblTanggalLahir.setText(up.uh.active.getTanggalLahir());
        lblNoHp.setText(up.uh.active.getNomorHP());
    }
    
    public void passData(UserProfile up) {
        this.up = up;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelBack = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblEdit = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblNama = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblAlamat = new javax.swing.JLabel();
        lblTanggalLahir = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblNoHp = new javax.swing.JLabel();
        jPanel2 = new RoundJPanel(35);
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(250, 243, 243));

        panelBack.setBackground(new java.awt.Color(255, 255, 255));
        panelBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelBackMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/m/banking/Asset/Back.png"))); // NOI18N

        javax.swing.GroupLayout panelBackLayout = new javax.swing.GroupLayout(panelBack);
        panelBack.setLayout(panelBackLayout);
        panelBackLayout.setHorizontalGroup(
            panelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel1)
                .addGap(0, 0, 0))
        );
        panelBackLayout.setVerticalGroup(
            panelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Courier New", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("DETAIL USER");

        lblEdit.setForeground(new java.awt.Color(0, 0, 255));
        lblEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/m/banking/Asset/editBlue.png"))); // NOI18N
        lblEdit.setText("EDIT");
        lblEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEditMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Courier New", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(87, 202, 247));
        jLabel5.setText("FULL NAME");

        lblNama.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblNama.setForeground(new java.awt.Color(153, 153, 153));
        lblNama.setText("isi Nama");

        jLabel8.setFont(new java.awt.Font("Courier New", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(87, 202, 247));
        jLabel8.setText("ADDRESS");

        jLabel9.setFont(new java.awt.Font("Courier New", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(87, 202, 247));
        jLabel9.setText("BIRTH DATE");

        jLabel10.setFont(new java.awt.Font("Courier New", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(87, 202, 247));
        jLabel10.setText("GENDER");

        jLabel11.setFont(new java.awt.Font("Courier New", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(87, 202, 247));
        jLabel11.setText("PHONE NUMBER");

        lblAlamat.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblAlamat.setForeground(new java.awt.Color(153, 153, 153));
        lblAlamat.setText("isi Alamat");

        lblTanggalLahir.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblTanggalLahir.setForeground(new java.awt.Color(153, 153, 153));
        lblTanggalLahir.setText("isi Tanggal Lahir");

        lblGender.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblGender.setForeground(new java.awt.Color(153, 153, 153));
        lblGender.setText("isi Gender");

        lblNoHp.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblNoHp.setForeground(new java.awt.Color(153, 153, 153));
        lblNoHp.setText("isi Nomor HP");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                        .addComponent(lblEdit)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNoHp)
                            .addComponent(lblGender)
                            .addComponent(lblTanggalLahir)
                            .addComponent(lblAlamat)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(lblNama))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblEdit))
                .addGap(40, 40, 40)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNama)
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAlamat)
                .addGap(30, 30, 30)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTanggalLahir)
                .addGap(30, 30, 30)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGender)
                .addGap(30, 30, 30)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNoHp)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Detail User");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(20, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(53, 53, 53))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
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

    private void panelBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBackMouseClicked
        // TODO add your handling code here:
        up.uh.getContent().removeAll();
        up.uh.getContent().add(up);
        up.uh.getContent().revalidate();
        up.uh.getContent().repaint();
    }//GEN-LAST:event_panelBackMouseClicked

    private void lblEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditMouseClicked
        // TODO add your handling code here:
        up.uh.getContent().removeAll();
        UserProfileDetailUserEdit eu = new UserProfileDetailUserEdit(this);
        eu.passData(this);
        eu.setVisible(true);
        eu.setBounds(0,0, 500, 717);
        up.uh.getContent().add(eu);
        up.uh.getContent().revalidate();
        up.uh.getContent().repaint();
        
    }//GEN-LAST:event_lblEditMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAlamat;
    private javax.swing.JLabel lblEdit;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblNoHp;
    private javax.swing.JLabel lblTanggalLahir;
    private javax.swing.JPanel panelBack;
    // End of variables declaration//GEN-END:variables
}
