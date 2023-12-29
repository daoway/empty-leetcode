package com.blogspot.ostas.leetcode.all.hard.smallest_good_base;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = "13"
    Output: "3"
    Explanation: 13 base 3 is 111.
    Example 2:
    Input: n = "4681"
    Output: "8"
    Explanation: 4681 base 8 is 11111.
    Example 3:
    Input: n = "1000000000000000000"
    Output: "999999999999999999"
    Explanation: 1000000000000000000 base 999999999999999999 is 11.
      Constraints:
    n is an integer in the range [3, 1018].
    n does not contain any leading zeros.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String n = "13";
        String expected = "3";
        var result = solution.smallestGoodBase(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String n = "4681";
        String expected = "8";
        var result = solution.smallestGoodBase(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String n = "1000000000000000000";
        String expected = "999999999999999999";
        var result = solution.smallestGoodBase(n);
        assertThat(result).isEqualTo(expected);
    }

}
