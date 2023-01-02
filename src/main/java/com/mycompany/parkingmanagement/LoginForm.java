package com.mycompany.parkingmanagement;

import com.mycompany.parkingmanagement.logic.Database;
import java.awt.Color;
import javax.swing.JOptionPane;

public class LoginForm extends javax.swing.JFrame {
  public LoginForm() {
    initComponents();
    setLocationRelativeTo(null);
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jPanel2 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    Username = new javax.swing.JTextField();
    Password = new javax.swing.JPasswordField();
    jPanel3 = new javax.swing.JPanel();
    cta = new javax.swing.JLabel();
    cta_exit = new javax.swing.JLabel();
    username_reminder = new javax.swing.JLabel();
    password_reminder = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setUndecorated(true);

    jPanel1.setBackground(new java.awt.Color(75, 86, 210));

    jLabel3.setBackground(new java.awt.Color(255, 255, 255));
    jLabel3.setForeground(new java.awt.Color(255, 255, 255));
    jLabel3.setIcon(new javax.swing.ImageIcon("D:\\Mata Kuliah\\Semester 3\\OOP\\Final Project\\ParkingSystem\\asset\\rsz_1rsz_parking-logo.png")); // NOI18N

    jLabel4.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(255, 255, 255));
    jLabel4.setText("PARKING MANAGEMENT");

    jLabel5.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(255, 255, 255));
    jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel5.setText("SYSTEM");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(94, 94, 94)
        .addComponent(jLabel3)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addGap(0, 35, Short.MAX_VALUE)
        .addComponent(jLabel4)
        .addGap(32, 32, 32))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jLabel5)
        .addGap(126, 126, 126))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jLabel3)
        .addGap(32, 32, 32)
        .addComponent(jLabel4)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel5)
        .addGap(92, 92, 92))
    );

    jPanel2.setBackground(new java.awt.Color(255, 255, 255));
    jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(0, 0, 0));
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("SIGN IN ACCOUNT");
    jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 220, 60));

    Username.setBackground(new java.awt.Color(241, 246, 245));
    Username.setFont(new java.awt.Font("sansserif", 2, 12)); // NOI18N
    Username.setForeground(new java.awt.Color(149, 149, 149));
    Username.setHorizontalAlignment(javax.swing.JTextField.LEFT);
    Username.setText("Username");
    Username.setToolTipText("");
    Username.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    Username.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusGained(java.awt.event.FocusEvent evt) {
        UsernameFocusGained(evt);
      }
    });
    Username.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        UsernameActionPerformed(evt);
      }
    });
    jPanel2.add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 280, 40));

    Password.setBackground(new java.awt.Color(241, 246, 245));
    Password.setFont(new java.awt.Font("sansserif", 2, 12)); // NOI18N
    Password.setForeground(new java.awt.Color(149, 149, 149));
    Password.setHorizontalAlignment(javax.swing.JTextField.LEFT);
    Password.setText("Password");
    Password.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    Password.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusGained(java.awt.event.FocusEvent evt) {
        PasswordFocusGained(evt);
      }
    });
    jPanel2.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 280, 40));

    jPanel3.setBackground(new java.awt.Color(75, 86, 210));
    jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jPanel3MouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        jPanel3MouseEntered(evt);
      }
    });

    cta.setBackground(new java.awt.Color(255, 255, 255));
    cta.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    cta.setForeground(new java.awt.Color(255, 255, 255));
    cta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    cta.setText("SIGN IN");
    cta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(cta, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(cta, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
    );

    jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 280, 40));

    cta_exit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    cta_exit.setForeground(new java.awt.Color(0, 0, 0));
    cta_exit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    cta_exit.setIcon(new javax.swing.ImageIcon("D:\\Mata Kuliah\\Semester 3\\OOP\\Final Project\\ParkingSystem\\asset\\Vector.png")); // NOI18N
    cta_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    cta_exit.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        cta_exitMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        cta_exitMouseEntered(evt);
      }
    });
    jPanel2.add(cta_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 30, 30));

    username_reminder.setForeground(new java.awt.Color(255, 0, 0));
    jPanel2.add(username_reminder, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 280, -1));

    password_reminder.setForeground(new java.awt.Color(255, 0, 0));
    jPanel2.add(password_reminder, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 280, -1));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGap(0, 0, 0)
        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_UsernameActionPerformed

  private void UsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameFocusGained
    Username.setText("");
  }//GEN-LAST:event_UsernameFocusGained

  private void PasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFocusGained
    Password.setText("");
  }//GEN-LAST:event_PasswordFocusGained

  private void cta_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_exitMouseClicked
    System.exit(0);
  }//GEN-LAST:event_cta_exitMouseClicked

  private void cta_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_exitMouseEntered
    cta_exit.setBackground(new Color(255,0,0));
  }//GEN-LAST:event_cta_exitMouseEntered

  private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
    setBackground(new Color(71, 33, 131));
  }//GEN-LAST:event_jPanel3MouseEntered

  private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
    String _username = Username.getText();
    String _password = Password.getText();
    
    if(_username.length() < 6) {
      username_reminder.setText("Email is too short");
    }
    else username_reminder.setText("");
    
    if(_password.length() < 6) {
      password_reminder.setText("Password is too short");
    }
    else password_reminder.setText("");
    
    Database userLogin = new Database();
    if(userLogin.userAuth(_username, _password) == true &&
      _username.length() >= 6 &&
      _password.length() >= 6
    ) {
      dispose();
      MainView main_view = new MainView();
      main_view.show();
      JOptionPane.showMessageDialog(this,"Login Successful!");
    }
    else {
      JOptionPane.showMessageDialog(this, "Username or password wrong..");
    }
  }//GEN-LAST:event_jPanel3MouseClicked

  public static void main(String args[]) {
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
      java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>
    
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new LoginForm().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPasswordField Password;
  private javax.swing.JTextField Username;
  private javax.swing.JLabel cta;
  private javax.swing.JLabel cta_exit;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JLabel password_reminder;
  private javax.swing.JLabel username_reminder;
  // End of variables declaration//GEN-END:variables
}
