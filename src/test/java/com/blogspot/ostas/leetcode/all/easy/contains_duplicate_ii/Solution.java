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
      //map.computeIfAbsent(nums[i], map.getOrDefault(nums[i],0)+1 l -> new ArrayList<>()).add(i);
      map.computeIfAbsent(nums[i], l -> new ArrayList<>()).add(i);
    }
    for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
      if (entry.getValue().size() >=2){
        Integer[] list = entry.getValue().toArray(Integer[]::new);
        for(int i=0;i<list.length;i++){
          for (int j = 0; j < list.length && j!=i; j++) {
            if(Math.abs(list[i]-list[j])<=k){
              return true;
            }
          }
        }
      }
    }
    return false;
  }
}