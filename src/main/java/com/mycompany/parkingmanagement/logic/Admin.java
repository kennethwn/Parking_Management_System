package com.mycompany.parkingmanagement.logic;

public class Admin {
  private String username;
  private String password;
  private Database db = new Database();
  
  public void setUsername(String username) {this.username = username;}
  public void setPassword(String password) {this.password = password;}
  
  public String getUsername() {return this.username;}
  public String getPassword() {return this.password;}
  
  public boolean userAuth(String username,String pass) {
    try {
      db.connector = Database.getConnection();
      
      String sql = "select "
              + "username, pass "
              + "from admin_table "
              + "where username=? and pass=?";
      
      db.preparedStatement = db.connector.prepareStatement(sql);
      
      db.preparedStatement.setString(1, username);
      db.preparedStatement.setString(2, pass);
      
      db.rs = db.preparedStatement.executeQuery();
     
      if (db.rs.next()) return true;
      else return false;
    }
    catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return false;
  }
}
