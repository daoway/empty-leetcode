package com.blogspot.ostas.leetcode.all.easy.find_the_difference_of_two_arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution{

  public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
    var set1 = new HashSet<Integer>();
    for (int j : nums1) {
      set1.add(j);
    }
    var set2 = new HashSet<Integer>();
    for (int j : nums2) {
      set2.add(j);
    }

    List<Integer> list1 = new ArrayList<>();
    for(int val : set1){
      if(!set2.contains(val)) list1.add(val);
    }

    List<Integer> list2 = new ArrayList<>();
    for(int val : set2){
      if(!set1.contains(val)) list2.add(val);
    }

    return List.of(list1,list2);
  }
}