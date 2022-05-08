/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cafe_management_system;

import dao.Userdao;

/**
 *
 * @author POULAMI
 */
public class ChangePassword extends javax.swing.JFrame {

    public String userEmail;

    /**
     * Creates new form ChangePassword
     */
    public ChangePassword() {
        initComponents();
    }

    public ChangePassword(String email) {
        initComponents();
        userEmail = email;
        btnupdate.setEnabled(false);
    }
    
    public void validateField(){
        String oldPassword = txtold.getText();
        String newPassword = txtnew.getText();
        String confirmPassword = txtconfirm.getText();
        if(!oldPassword.equals("") && !newPassword.equals("") && !confirmPassword.equals("") && newPassword.equals(confirmPassword)){
            btnupdate.setEnabled(true);
        }
        else
        btnupdate.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtoldpassword = new javax.swing.JLabel();
        txtnewpassword = new javax.swing.JLabel();
        txtconfirmpassword = new javax.swing.JLabel();
        txtold = new javax.swing.JPasswordField();
        txtnew = new javax.swing.JPasswordField();
        txtconfirm = new javax.swing.JPasswordField();
        btnupdate = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 134));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/change Password.png"))); // NOI18N
        jLabel1.setText("Change Password");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 25, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 25, -1, -1));

        txtoldpassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtoldpassword.setText("Old Password");
        getContentPane().add(txtoldpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 101, -1, -1));

        txtnewpassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtnewpassword.setText("New Password");
        getContentPane().add(txtnewpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 150, -1, -1));

        txtconfirmpassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtconfirmpassword.setText("Confirm Password");
        getContentPane().add(txtconfirmpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 199, -1, -1));

        txtold.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtold.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtoldKeyReleased(evt);
            }
        });
        getContentPane().add(txtold, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 98, 280, -1));

        txtnew.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtnew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnewKeyReleased(evt);
            }
        });
        getContentPane().add(txtnew, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 147, 280, -1));

        txtconfirm.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtconfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtconfirmActionPerformed(evt);
            }
        });
        txtconfirm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtconfirmKeyReleased(evt);
            }
        });
        getContentPane().add(txtconfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 196, 280, -1));

        btnupdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 245, -1, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 245, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/9.01.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtconfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtconfirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtconfirmActionPerformed

    private void txtoldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtoldKeyReleased
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_txtoldKeyReleased

    private void txtnewKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnewKeyReleased
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_txtnewKeyReleased

    private void txtconfirmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtconfirmKeyReleased
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_txtconfirmKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new ChangePassword(userEmail).setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        String oldPassword = txtold.getText();
        String newPassword = txtnew.getText();
        Userdao.changePassword(userEmail,oldPassword,newPassword);
        setVisible(false);
        new ChangePassword(userEmail).setVisible(true);
    }//GEN-LAST:event_btnupdateActionPerformed

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
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField txtconfirm;
    private javax.swing.JLabel txtconfirmpassword;
    private javax.swing.JPasswordField txtnew;
    private javax.swing.JLabel txtnewpassword;
    private javax.swing.JPasswordField txtold;
    private javax.swing.JLabel txtoldpassword;
    // End of variables declaration//GEN-END:variables
}
