package com.blogspot.ostas.leetcode.all.easy.number_of_employees_who_met_the_target;

/*
      2798. number of employees who met the target

https://leetcode.com/problems/number-of-employees-who-met-the-target

There are n employees in a company, numbered from 0 to n - 1. Each employee i has worked for hours[i] hours in the company.
The company requires each employee to work for at least target hours.
You are given a 0-indexed array of non-negative integers hours of length n and a non-negative integer target.
Return the integer denoting the number of employees who worked at least target hours.

*/

import java.util.Arrays;

class Solution {
  public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
    return (int) Arrays.stream(hours).filter(t->t >= target).count();
  }
}