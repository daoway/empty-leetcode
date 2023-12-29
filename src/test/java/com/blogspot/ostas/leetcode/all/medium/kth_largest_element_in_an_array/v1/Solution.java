package com.blogspot.ostas.leetcode.all.medium.kth_largest_element_in_an_array.v1;

import java.util.Random;

class Solution {
  public int findKthLargest(int[] nums, int k) {
    return quickSelect(nums, 0, nums.length - 1, k - 1);
  }

  private int partition(int[] nums, int firstIndex, int lastIndex) {
    int pivotIndex = new Random().nextInt(lastIndex - firstIndex + 1) + firstIndex;
    swap(nums, pivotIndex, lastIndex);
    for (int i = firstIndex; i < lastIndex; ++i) {
      if (nums[i] > nums[lastIndex]) {
        swap(nums, i, firstIndex);
        firstIndex++;
      }
    }
    swap(nums, lastIndex, firstIndex);
    return firstIndex;
  }

  private void swap(int[] nums, int pivot, int lastIndex) {
    int temp = nums[pivot];
    nums[pivot] = nums[lastIndex];
    nums[lastIndex] = temp;
  }

  private int quickSelect(int[] nums, int firstIndex, int lastIndex, int k) {
    int pivotIndex = partition(nums, firstIndex, lastIndex);
    if (pivotIndex < k) {
      return quickSelect(nums, pivotIndex + 1, lastIndex, k);
    } else if (pivotIndex > k) {
      return quickSelect(nums, firstIndex, pivotIndex - 1, k);
    }
    return nums[pivotIndex];
  }
}