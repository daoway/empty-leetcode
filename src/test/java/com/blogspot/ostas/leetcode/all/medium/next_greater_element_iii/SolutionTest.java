package com.blogspot.ostas.leetcode.all.medium.next_greater_element_iii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 12
    Output: 21
    Example 2:
    Input: n = 21
    Output: -1
      Constraints:
    1 <= n <= 231 - 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 12;
        int expected = 21;
        var result = solution.nextGreaterElement(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 21;
        int expected = -1;
        var result = solution.nextGreaterElement(n);
        assertThat(result).isEqualTo(expected);
    }

}
