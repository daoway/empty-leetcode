package com.blogspot.ostas.leetcode.all.medium.longest_happy_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: a = 1, b = 1, c = 7
    Output: "ccaccbcc"
    Explanation: "ccbccacc" would also be a correct answer.
    Example 2:
    Input: a = 7, b = 1, c = 0
    Output: "aabaa"
    Explanation: It is the only correct answer in this case.
      Constraints:
    0 <= a, b, c <= 100
    a + b + c > 0
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int a = 1;
        int b = 1;
        int c = 7;
        String expected = "ccaccbcc";
        var result = solution.longestDiverseString(a, b, c);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int a = 7;
        int b = 1;
        int c = 0;
        String expected = "aabaa";
        var result = solution.longestDiverseString(a, b, c);
        assertThat(result).isEqualTo(expected);
    }

}
