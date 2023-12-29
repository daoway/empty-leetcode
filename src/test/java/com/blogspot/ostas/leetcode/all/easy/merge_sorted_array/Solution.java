package com.blogspot.ostas.leetcode.all.easy.merge_sorted_array;

/*
      88. merge sorted array

https://leetcode.com/problems/merge-sorted-array

You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
Merge nums1 and nums2 into a single array sorted in non-decreasing order.
The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

*/

class Solution {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int indexA = m - 1;
    int indexB = n - 1;
    int indexMerged = n + m - 1;

    while (indexA >= 0 && indexB >= 0) {
      if (nums1[indexA] > nums2[indexB]) {
        nums1[indexMerged] = nums1[indexA]; // copy element
        indexMerged--; // move indexes
        indexA--;
      } else {
        nums1[indexMerged] = nums2[indexB]; // copy element
        indexMerged--;
        indexB--;
      }
    }

    /* copy remaining elements from nums2 into place */
    while (indexB >= 0) {
      nums1[indexMerged] = nums2[indexB];
      indexMerged--;
      indexB--;
    }
  }
}