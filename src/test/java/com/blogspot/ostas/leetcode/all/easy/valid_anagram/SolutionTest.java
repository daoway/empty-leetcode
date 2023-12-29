package com.blogspot.ostas.leetcode.all.easy.valid_anagram;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "anagram", t = "nagaram"
    Output: true
    Example 2:
    Input: s = "rat", t = "car"
    Output: false
      Constraints:
    1 <= s.length, t.length <= 5 * 104
    s and t consist of lowercase English letters.
      Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "anagram";
        String t = "nagaram";
        boolean expected = true;
        var result = solution.isAnagram(s, t);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "rat";
        String t = "car";
        boolean expected = false;
        var result = solution.isAnagram(s, t);
        assertThat(result).isEqualTo(expected);
    }

}
