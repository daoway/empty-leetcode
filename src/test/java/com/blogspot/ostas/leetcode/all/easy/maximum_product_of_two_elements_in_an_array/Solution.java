package com.blogspot.ostas.leetcode.all.easy.maximum_product_of_two_elements_in_an_array;

/*
      1464. maximum product of two elements in an array

https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array

Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).

*/

public class Solution {
  public int maxProduct(int[] nums) {
    int max1 = 0; // Largest element
    int max2 = 0; // Second largest element

    for (int num : nums) {
      if (num > max1) {
        max2 = max1;
        max1 = num;
      } else if (num > max2) {
        max2 = num;
      }
    }

    return (max1 - 1) * (max2 - 1);
  }
}