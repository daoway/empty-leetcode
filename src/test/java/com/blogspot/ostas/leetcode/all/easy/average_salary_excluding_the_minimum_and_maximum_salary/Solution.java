package com.blogspot.ostas.leetcode.all.easy.average_salary_excluding_the_minimum_and_maximum_salary;

/*
      1491. average salary excluding the minimum and maximum salary

https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary

You are given an array of unique integers salary where salary[i] is the salary of the ith employee.
Return the average salary of employees excluding the minimum and maximum salary. Answers within 10-5 of the actual answer will be accepted.

*/

import java.util.Arrays;
import java.util.TreeSet;

class Solution {
  public double averageX(int[] salaries) {
    TreeSet<Integer> set = new TreeSet<>(Arrays.stream(salaries).boxed().toList());
    set.pollFirst();
    set.pollLast();
    var sum = set.stream().reduce(0, Integer::sum);
    return (double) sum / set.size();
  }

  public double averageXX(int[] salaries) {
    int minSalary = Integer.MAX_VALUE;
    int maxSalary = Integer.MIN_VALUE;
    int sum = 0;

    for (final int salary : salaries) {
      // Sum of all the salaries.
      sum += salary;
      // Update the minimum salary.
      minSalary = Math.min(minSalary, salary);
      // Update the maximum salary.
      maxSalary = Math.max(maxSalary, salary);
    }

    // Divide the sum by total size - 2, as we exclude minimum and maximum values.
    return (double) (sum - minSalary - maxSalary) / (double) (salaries.length - 2);
  }

  public double average(int[] salary) {
    Arrays.sort(salary);
    int sum = 0;
    for (int i = 1; i <= salary.length - 2; i++) {
      sum += salary[i];
    }
    return (double) sum / (salary.length - 2);
  }
}