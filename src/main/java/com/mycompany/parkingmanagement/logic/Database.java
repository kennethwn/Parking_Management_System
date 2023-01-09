git package com.mycompany.parkingmanagement.logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {
  private static Connection connect;
  
  public PreparedStatement preparedStatement;
  public Statement st;
  public Connection connector;
  public ResultSet rs;
  
  public static Connection getConnection() {
    if(connect == null) {
      try {
        String url = "jdbc:mysql://localhost:3306/parkir_system";
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
