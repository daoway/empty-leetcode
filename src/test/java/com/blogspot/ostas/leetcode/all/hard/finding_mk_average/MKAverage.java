package com.blogspot.ostas.leetcode.all.hard.finding_mk_average;

/*
      1825. finding mk average

https://leetcode.com/problems/finding-mk-average

You are given two integers, m and k, and a stream of integers. You are tasked to implement a data structure that calculates the MKAverage for the stream.
The MKAverage can be calculated using these steps:
If the number of the elements in the stream is less than m you should consider the MKAverage to be -1. Otherwise, copy the last m elements of the stream to a separate container.
Remove the smallest k elements and the largest k elements from the container.
Calculate the average value for the rest of the elements rounded down to the nearest integer.
Implement the MKAverage class:
MKAverage(int m, int k) Initializes the MKAverage object with an empty stream and the two integers m and k.
void addElement(int num) Inserts a new element num into the stream.
int calculateMKAverage() Calculates and returns the MKAverage for the current stream rounded down to the nearest integer.

*/
class MKAverage {
  public MKAverage(int m, int k) {
  }

  public void addElement(int num) {
  }

  public int calculateMKAverage() {
    return 0;
  }
}