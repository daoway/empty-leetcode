package com.blogspot.ostas.leetcode.all.medium.sort_characters_by_frequency;

/*
      451. sort characters by frequency

https://leetcode.com/problems/sort-characters-by-frequency

Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.
Return the sorted string. If there are multiple answers, return any of them.

*/

import java.util.Arrays;

public class Solution {
  public String frequencySort(String s) {
    int[][] map = new int[128][2];

    for (char ch : s.toCharArray()) {
      map[ch][0] = ch;
      map[ch][1]++;
    }

    Arrays.sort(map, (a, b) -> Integer.compare(b[1], a[1]));

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < map.length; i++) {
      if (map[i][1] > 0) {
        for (int j = 0; j < map[i][1]; j++) {
          sb.append((char) map[i][0]);
        }
      }
    }

    return sb.toString();
  }
}
