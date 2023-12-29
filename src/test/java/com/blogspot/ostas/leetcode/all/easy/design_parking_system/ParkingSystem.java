package com.blogspot.ostas.leetcode.all.easy.design_parking_system;

/*
      1603. design parking system

https://leetcode.com/problems/design-parking-system

Design a parking system for a parking lot. The parking lot has three kinds of parking spaces: big, medium, and small, with a fixed number of slots for each size.
Implement the ParkingSystem class:
ParkingSystem(int big, int medium, int small) Initializes object of the ParkingSystem class. The number of slots for each parking space are given as part of the constructor.
bool addCar(int carType) Checks whether there is a parking space of carType for the car that wants to get into the parking lot. carType can be of three kinds: big, medium, or small, which are represented by 1, 2, and 3 respectively. A car can only park in a parking space of its carType. If there is no space available, return false, else park the car in that size space and return true.

*/
class ParkingSystem {
  private final int[] capacity;

  public ParkingSystem(int big, int medium, int small) {
    //capacity[0] = big
    //capacity[1] = medium
    //capacity[2] = small
    capacity = new int[] {big, medium, small};
  }

  public boolean addCar(int carType) { //1,2,3
    return capacity[carType - 1]-- > 0;
  }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */