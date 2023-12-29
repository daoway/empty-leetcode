package com.blogspot.ostas.leetcode.all.easy.count_pairs_whose_sum_is_less_than_target;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
  public int countPairsX(List<Integer> nums, int target) {
    var array = nums.toArray(Integer[]::new);
    int result = 0;

    for (int i = 0; i < array.length; i++) {
      for (int j = i + 1; j < array.length; j++) {
        if (array[i] + array[j] < target) {
          result++;
        }
      }
    }

    return result;
  }

  public int countPairs(List<Integer> nums, int target) {
    nums = new ArrayList<>(nums);
    Collections.sort(nums);
    int count = 0;
    int left = 0;
    int right = nums.size() - 1;

    while (left < right) {
      int sum = nums.get(left) + nums.get(right);

      if (sum < target) {
        count += (right - left); // All pairs between left and right will be less than the target
        left++;
      } else {
        right--;
      }
    }

    return count;
  }

}
