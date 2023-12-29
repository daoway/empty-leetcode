package com.blogspot.ostas.leetcode.all.easy.is_subsequence;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "abc", t = "ahbgdc"
    Output: true
    Example 2:
    Input: s = "axc", t = "ahbgdc"
    Output: false
      Constraints:
    0 <= s.length <= 100
    0 <= t.length <= 104
    s and t consist only of lowercase English letters.
      Follow up: Suppose there are lots of incoming s, say s1, s2, ..., sk where k >= 109, and you want to check one by one to see if t has its subsequence. In this scenario, how would you change your code?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "abc";
        String t = "ahbgdc";
        boolean expected = true;
        var result = solution.isSubsequence(s, t);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "axc";
        String t = "ahbgdc";
        boolean expected = false;
        var result = solution.isSubsequence(s, t);
        assertThat(result).isEqualTo(expected);
    }

}
