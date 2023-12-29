package com.blogspot.ostas.leetcode.all.medium.smallest_integer_divisible_by_k;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: k = 1
    Output: 1
    Explanation: The smallest answer is n = 1, which has length 1.
    Example 2:
    Input: k = 2
    Output: -1
    Explanation: There is no such positive integer n divisible by 2.
    Example 3:
    Input: k = 3
    Output: 3
    Explanation: The smallest answer is n = 111, which has length 3.
      Constraints:
    1 <= k <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int k = 1;
        int expected = 1;
        var result = solution.smallestRepunitDivByK(k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int k = 2;
        int expected = -1;
        var result = solution.smallestRepunitDivByK(k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int k = 3;
        int expected = 3;
        var result = solution.smallestRepunitDivByK(k);
        assertThat(result).isEqualTo(expected);
    }

}
