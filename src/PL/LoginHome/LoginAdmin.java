/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PL.LoginHome;

import BL.Person;
import DAL.dataAccessLayer;
import PL.LoginHome.StudentAccount.StudentDashboard;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author slimane
 */
public class LoginAdmin extends javax.swing.JFrame {

    /**
     * Creates new form LoginAdmin
     */
    private static int idPerson;
    public LoginAdmin() {
        initComponents();
        SMSPanel.setBackground(new Color(25,181,254,230));
        smsPanel2.setBackground(new Color(255,255,255,200));
        
        
        
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
        SMSPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        HomeLabel = new javax.swing.JLabel();
        smsPanel2 = new javax.swing.JPanel();
        usernameTxf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        passwordTxF = new javax.swing.JPasswordField();
        LoginJLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        wrongLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(254, 254, 254));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SMSPanel.setBackground(new java.awt.Color(83, 110, 233));

        jLabel1.setBackground(new java.awt.Color(254, 254, 254));
        jLabel1.setFont(new java.awt.Font("Andika", 1, 42)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("School Management System");

        javax.swing.GroupLayout SMSPanelLayout = new javax.swing.GroupLayout(SMSPanel);
        SMSPanel.setLayout(SMSPanelLayout);
        SMSPanelLayout.setHorizontalGroup(
            SMSPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SMSPanelLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addContainerGap(336, Short.MAX_VALUE))
        );
        SMSPanelLayout.setVerticalGroup(
            SMSPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SMSPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jPanel1.add(SMSPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 990, 130));

        HomeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PL/LoginHome/image/LoginHome.png"))); // NOI18N
        HomeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HomeLabelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                HomeLabelMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeLabelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomeLabelMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomeLabelMouseEntered(evt);
            }
        });
        jPanel1.add(HomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 510, 122, 49));

        smsPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        smsPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                smsPanel2MouseClicked(evt);
            }
        });
        smsPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usernameTxf.setFont(new java.awt.Font("Andika", 0, 20)); // NOI18N
        usernameTxf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameTxf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        usernameTxf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameTxfMouseClicked(evt);
            }
        });
        usernameTxf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTxfActionPerformed(evt);
            }
        });
        smsPanel2.add(usernameTxf, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 270, 45));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PL/LoginHome/image/userr4.png"))); // NOI18N
        smsPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 40, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PL/LoginHome/image/locked4.png"))); // NOI18N
        smsPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 30, 40));

        passwordTxF.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        passwordTxF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordTxF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        passwordTxF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordTxFMouseClicked(evt);
            }
        });
        passwordTxF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTxFActionPerformed(evt);
            }
        });
        smsPanel2.add(passwordTxF, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 270, 45));

        LoginJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PL/LoginHome/image/LoginB.png"))); // NOI18N
        LoginJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LoginJLabelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LoginJLabelMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginJLabelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginJLabelMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginJLabelMouseEntered(evt);
            }
        });
        LoginJLabel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                LoginJLabelKeyTyped(evt);
            }
        });
        smsPanel2.add(LoginJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 100, 40));

        jLabel6.setBackground(new java.awt.Color(254, 254, 254));
        jLabel6.setFont(new java.awt.Font("Andika", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(65, 46, 46));
        jLabel6.setText("Admin Login Panel");
        smsPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 58));

        wrongLabel.setForeground(new java.awt.Color(235, 20, 20));
        smsPanel2.add(wrongLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 230, 20));

        jPanel1.add(smsPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 350, 280));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PL/LoginHome/image/Background.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 1010, 710));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTxfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTxfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTxfActionPerformed

    private void passwordTxFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTxFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTxFActionPerformed

    private void LoginJLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginJLabelMouseEntered
        ImageIcon ii = new ImageIcon(getClass().getResource("/PL/LoginHome/image/LoginOnPressedB.png"));
        LoginJLabel.setIcon(ii);
    }//GEN-LAST:event_LoginJLabelMouseEntered

    private void LoginJLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginJLabelMouseExited
        ImageIcon ii = new ImageIcon(getClass().getResource("/PL/LoginHome/image/LoginB.png"));
        LoginJLabel.setIcon(ii);
    }//GEN-LAST:event_LoginJLabelMouseExited

    private void LoginJLabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginJLabelMouseReleased
        ImageIcon ii = new ImageIcon(getClass().getResource("/PL/LoginHome/image/LoginB.png"));
        LoginJLabel.setIcon(ii);
    }//GEN-LAST:event_LoginJLabelMouseReleased

    private void LoginJLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginJLabelMousePressed
        ImageIcon ii = new ImageIcon(getClass().getResource("/PL/LoginHome/image/LoginOnClickB.png"));
        LoginJLabel.setIcon(ii);
    }//GEN-LAST:event_LoginJLabelMousePressed

    private void HomeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeLabelMouseEntered
        ImageIcon ii = new ImageIcon(getClass().getResource("/PL/LoginHome/image/LoginHomeOnPressed.png"));
        HomeLabel.setIcon(ii);
    }//GEN-LAST:event_HomeLabelMouseEntered

    private void HomeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeLabelMouseExited
        ImageIcon ii = new ImageIcon(getClass().getResource("/PL/LoginHome/image/LoginHome.png"));
        HomeLabel.setIcon(ii);
    }//GEN-LAST:event_HomeLabelMouseExited

    private void HomeLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeLabelMousePressed
        ImageIcon ii = new ImageIcon(getClass().getResource("/PL/LoginHome/image/LoginHomeOnClick.png"));
        HomeLabel.setIcon(ii);
    }//GEN-LAST:event_HomeLabelMousePressed

    private void HomeLabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeLabelMouseReleased
        ImageIcon ii = new ImageIcon(getClass().getResource("/PL/LoginHome/image/LoginHome.png"));
        HomeLabel.setIcon(ii);
    }//GEN-LAST:event_HomeLabelMouseReleased

    private void HomeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeLabelMouseClicked
        new LoginHome().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_HomeLabelMouseClicked

    public int idPerso(String username, String password){
        int id = 0;
        dataAccessLayer dal = new dataAccessLayer();
        String sql="select idPerson from persons where username = '"+ username+"' and password = '"+ password +"';";

            try {
                dal.stmt = dal.conn.createStatement();
                dal.rs = dal.stmt.executeQuery(sql);
                if(dal.rs.next()){
                    id= dal.rs.getInt(1);
                }
            } catch (SQLException ex) {
            }
       
        return id;
    }
    private void LoginJLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginJLabelMouseClicked
        Person pr = new Person();
        int i=0;
        boolean go= pr.login(usernameTxf.getText(), passwordTxF.getText());
        System.out.println(usernameTxf.getText()+"  -----"+" ----- " +passwordTxF.getText());
        if(go == true){ 
           new StudentDashboard().setVisible(true);
           this.setVisible(false);
           i = idPerso(usernameTxf.getText(), passwordTxF.getText());
        }else{
           usernameTxf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,0,22), 2)); 
           passwordTxF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 22)));  
           wrongLabel.setText("username or password is invalid !");
        }
        
         this.idPerson = i;
         System.out.println("from login "+idPerson);
    }//GEN-LAST:event_LoginJLabelMouseClicked

    public int getIdPerson(){
        return this.idPerson;
    }
    
    private void smsPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_smsPanel2MouseClicked
        usernameTxf.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,0,0)));
        passwordTxF.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,0,0)));
        passwordTxF.setText(null);
        wrongLabel.setVisible(false);
        
                
    }//GEN-LAST:event_smsPanel2MouseClicked

    private void LoginJLabelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LoginJLabelKeyTyped
       
    }//GEN-LAST:event_LoginJLabelKeyTyped

    private void usernameTxfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameTxfMouseClicked
        usernameTxf.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,0,0)));
    }//GEN-LAST:event_usernameTxfMouseClicked

    private void passwordTxFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordTxFMouseClicked
        passwordTxF.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,0,0)));
        
    }//GEN-LAST:event_passwordTxFMouseClicked

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
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        LoginAdmin ls = new LoginAdmin();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HomeLabel;
    private javax.swing.JLabel LoginJLabel;
    private javax.swing.JPanel SMSPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passwordTxF;
    private javax.swing.JPanel smsPanel2;
    private javax.swing.JTextField usernameTxf;
    private javax.swing.JLabel wrongLabel;
    // End of variables declaration//GEN-END:variables
}
