package com.blogspot.ostas.leetcode.all.hard.best_position_for_a_service_centre;

/*
      1515. best position for a service centre

https://leetcode.com/problems/best-position-for-a-service-centre

A delivery company wants to build a new service center in a new city. The company knows the positions of all the customers in this city on a 2D-Map and wants to build the new center in a position such that the sum of the euclidean distances to all customers is minimum.
Given an array positions where positions[i] = [xi, yi] is the position of the ith customer on the map, return the minimum sum of the euclidean distances to all customers.
In other words, you need to choose the position of the service center [xcentre, ycentre] such that the following formula is minimized:
Answers within 10-5 of the actual value will be accepted.

*/
class Solution {
  public double getMinDistSum(int[][] positions) {
    for (int i = 0; i < positions.length; i++) {
      var x = positions[i][0];
      var y = positions[i][1];
    }
    double sum = 0;
    int x = 0;
    int y = 0;
    for (int i = 0; i < positions.length; i++) {
      sum += Math.sqrt(Math.pow(x - positions[i][0], 2) + Math.pow(y - positions[i][1], 2));
    }
    return 0;
  }
}
