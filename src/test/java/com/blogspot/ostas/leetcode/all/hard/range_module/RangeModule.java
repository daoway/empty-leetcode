package com.blogspot.ostas.leetcode.all.hard.range_module;

/*
      715. range module

https://leetcode.com/problems/range-module

A Range Module is a module that tracks ranges of numbers. Design a data structure to track the ranges represented as half-open intervals and query about them.
A half-open interval [left, right) denotes all the real numbers x where left <= x < right.
Implement the RangeModule class:
RangeModule() Initializes the object of the data structure.
void addRange(int left, int right) Adds the half-open interval [left, right), tracking every real number in that interval. Adding an interval that partially overlaps with currently tracked numbers should add any numbers in the interval [left, right) that are not already tracked.
boolean queryRange(int left, int right) Returns true if every real number in the interval [left, right) is currently being tracked, and false otherwise.
void removeRange(int left, int right) Stops tracking every real number currently being tracked in the half-open interval [left, right).

*/
class RangeModule {
  public RangeModule() {
  }

  public void addRange(int left, int right) {
  }

  public boolean queryRange(int left, int right) {
    return false;
  }

  public void removeRange(int left, int right) {
  }
}