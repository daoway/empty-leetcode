package com.blogspot.ostas.leetcode.all.hard.contains_duplicate_iii;

import java.util.TreeSet;

/*
      220. contains duplicate iii

https://leetcode.com/problems/contains-duplicate-iii

You are given an integer array nums and two integers indexDiff and valueDiff.
Find a pair of indices (i, j) such that:
i != j,
abs(i - j) <= indexDiff.
abs(nums[i] - nums[j]) <= valueDiff, and
Return true if such pair exists or false otherwise.

*/
class Solution {
    //Time Limit Exceeded
//  public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
//    for (int i = 0; i < nums.length; i++) {
//      for (int j = i + 1; j < nums.length; j++) {
//        if (Math.abs(nums[i] - nums[j]) <= valueDiff && Math.abs(i - j) <= indexDiff) {
//          return true;
//        }
//      }
//    }
//    return false;
//  }

    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {
            Integer floor = set.floor(nums[i] + valueDiff);
            Integer ceiling = set.ceiling(nums[i] - valueDiff);

            if ((floor != null && floor >= nums[i]) || (ceiling != null && ceiling <= nums[i])) {
                return true;
            }

            set.add(nums[i]);

            if (i >= indexDiff) {
                set.remove(nums[i - indexDiff]);
            }
        }

        return false;
    }
}