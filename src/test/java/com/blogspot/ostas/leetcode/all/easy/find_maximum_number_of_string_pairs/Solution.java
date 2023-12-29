package com.blogspot.ostas.leetcode.all.easy.find_maximum_number_of_string_pairs;

/*
      2744. find maximum number of string pairs

https://leetcode.com/problems/find-maximum-number-of-string-pairs

You are given a 0-indexed array words consisting of distinct strings.
The string words[i] can be paired with the string words[j] if:
The string words[i] is equal to the reversed string of words[j].
0 <= i < j < words.length.
Return the maximum number of pairs that can be formed from the array words.
Note that each string can belong in at most one pair.

*/
import java.util.HashMap;
import java.util.Map;

public class Solution {
  private static String reverse(String s){
    var chars = s.toCharArray();
    StringBuilder sb = new StringBuilder();
    for (int i = chars.length-1; i >=0 ; i--) {
      sb.append(chars[i]);
    }
    return sb.toString();
  }
  public int maximumNumberOfStringPairs(String[] words) {
    int count=0;

    final Map<String,Integer> set = new HashMap<>();
    for (int i = 0; i < words.length; i++) {
      set.put(words[i],i);
    }
    for (final String word : words){
      final String reversed = reverse(word);
      if(set.containsKey(reversed) && set.get(word) < set.get(reversed)) {
        count++;
        set.remove(word);
      }
    }

    return count;
  }

}