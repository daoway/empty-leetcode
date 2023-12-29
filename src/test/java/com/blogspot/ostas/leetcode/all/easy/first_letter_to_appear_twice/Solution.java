package com.blogspot.ostas.leetcode.all.easy.first_letter_to_appear_twice;

/*
      2351. first letter to appear twice

https://leetcode.com/problems/first-letter-to-appear-twice

Given a string s consisting of lowercase English letters, return the first letter to appear twice.
Note:
A letter a appears twice before another letter b if the second occurrence of a is before the second occurrence of b.
s will contain at least one letter that appears twice.

*/

import java.util.HashMap;
import java.util.Map;

class Solution {
  public char repeatedCharacter(String s) {
    Map<Character,Integer> map = new HashMap<>();
    var chars = s.toCharArray();
    int freq=0;
    for(final char c : chars){
      freq = map.getOrDefault(c,0)+1;
      if(freq==2) return c;
      map.put(c, freq);
    }
    return 0;
  }
}