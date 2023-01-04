package com.mycompany.parkingmanagement.logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {
  private String username;
  private String password;
  private Connection connect;
  private Statement st;
  private ResultSet rs;
  
  public void setUsername(String username) {this.username = username;}
  public void setPassword(String password) {this.password = password;}
  
  public String getUsername() {return this.username;}
  public String getPassword() {return this.password;}
  
  public boolean userAuth(String email,String password) {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      connect = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/parking_management_oop",
           "root",
        ""
      );
      
      st = connect.createStatement();
      
      String sql = "select email, password_officer from officer where email='"+email+"' and password_officer='"+password+"'";
      rs = st.executeQuery(sql);
     
      if (rs.next()) return true;
      else return false;
      
    }
    catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return false;
  }
  
}
