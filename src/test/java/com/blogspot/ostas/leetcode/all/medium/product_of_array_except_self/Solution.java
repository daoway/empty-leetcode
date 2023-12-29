package com.blogspot.ostas.leetcode.all.medium.product_of_array_except_self;

/*
      238. product of array except self

https://leetcode.com/problems/product-of-array-except-self

Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.

*/

public class Solution {
  public int[] productExceptSelf(int[] nums)
  {
    // Initialize memory to all arrays
    int[] left = new int[nums.length];
    int[] right = new int[nums.length];
    int[] prod = new int[nums.length];

    int i, j;

    /* Left most element of left array is always 1 */
    left[0] = 1;

    /* Right most element of right array is always 1 */
    right[nums.length - 1] = 1;

    /* Construct the left array */
    for (i = 1; i < nums.length; i++)
      left[i] = nums[i - 1] * left[i - 1];

    /* Construct the right array */
    for (j = nums.length - 2; j >= 0; j--)
      right[j] = nums[j + 1] * right[j + 1];

    /* Construct the product array using left[] and right[] */
    for (i = 0; i < nums.length; i++)
      prod[i] = left[i] * right[i];

    /* print the constructed prod array */
    for (i = 0; i < nums.length; i++)
      System.out.print(prod[i] + " ");

    return prod;
  }

}
