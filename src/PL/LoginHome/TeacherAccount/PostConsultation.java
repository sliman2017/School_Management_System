/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PL.LoginHome.TeacherAccount;

import BL.Teacher;
import PL.LoginHome.StudentAccount.*;
import DAL.dataAccessLayer;
import PL.LoginHome.LoginStudent;
import PL.LoginHome.LoginTeacher;
import java.awt.Color;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author slimane
 */
public class PostConsultation extends javax.swing.JFrame {

    /**
     * Creates new form Result
     */
    public PostConsultation() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        RecoursBtn = new javax.swing.JPanel();
        RecoursBtnL = new javax.swing.JLabel();
        AffichageBtn = new javax.swing.JPanel();
        AffichageBtnL = new javax.swing.JLabel();
        FooterPanel = new javax.swing.JPanel();
        RecourPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        AffichagePanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        SpecCombobox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        SectionComboBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        GroupComboBox = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        path = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel9 = new javax.swing.JLabel();
        idF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(254, 200, 200));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(108, 149, 234));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PL/LoginHome/StudentAccount/StudentImages/HomeDefault.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel4MouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
        });
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 70));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 55)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Post Consultation");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 480, 69));

        RecoursBtn.setBackground(new java.awt.Color(108, 149, 234));

        RecoursBtnL.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        RecoursBtnL.setForeground(new java.awt.Color(255, 255, 255));
        RecoursBtnL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RecoursBtnL.setText("Post Advs");
        RecoursBtnL.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(255, 255, 255)));
        RecoursBtnL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RecoursBtnLMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RecoursBtnLMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout RecoursBtnLayout = new javax.swing.GroupLayout(RecoursBtn);
        RecoursBtn.setLayout(RecoursBtnLayout);
        RecoursBtnLayout.setHorizontalGroup(
            RecoursBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RecoursBtnLayout.createSequentialGroup()
                .addComponent(RecoursBtnL, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        RecoursBtnLayout.setVerticalGroup(
            RecoursBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RecoursBtnL, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        jPanel2.add(RecoursBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 230, -1));

        AffichageBtn.setBackground(new java.awt.Color(108, 149, 234));
        AffichageBtn.setToolTipText("");

        AffichageBtnL.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        AffichageBtnL.setForeground(new java.awt.Color(255, 255, 255));
        AffichageBtnL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AffichageBtnL.setText("Post Result");
        AffichageBtnL.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(255, 255, 255)));
        AffichageBtnL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AffichageBtnLMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                AffichageBtnLMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AffichageBtnLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AffichageBtnLMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout AffichageBtnLayout = new javax.swing.GroupLayout(AffichageBtn);
        AffichageBtn.setLayout(AffichageBtnLayout);
        AffichageBtnLayout.setHorizontalGroup(
            AffichageBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AffichageBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(AffichageBtnL, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        AffichageBtnLayout.setVerticalGroup(
            AffichageBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AffichageBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(AffichageBtnL, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(AffichageBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 1280, -1));

        FooterPanel.setBackground(new java.awt.Color(255, 255, 255));
        FooterPanel.setLayout(new java.awt.CardLayout());

        RecourPanel.setBackground(new java.awt.Color(226, 226, 226));

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel5.setText("Welcome to the ADVS Post ");

        javax.swing.GroupLayout RecourPanelLayout = new javax.swing.GroupLayout(RecourPanel);
        RecourPanel.setLayout(RecourPanelLayout);
        RecourPanelLayout.setHorizontalGroup(
            RecourPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RecourPanelLayout.createSequentialGroup()
                .addGap(468, 468, 468)
                .addComponent(jLabel5)
                .addContainerGap(497, Short.MAX_VALUE))
        );
        RecourPanelLayout.setVerticalGroup(
            RecourPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RecourPanelLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
        );

        FooterPanel.add(RecourPanel, "card4");

        AffichagePanel.setBackground(new java.awt.Color(226, 226, 226));
        AffichagePanel.setPreferredSize(new java.awt.Dimension(1280, 420));
        AffichagePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Abyssinica SIL", 0, 24)); // NOI18N
        jLabel3.setText("Follow The Phase");
        AffichagePanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, -1, 52));

        SpecCombobox.setBackground(new java.awt.Color(254, 254, 254));
        SpecCombobox.setFont(new java.awt.Font("DejaVu Sans", 1, 15)); // NOI18N
        SpecCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--CHOSE--", "Computer science", "Eléctronic", "Mathématic" }));
        SpecCombobox.setBorder(null);
        AffichagePanel.add(SpecCombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, 30));

        jLabel2.setFont(new java.awt.Font("Bitstream Charter", 0, 24)); // NOI18N
        jLabel2.setText("Chose specialization :");
        AffichagePanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 240, 30));

        jLabel6.setFont(new java.awt.Font("Bitstream Charter", 0, 24)); // NOI18N
        jLabel6.setText("Chose section :");
        AffichagePanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, -1, 30));

        SectionComboBox.setBackground(new java.awt.Color(254, 254, 254));
        SectionComboBox.setFont(new java.awt.Font("DejaVu Sans", 1, 15)); // NOI18N
        SectionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- SELECT--", "Section 1", "Section 2", "Section 3", "Section 4" }));
        SectionComboBox.setBorder(null);
        SectionComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SectionComboBoxActionPerformed(evt);
            }
        });
        AffichagePanel.add(SectionComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, 150, 30));

        jLabel7.setFont(new java.awt.Font("Bitstream Charter", 0, 24)); // NOI18N
        jLabel7.setText("Chose group :");
        AffichagePanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 90, 150, 30));

        GroupComboBox.setBackground(new java.awt.Color(254, 254, 254));
        GroupComboBox.setFont(new java.awt.Font("DejaVu Sans", 1, 15)); // NOI18N
        GroupComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- SELECT--", "Group 1", "Group 2", "Group 3" }));
        GroupComboBox.setBorder(null);
        GroupComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GroupComboBoxActionPerformed(evt);
            }
        });
        AffichagePanel.add(GroupComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 90, 150, 30));

        jSeparator1.setBackground(new java.awt.Color(254, 254, 254));
        AffichagePanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1270, 20));

        jSeparator2.setBackground(new java.awt.Color(254, 254, 254));
        jSeparator2.setToolTipText("");
        AffichagePanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1270, 20));

        jButton2.setBackground(new java.awt.Color(248, 248, 250));
        jButton2.setFont(new java.awt.Font("Bitstream Charter", 1, 18)); // NOI18N
        jButton2.setText("Chose jpn file");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        AffichagePanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 280, 40));

        jPanel3.setBackground(new java.awt.Color(254, 254, 254));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        path.setFont(new java.awt.Font("Bitstream Charter", 0, 18)); // NOI18N
        path.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pathActionPerformed(evt);
            }
        });
        jPanel3.add(path, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 280, 40));

        jButton1.setBackground(new java.awt.Color(249, 249, 249));
        jButton1.setFont(new java.awt.Font("Bitstream Charter", 1, 18)); // NOI18N
        jButton1.setText("Consulte the file ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 280, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PL/LoginHome/TeacherAccount/images/unknown image.png"))); // NOI18N
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 130, 160));

        jDesktopPane1.setBackground(new java.awt.Color(242, 241, 230));
        jPanel3.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 150, 180));

        jLabel9.setFont(new java.awt.Font("Bitstream Charter", 0, 20)); // NOI18N
        jLabel9.setText("The id of Picture :");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, 180, 30));

        idF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFActionPerformed(evt);
            }
        });
        jPanel3.add(idF, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, 160, 30));

        AffichagePanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1280, 260));

        FooterPanel.add(AffichagePanel, "card3");

        jPanel1.add(FooterPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 1270, 360));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    LoginTeacher ls = new LoginTeacher();
    int idPerson = ls.getIdTeacher();
    public float selectFinalResult(int idPerson){
        float idP= 0f;
        try {
            String sql = "select finalResult from students where idStudent = "+idPerson+";";
            dataAccessLayer dal= new dataAccessLayer();
            dal.stmt = dal.conn.createStatement();
            dal.rs= dal.stmt.executeQuery(sql);
            
            if(dal.rs.next()){
                idP = dal.rs.getFloat(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PostConsultation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return idP;
        
    }

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        ImageIcon ii = new ImageIcon(getClass().getResource("/PL/LoginHome/StudentAccount/StudentImages/HomeOnClicked.png"));
        jLabel4.setIcon(ii);
    }//GEN-LAST:event_jLabel4MousePressed

    private void jLabel4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseReleased
        ImageIcon ii = new ImageIcon(getClass().getResource("/PL/LoginHome/StudentAccount/StudentImages/HomeDefault.png"));
        jLabel4.setIcon(ii);
    }//GEN-LAST:event_jLabel4MouseReleased

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        new TeacherDashboard().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        //ImageIcon ii = new ImageIcon(getClass().getResource("/PL/LoginHome/StudentAccount/StudentImages/HomeDefault.png"));
        //jLabel4.setIcon(ii);
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        // ImageIcon ii = new ImageIcon(getClass().getResource("/PL/LoginHome/StudentAccount/StudentImages/HomeOnEntred.png"));
        //jLabel4.setIcon(ii);
    }//GEN-LAST:event_jLabel4MouseEntered

    private void AffichageBtnLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AffichageBtnLMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AffichageBtnLMouseEntered

    private void AffichageBtnLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AffichageBtnLMousePressed
        AffichageBtn.setBackground(new Color(61,118,237));
        RecoursBtn.setBackground(new Color(108,149,234));
    }//GEN-LAST:event_AffichageBtnLMousePressed

    private void AffichageBtnLMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AffichageBtnLMouseReleased
        
    }//GEN-LAST:event_AffichageBtnLMouseReleased

    private void AffichageBtnLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AffichageBtnLMouseClicked
        AffichagePanel.setVisible(true);
        RecourPanel.setVisible(false);
    }//GEN-LAST:event_AffichageBtnLMouseClicked

    private void RecoursBtnLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RecoursBtnLMouseClicked
        RecourPanel.setVisible(true);
        AffichagePanel.setVisible(false);
    }//GEN-LAST:event_RecoursBtnLMouseClicked

    private void RecoursBtnLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RecoursBtnLMousePressed
        RecoursBtn.setBackground(new Color(61,118,237));
        AffichageBtn.setBackground(new Color(108,149,234));
    }//GEN-LAST:event_RecoursBtnLMousePressed

    private void SectionComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SectionComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SectionComboBoxActionPerformed

    private void GroupComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GroupComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GroupComboBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Teacher th= new Teacher();
        th.postAffichage2(Integer.parseInt(idF.getText().toString()), idPerson, path.getText().toString(), SpecCombobox.getSelectedItem().toString(),SectionComboBox.getSelectedItem().toString(),GroupComboBox.getSelectedItem().toString());
        System.out.println("idF :" + Integer.parseInt(idF.getText().toString()));

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        fileName = f.getAbsolutePath();
        path.setText(fileName);
        try {
            File image = new File(fileName);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for(int readNum; (readNum = fis.read(buf))!=-1;){
                bos.write(buf, 0, readNum);
            }
         listImage = bos.toByteArray();
        } catch (Exception e) {
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void pathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pathActionPerformed

    private void idFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idFActionPerformed
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PostConsultation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PostConsultation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PostConsultation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PostConsultation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PostConsultation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AffichageBtn;
    private javax.swing.JLabel AffichageBtnL;
    private javax.swing.JPanel AffichagePanel;
    private javax.swing.JPanel FooterPanel;
    private javax.swing.JComboBox<String> GroupComboBox;
    private javax.swing.JPanel RecourPanel;
    private javax.swing.JPanel RecoursBtn;
    private javax.swing.JLabel RecoursBtnL;
    private javax.swing.JComboBox<String> SectionComboBox;
    private javax.swing.JComboBox<String> SpecCombobox;
    private javax.swing.JTextField idF;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField path;
    // End of variables declaration//GEN-END:variables

  String fileName;
  int s= 0;
  byte[] listImage = null;
  private ImageIcon format = null;
}
