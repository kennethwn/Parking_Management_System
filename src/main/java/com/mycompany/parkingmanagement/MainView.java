package com.mycompany.parkingmanagement;

import com.mycompany.parkingmanagement.logic.Vehicles.Dashboard;
import com.mycompany.parkingmanagement.logic.Vehicles.History;
import com.mycompany.parkingmanagement.logic.Vehicles.VehicleList;
import java.awt.Color;
import javax.swing.JLabel;


public class MainView extends javax.swing.JFrame {
  private StyleGuide cta_button = new StyleGuide();
  private StyleGuide _font = new StyleGuide();
  
  private Dashboard dashboard = new Dashboard();
  private VehicleList vehicle_list = new VehicleList();
  private History history = new History();

  /** Creates new form MainView */
  public MainView() {
    setUndecorated(false);
    initComponents();
    setTitle("Parking Management System");
    setLocationRelativeTo(null);
    setResizable(false);
    //setExtendedState(JFrame.MAXIMIZED_BOTH); 
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    typeGroup = new javax.swing.ButtonGroup();
    membershipGroup = new javax.swing.ButtonGroup();
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
    feature_panel = new javax.swing.JPanel();
    beranda_panel = new javax.swing.JPanel();
    keterangan = new javax.swing.JPanel();
    nopol_panel = new javax.swing.JPanel();
    nopol_title = new javax.swing.JLabel();
    nopol_input = new javax.swing.JTextField();
    status_panel = new javax.swing.JPanel();
    status_title = new javax.swing.JLabel();
    member_radio = new javax.swing.JRadioButton();
    nonmember_radio = new javax.swing.JRadioButton();
    tipe_panel = new javax.swing.JPanel();
    tipe_title = new javax.swing.JLabel();
    mobil_radio = new javax.swing.JRadioButton();
    motor_radio = new javax.swing.JRadioButton();
    truk_radio = new javax.swing.JRadioButton();
    bus_radio = new javax.swing.JRadioButton();
    cta_button_next = new javax.swing.JPanel();
    cta_next = new javax.swing.JLabel();
    pic_1 = new javax.swing.JPanel();
    pic_2 = new javax.swing.JPanel();
    daftar_kendaraan_panel = new javax.swing.JPanel();
    table_panel = new javax.swing.JPanel();
    table_title_panel = new javax.swing.JPanel();
    daftar_kendaraan_title = new javax.swing.JLabel();
    total_title = new javax.swing.JLabel();
    num_jumlah_kendaraan = new javax.swing.JLabel();
    jScrollPane2 = new javax.swing.JScrollPane();
    jTable1 = new javax.swing.JTable();
    mobil_panel = new javax.swing.JPanel();
    mobil_title_panel = new javax.swing.JPanel();
    mobil_title = new javax.swing.JLabel();
    total_mobil_parkir = new javax.swing.JLabel();
    motor_panel = new javax.swing.JPanel();
    motor_title_panel = new javax.swing.JPanel();
    motor_title = new javax.swing.JLabel();
    total_motor_parkir = new javax.swing.JLabel();
    others_panel = new javax.swing.JPanel();
    others_title_panel = new javax.swing.JPanel();
    others_title = new javax.swing.JLabel();
    total_lainnya_parkir = new javax.swing.JLabel();
    history_panel = new javax.swing.JPanel();
    table_riwayat_panel = new javax.swing.JPanel();
    table_riwayat_title_panel = new javax.swing.JPanel();
    table_riwayat_title = new javax.swing.JLabel();
    jScrollPane4 = new javax.swing.JScrollPane();
    jTable2 = new javax.swing.JTable();
    search_panel = new javax.swing.JPanel();
    search_textfield = new javax.swing.JTextField();
    cta_search = new javax.swing.JButton();
    payment_panel = new javax.swing.JPanel();
    kosong_panel = new javax.swing.JPanel();
    kosong_title_panel = new javax.swing.JPanel();
    kosong_title = new javax.swing.JLabel();
    jumlah_kosong = new javax.swing.JLabel();
    terisi_panel = new javax.swing.JPanel();
    terisi_title_panel = new javax.swing.JPanel();
    terisit_title = new javax.swing.JLabel();
    jumlah_terisi = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    table_status_payment1 = new javax.swing.JTable();
    cta_button_validate = new javax.swing.JPanel();
    cta_validate = new javax.swing.JLabel();
    validated_panel = new javax.swing.JPanel();
    kosong_panel2 = new javax.swing.JPanel();
    kosong_title_panel2 = new javax.swing.JPanel();
    kosong_title1 = new javax.swing.JLabel();
    jumlah_kosong2 = new javax.swing.JLabel();
    terisi_panel2 = new javax.swing.JPanel();
    terisi_title_panel2 = new javax.swing.JPanel();
    terisit_title2 = new javax.swing.JLabel();
    jumlah_terisi2 = new javax.swing.JLabel();
    jScrollPane3 = new javax.swing.JScrollPane();
    table_status_payment3 = new javax.swing.JTable();
    cta_button_return_beranda = new javax.swing.JPanel();
    cta_return_beranda = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setBackground(new java.awt.Color(255, 255, 255));
    setExtendedState(1);
    setPreferredSize(new java.awt.Dimension(1300, 700));
    setResizable(false);

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
      public void mouseReleased(java.awt.event.MouseEvent evt) {
        cta_berandaMouseReleased(evt);
      }
    });

    home_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    home_icon.setIcon(new javax.swing.ImageIcon("D:\\Mata Kuliah\\Semester 3\\OOP\\Final Project\\asset\\icons8-home-page-30.png")); // NOI18N

    beranda.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
    beranda.setForeground(new java.awt.Color(255, 255, 255));
    beranda.setText("Beranda");

    javax.swing.GroupLayout cta_berandaLayout = new javax.swing.GroupLayout(cta_beranda);
    cta_beranda.setLayout(cta_berandaLayout);
    cta_berandaLayout.setHorizontalGroup(
      cta_berandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(cta_berandaLayout.createSequentialGroup()
        .addGap(16, 16, 16)
        .addComponent(home_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(beranda, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    cta_berandaLayout.setVerticalGroup(
      cta_berandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(home_icon, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
      .addComponent(beranda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        .addGap(16, 16, 16)
        .addComponent(list_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(daftar_kendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    cta_daftar_kendaraanLayout.setVerticalGroup(
      cta_daftar_kendaraanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(list_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(daftar_kendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        .addGap(16, 16, 16)
        .addComponent(repo_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(riwayat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
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
        .addGap(66, 66, 66)
        .addComponent(signout_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(sign_out, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
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
      .addComponent(cta_daftar_kendaraan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(jSeparator2)
      .addComponent(cta_signout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(side_panelLayout.createSequentialGroup()
        .addGroup(side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(side_panelLayout.createSequentialGroup()
            .addGroup(side_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(side_panelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(title))
              .addGroup(side_panelLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(user_pic)))
            .addGap(0, 0, Short.MAX_VALUE))
          .addComponent(cta_riwayat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(cta_beranda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap())
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
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(cta_signout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    feature_panel.setBackground(new java.awt.Color(255, 255, 255));
    feature_panel.setLayout(new java.awt.CardLayout());

    beranda_panel.setBackground(new java.awt.Color(255, 255, 255));

    keterangan.setBackground(new java.awt.Color(255, 255, 255));
    keterangan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    nopol_panel.setBackground(new java.awt.Color(255, 255, 255));

    nopol_title.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
    nopol_title.setForeground(new java.awt.Color(0, 0, 0));
    nopol_title.setText("Nomor Polisi : ");

    nopol_input.setBackground(new java.awt.Color(241, 246, 245));
    nopol_input.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
    nopol_input.setForeground(new java.awt.Color(149, 149, 149));
    nopol_input.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    nopol_input.setText("x xxxx xx");
    nopol_input.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    nopol_input.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusGained(java.awt.event.FocusEvent evt) {
        nopol_inputFocusGained(evt);
      }
    });

    javax.swing.GroupLayout nopol_panelLayout = new javax.swing.GroupLayout(nopol_panel);
    nopol_panel.setLayout(nopol_panelLayout);
    nopol_panelLayout.setHorizontalGroup(
      nopol_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(nopol_panelLayout.createSequentialGroup()
        .addGap(18, 18, 18)
        .addGroup(nopol_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(nopol_input)
          .addComponent(nopol_title, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE))
        .addContainerGap())
    );
    nopol_panelLayout.setVerticalGroup(
      nopol_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(nopol_panelLayout.createSequentialGroup()
        .addComponent(nopol_title, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(nopol_input, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );

    status_panel.setBackground(new java.awt.Color(255, 255, 255));

    status_title.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
    status_title.setForeground(new java.awt.Color(0, 0, 0));
    status_title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    status_title.setText("Status : ");

    member_radio.setBackground(new java.awt.Color(255, 255, 255));
    membershipGroup.add(member_radio);
    member_radio.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
    member_radio.setForeground(new java.awt.Color(219, 219, 219));
    member_radio.setText("Member");
    member_radio.setEnabled(false);
    member_radio.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        member_radioActionPerformed(evt);
      }
    });

    nonmember_radio.setBackground(new java.awt.Color(255, 255, 255));
    membershipGroup.add(nonmember_radio);
    nonmember_radio.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
    nonmember_radio.setForeground(new java.awt.Color(0, 0, 0));
    nonmember_radio.setText("Nonmember");

    javax.swing.GroupLayout status_panelLayout = new javax.swing.GroupLayout(status_panel);
    status_panel.setLayout(status_panelLayout);
    status_panelLayout.setHorizontalGroup(
      status_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(status_panelLayout.createSequentialGroup()
        .addGap(166, 166, 166)
        .addGroup(status_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(status_panelLayout.createSequentialGroup()
            .addComponent(status_title, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
          .addComponent(member_radio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(nonmember_radio, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
        .addContainerGap())
    );
    status_panelLayout.setVerticalGroup(
      status_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(status_panelLayout.createSequentialGroup()
        .addComponent(status_title, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(member_radio)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(nonmember_radio)
        .addGap(0, 0, Short.MAX_VALUE))
    );

    tipe_panel.setBackground(new java.awt.Color(255, 255, 255));

    tipe_title.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
    tipe_title.setForeground(new java.awt.Color(0, 0, 0));
    tipe_title.setText("Tipe :");

    mobil_radio.setBackground(new java.awt.Color(255, 255, 255));
    typeGroup.add(mobil_radio);
    mobil_radio.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
    mobil_radio.setForeground(new java.awt.Color(0, 0, 0));
    mobil_radio.setText("Mobil");

    motor_radio.setBackground(new java.awt.Color(255, 255, 255));
    typeGroup.add(motor_radio);
    motor_radio.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
    motor_radio.setForeground(new java.awt.Color(0, 0, 0));
    motor_radio.setText("Motor");

    truk_radio.setBackground(new java.awt.Color(255, 255, 255));
    typeGroup.add(truk_radio);
    truk_radio.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
    truk_radio.setForeground(new java.awt.Color(0, 0, 0));
    truk_radio.setText("Truk");

    bus_radio.setBackground(new java.awt.Color(255, 255, 255));
    typeGroup.add(bus_radio);
    bus_radio.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
    bus_radio.setForeground(new java.awt.Color(0, 0, 0));
    bus_radio.setText("Bus");

    javax.swing.GroupLayout tipe_panelLayout = new javax.swing.GroupLayout(tipe_panel);
    tipe_panel.setLayout(tipe_panelLayout);
    tipe_panelLayout.setHorizontalGroup(
      tipe_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tipe_panelLayout.createSequentialGroup()
        .addContainerGap(155, Short.MAX_VALUE)
        .addGroup(tipe_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(bus_radio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(truk_radio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(motor_radio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(mobil_radio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tipe_title, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(34, 34, 34))
    );
    tipe_panelLayout.setVerticalGroup(
      tipe_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(tipe_panelLayout.createSequentialGroup()
        .addComponent(tipe_title, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(mobil_radio)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(motor_radio)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(truk_radio)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(bus_radio)
        .addGap(0, 28, Short.MAX_VALUE))
    );

    cta_button_next.setBackground(new java.awt.Color(75, 86, 210));
    cta_button_next.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    cta_button_next.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        cta_button_nextMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        cta_button_nextMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        cta_button_nextMouseExited(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        cta_button_nextMousePressed(evt);
      }
      public void mouseReleased(java.awt.event.MouseEvent evt) {
        cta_button_nextMouseReleased(evt);
      }
    });

    cta_next.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    cta_next.setForeground(new java.awt.Color(255, 255, 255));
    cta_next.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    cta_next.setText("NEXT");

    javax.swing.GroupLayout cta_button_nextLayout = new javax.swing.GroupLayout(cta_button_next);
    cta_button_next.setLayout(cta_button_nextLayout);
    cta_button_nextLayout.setHorizontalGroup(
      cta_button_nextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(cta_next, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    cta_button_nextLayout.setVerticalGroup(
      cta_button_nextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(cta_next, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout keteranganLayout = new javax.swing.GroupLayout(keterangan);
    keterangan.setLayout(keteranganLayout);
    keteranganLayout.setHorizontalGroup(
      keteranganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(keteranganLayout.createSequentialGroup()
        .addComponent(nopol_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(keteranganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(cta_button_next, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(tipe_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(status_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    keteranganLayout.setVerticalGroup(
      keteranganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(keteranganLayout.createSequentialGroup()
        .addGroup(keteranganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(nopol_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(tipe_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(status_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(18, 18, 18)
        .addComponent(cta_button_next, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 31, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout pic_1Layout = new javax.swing.GroupLayout(pic_1);
    pic_1.setLayout(pic_1Layout);
    pic_1Layout.setHorizontalGroup(
      pic_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 0, Short.MAX_VALUE)
    );
    pic_1Layout.setVerticalGroup(
      pic_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 278, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout pic_2Layout = new javax.swing.GroupLayout(pic_2);
    pic_2.setLayout(pic_2Layout);
    pic_2Layout.setHorizontalGroup(
      pic_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 435, Short.MAX_VALUE)
    );
    pic_2Layout.setVerticalGroup(
      pic_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 0, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout beranda_panelLayout = new javax.swing.GroupLayout(beranda_panel);
    beranda_panel.setLayout(beranda_panelLayout);
    beranda_panelLayout.setHorizontalGroup(
      beranda_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(beranda_panelLayout.createSequentialGroup()
        .addGap(60, 60, 60)
        .addGroup(beranda_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(keterangan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(beranda_panelLayout.createSequentialGroup()
            .addComponent(pic_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGap(18, 18, 18)
            .addComponent(pic_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(110, Short.MAX_VALUE))
    );
    beranda_panelLayout.setVerticalGroup(
      beranda_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(beranda_panelLayout.createSequentialGroup()
        .addContainerGap(14, Short.MAX_VALUE)
        .addGroup(beranda_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(pic_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(pic_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(18, 18, 18)
        .addComponent(keterangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(68, 68, 68))
    );

    feature_panel.add(beranda_panel, "card2");

    daftar_kendaraan_panel.setBackground(new java.awt.Color(255, 255, 255));

    table_title_panel.setBackground(new java.awt.Color(75, 86, 210));

    daftar_kendaraan_title.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
    daftar_kendaraan_title.setForeground(new java.awt.Color(255, 255, 255));
    daftar_kendaraan_title.setText("Daftar Kendaraan");

    total_title.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
    total_title.setForeground(new java.awt.Color(255, 255, 255));
    total_title.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    total_title.setText("Total : ");

    num_jumlah_kendaraan.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
    num_jumlah_kendaraan.setForeground(new java.awt.Color(255, 0, 0));
    num_jumlah_kendaraan.setText("30");

    javax.swing.GroupLayout table_title_panelLayout = new javax.swing.GroupLayout(table_title_panel);
    table_title_panel.setLayout(table_title_panelLayout);
    table_title_panelLayout.setHorizontalGroup(
      table_title_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(table_title_panelLayout.createSequentialGroup()
        .addGap(15, 15, 15)
        .addComponent(daftar_kendaraan_title)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(total_title, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(num_jumlah_kendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0))
    );
    table_title_panelLayout.setVerticalGroup(
      table_title_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(daftar_kendaraan_title, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
      .addComponent(num_jumlah_kendaraan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(total_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    jTable1.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null}
      },
      new String [] {
        "No Polisi", "Tipe", "Merk", "Jam Masuk"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }
    });
    jTable1.getTableHeader().setReorderingAllowed(false);
    jScrollPane2.setViewportView(jTable1);

    javax.swing.GroupLayout table_panelLayout = new javax.swing.GroupLayout(table_panel);
    table_panel.setLayout(table_panelLayout);
    table_panelLayout.setHorizontalGroup(
      table_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(table_title_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(jScrollPane2)
    );
    table_panelLayout.setVerticalGroup(
      table_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(table_panelLayout.createSequentialGroup()
        .addComponent(table_title_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    mobil_panel.setBackground(new java.awt.Color(255, 255, 255));
    mobil_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    mobil_title_panel.setBackground(new java.awt.Color(75, 86, 210));

    mobil_title.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
    mobil_title.setForeground(new java.awt.Color(255, 255, 255));
    mobil_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    mobil_title.setText("MOBIL");

    javax.swing.GroupLayout mobil_title_panelLayout = new javax.swing.GroupLayout(mobil_title_panel);
    mobil_title_panel.setLayout(mobil_title_panelLayout);
    mobil_title_panelLayout.setHorizontalGroup(
      mobil_title_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(mobil_title, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
    );
    mobil_title_panelLayout.setVerticalGroup(
      mobil_title_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(mobil_title, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
    );

    total_mobil_parkir.setFont(new java.awt.Font("sansserif", 0, 60)); // NOI18N
    total_mobil_parkir.setForeground(new java.awt.Color(0, 0, 0));
    total_mobil_parkir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

    javax.swing.GroupLayout mobil_panelLayout = new javax.swing.GroupLayout(mobil_panel);
    mobil_panel.setLayout(mobil_panelLayout);
    mobil_panelLayout.setHorizontalGroup(
      mobil_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(mobil_title_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(total_mobil_parkir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    mobil_panelLayout.setVerticalGroup(
      mobil_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(mobil_panelLayout.createSequentialGroup()
        .addComponent(mobil_title_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(total_mobil_parkir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    motor_panel.setBackground(new java.awt.Color(255, 255, 255));
    motor_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    motor_title_panel.setBackground(new java.awt.Color(75, 86, 210));

    motor_title.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
    motor_title.setForeground(new java.awt.Color(255, 255, 255));
    motor_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    motor_title.setText("MOTOR");

    javax.swing.GroupLayout motor_title_panelLayout = new javax.swing.GroupLayout(motor_title_panel);
    motor_title_panel.setLayout(motor_title_panelLayout);
    motor_title_panelLayout.setHorizontalGroup(
      motor_title_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(motor_title, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
    );
    motor_title_panelLayout.setVerticalGroup(
      motor_title_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(motor_title, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
    );

    total_motor_parkir.setFont(new java.awt.Font("sansserif", 0, 60)); // NOI18N
    total_motor_parkir.setForeground(new java.awt.Color(0, 0, 0));
    total_motor_parkir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

    javax.swing.GroupLayout motor_panelLayout = new javax.swing.GroupLayout(motor_panel);
    motor_panel.setLayout(motor_panelLayout);
    motor_panelLayout.setHorizontalGroup(
      motor_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(motor_title_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(total_motor_parkir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    motor_panelLayout.setVerticalGroup(
      motor_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(motor_panelLayout.createSequentialGroup()
        .addComponent(motor_title_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(total_motor_parkir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    others_panel.setBackground(new java.awt.Color(255, 255, 255));
    others_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    others_title_panel.setBackground(new java.awt.Color(75, 86, 210));

    others_title.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
    others_title.setForeground(new java.awt.Color(255, 255, 255));
    others_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    others_title.setText("LAINNYA");

    javax.swing.GroupLayout others_title_panelLayout = new javax.swing.GroupLayout(others_title_panel);
    others_title_panel.setLayout(others_title_panelLayout);
    others_title_panelLayout.setHorizontalGroup(
      others_title_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(others_title, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
    );
    others_title_panelLayout.setVerticalGroup(
      others_title_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(others_title, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
    );

    total_lainnya_parkir.setFont(new java.awt.Font("sansserif", 0, 60)); // NOI18N
    total_lainnya_parkir.setForeground(new java.awt.Color(0, 0, 0));
    total_lainnya_parkir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

    javax.swing.GroupLayout others_panelLayout = new javax.swing.GroupLayout(others_panel);
    others_panel.setLayout(others_panelLayout);
    others_panelLayout.setHorizontalGroup(
      others_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(others_title_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(total_lainnya_parkir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    others_panelLayout.setVerticalGroup(
      others_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(others_panelLayout.createSequentialGroup()
        .addComponent(others_title_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(total_lainnya_parkir, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout daftar_kendaraan_panelLayout = new javax.swing.GroupLayout(daftar_kendaraan_panel);
    daftar_kendaraan_panel.setLayout(daftar_kendaraan_panelLayout);
    daftar_kendaraan_panelLayout.setHorizontalGroup(
      daftar_kendaraan_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, daftar_kendaraan_panelLayout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(daftar_kendaraan_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
          .addComponent(table_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, daftar_kendaraan_panelLayout.createSequentialGroup()
            .addComponent(mobil_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(motor_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(others_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(60, 60, 60))
    );
    daftar_kendaraan_panelLayout.setVerticalGroup(
      daftar_kendaraan_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, daftar_kendaraan_panelLayout.createSequentialGroup()
        .addContainerGap(21, Short.MAX_VALUE)
        .addGroup(daftar_kendaraan_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(mobil_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(motor_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(others_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(33, 33, 33)
        .addComponent(table_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(69, 69, 69))
    );

    feature_panel.add(daftar_kendaraan_panel, "card3");

    history_panel.setBackground(new java.awt.Color(255, 255, 255));

    table_riwayat_title_panel.setBackground(new java.awt.Color(75, 86, 210));

    table_riwayat_title.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
    table_riwayat_title.setForeground(new java.awt.Color(255, 255, 255));
    table_riwayat_title.setText("Daftar Kendaraan");

    javax.swing.GroupLayout table_riwayat_title_panelLayout = new javax.swing.GroupLayout(table_riwayat_title_panel);
    table_riwayat_title_panel.setLayout(table_riwayat_title_panelLayout);
    table_riwayat_title_panelLayout.setHorizontalGroup(
      table_riwayat_title_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(table_riwayat_title_panelLayout.createSequentialGroup()
        .addGap(17, 17, 17)
        .addComponent(table_riwayat_title)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    table_riwayat_title_panelLayout.setVerticalGroup(
      table_riwayat_title_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(table_riwayat_title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
    );

    jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));

    jTable2.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null}
      },
      new String [] {
        "Tanggal Keluar", "No Polisi", "Tipe ", "Merk", "Jam Masuk", "Jam Keluar"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
      };
      boolean[] canEdit = new boolean [] {
        false, false, false, false, false, false
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    jTable2.getTableHeader().setReorderingAllowed(false);
    jScrollPane4.setViewportView(jTable2);
    if (jTable2.getColumnModel().getColumnCount() > 0) {
      jTable2.getColumnModel().getColumn(0).setResizable(false);
      jTable2.getColumnModel().getColumn(1).setResizable(false);
      jTable2.getColumnModel().getColumn(2).setResizable(false);
      jTable2.getColumnModel().getColumn(3).setResizable(false);
      jTable2.getColumnModel().getColumn(4).setResizable(false);
      jTable2.getColumnModel().getColumn(5).setResizable(false);
    }

    javax.swing.GroupLayout table_riwayat_panelLayout = new javax.swing.GroupLayout(table_riwayat_panel);
    table_riwayat_panel.setLayout(table_riwayat_panelLayout);
    table_riwayat_panelLayout.setHorizontalGroup(
      table_riwayat_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(table_riwayat_title_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
    );
    table_riwayat_panelLayout.setVerticalGroup(
      table_riwayat_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(table_riwayat_panelLayout.createSequentialGroup()
        .addComponent(table_riwayat_title_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE))
    );

    search_panel.setBackground(new java.awt.Color(255, 255, 255));
    search_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    search_textfield.setBackground(new java.awt.Color(255, 255, 255));
    search_textfield.setFont(new java.awt.Font("sansserif", 2, 14)); // NOI18N
    search_textfield.setForeground(new java.awt.Color(149, 149, 149));
    search_textfield.setText("No Polisi");
    search_textfield.setBorder(null);

    javax.swing.GroupLayout search_panelLayout = new javax.swing.GroupLayout(search_panel);
    search_panel.setLayout(search_panelLayout);
    search_panelLayout.setHorizontalGroup(
      search_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, search_panelLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(search_textfield))
    );
    search_panelLayout.setVerticalGroup(
      search_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(search_textfield, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
    );

    cta_search.setBackground(new java.awt.Color(75, 86, 210));
    cta_search.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
    cta_search.setForeground(new java.awt.Color(255, 255, 255));
    cta_search.setText("Search");
    cta_search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

    javax.swing.GroupLayout history_panelLayout = new javax.swing.GroupLayout(history_panel);
    history_panel.setLayout(history_panelLayout);
    history_panelLayout.setHorizontalGroup(
      history_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(history_panelLayout.createSequentialGroup()
        .addGap(55, 55, 55)
        .addGroup(history_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(history_panelLayout.createSequentialGroup()
            .addComponent(search_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGap(18, 18, 18)
            .addComponent(cta_search, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(table_riwayat_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(96, Short.MAX_VALUE))
    );
    history_panelLayout.setVerticalGroup(
      history_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, history_panelLayout.createSequentialGroup()
        .addContainerGap(52, Short.MAX_VALUE)
        .addGroup(history_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(cta_search, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(search_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(37, 37, 37)
        .addComponent(table_riwayat_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(68, 68, 68))
    );

    feature_panel.add(history_panel, "card4");

    payment_panel.setBackground(new java.awt.Color(255, 255, 255));

    kosong_panel.setBackground(new java.awt.Color(255, 255, 255));
    kosong_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    kosong_title_panel.setBackground(new java.awt.Color(75, 86, 210));

    kosong_title.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
    kosong_title.setForeground(new java.awt.Color(255, 255, 255));
    kosong_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    kosong_title.setText("KOSONG");

    javax.swing.GroupLayout kosong_title_panelLayout = new javax.swing.GroupLayout(kosong_title_panel);
    kosong_title_panel.setLayout(kosong_title_panelLayout);
    kosong_title_panelLayout.setHorizontalGroup(
      kosong_title_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(kosong_title, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
    );
    kosong_title_panelLayout.setVerticalGroup(
      kosong_title_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(kosong_title, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
    );

    jumlah_kosong.setFont(new java.awt.Font("sansserif", 0, 60)); // NOI18N
    jumlah_kosong.setForeground(new java.awt.Color(0, 0, 0));
    jumlah_kosong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

    javax.swing.GroupLayout kosong_panelLayout = new javax.swing.GroupLayout(kosong_panel);
    kosong_panel.setLayout(kosong_panelLayout);
    kosong_panelLayout.setHorizontalGroup(
      kosong_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(kosong_title_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(jumlah_kosong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    kosong_panelLayout.setVerticalGroup(
      kosong_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(kosong_panelLayout.createSequentialGroup()
        .addComponent(kosong_title_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(jumlah_kosong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    terisi_panel.setBackground(new java.awt.Color(255, 255, 255));
    terisi_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    terisi_title_panel.setBackground(new java.awt.Color(75, 86, 210));

    terisit_title.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
    terisit_title.setForeground(new java.awt.Color(255, 255, 255));
    terisit_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    terisit_title.setText("TERISI");

    javax.swing.GroupLayout terisi_title_panelLayout = new javax.swing.GroupLayout(terisi_title_panel);
    terisi_title_panel.setLayout(terisi_title_panelLayout);
    terisi_title_panelLayout.setHorizontalGroup(
      terisi_title_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(terisit_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    terisi_title_panelLayout.setVerticalGroup(
      terisi_title_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(terisit_title, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
    );

    jumlah_terisi.setFont(new java.awt.Font("sansserif", 0, 60)); // NOI18N
    jumlah_terisi.setForeground(new java.awt.Color(0, 0, 0));
    jumlah_terisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

    javax.swing.GroupLayout terisi_panelLayout = new javax.swing.GroupLayout(terisi_panel);
    terisi_panel.setLayout(terisi_panelLayout);
    terisi_panelLayout.setHorizontalGroup(
      terisi_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(terisi_title_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(jumlah_terisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    terisi_panelLayout.setVerticalGroup(
      terisi_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(terisi_panelLayout.createSequentialGroup()
        .addComponent(terisi_title_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(jumlah_terisi, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
    );

    table_status_payment1.setBackground(new java.awt.Color(255, 255, 255));
    table_status_payment1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    table_status_payment1.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null}
      },
      new String [] {
        "Nomor Polisi", "Tipe ", "Status", "Metode", "Tarif", "Status Pembayaran"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
      };
      boolean[] canEdit = new boolean [] {
        false, false, false, false, false, false
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    table_status_payment1.setGridColor(new java.awt.Color(0, 0, 0));
    table_status_payment1.getTableHeader().setReorderingAllowed(false);
    jScrollPane1.setViewportView(table_status_payment1);
    if (table_status_payment1.getColumnModel().getColumnCount() > 0) {
      table_status_payment1.getColumnModel().getColumn(0).setResizable(false);
      table_status_payment1.getColumnModel().getColumn(1).setResizable(false);
      table_status_payment1.getColumnModel().getColumn(2).setResizable(false);
      table_status_payment1.getColumnModel().getColumn(3).setResizable(false);
      table_status_payment1.getColumnModel().getColumn(4).setResizable(false);
      table_status_payment1.getColumnModel().getColumn(5).setResizable(false);
    }

    cta_button_validate.setBackground(new java.awt.Color(75, 86, 210));
    cta_button_validate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    cta_button_validate.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        cta_button_validateMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        cta_button_validateMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        cta_button_validateMouseExited(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        cta_button_validateMousePressed(evt);
      }
      public void mouseReleased(java.awt.event.MouseEvent evt) {
        cta_button_validateMouseReleased(evt);
      }
    });

    cta_validate.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
    cta_validate.setForeground(new java.awt.Color(255, 255, 255));
    cta_validate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    cta_validate.setText("VALIDASI BAYAR");

    javax.swing.GroupLayout cta_button_validateLayout = new javax.swing.GroupLayout(cta_button_validate);
    cta_button_validate.setLayout(cta_button_validateLayout);
    cta_button_validateLayout.setHorizontalGroup(
      cta_button_validateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(cta_validate, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
    );
    cta_button_validateLayout.setVerticalGroup(
      cta_button_validateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(cta_validate, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout payment_panelLayout = new javax.swing.GroupLayout(payment_panel);
    payment_panel.setLayout(payment_panelLayout);
    payment_panelLayout.setHorizontalGroup(
      payment_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(payment_panelLayout.createSequentialGroup()
        .addGroup(payment_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(payment_panelLayout.createSequentialGroup()
            .addGap(367, 367, 367)
            .addComponent(cta_button_validate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(payment_panelLayout.createSequentialGroup()
            .addGap(60, 60, 60)
            .addGroup(payment_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGroup(payment_panelLayout.createSequentialGroup()
                .addComponent(kosong_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(terisi_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        .addContainerGap(103, Short.MAX_VALUE))
    );
    payment_panelLayout.setVerticalGroup(
      payment_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(payment_panelLayout.createSequentialGroup()
        .addGap(48, 48, 48)
        .addGroup(payment_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(terisi_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(kosong_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(34, 34, 34)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(43, 43, 43)
        .addComponent(cta_button_validate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(22, Short.MAX_VALUE))
    );

    feature_panel.add(payment_panel, "card5");

    validated_panel.setBackground(new java.awt.Color(255, 255, 255));

    kosong_panel2.setBackground(new java.awt.Color(255, 255, 255));
    kosong_panel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    kosong_title_panel2.setBackground(new java.awt.Color(75, 86, 210));

    kosong_title1.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
    kosong_title1.setForeground(new java.awt.Color(255, 255, 255));
    kosong_title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    kosong_title1.setText("KOSONG");

    javax.swing.GroupLayout kosong_title_panel2Layout = new javax.swing.GroupLayout(kosong_title_panel2);
    kosong_title_panel2.setLayout(kosong_title_panel2Layout);
    kosong_title_panel2Layout.setHorizontalGroup(
      kosong_title_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(kosong_title1, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
    );
    kosong_title_panel2Layout.setVerticalGroup(
      kosong_title_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(kosong_title1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
    );

    jumlah_kosong2.setFont(new java.awt.Font("sansserif", 0, 60)); // NOI18N
    jumlah_kosong2.setForeground(new java.awt.Color(0, 0, 0));
    jumlah_kosong2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

    javax.swing.GroupLayout kosong_panel2Layout = new javax.swing.GroupLayout(kosong_panel2);
    kosong_panel2.setLayout(kosong_panel2Layout);
    kosong_panel2Layout.setHorizontalGroup(
      kosong_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(kosong_title_panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(jumlah_kosong2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    kosong_panel2Layout.setVerticalGroup(
      kosong_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(kosong_panel2Layout.createSequentialGroup()
        .addComponent(kosong_title_panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(jumlah_kosong2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    terisi_panel2.setBackground(new java.awt.Color(255, 255, 255));
    terisi_panel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    terisi_title_panel2.setBackground(new java.awt.Color(75, 86, 210));

    terisit_title2.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
    terisit_title2.setForeground(new java.awt.Color(255, 255, 255));
    terisit_title2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    terisit_title2.setText("TERISI");

    javax.swing.GroupLayout terisi_title_panel2Layout = new javax.swing.GroupLayout(terisi_title_panel2);
    terisi_title_panel2.setLayout(terisi_title_panel2Layout);
    terisi_title_panel2Layout.setHorizontalGroup(
      terisi_title_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(terisit_title2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    terisi_title_panel2Layout.setVerticalGroup(
      terisi_title_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(terisit_title2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
    );

    jumlah_terisi2.setFont(new java.awt.Font("sansserif", 0, 60)); // NOI18N
    jumlah_terisi2.setForeground(new java.awt.Color(0, 0, 0));
    jumlah_terisi2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

    javax.swing.GroupLayout terisi_panel2Layout = new javax.swing.GroupLayout(terisi_panel2);
    terisi_panel2.setLayout(terisi_panel2Layout);
    terisi_panel2Layout.setHorizontalGroup(
      terisi_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(terisi_title_panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(jumlah_terisi2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    terisi_panel2Layout.setVerticalGroup(
      terisi_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(terisi_panel2Layout.createSequentialGroup()
        .addComponent(terisi_title_panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(jumlah_terisi2, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
    );

    table_status_payment3.setBackground(new java.awt.Color(255, 255, 255));
    table_status_payment3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    table_status_payment3.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null}
      },
      new String [] {
        "Nomor Polisi", "Tipe ", "Status", "Metode", "Tarif", "Status Pembayaran"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
      };
      boolean[] canEdit = new boolean [] {
        false, false, false, false, false, false
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    table_status_payment3.setGridColor(new java.awt.Color(0, 0, 0));
    table_status_payment3.getTableHeader().setReorderingAllowed(false);
    jScrollPane3.setViewportView(table_status_payment3);
    if (table_status_payment3.getColumnModel().getColumnCount() > 0) {
      table_status_payment3.getColumnModel().getColumn(0).setResizable(false);
      table_status_payment3.getColumnModel().getColumn(1).setResizable(false);
      table_status_payment3.getColumnModel().getColumn(2).setResizable(false);
      table_status_payment3.getColumnModel().getColumn(3).setResizable(false);
      table_status_payment3.getColumnModel().getColumn(4).setResizable(false);
      table_status_payment3.getColumnModel().getColumn(5).setResizable(false);
    }

    cta_button_return_beranda.setBackground(new java.awt.Color(75, 86, 210));
    cta_button_return_beranda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    cta_button_return_beranda.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        cta_button_return_berandaMouseClicked(evt);
      }
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        cta_button_return_berandaMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        cta_button_return_berandaMouseExited(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        cta_button_return_berandaMousePressed(evt);
      }
      public void mouseReleased(java.awt.event.MouseEvent evt) {
        cta_button_return_berandaMouseReleased(evt);
      }
    });

    cta_return_beranda.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
    cta_return_beranda.setForeground(new java.awt.Color(255, 255, 255));
    cta_return_beranda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    cta_return_beranda.setText("BERANDA");

    javax.swing.GroupLayout cta_button_return_berandaLayout = new javax.swing.GroupLayout(cta_button_return_beranda);
    cta_button_return_beranda.setLayout(cta_button_return_berandaLayout);
    cta_button_return_berandaLayout.setHorizontalGroup(
      cta_button_return_berandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(cta_return_beranda, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
    );
    cta_button_return_berandaLayout.setVerticalGroup(
      cta_button_return_berandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(cta_return_beranda, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout validated_panelLayout = new javax.swing.GroupLayout(validated_panel);
    validated_panel.setLayout(validated_panelLayout);
    validated_panelLayout.setHorizontalGroup(
      validated_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(validated_panelLayout.createSequentialGroup()
        .addGap(60, 60, 60)
        .addGroup(validated_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(validated_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(validated_panelLayout.createSequentialGroup()
              .addComponent(kosong_panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(18, 18, 18)
              .addComponent(terisi_panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
          .addComponent(cta_button_return_beranda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(103, Short.MAX_VALUE))
    );
    validated_panelLayout.setVerticalGroup(
      validated_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(validated_panelLayout.createSequentialGroup()
        .addGap(48, 48, 48)
        .addGroup(validated_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(terisi_panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(kosong_panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(34, 34, 34)
        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(43, 43, 43)
        .addComponent(cta_button_return_beranda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(22, Short.MAX_VALUE))
    );

    feature_panel.add(validated_panel, "card5");

    javax.swing.GroupLayout main_panelLayout = new javax.swing.GroupLayout(main_panel);
    main_panel.setLayout(main_panelLayout);
    main_panelLayout.setHorizontalGroup(
      main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(main_panelLayout.createSequentialGroup()
        .addComponent(side_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(feature_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    main_panelLayout.setVerticalGroup(
      main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(side_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(feature_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    cta_button.changePanel(feature_panel, beranda_panel);
    boldColoredFont(beranda);
    unboldUncoloredFont(daftar_kendaraan);
    unboldUncoloredFont(riwayat);
  }//GEN-LAST:event_cta_berandaMouseClicked

  private void totalMobilParkir() {
    
  }
  
  private void cta_daftar_kendaraanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_daftar_kendaraanMouseClicked
    // Logic
    cta_button.changePanel(feature_panel, daftar_kendaraan_panel);
    int mobil_parkir = vehicle_list.getUnemptySlot("Mobil");
    int motor_parkir = vehicle_list.getUnemptySlot("Motor");
    
    total_mobil_parkir.setText(String.valueOf(mobil_parkir));
    total_motor_parkir.setText(String.valueOf(motor_parkir));
    
    // Style
    boldColoredFont(daftar_kendaraan);
    unboldUncoloredFont(riwayat);
    unboldUncoloredFont(beranda);
  }//GEN-LAST:event_cta_daftar_kendaraanMouseClicked

  private void cta_riwayatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_riwayatMouseClicked
    cta_button.changePanel(feature_panel, history_panel);
    boldColoredFont(riwayat);
    unboldUncoloredFont(daftar_kendaraan);
    unboldUncoloredFont(beranda);
  }//GEN-LAST:event_cta_riwayatMouseClicked

  private void boldColoredFont(JLabel _text) {
    _font.boldingFont(_text);
    //_font.changeColor(_text, new Color(71, 33, 131));
  }
  
  private void unboldUncoloredFont(JLabel _text) {
    _font.unboldFont(_text);
    //_font.changeColor(_text, Color.white);
  }
  
  private void cta_berandaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_berandaMouseReleased
  }//GEN-LAST:event_cta_berandaMouseReleased

  private void member_radioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_member_radioActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_member_radioActionPerformed

  private void nopol_inputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nopol_inputFocusGained
    nopol_input.setText("");
  }//GEN-LAST:event_nopol_inputFocusGained

  private void cta_button_nextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_button_nextMouseEntered
    cta_button.changeColor(cta_button_next, new Color(71, 33, 131));
  }//GEN-LAST:event_cta_button_nextMouseEntered

  private void cta_button_nextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_button_nextMouseExited
    cta_button.changeColor(cta_button_next, new Color(75, 86, 210));
  }//GEN-LAST:event_cta_button_nextMouseExited

  private void cta_button_nextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_button_nextMousePressed
    cta_button.changeColor(cta_button_next, new Color(75, 86, 210));
  }//GEN-LAST:event_cta_button_nextMousePressed

  private void cta_button_nextMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_button_nextMouseReleased
    cta_button.changeColor(cta_button_next, new Color(71, 33, 131));
  }//GEN-LAST:event_cta_button_nextMouseReleased

  private void cta_button_nextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_button_nextMouseClicked
    cta_button.changePanel(feature_panel, payment_panel);
    cta_button.changeColor(cta_button_next, new Color(75,86,210));
  }//GEN-LAST:event_cta_button_nextMouseClicked

  private void cta_button_validateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_button_validateMouseEntered
    cta_button.changeColor(cta_button_validate, new Color(71, 33, 131));
  }//GEN-LAST:event_cta_button_validateMouseEntered

  private void cta_button_validateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_button_validateMouseExited
    cta_button.changeColor(cta_button_validate, new Color(75, 86, 210));
  }//GEN-LAST:event_cta_button_validateMouseExited

  private void cta_button_validateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_button_validateMousePressed
    cta_button.changeColor(cta_button_validate, new Color(75, 86, 210));
  }//GEN-LAST:event_cta_button_validateMousePressed

  private void cta_button_validateMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_button_validateMouseReleased
    cta_button.changeColor(cta_button_validate, new Color(71, 33, 131));
  }//GEN-LAST:event_cta_button_validateMouseReleased

  private void cta_button_validateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_button_validateMouseClicked
    cta_button.changePanel(feature_panel, validated_panel);
    cta_button.changeColor(cta_button_validate, new Color(75, 86, 210));
  }//GEN-LAST:event_cta_button_validateMouseClicked

  private void cta_button_return_berandaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_button_return_berandaMouseClicked
    cta_button.changePanel(feature_panel, beranda_panel);
    cta_button.changeColor(cta_button_return_beranda, new Color(75, 86, 210));
  }//GEN-LAST:event_cta_button_return_berandaMouseClicked

  private void cta_button_return_berandaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_button_return_berandaMouseEntered
    cta_button.changeColor(cta_button_return_beranda, new Color(71, 33, 131));
  }//GEN-LAST:event_cta_button_return_berandaMouseEntered

  private void cta_button_return_berandaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_button_return_berandaMouseExited
    cta_button.changeColor(cta_button_return_beranda, new Color(75, 86, 210));
  }//GEN-LAST:event_cta_button_return_berandaMouseExited

  private void cta_button_return_berandaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_button_return_berandaMousePressed
    cta_button.changeColor(cta_button_return_beranda, new Color(75, 86, 210));
  }//GEN-LAST:event_cta_button_return_berandaMousePressed

  private void cta_button_return_berandaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cta_button_return_berandaMouseReleased
    cta_button.changeColor(cta_button_return_beranda, new Color(71, 33, 131));
  }//GEN-LAST:event_cta_button_return_berandaMouseReleased

  
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
  private javax.swing.JPanel beranda_panel;
  private javax.swing.JRadioButton bus_radio;
  private javax.swing.JPanel cta_beranda;
  private javax.swing.JPanel cta_button_next;
  private javax.swing.JPanel cta_button_return_beranda;
  private javax.swing.JPanel cta_button_validate;
  private javax.swing.JPanel cta_daftar_kendaraan;
  private javax.swing.JLabel cta_next;
  private javax.swing.JLabel cta_return_beranda;
  private javax.swing.JPanel cta_riwayat;
  private javax.swing.JButton cta_search;
  private javax.swing.JPanel cta_signout;
  private javax.swing.JLabel cta_validate;
  private javax.swing.JLabel daftar_kendaraan;
  private javax.swing.JPanel daftar_kendaraan_panel;
  private javax.swing.JLabel daftar_kendaraan_title;
  private javax.swing.JPanel feature_panel;
  private javax.swing.JPanel history_panel;
  private javax.swing.JLabel home_icon;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JScrollPane jScrollPane3;
  private javax.swing.JScrollPane jScrollPane4;
  private javax.swing.JSeparator jSeparator1;
  private javax.swing.JSeparator jSeparator2;
  private javax.swing.JTable jTable1;
  private javax.swing.JTable jTable2;
  private javax.swing.JLabel jumlah_kosong;
  private javax.swing.JLabel jumlah_kosong2;
  private javax.swing.JLabel jumlah_terisi;
  private javax.swing.JLabel jumlah_terisi2;
  private javax.swing.JPanel keterangan;
  private javax.swing.JPanel kosong_panel;
  private javax.swing.JPanel kosong_panel2;
  private javax.swing.JLabel kosong_title;
  private javax.swing.JLabel kosong_title1;
  private javax.swing.JPanel kosong_title_panel;
  private javax.swing.JPanel kosong_title_panel2;
  private javax.swing.JLabel list_icon;
  private javax.swing.JPanel main_panel;
  private javax.swing.JRadioButton member_radio;
  private javax.swing.ButtonGroup membershipGroup;
  private javax.swing.JPanel mobil_panel;
  private javax.swing.JRadioButton mobil_radio;
  private javax.swing.JLabel mobil_title;
  private javax.swing.JPanel mobil_title_panel;
  private javax.swing.JPanel motor_panel;
  private javax.swing.JRadioButton motor_radio;
  private javax.swing.JLabel motor_title;
  private javax.swing.JPanel motor_title_panel;
  private javax.swing.JRadioButton nonmember_radio;
  private javax.swing.JTextField nopol_input;
  private javax.swing.JPanel nopol_panel;
  private javax.swing.JLabel nopol_title;
  private javax.swing.JLabel num_jumlah_kendaraan;
  private javax.swing.JPanel others_panel;
  private javax.swing.JLabel others_title;
  private javax.swing.JPanel others_title_panel;
  private javax.swing.JPanel payment_panel;
  private javax.swing.JPanel pic_1;
  private javax.swing.JPanel pic_2;
  private javax.swing.JLabel repo_icon;
  private javax.swing.JLabel riwayat;
  private javax.swing.JPanel search_panel;
  private javax.swing.JTextField search_textfield;
  private javax.swing.JPanel side_panel;
  private javax.swing.JLabel sign_out;
  private javax.swing.JLabel signout_icon;
  private javax.swing.JPanel status_panel;
  private javax.swing.JLabel status_title;
  private javax.swing.JPanel table_panel;
  private javax.swing.JPanel table_riwayat_panel;
  private javax.swing.JLabel table_riwayat_title;
  private javax.swing.JPanel table_riwayat_title_panel;
  private javax.swing.JTable table_status_payment1;
  private javax.swing.JTable table_status_payment3;
  private javax.swing.JPanel table_title_panel;
  private javax.swing.JPanel terisi_panel;
  private javax.swing.JPanel terisi_panel2;
  private javax.swing.JPanel terisi_title_panel;
  private javax.swing.JPanel terisi_title_panel2;
  private javax.swing.JLabel terisit_title;
  private javax.swing.JLabel terisit_title2;
  private javax.swing.JPanel tipe_panel;
  private javax.swing.JLabel tipe_title;
  private javax.swing.JLabel title;
  private javax.swing.JLabel total_lainnya_parkir;
  private javax.swing.JLabel total_mobil_parkir;
  private javax.swing.JLabel total_motor_parkir;
  private javax.swing.JLabel total_title;
  private javax.swing.JRadioButton truk_radio;
  private javax.swing.ButtonGroup typeGroup;
  private javax.swing.JLabel user_pic;
  private javax.swing.JPanel validated_panel;
  // End of variables declaration//GEN-END:variables
}
