/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PL.LoginHome;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author slimane
 */
public class LoginHome extends javax.swing.JFrame {

    /**
     * Creates new form LoginHome
     */
    public LoginHome() {
        initComponents();
        smsPanel.setBackground(new Color(25,181,254,230));
        LoginAsPanel.setBackground(new Color(255,255,255,240));
        smsPanel.setBackground(new Color(83,110,233,200));
        
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
        smsPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        LoginAsPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TeacherBtn = new javax.swing.JLabel();
        StudentBtn = new javax.swing.JLabel();
        AdminBtn = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        smsPanel.setBackground(new java.awt.Color(83, 110, 233));
        smsPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        smsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(254, 254, 254));
        jLabel1.setFont(new java.awt.Font("Andika", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("School Management System");
        smsPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 470, 58));

        jPanel12.setBackground(new java.awt.Color(83, 110, 233));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        smsPanel.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(952, 0, 38, 0));

        jPanel1.add(smsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 990, 110));

        LoginAsPanel.setBackground(new java.awt.Color(254, 254, 254));
        LoginAsPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel3.setBackground(new java.awt.Color(254, 254, 254));
        jLabel3.setFont(new java.awt.Font("Andika", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(83, 59, 230));
        jLabel3.setText("Login As");

        javax.swing.GroupLayout LoginAsPanelLayout = new javax.swing.GroupLayout(LoginAsPanel);
        LoginAsPanel.setLayout(LoginAsPanelLayout);
        LoginAsPanelLayout.setHorizontalGroup(
            LoginAsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginAsPanelLayout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        LoginAsPanelLayout.setVerticalGroup(
            LoginAsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginAsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(LoginAsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 200, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PL/LoginHome/image/AdminPanel.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 160, 170));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PL/LoginHome/image/StudentPanel.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, 160, 160));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PL/LoginHome/image/TeacherPanel.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 160, 160));

        TeacherBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PL/LoginHome/image/TeacherBtnDefault.png"))); // NOI18N
        TeacherBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TeacherBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                TeacherBtnMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TeacherBtnMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TeacherBtnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TeacherBtnMouseEntered(evt);
            }
        });
        jPanel1.add(TeacherBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, 120, 40));

        StudentBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PL/LoginHome/image/StudentBtnDefault.png"))); // NOI18N
        StudentBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                StudentBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                StudentBtnMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StudentBtnMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                StudentBtnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                StudentBtnMouseEntered(evt);
            }
        });
        jPanel1.add(StudentBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 460, 120, 40));

        AdminBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PL/LoginHome/image/AdminBtnDefault.png"))); // NOI18N
        AdminBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AdminBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                AdminBtnMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdminBtnMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AdminBtnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AdminBtnMouseEntered(evt);
            }
        });
        jPanel1.add(AdminBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 120, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PL/LoginHome/image/Background.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -170, 1030, 750));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdminBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminBtnMouseEntered
        ImageIcon ii = new ImageIcon(getClass().getResource("/PL/LoginHome/image/AdminBtnOnEntred.png"));
        AdminBtn.setIcon(ii);
    }//GEN-LAST:event_AdminBtnMouseEntered

    private void AdminBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminBtnMouseExited
        ImageIcon ii = new ImageIcon(getClass().getResource("/PL/LoginHome/image/AdminBtnDefault.png"));
        AdminBtn.setIcon(ii);
    }//GEN-LAST:event_AdminBtnMouseExited

    private void AdminBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminBtnMousePressed
        ImageIcon ii = new ImageIcon(getClass().getResource("/PL/LoginHome/image/AdminBtnOnClicked.png"));
        AdminBtn.setIcon(ii);
    }//GEN-LAST:event_AdminBtnMousePressed

    private void AdminBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminBtnMouseReleased
        ImageIcon ii = new ImageIcon(getClass().getResource("/PL/LoginHome/image/AdminBtnDefault.png"));
        AdminBtn.setIcon(ii);
    }//GEN-LAST:event_AdminBtnMouseReleased

    private void AdminBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminBtnMouseClicked
        new LoginAdmin().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AdminBtnMouseClicked

    private void TeacherBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TeacherBtnMousePressed
        ImageIcon ii = new ImageIcon(getClass().getResource("/PL/LoginHome/image/TeacherBtnOnClicked.png"));
        TeacherBtn.setIcon(ii);
    }//GEN-LAST:event_TeacherBtnMousePressed

    private void TeacherBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TeacherBtnMouseReleased
        ImageIcon ii = new ImageIcon(getClass().getResource("/PL/LoginHome/image/TeacherBtnDefault.png"));
        TeacherBtn.setIcon(ii);
    }//GEN-LAST:event_TeacherBtnMouseReleased

    private void TeacherBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TeacherBtnMouseClicked
        new LoginTeacher().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_TeacherBtnMouseClicked

    private void TeacherBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TeacherBtnMouseExited
        ImageIcon ii = new ImageIcon(getClass().getResource("/PL/LoginHome/image/TeacherBtnDefault.png"));
        TeacherBtn.setIcon(ii);
    }//GEN-LAST:event_TeacherBtnMouseExited

    private void TeacherBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TeacherBtnMouseEntered
        ImageIcon ii = new ImageIcon(getClass().getResource("/PL/LoginHome/image/TeacherBtnOnEntred.png"));
        TeacherBtn.setIcon(ii);
    }//GEN-LAST:event_TeacherBtnMouseEntered

    private void StudentBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentBtnMousePressed
        ImageIcon ii = new ImageIcon(getClass().getResource("/PL/LoginHome/image/StudentBtnOnClicked.png"));
        StudentBtn.setIcon(ii);
    }//GEN-LAST:event_StudentBtnMousePressed

    private void StudentBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentBtnMouseReleased
        ImageIcon ii = new ImageIcon(getClass().getResource("/PL/LoginHome/image/StudentBtnDefault.png"));
        StudentBtn.setIcon(ii);
    }//GEN-LAST:event_StudentBtnMouseReleased

    private void StudentBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentBtnMouseClicked
        new LoginStudent().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_StudentBtnMouseClicked

    private void StudentBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentBtnMouseExited
        ImageIcon ii = new ImageIcon(getClass().getResource("/PL/LoginHome/image/StudentBtnDefault.png"));
        StudentBtn.setIcon(ii);
    }//GEN-LAST:event_StudentBtnMouseExited

    private void StudentBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentBtnMouseEntered
        ImageIcon ii = new ImageIcon(getClass().getResource("/PL/LoginHome/image/StudentBtnOnEntred.png"));
        StudentBtn.setIcon(ii);
    }//GEN-LAST:event_StudentBtnMouseEntered

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminBtn;
    private javax.swing.JPanel LoginAsPanel;
    private javax.swing.JLabel StudentBtn;
    private javax.swing.JLabel TeacherBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel smsPanel;
    // End of variables declaration//GEN-END:variables
}
