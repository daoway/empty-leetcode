package com.blogspot.ostas.leetcode.all.medium.string_without_aaa_or_bbb;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: a = 1, b = 2
    Output: "abb"
    Explanation: "abb", "bab" and "bba" are all correct answers.
    Example 2:
    Input: a = 4, b = 1
    Output: "aabaa"
      Constraints:
    0 <= a, b <= 100
    It is guaranteed such an s exists for the given a and b.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int a = 1;
        int b = 2;
        String expected = "abb";
        var result = solution.strWithout3a3b(a, b);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int a = 4;
        int b = 1;
        String expected = "aabaa";
        var result = solution.strWithout3a3b(a, b);
        assertThat(result).isEqualTo(expected);
    }

}
