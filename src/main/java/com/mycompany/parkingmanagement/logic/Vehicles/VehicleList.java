package com.mycompany.parkingmanagement.logic.Vehicles;

public class VehicleList extends com.mycompany.parkingmanagement.logic.Vehicle {
  private static int count;

  @Override
  public void displayData() {
    throw new UnsupportedOperationException("Not supported yet.");
  }
  
  public static int getAllUnemptySlot() {
    return count;
  }
}
