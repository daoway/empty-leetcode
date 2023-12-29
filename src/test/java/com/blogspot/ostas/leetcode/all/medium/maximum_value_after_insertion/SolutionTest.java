package com.blogspot.ostas.leetcode.all.medium.maximum_value_after_insertion;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = "99", x = 9
    Output: "999"
    Explanation: The result is the same regardless of where you insert 9.
    Example 2:
    Input: n = "-13", x = 2
    Output: "-123"
    Explanation: You can make n one of {-213, -123, -132}, and the largest of those three is -123.
      Constraints:
    1 <= n.length <= 105
    1 <= x <= 9
    The digits in n are in the range [1, 9].
    n is a valid representation of an integer.
    In the case of a negative n, it will begin with '-'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String n = "99";
        int x = 9;
        String expected = "999";
        var result = solution.maxValue(n, x);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String n = "-13";
        int x = 2;
        String expected = "-123";
        var result = solution.maxValue(n, x);
        assertThat(result).isEqualTo(expected);
    }

}
