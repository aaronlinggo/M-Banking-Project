/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

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
import java.util.Date;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JViewport;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneLayout;
import javax.swing.SwingUtilities;
import m.banking.Gold;
import m.banking.Member;
import m.banking.Platinum;
import m.banking.Silver;

/**
 *
 * @author LINGGO
 */
public class AdminNewMember extends javax.swing.JPanel {

    /**
     * Creates new form AdminNewMember
     */
    ArrayList<Member> requestMember;
    ArrayList<AdminListNewMember> ALNM;
    int idx = -1;
    public AdminNewMember() {
        initComponents();
        showAllRequestMember();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroll = new javax.swing.JScrollPane();
        listnewMember = new javax.swing.JPanel();
        reject = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        confirm = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(250, 243, 243));

        scroll.setBackground(new java.awt.Color(250, 243, 243));
        scroll.setBorder(null);
        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setLayout(new ScrollPaneLayout() {
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
        scroll.getVerticalScrollBar().setUI(new MyScrollBarUI());
        MouseAdapter ma = new MouseAdapter() {

            private Point origin;

            @Override
            public void mousePressed(MouseEvent e) {
                origin = new Point(e.getPoint());
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                if (origin != null) {
                    JViewport viewPort = (JViewport) SwingUtilities.getAncestorOfClass(JViewport.class, listnewMember);
                    if (viewPort != null) {
                        int deltaX = origin.x - e.getX();
                        int deltaY = origin.y - e.getY();

                        Rectangle view = viewPort.getViewRect();
                        view.x += deltaX;
                        view.y += deltaY;

                        listnewMember.scrollRectToVisible(view);
                    }
                }
            }

        };

        listnewMember.addMouseListener(ma);
        listnewMember.addMouseMotionListener(ma);

        listnewMember.setBackground(new java.awt.Color(250, 243, 243));

        javax.swing.GroupLayout listnewMemberLayout = new javax.swing.GroupLayout(listnewMember);
        listnewMember.setLayout(listnewMemberLayout);
        listnewMemberLayout.setHorizontalGroup(
            listnewMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );
        listnewMemberLayout.setVerticalGroup(
            listnewMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );

        scroll.setViewportView(listnewMember);

        reject.setBackground(new java.awt.Color(255, 51, 51));
        reject.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rejectMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reject");

        javax.swing.GroupLayout rejectLayout = new javax.swing.GroupLayout(reject);
        reject.setLayout(rejectLayout);
        rejectLayout.setHorizontalGroup(
            rejectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
        );
        rejectLayout.setVerticalGroup(
            rejectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        confirm.setBackground(new java.awt.Color(0, 204, 0));
        confirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Confirm");

        javax.swing.GroupLayout confirmLayout = new javax.swing.GroupLayout(confirm);
        confirm.setLayout(confirmLayout);
        confirmLayout.setHorizontalGroup(
            confirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
        );
        confirmLayout.setVerticalGroup(
            confirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(reject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(reject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rejectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rejectMouseClicked
        // TODO add your handling code here:
        if (idx != -1){
            ArrayList<Member> requestMember = new ArrayList<>();
            try {
                FileInputStream file = new FileInputStream("requestMember.ser");
                ObjectInputStream in = new ObjectInputStream(file);

                requestMember = (ArrayList<Member>) in.readObject();

                in.close();
                file.close();
            }
            catch(IOException ex) {
                System.out.println("IOException is caught");
            }
            catch(ClassNotFoundException ex) {
                System.out.println("ClassNotFoundException is caught");
            }
            requestMember.remove(idx);
            String filename = "requestMember.ser";
            try {
                FileOutputStream file = new FileOutputStream(filename);
                ObjectOutputStream out = new ObjectOutputStream(file);

                out.writeObject(requestMember);

                out.close();
                file.close();

                System.out.println("Object has been serialized");

            }
            catch(IOException ex) {
                System.out.println("IOException is caught");
            }
            JOptionPane.showMessageDialog(this, "Berhasil delete");
        }
        else {
            JOptionPane.showMessageDialog(this, "Pick a new member pls");
        }
        idx = -1;
        showAllRequestMember();
    }//GEN-LAST:event_rejectMouseClicked

    private void confirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmMouseClicked
        // TODO add your handling code here:
        if (idx != -1){
            ArrayList<Member> requestMember = new ArrayList<>();
            ArrayList<Member> Account = new ArrayList<Member>();
            try {
                FileInputStream file = new FileInputStream("requestMember.ser");
                ObjectInputStream in = new ObjectInputStream(file);

                requestMember = (ArrayList<Member>) in.readObject();

                in.close();
                file.close();
            }
            catch(IOException ex) {
                System.out.println("IOException is caught");
            }
            catch(ClassNotFoundException ex) {
                System.out.println("ClassNotFoundException is caught");
            }
            
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
            
            Account.add(requestMember.get(idx));
            requestMember.remove(idx);
            
            try {
                FileOutputStream file = new FileOutputStream("requestMember.ser");
                ObjectOutputStream out = new ObjectOutputStream(file);

                out.writeObject(requestMember);

                out.close();
                file.close();

                System.out.println("Object has been serialized");

            }
            catch(IOException ex) {
                System.out.println("IOException is caught");
            }
            
            String filename = "Account.ser";
            try {
                FileOutputStream file = new FileOutputStream(filename);
                ObjectOutputStream out = new ObjectOutputStream(file);

                out.writeObject(Account);

                out.close();
                file.close();

                System.out.println("Object has been serialized");

            }
            catch(IOException ex) {
                System.out.println("IOException is caught");
            }
            System.out.println(Account.size());
            JOptionPane.showMessageDialog(this, "Berhasil confirm " + Account.get(Account.size()-1).getNama() + "!");
        }
        else {
            JOptionPane.showMessageDialog(this, "Pick a new member pls");
        }
        idx = -1;
        showAllRequestMember();
    }//GEN-LAST:event_confirmMouseClicked

    public void showAllRequestMember(){
        ListSelectionModel listSelectionModel;
        ArrayList<Member> requestMember = new ArrayList<>();
        ArrayList<AdminListNewMember> ALNM = new ArrayList<>();
        try {
            FileInputStream file = new FileInputStream("requestMember.ser");
            ObjectInputStream in = new ObjectInputStream(file);

            requestMember = (ArrayList<Member>) in.readObject();

            in.close();
            file.close();
        }
        catch(IOException ex) {
            System.out.println("IOException is caught");
        }
        catch(ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }
        listnewMember.removeAll();
        if ((313+10)*requestMember.size() >= 542) {
            listnewMember.setPreferredSize(new Dimension(470, (313+10)*requestMember.size()));
        }
        else {
            listnewMember.setPreferredSize(new Dimension(488, 542));
        }
        for (int i = 0; i < requestMember.size(); i++) {
            System.out.println(i);
            ALNM.add(new AdminListNewMember());
            ALNM.get(i).setName("ALNM"+i);
            ALNM.get(i).setFullName("Full Name     : " + requestMember.get(i).getNama().toUpperCase());
            System.out.println(requestMember.get(i).getTanggalLahir());
            ALNM.get(i).setTglLahir("Date of Birth : " + requestMember.get(i).getTanggalLahir());
            ALNM.get(i).setGender("Gender        : " + requestMember.get(i).getGender());
            ALNM.get(i).setAlamat("Address       : " + requestMember.get(i).getAlamat());
            ALNM.get(i).setNoHP("Phone Number  : " + requestMember.get(i).getNomorHP());
            String tempnorek = String.valueOf(requestMember.get(i).getNoRekening()).substring(0,4) + "-" + String.valueOf(requestMember.get(i).getNoRekening()).substring(4,8);
            ALNM.get(i).setNoRek("Card Number   : " + tempnorek);
            String tempSaldo = Double.toString(requestMember.get(i).getRupiah());
            System.out.println(tempSaldo);
            ALNM.get(i).setSaldo("Balance       : " + priceWithoutDecimal(requestMember.get(i).getRupiah()));
            String jenis = "";
            if (requestMember.get(i) instanceof Silver){
                jenis = "Silver";
                ALNM.get(i).setNewColorKartu(229, 228, 226);
            }
            else if (requestMember.get(i) instanceof Gold){
                jenis = "Gold";
                ALNM.get(i).setNewColorKartu(255,215,0);
            }
            else if (requestMember.get(i) instanceof Platinum){
                jenis = "Platinum";
                ALNM.get(i).setNewColorKartu(128,128,128);
            }
            ALNM.get(i).setJenisKartu(jenis);
            ALNM.get(i).setBounds(0, (313+10)*i, 470,313);
            ALNM.get(i).setVisible(true);
            ALNM.get(i).addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e){
                    System.out.println("klik");
                    System.out.println(e.getSource());
                    System.out.println(e.getY());
                    System.out.println(e.getComponent().getName());
                    System.out.println(ALNM.indexOf(e.getComponent()));
                    idx = ALNM.indexOf(e.getComponent());
                    resetBGPanel(ALNM);
                    ALNM.get(idx).setNewColorBG(84,190,229);
                }
            });
            listnewMember.add(ALNM.get(i));
        }
        listnewMember.revalidate();
        listnewMember.repaint();
    }

    public void resetBGPanel(ArrayList<AdminListNewMember> ALNM){
        ArrayList<Member> requestMember = new ArrayList<>();
        try {
            FileInputStream file = new FileInputStream("requestMember.ser");
            ObjectInputStream in = new ObjectInputStream(file);

            requestMember = (ArrayList<Member>) in.readObject();

            in.close();
            file.close();
        }
        catch(IOException ex) {
            System.out.println("IOException is caught");
        }
        catch(ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }
        for (int j = 0; j < requestMember.size(); j++) {
            ALNM.get(j).setNewColorBG(254,174,72);
        }
    }
    
    public String priceWithoutDecimal (Double price) {
        DecimalFormat formatter = new DecimalFormat("###,###,###.##");
        return formatter.format(price);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel confirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel listnewMember;
    private javax.swing.JPanel reject;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
