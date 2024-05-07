package com.blogspot.ostas.leetcode.all.easy.contains_duplicate_ii;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
      219. contains duplicate ii

https://leetcode.com/problems/contains-duplicate-ii

Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

*/
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.computeIfAbsent(nums[i], l -> new ArrayList<>()).add(i);
        }
        for (final Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            if (entry.getValue().size() >= 2) {
                final var list = entry.getValue();
                for (int i = 0; i < list.size(); i++) {
                    for (int j = 0; j < list.size() && j != i; j++) {
                        if (Math.abs(list.get(i) - list.get(j)) <= k) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}