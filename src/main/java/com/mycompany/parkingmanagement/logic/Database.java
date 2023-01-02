package com.mycompany.parkingmanagement.logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {
  public boolean userAuth(String email,String password) {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection connect = DriverManager.getConnection(
              "jdbc:mysql://localhost:3306/parking_management_oop",
              "root",
              ""
      );
      Statement st = connect.createStatement();
      
      String sql = "select email, password_officer from officer where email='"+email+"' and password_officer='"+password+"'";
      ResultSet rs = st.executeQuery(sql);
     
      if (rs.next()) return true;
      else return false;
      
    }
    catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return false;
  }
  
}
