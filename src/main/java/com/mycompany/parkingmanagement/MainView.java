package com.mycompany.parkingmanagement;

import java.awt.Color;
import javax.swing.JFrame;


public class MainView extends javax.swing.JFrame {
  private CtaButton cta_button = new CtaButton();

  /** Creates new form MainView */
  public MainView() {
    initComponents();
    setLocationRelativeTo(null);
    setExtendedState(JFrame.MAXIMIZED_BOTH); 
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    main_panel = new javax.swing.JPanel();
    side_panel = new javax.swing.JPanel();
    jSeparator1 = new javax.swing.JSeparator();
    title = new javax.swing.JLabel();
    user_pic = new javax.swing.JLabel();
    cta_beranda = new javax.swing.JPanel();
    home_icon = new javax.swing.JLabel();
    beranda = new javax.swing.JLabel();
    cta_daftar_kendaraan = new javax.swing.JPanel();
    list_icon = new javax.swing.JLabel();
    daftar_kendaraan = new javax.swing.JLabel();
    cta_riwayat = new javax.swing.JPanel();
    repo_icon = new javax.swing.JLabel();
    riwayat = new javax.swing.JLabel();
    jSeparator2 = new javax.swing.JSeparator();
    cta_signout = new javax.swing.JPanel();
    signout_icon = new javax.swing.JLabel();
    sign_out = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setBackground(new java.awt.Color(255, 255, 255));
    setPreferredSize(new java.awt.Dimension(900, 600));

    main_panel.setBackground(new java.awt.Color(255, 255, 255));

    side_panel.setBackground(new java.awt.Color(75, 86, 210));

    jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
    jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

    title.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
    title.setForeground(new java.awt.Color(255, 255, 255));
    title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    title.setText("Selamat Datang, Admin");

    user_pic.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\rsz_11rsz_user.png")); // NOI18N

    cta_beranda.setBackground(new java.awt.Color(75, 86, 210));
    cta_beranda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    cta_beranda.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        cta_berandaMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        cta_berandaMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        cta_berandaMouseExited(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        cta_berandaMousePressed(evt);
      }
    });

    home_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    home_icon.setIcon(new javax.swing.ImageIcon("D:\\Mata Kuliah\\Semester 3\\OOP\\Final Project\\asset\\icons8-home-page-30.png")); // NOI18N

    beranda.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
    beranda.setForeground(new java.awt.Color(255, 255, 255));
    beranda.setText("Beranda");

    javax.swing.GroupLayout cta_berandaLayout = new javax.swing.GroupLayout(cta_beranda);
    cta_beranda.setLayout(cta_berandaLayout);
    cta_berandaLayout.setHorizontalGroup(
      cta_berandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(cta_berandaLayout.createSequentialGroup()
        .addComponent(home_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(beranda, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
    );
    cta_berandaLayout.setVerticalGroup(
      cta_berandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(cta_berandaLayout.createSequentialGroup()
        .addGroup(cta_berandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(home_icon, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
          .addComponent(beranda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(0, 0, 0))
    );

    cta_daftar_kendaraan.setBackground(new java.awt.Color(75, 86, 210));
    cta_daftar_kendaraan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    cta_daftar_kendaraan.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        cta_daftar_kendaraanMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        cta_daftar_kendaraanMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        cta_daftar_kendaraanMouseExited(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        cta_daftar_kendaraanMousePressed(evt);
      }
    });

    list_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    list_icon.setIcon(new javax.swing.ImageIcon("D:\\Mata Kuliah\\Semester 3\\OOP\\Final Project\\asset\\icons8-bullet-list-30.png")); // NOI18N

    daftar_kendaraan.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
    daftar_kendaraan.setForeground(new java.awt.Color(255, 255, 255));
    daftar_kendaraan.setText("Daftar Kendaraan");

    javax.swing.GroupLayout cta_daftar_kendaraanLayout = new javax.swing.GroupLayout(cta_daftar_kendaraan);
    cta_daftar_kendaraan.setLayout(cta_daftar_kendaraanLayout);
    cta_daftar_kendaraanLayout.setHorizontalGroup(
      cta_daftar_kendaraanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(cta_daftar_kendaraanLayout.createSequentialGroup()
        .addComponent(list_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(daftar_kendaraan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    cta_daftar_kendaraanLayout.setVerticalGroup(
      cta_daftar_kendaraanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(cta_daftar_kendaraanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        .addComponent(list_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(daftar_kendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    cta_riwayat.setBackground(new java.awt.Color(75, 86, 210));
    cta_riwayat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    cta_riwayat.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        cta_riwayatMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        cta_riwayatMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        cta_riwayatMouseExited(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        cta_riwayatMousePressed(evt);
      }
    });

    repo_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    repo_icon.setIcon(new javax.swing.ImageIcon("D:\\Mata Kuliah\\Semester 3\\OOP\\Final Project\\asset\\icons8-repository-30.png")); // NOI18N

    riwayat.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
    riwayat.setForeground(new java.awt.Color(255, 255, 255));
    riwayat.setText("Riwayat");

    javax.swing.GroupLayout cta_riwayatLayout = new javax.swing.GroupLayout(cta_riwayat);
    cta_riwayat.setLayout(cta_riwayatLayout);
    cta_riwayatLayout.setHorizontalGroup(
      cta_riwayatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(cta_riwayatLayout.createSequentialGroup()
        .addComponent(repo_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(riwayat, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
    );
    cta_riwayatLayout.setVerticalGroup(
      cta_riwayatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(repo_icon, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
      .addComponent(riwayat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

    cta_signout.setBackground(new java.awt.Color(75, 86, 210));
    cta_signout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    cta_signout.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        cta_signoutMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        cta_signoutMouseExited(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        cta_signoutMousePressed(evt);
      }
      public void mouseReleased(java.awt.event.MouseEvent evt) {
        cta_signoutMouseReleased(evt);
      }
    });

    signout_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    signout_icon.setIcon(new javax.swing.ImageIcon("D:\\Mata Kuliah\\Semester 3\\OOP\\Final Project\\asset\\icons8-logout-32.png")); // NOI18N

    sign_out.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
    sign_out.setForeground(new java.awt.Color(255, 255, 255));
    sign_out.setText("Sign Out");

    javax.swing.GroupLayout cta_signoutLayout = new javax.swing.GroupLayout(cta_signout);
    cta_signout.setLayout(cta_signoutLayout);
    cta_signoutLayout.setHorizontalGroup(
      cta_signoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(cta_signoutLayout.createSequentialGroup()
        .addGap(61, 61, 61)
        .addComponent(signout_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(sign_out, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(24, 24, 24))
    );
    cta_signoutLayout.setVerticalGroup(
      cta_signoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(signout_icon, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
      .addComponent(sign_out, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout side_panelLayout = new javax.swing.GroupLayout(side_panel);
    side_panel.setLayout(side_panelLayout);
    side_panelLayout.setHorizontalGroup(
      side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jSeparator1)
      .addComponent(cta_beranda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(cta_daftar_kendaraan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(jSeparator2)
      .addComponent(cta_signout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(side_panelLayout.createSequentialGroup()
        .addGroup(side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(side_panelLayout.createSequentialGroup()
            .addGap(15, 15, 15)
            .addComponent(title))
          .addGroup(side_panelLayout.createSequentialGroup()
            .addGap(93, 93, 93)
            .addComponent(user_pic)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(side_panelLayout.createSequentialGroup()
        .addComponent(cta_riwayat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );
    side_panelLayout.setVerticalGroup(
      side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(side_panelLayout.createSequentialGroup()
        .addGap(30, 30, 30)
        .addComponent(user_pic, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(title)
        .addGap(18, 18, 18)
        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(cta_beranda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(cta_daftar_kendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(cta_riwayat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(cta_signout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    javax.swing.GroupLayout main_panelLayout = new javax.swing.GroupLayout(main_panel);
    main_panel.setLayout(main_panelLayout);
    main_panelLayout.setHorizontalGroup(
      main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(main_panelLayout.createSequentialGroup()
        .addComponent(side_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 906, Short.MAX_VALUE))
    );
    main_panelLayout.setVerticalGroup(
      main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(side_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void cta_berandaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_berandaMouseEntered
    cta_button.changeColor(cta_beranda, new Color(71, 33, 131));
  }//GEN-LAST:event_cta_berandaMouseEntered

  private void cta_berandaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_berandaMouseExited
    cta_button.changeColor(cta_beranda, new Color(75,86,210));
  }//GEN-LAST:event_cta_berandaMouseExited

  private void cta_berandaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_berandaMousePressed
    
  }//GEN-LAST:event_cta_berandaMousePressed

  private void cta_daftar_kendaraanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_daftar_kendaraanMouseEntered
    cta_button.changeColor(cta_daftar_kendaraan, new Color(71, 33, 131));
  }//GEN-LAST:event_cta_daftar_kendaraanMouseEntered

  private void cta_daftar_kendaraanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_daftar_kendaraanMouseExited
    cta_button.changeColor(cta_daftar_kendaraan, new Color(75,86,210));
  }//GEN-LAST:event_cta_daftar_kendaraanMouseExited

  private void cta_daftar_kendaraanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_daftar_kendaraanMousePressed
    
  }//GEN-LAST:event_cta_daftar_kendaraanMousePressed

  private void cta_riwayatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_riwayatMouseEntered
    cta_button.changeColor(cta_riwayat, new Color(71, 33, 131));
  }//GEN-LAST:event_cta_riwayatMouseEntered

  private void cta_riwayatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_riwayatMouseExited
    cta_button.changeColor(cta_riwayat, new Color(75,86,210));
  }//GEN-LAST:event_cta_riwayatMouseExited

  private void cta_riwayatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_riwayatMousePressed
    
  }//GEN-LAST:event_cta_riwayatMousePressed

  private void cta_signoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_signoutMouseEntered
    cta_button.changeColor(cta_signout, new Color(71,33,131));
  }//GEN-LAST:event_cta_signoutMouseEntered

  private void cta_signoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_signoutMouseExited
    cta_button.changeColor(cta_signout, new Color(75,86,210));
  }//GEN-LAST:event_cta_signoutMouseExited

  private void cta_signoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_signoutMousePressed
    cta_button.changeColor(cta_signout, new Color(75,86,210));
  }//GEN-LAST:event_cta_signoutMousePressed

  private void cta_signoutMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_signoutMouseReleased
    cta_button.changeColor(cta_signout, new Color(71,33,131));
  }//GEN-LAST:event_cta_signoutMouseReleased

  private void cta_berandaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_berandaMouseClicked
    cta_button.changeColor(cta_beranda, new Color(71, 33, 131));
    cta_button.changeColor(cta_daftar_kendaraan, new Color(75,86,210));
    cta_button.changeColor(cta_riwayat, new Color(75,86,210));
  }//GEN-LAST:event_cta_berandaMouseClicked

  private void cta_daftar_kendaraanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_daftar_kendaraanMouseClicked
    cta_button.changeColor(cta_daftar_kendaraan, new Color(71, 33, 131));
    cta_button.changeColor(cta_beranda, new Color(75,86,210));
    cta_button.changeColor(cta_riwayat, new Color(75,86,210));
  }//GEN-LAST:event_cta_daftar_kendaraanMouseClicked

  private void cta_riwayatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_riwayatMouseClicked
    cta_button.changeColor(cta_riwayat, new Color(71, 33, 131));
    cta_button.changeColor(cta_beranda, new Color(75,86,210));
    cta_button.changeColor(cta_daftar_kendaraan, new Color(75,86,210));
  }//GEN-LAST:event_cta_riwayatMouseClicked

  
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
      java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new MainView().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel beranda;
  private javax.swing.JPanel cta_beranda;
  private javax.swing.JPanel cta_daftar_kendaraan;
  private javax.swing.JPanel cta_riwayat;
  private javax.swing.JPanel cta_signout;
  private javax.swing.JLabel daftar_kendaraan;
  private javax.swing.JLabel home_icon;
  private javax.swing.JSeparator jSeparator1;
  private javax.swing.JSeparator jSeparator2;
  private javax.swing.JLabel list_icon;
  private javax.swing.JPanel main_panel;
  private javax.swing.JLabel repo_icon;
  private javax.swing.JLabel riwayat;
  private javax.swing.JPanel side_panel;
  private javax.swing.JLabel sign_out;
  private javax.swing.JLabel signout_icon;
  private javax.swing.JLabel title;
  private javax.swing.JLabel user_pic;
  // End of variables declaration//GEN-END:variables
}
