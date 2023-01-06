package com.mycompany.parkingmanagement.logic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

abstract class Vehicle {
  protected String license_plate;
  protected String vehicle_type;
  protected String vehicle_brand;
  protected String time_entry;
  
  protected PreparedStatement preparedStatement;
  protected Connection connect;
  protected ResultSet rs;
  
  public abstract void displayData();
}
