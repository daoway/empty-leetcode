package com.blogspot.ostas.leetcode.all.easy.di_string_match;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "IDID"
    Output: [0,4,1,3,2]
    Example 2:
    Input: s = "III"
    Output: [0,1,2,3]
    Example 3:
    Input: s = "DDI"
    Output: [3,2,0,1]
      Constraints:
    1 <= s.length <= 105
    s[i] is either 'I' or 'D'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "IDID";
        int[] expected = new int[]{0, 4, 1, 3, 2};
        var result = solution.diStringMatch(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "III";
        int[] expected = new int[]{0, 1, 2, 3};
        var result = solution.diStringMatch(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "DDI";
        int[] expected = new int[]{3, 2, 0, 1};
        var result = solution.diStringMatch(s);
        assertThat(result).isEqualTo(expected);
    }

}
