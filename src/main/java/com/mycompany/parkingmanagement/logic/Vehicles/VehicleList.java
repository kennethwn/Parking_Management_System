package com.mycompany.parkingmanagement.logic.Vehicles;

import com.mycompany.parkingmanagement.MainView;
import com.mycompany.parkingmanagement.logic.Database;
import javax.swing.table.DefaultTableModel;

public class VehicleList extends com.mycompany.parkingmanagement.logic.Vehicle {
  private static int count;

  @Override
  @SuppressWarnings("empty-statement")
  public void displayData() {
    try {
      db.connector = Database.getConnection();
      
      String sql = "select"
              + "kendaraan.nopol as No_Polisi,"
              + "tipe_kendaraan as Tipe,"
              + "merk as Merk,"
              + "jam_masuk as Jam_Masuk"
              + "from kendaraan_payment"
              + "inner join kendaraan on kendaraan_payment.nopol = kendaraan.nopol"
              + "inner join membership on kendaraan.id_membership = membership.id_membership"
              + "inner join jenis_kendaraan on kendaraan.id_jenis_kendaraan = jenis_kendaraan.id_jenis_kendaraan"
              + "inner join payment on kendaraan_payment.id_payment = payment.id_payment"
              + "inner join status_payment on kendaraan_payment.id_status_payment = status_payment.id_status_payment"
              + "where kendaraan.jam_keluar is null and staus_payment.id_status_payment = 'BL';";
      
      db.st = db.connector.createStatement();
      db.rs = db.st.executeQuery(sql);
      
      while(db.rs.next()) {
        setLicensePlate(db.rs.getString("No_Polisi"));
        setVehicleType(db.rs.getString("Tipe"));
        setVehicleBrand(db.rs.getString("Merk"));
        setTimeEntry(String.valueOf(db.rs.getTime("Jam_Masuk")));
        
        String[] tbData = {license_plate,vehicle_type,vehicle_brand,time_entry};
        DefaultTableModel tbModel = (DefaultTableModel)MainView.jTable1.getModel();
        tbModel.addRow(tbData);
      }
    }
    catch (Exception e) {
      throw new UnsupportedOperationException("Not connected to Database");
    }
  }
  
  public static int getAllUnemptySlot() {
    return count;
  }
}
