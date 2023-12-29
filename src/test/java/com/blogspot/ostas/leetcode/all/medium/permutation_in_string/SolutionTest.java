package com.blogspot.ostas.leetcode.all.medium.permutation_in_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s1 = "ab", s2 = "eidbaooo"
    Output: true
    Explanation: s2 contains one permutation of s1 ("ba").
    Example 2:
    Input: s1 = "ab", s2 = "eidboaoo"
    Output: false
      Constraints:
    1 <= s1.length, s2.length <= 104
    s1 and s2 consist of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s1 = "ab";
        String s2 = "eidbaooo";
        boolean expected = true;
        var result = solution.checkInclusion(s1, s2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s1 = "ab";
        String s2 = "eidboaoo";
        boolean expected = false;
        var result = solution.checkInclusion(s1, s2);
        assertThat(result).isEqualTo(expected);
    }

}
