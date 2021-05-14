/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author acxel
 */
public class UserProfileTagihan extends javax.swing.JPanel {

    UserProfile up;
    
    /**
     * Creates new form UserProfileTagihan
     */
    public UserProfileTagihan() {
        initComponents();
        bgHeader();
        //isiTabel();
    }
    
    
    public void isiTabel(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel(); 
        if(model.getRowCount()>0) {
            for (int i = 0; i < model.getRowCount(); i++) {
                model.removeRow(0);
            }
        }
        Object rowData[] = new Object[3];
        for (int i = 0; i < 2; i++) {
            //rowData[0] = myTagihan.get(i).getTagihan();
            //rowData[1] = myTagihan.get(i).getVa();
            //rowData[2] = myTagihan.get(i).getJumlah();
            model.addRow(rowData);
        }
    }
    
    public void bgHeader() {
        DefaultTableCellRenderer render1 = new DefaultTableCellRenderer();
        render1.setBackground(new Color(254,174,72));
        render1.setForeground(new Color(255,255,255));
        jTable1.getTableHeader().getColumnModel().getColumn(0).setHeaderRenderer(render1);
        jTable1.getTableHeader().getColumnModel().getColumn(1).setHeaderRenderer(render1);
        jTable1.getTableHeader().getColumnModel().getColumn(2).setHeaderRenderer(render1);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(55, 53, 61));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/m/banking/Asset/BackBlue.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(245, 245, 245));
        jLabel2.setText("TAGIHAN");

        jTable1.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TAGIHAN", "VA", "JUMLAH"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(122, 122, 122)
                        .addComponent(jLabel2)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(534, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}