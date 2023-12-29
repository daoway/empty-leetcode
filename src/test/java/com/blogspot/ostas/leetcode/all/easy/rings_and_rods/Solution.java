package com.blogspot.ostas.leetcode.all.easy.rings_and_rods;

/*
      2103. rings and rods

https://leetcode.com/problems/rings-and-rods

There are n rings and each ring is either red, green, or blue. The rings are distributed across ten rods labeled from 0 to 9.
You are given a string rings of length 2n that describes the n rings that are placed onto the rods. Every two characters in rings forms a color-position pair that is used to describe each ring where:
The first character of the ith pair denotes the ith ring's color ('R', 'G', 'B').
The second character of the ith pair denotes the rod that the ith ring is placed on ('0' to '9').
For example, "R3G2B1" describes n == 3 rings: a red ring placed onto the rod labeled 3, a green ring placed onto the rod labeled 2, and a blue ring placed onto the rod labeled 1.
Return the number of rods that have all three colors of rings on them.

*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

  public int countPoints(String rings) {
    final Map<Character, Set<Character>> map = new HashMap<>();
    final char[] charArray = rings.toCharArray();
    for (int i = 0; i < charArray.length - 1; i++) {
      var color = charArray[i];
      var ringIndex = charArray[i + 1];
      i++;
      var colors = map.get(ringIndex);
      if (colors == null) {
        colors = new HashSet<>();
      }
      colors.add(color);
      map.put(ringIndex, colors);
    }

    int count = 0;
    for (final Set<Character> colors : map.values()) {
      if (colors.size() == 3) {
        count++;
      }
    }
    return count;
  }

}