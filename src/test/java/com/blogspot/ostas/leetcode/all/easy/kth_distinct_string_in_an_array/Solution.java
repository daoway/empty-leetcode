package com.blogspot.ostas.leetcode.all.easy.kth_distinct_string_in_an_array;

/*
      2053. kth distinct string in an array

https://leetcode.com/problems/kth-distinct-string-in-an-array

A distinct string is a string that is present only once in an array.
Given an array of strings arr, and an integer k, return the kth distinct string present in arr. If there are fewer than k distinct strings, return an empty string "".
Note that the strings are considered in the order in which they appear in the array.

*/

import java.util.LinkedHashMap;
import java.util.Map;

class Solution {
  public String kthDistinct(String[] arr, int k) {
    var map = new LinkedHashMap<String,Integer>();
    for(final String s : arr){
      map.put(s, map.getOrDefault(s,0)+1);
    }
    var uniqueElements = map.entrySet().stream().filter( el -> el.getValue() == 1).map(
        Map.Entry::getKey).limit(k).toArray();
    if(uniqueElements.length!=k) return "";
    return uniqueElements[k-1].toString();
  }
}
