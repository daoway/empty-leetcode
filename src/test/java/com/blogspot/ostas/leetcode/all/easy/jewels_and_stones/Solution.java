package com.blogspot.ostas.leetcode.all.easy.jewels_and_stones;

/*
      771. jewels and stones

https://leetcode.com/problems/jewels-and-stones

You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
Letters are case sensitive, so "a" is considered a different type of stone from "A".

*/

import java.util.HashMap;

class Solution {
  public int numJewelsInStones(String jewels, String stones) {

    var stonesChars = new HashMap<Character, Integer>();
    for (char c : stones.toCharArray()) {
      stonesChars.put(c, stonesChars.getOrDefault(c, 0) + 1);
      //or just
      //stonesChars.merge(c, 1, Integer::sum);
    }
    int total = 0;
    for (char j : jewels.toCharArray()) {
      if (stonesChars.containsKey(j)) {
        total += stonesChars.get(j);
      }
    }
    return total;
  }
}