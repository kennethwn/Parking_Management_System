package com.mycompany.parkingmanagement.logic;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
  private static Connection connect;
  
  public static Connection getConnection() {
    if(connect == null) {
      try {
        String url = "jdbc:mysql://localhost:3306/parking_management_oop";
        String user = "root";
        String pw = "";
        
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        connect = DriverManager.getConnection(url,user,pw);
      }
      catch(Exception e) {
        System.out.println(e.getMessage());
      }
    }
    return connect;
  }
}
