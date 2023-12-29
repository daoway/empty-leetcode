package com.blogspot.ostas.leetcode.all.medium.smallest_string_with_a_given_numeric_value;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 3, k = 27
    Output: "aay"
    Explanation: The numeric value of the string is 1 + 1 + 25 = 27, and it is the smallest string with such a value and length equal to 3.
    Example 2:
    Input: n = 5, k = 73
    Output: "aaszz"
      Constraints:
    1 <= n <= 105
    n <= k <= 26 * n
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 3;
        int k = 27;
        String expected = "aay";
        var result = solution.getSmallestString(n, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 5;
        int k = 73;
        String expected = "aaszz";
        var result = solution.getSmallestString(n, k);
        assertThat(result).isEqualTo(expected);
    }

}
