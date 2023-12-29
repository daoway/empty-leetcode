package com.blogspot.ostas.leetcode.all.medium.binary_string_with_substrings_representing_one_to_n;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "0110", n = 3
    Output: true
    Example 2:
    Input: s = "0110", n = 4
    Output: false
      Constraints:
    1 <= s.length <= 1000
    s[i] is either '0' or '1'.
    1 <= n <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "0110";
        int n = 3;
        boolean expected = true;
        var result = solution.queryString(s, n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "0110";
        int n = 4;
        boolean expected = false;
        var result = solution.queryString(s, n);
        assertThat(result).isEqualTo(expected);
    }

}
