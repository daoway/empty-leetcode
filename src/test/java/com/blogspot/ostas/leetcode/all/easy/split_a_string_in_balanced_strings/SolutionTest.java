package com.blogspot.ostas.leetcode.all.easy.split_a_string_in_balanced_strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "RLRRLLRLRL"
    Output: 4
    Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
    Example 2:
    Input: s = "RLRRRLLRLL"
    Output: 2
    Explanation: s can be split into "RL", "RRRLLRLL", each substring contains same number of 'L' and 'R'.
    Note that s cannot be split into "RL", "RR", "RL", "LR", "LL", because the 2nd and 5th substrings are not balanced.
    Example 3:
    Input: s = "LLLLRRRR"
    Output: 1
    Explanation: s can be split into "LLLLRRRR".
      Constraints:
    2 <= s.length <= 1000
    s[i] is either 'L' or 'R'.
    s is a balanced string.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "RLRRLLRLRL";
        int expected = 4;
        var result = solution.balancedStringSplit(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "RLRRRLLRLL";
        int expected = 2;
        var result = solution.balancedStringSplit(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "LLLLRRRR";
        int expected = 1;
        var result = solution.balancedStringSplit(s);
        assertThat(result).isEqualTo(expected);
    }

}
