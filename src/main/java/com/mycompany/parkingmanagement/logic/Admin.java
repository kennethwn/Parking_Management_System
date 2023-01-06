package com.mycompany.parkingmanagement.logic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Admin {
  private String username;
  private String password;
  
  private PreparedStatement preparedStatement;
  private Connection connect;
  private ResultSet rs;
  
  public void setUsername(String username) {this.username = username;}
  public void setPassword(String password) {this.password = password;}
  
  public String getUsername() {return this.username;}
  public String getPassword() {return this.password;}
  
  public boolean userAuth(String username,String pass) {
    try {
      connect = Database.getConnection();
      
      String sql = "select "
              + "username, pass "
              + "from admin_table "
              + "where username=? and pass=?";
      
      preparedStatement = connect.prepareStatement(sql);
      
      preparedStatement.setString(1, username);
      preparedStatement.setString(2, pass);
      
      rs = preparedStatement.executeQuery();
     
      if (rs.next()) return true;
      else return false;
    }
    catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return false;
  }
}
