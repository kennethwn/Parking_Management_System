package com.mycompany.parkingmanagement;

import com.mycompany.parkingmanagement.logic.Admin;
import com.mycompany.parkingmanagement.logic.Database;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class LoginForm extends javax.swing.JFrame {
  public LoginForm() {
    initComponents();
    setLocationRelativeTo(null);
  }
  
  private void changeColor(JPanel hover, Color rand) {
    hover.setBackground(rand);
  }
  
  private void changeColor(JLabel label, Color rand) {
    label.setBackground(rand);
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
    Signin_button = new javax.swing.JPanel();
    cta = new javax.swing.JLabel();
    username_reminder = new javax.swing.JLabel();
    password_reminder = new javax.swing.JLabel();
    cta_exit_panel = new javax.swing.JPanel();
    cta_exit = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setUndecorated(true);

    jPanel1.setBackground(new java.awt.Color(75, 86, 210));

    jLabel3.setBackground(new java.awt.Color(255, 255, 255));
    jLabel3.setForeground(new java.awt.Color(255, 255, 255));
    jLabel3.setIcon(new javax.swing.ImageIcon("D:\\Mata Kuliah\\Semester 3\\OOP\\Final Project\\asset\\rsz_1rsz_parking-logo.png")); // NOI18N

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

    Signin_button.setBackground(new java.awt.Color(75, 86, 210));
    Signin_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    Signin_button.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        Signin_buttonMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        Signin_buttonMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        Signin_buttonMouseExited(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        Signin_buttonMousePressed(evt);
      }
      public void mouseReleased(java.awt.event.MouseEvent evt) {
        Signin_buttonMouseReleased(evt);
      }
    });

    cta.setBackground(new java.awt.Color(255, 255, 255));
    cta.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    cta.setForeground(new java.awt.Color(255, 255, 255));
    cta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    cta.setText("SIGN IN");
    cta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

    javax.swing.GroupLayout Signin_buttonLayout = new javax.swing.GroupLayout(Signin_button);
    Signin_button.setLayout(Signin_buttonLayout);
    Signin_buttonLayout.setHorizontalGroup(
      Signin_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(cta, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
    );
    Signin_buttonLayout.setVerticalGroup(
      Signin_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(cta, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
    );

    jPanel2.add(Signin_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 280, 40));

    username_reminder.setForeground(new java.awt.Color(255, 0, 0));
    jPanel2.add(username_reminder, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 280, -1));

    password_reminder.setForeground(new java.awt.Color(255, 0, 0));
    jPanel2.add(password_reminder, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 280, -1));

    cta_exit_panel.setBackground(new java.awt.Color(255, 255, 255));
    cta_exit_panel.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        cta_exit_panelMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        cta_exit_panelMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        cta_exit_panelMouseExited(evt);
      }
    });

    cta_exit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    cta_exit.setForeground(new java.awt.Color(0, 0, 0));
    cta_exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    cta_exit.setIcon(new javax.swing.ImageIcon("D:\\Mata Kuliah\\Semester 3\\OOP\\Final Project\\asset\\Vector.png")); // NOI18N
    cta_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    cta_exit.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        cta_exitMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        cta_exitMouseEntered(evt);
      }
    });

    javax.swing.GroupLayout cta_exit_panelLayout = new javax.swing.GroupLayout(cta_exit_panel);
    cta_exit_panel.setLayout(cta_exit_panelLayout);
    cta_exit_panelLayout.setHorizontalGroup(
      cta_exit_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(cta_exit, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
    );
    cta_exit_panelLayout.setVerticalGroup(
      cta_exit_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cta_exit_panelLayout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addComponent(cta_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    jPanel2.add(cta_exit_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 40, 30));

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
    new StyleGuide().changeColor(cta_exit, Color.red);
  }//GEN-LAST:event_cta_exitMouseEntered

  private void Signin_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Signin_buttonMouseEntered
    new StyleGuide().changeColor(Signin_button, new Color(71, 33, 131));
  }//GEN-LAST:event_Signin_buttonMouseEntered

  private void Signin_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Signin_buttonMouseClicked
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
    
    Admin adminLogin = new Admin();
    if(adminLogin.userAuth(_username, _password) == true &&
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
  }//GEN-LAST:event_Signin_buttonMouseClicked

  private void Signin_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Signin_buttonMouseExited
    new StyleGuide().changeColor(Signin_button, new Color(75,86,210));
  }//GEN-LAST:event_Signin_buttonMouseExited

  private void Signin_buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Signin_buttonMousePressed
    new StyleGuide().changeColor(Signin_button, new Color(75,86,210));
  }//GEN-LAST:event_Signin_buttonMousePressed

  private void Signin_buttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Signin_buttonMouseReleased
    new StyleGuide().changeColor(Signin_button, new Color(71, 33, 131));
  }//GEN-LAST:event_Signin_buttonMouseReleased

  private void cta_exit_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_exit_panelMouseClicked
    System.exit(0);
  }//GEN-LAST:event_cta_exit_panelMouseClicked

  private void cta_exit_panelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_exit_panelMouseEntered
    new StyleGuide().changeColor(cta_exit_panel, Color.red);
  }//GEN-LAST:event_cta_exit_panelMouseEntered

  private void cta_exit_panelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_exit_panelMouseExited
    new StyleGuide().changeColor(cta_exit_panel, new Color(255,255,255));
  }//GEN-LAST:event_cta_exit_panelMouseExited

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
  private javax.swing.JPanel Signin_button;
  private javax.swing.JTextField Username;
  private javax.swing.JLabel cta;
  private javax.swing.JLabel cta_exit;
  private javax.swing.JPanel cta_exit_panel;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JLabel password_reminder;
  private javax.swing.JLabel username_reminder;
  // End of variables declaration//GEN-END:variables
}
