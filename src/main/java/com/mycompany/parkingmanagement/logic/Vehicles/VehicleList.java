package com.mycompany.parkingmanagement.logic.Vehicles;

import com.mycompany.parkingmanagement.MainView;
import com.mycompany.parkingmanagement.logic.Database;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VehicleList extends com.mycompany.parkingmanagement.logic.Vehicle {
  private static int count;
  
  public static int getAllUnemptySlot() {
    return count;
  }

  @Override
  public void displayData(JTable table) {
   try {
      db.connector = Database.getConnection2();
      db.st = db.connector.createStatement();
      
      super.sql = "SELECT \n" +
        "tanggal as Tanggal_Parkir,\n" +
        "kendaraan.nopol as No_Polisi,\n" +
        "tipe_kendaraan as Tipe,\n" +
        "merk as Merk,\n" +
        "jam_masuk as Jam_Masuk\n" +
        "FROM kendaraan_payment\n" +
        "inner join kendaraan on kendaraan_payment.nopol = kendaraan.nopol\n" +
        "inner join membership on kendaraan.id_membership = membership.id_membership\n" +
        "inner join jenis_kendaraan on kendaraan.id_jenis_kendaraan = jenis_kendaraan.id_jenis_kendaraan\n" +
        "inner join payment on kendaraan_payment.id_payment = payment.id_payment\n" +
        "inner join status_payment on kendaraan_payment.id_status_payment = status_payment.id_status_payment\n" +
        "where kendaraan.jam_keluar is null AND status_payment.id_status_payment = 'BL';";
      
      db.rs = db.st.executeQuery(super.sql);
      
      while(db.rs.next()) {
        setDate(String.valueOf(db.rs.getDate("Tanggal_Parkir")));
        setLicensePlate(db.rs.getString("No_Polisi"));
        setVehicleType(db.rs.getString("Tipe"));
        setVehicleBrand(db.rs.getString("Merk"));
        setTimeEntry(String.valueOf(db.rs.getTime("Jam_Masuk")));
        
        String tbData[] = {
          super.date,
          super.license_plate,
          super.vehicle_type,
          super.vehicle_brand,
          super.time_entry
        };
        
        DefaultTableModel tbModel = (DefaultTableModel)table.getModel();
        tbModel.addRow(tbData);
      }
    }
    catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }
}
