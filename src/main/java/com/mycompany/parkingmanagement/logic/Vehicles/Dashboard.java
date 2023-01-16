package com.mycompany.parkingmanagement.logic.Vehicles;

import com.mycompany.parkingmanagement.logic.Database;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Dashboard extends com.mycompany.parkingmanagement.logic.Vehicle { 
  
  public Dashboard (
    String license_plate,
    String vehicle_type,
    String membership
  ) {
    setLicensePlate(license_plate);
    setVehicleType(vehicle_type);
    setMembership(membership);
  }
  
  public void validatePayment(String license_plate) {
    try {
      updateExitTime(license_plate);
      updatePaymentStatus(license_plate);
    }
    catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
  
  public void updateExitTime(String input) {
    try {
      db.connector = Database.getConnection();
      
      super.sql = "update kendaraan\n" +
        "set jam_keluar = current_time()\n" +
        "where kendaraan.nopol = ?;";
      
      db.preparedStatement = db.connector.prepareStatement(super.sql);
      db.preparedStatement.setString(1, input);
      db.preparedStatement.executeUpdate();
    }
    catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }
  
   public void updatePaymentStatus(String input) {
    try {
      db.connector = Database.getConnection();
      
      super.sql = "update kendaraan_payment\n" +
        "set id_status_payment = ?\n" +
        "where kendaraan_payment.nopol = ?;";
      
      db.preparedStatement = db.connector.prepareStatement(super.sql);
      
      db.preparedStatement.setString(1, "L");
      db.preparedStatement.setString(2, input);
      
      db.preparedStatement.executeUpdate();
    }
    catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }
  
  public void displaySingleData(JTable table, String license_plate, int type) {
    try {
      db.connector = Database.getConnection();
      
      if (type == 0) {
        super.sql = "SELECT \n" +
          "tanggal as Tanggal_Parkir,\n" +
          "kendaraan.nopol as No_Polisi,\n" +
          "tipe_kendaraan as Tipe,\n" +
          "status_member as Status_Member,\n" +
          "metode_pembayaran as Metode,\n" +
          "concat('Rp',tarif) as Tarif,\n" +
          "keterangan as Status_Payment\n" +
          "FROM kendaraan_payment\n" +
          "inner join kendaraan on kendaraan_payment.nopol = kendaraan.nopol\n" +
          "inner join membership on kendaraan.id_membership = membership.id_membership\n" +
          "inner join jenis_kendaraan on kendaraan.id_jenis_kendaraan = jenis_kendaraan.id_jenis_kendaraan\n" +
          "inner join payment on kendaraan_payment.id_payment = payment.id_payment\n" +
          "inner join status_payment on kendaraan_payment.id_status_payment = status_payment.id_status_payment\n" +
          "where kendaraan.nopol = ?\n" + 
          "and (jam_keluar is null AND status_payment.id_status_payment = 'BL')";
      }
      else if (type == 1) {
        super.sql = "SELECT \n" +
          "tanggal as Tanggal_Parkir,\n" +
          "kendaraan.nopol as No_Polisi,\n" +
          "tipe_kendaraan as Tipe,\n" +
          "status_member as Status_Member,\n" +
          "metode_pembayaran as Metode,\n" +
          "concat('Rp',tarif) as Tarif,\n" +
          "keterangan as Status_Payment\n" +
          "FROM kendaraan_payment\n" +
          "inner join kendaraan on kendaraan_payment.nopol = kendaraan.nopol\n" +
          "inner join membership on kendaraan.id_membership = membership.id_membership\n" +
          "inner join jenis_kendaraan on kendaraan.id_jenis_kendaraan = jenis_kendaraan.id_jenis_kendaraan\n" +
          "inner join payment on kendaraan_payment.id_payment = payment.id_payment\n" +
          "inner join status_payment on kendaraan_payment.id_status_payment = status_payment.id_status_payment\n" +
          "where kendaraan.nopol = ?\n" +
          "and (jam_keluar is not null AND status_payment.id_status_payment = 'L')";
      }
      
      db.preparedStatement = db.connector.prepareStatement(super.sql);
      db.preparedStatement.setString(1, license_plate);
      db.rs = db.preparedStatement.executeQuery();
      
      while(db.rs.next()) {
        super.setDate(String.valueOf(db.rs.getDate("Tanggal_Parkir")));
        super.setLicensePlate(db.rs.getString("No_Polisi"));
        super.setVehicleType(db.rs.getString("Tipe"));
        super.setMembership(db.rs.getString("Status_Member"));
        super.setPaymentMethod(db.rs.getString("Metode"));
        super.setPrice(db.rs.getString("Tarif"));
        super.setPaymentStatus(db.rs.getString("Status_Payment"));
        
        String tbData[] = {
          super.date,
          super.license_plate,
          super.vehicle_type,
          super.membership,
          super.payment_method,
          super.price,
          super.payment_status
        };
        
        DefaultTableModel tbModel = (DefaultTableModel)table.getModel();
        tbModel.addRow(tbData);
      }
    }
    catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }

  @Override
  protected void displayData(JTable table) {
    
  }
}
