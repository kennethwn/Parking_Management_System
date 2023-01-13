package com.mycompany.parkingmanagement.logic;

import java.sql.SQLException;
import javax.swing.JTable;

public abstract class Vehicle {
  protected String license_plate;
  protected String vehicle_type;
  protected String vehicle_brand;
  protected String time_entry;
  protected String time_exit;
  
  protected String sql;
  protected int count;
  
  public Database db = new Database();
  
  
  // Methods
  protected String getLicensePlate() {return this.license_plate;}
  protected String getVehicleType() {return this.vehicle_type;}
  protected String getVehicleBrand() {return this.vehicle_brand;}
  protected String getTimeEntry() {return this.time_entry;}
  protected String getTimeExit() {return this.time_exit;}
  
  protected void setLicensePlate(String license_plate) {this.license_plate = license_plate;}
  protected void setVehicleType(String vehicle_type) {this.vehicle_type = vehicle_type;}
  protected void setVehicleBrand(String vehicle_brand) {this.vehicle_brand = vehicle_brand;}
  protected void setTimeEntry(String time_entry) {this.time_entry = time_entry;}
  protected void setTimeExit(String time_exit) {this.time_exit = time_exit;}
  
  protected abstract void displayData(JTable table);
  
  public int getEmptySlot(String type, int total_slot) {
    return this.count;
  }
  
  public int getUnemptySlot(String type) {
    try {
      db.connector = Database.getConnection2();
      db.st = db.connector.createStatement();
      
      if (type == "Lainnya") {
        this.sql = "SELECT\n" +
          "COUNT(kendaraan.nopol) as kendaraan_parkir\n" +
          "FROM kendaraan_payment\n" +
          "inner join kendaraan on kendaraan_payment.nopol = kendaraan.nopol\n" +
          "inner join jenis_kendaraan on kendaraan.id_jenis_kendaraan = jenis_kendaraan.id_jenis_kendaraan\n" +
          "inner join status_payment on kendaraan_payment.id_status_payment = status_payment.id_status_payment\n" +
          "where tipe_kendaraan in ('Truk','Bus') \n" +
          "AND (jam_keluar is null AND status_payment.id_status_payment = 'BL');";
      }
      else {
        this.sql = "SELECT\n" +
          "COUNT(kendaraan.nopol) as kendaraan_parkir\n" +
          "FROM kendaraan_payment\n" +
          "inner join kendaraan on kendaraan_payment.nopol = kendaraan.nopol\n" +
          "inner join jenis_kendaraan on kendaraan.id_jenis_kendaraan = jenis_kendaraan.id_jenis_kendaraan\n" +
          "inner join status_payment on kendaraan_payment.id_status_payment = status_payment.id_status_payment\n" +
          "where tipe_kendaraan = '"+type+"' \n" +
          "AND (jam_keluar is null AND status_payment.id_status_payment = 'BL');";
      }
     
      db.rs = db.st.executeQuery(this.sql);
      if(db.rs.next()) {this.count = db.rs.getInt("kendaraan_parkir");}
    }
    catch (Exception e) {
      return -1;
    }
    return this.count;
  }

  public int getTotalVehicle() {
    try {
      db.connector = Database.getConnection2();
      db.st = db.connector.createStatement();
      
      this.sql = "SELECT\n" +
          "COUNT(kendaraan.nopol) as kendaraan_parkir\n" +
          "FROM kendaraan_payment\n" +
          "inner join kendaraan on kendaraan_payment.nopol = kendaraan.nopol\n" +
          "inner join jenis_kendaraan on kendaraan.id_jenis_kendaraan = jenis_kendaraan.id_jenis_kendaraan\n" +
          "inner join status_payment on kendaraan_payment.id_status_payment = status_payment.id_status_payment\n" +
          "where tipe_kendaraan in ('Mobil','Motor', 'Truk','Bus') \n" +
          "AND (jam_keluar is null AND status_payment.id_status_payment = 'BL');";
      
      db.rs = db.st.executeQuery(this.sql);
      if (db.rs.next()) {this.count = db.rs.getInt("kendaraan_parkir");}
    }
    catch (Exception e) {
      return -1;
    }
    return this.count;
  }
}
