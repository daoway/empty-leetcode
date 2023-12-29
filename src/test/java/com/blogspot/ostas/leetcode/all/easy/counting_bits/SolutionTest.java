package com.blogspot.ostas.leetcode.all.easy.counting_bits;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 2
    Output: [0,1,1]
    Explanation:
    0 --> 0
    1 --> 1
    2 --> 10
    Example 2:
    Input: n = 5
    Output: [0,1,1,2,1,2]
    Explanation:
    0 --> 0
    1 --> 1
    2 --> 10
    3 --> 11
    4 --> 100
    5 --> 101
      Constraints:
    0 <= n <= 105
      Follow up:
    It is very easy to come up with a solution with a runtime of O(n log n). Can you do it in linear time O(n) and possibly in a single pass?
    Can you do it without using any built-in function (i.e., like __builtin_popcount in C++)?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 2;
        int[] expected = new int[]{0, 1, 1};
        var result = solution.countBits(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 5;
        int[] expected = new int[]{0, 1, 1, 2, 1, 2};
        var result = solution.countBits(n);
        assertThat(result).isEqualTo(expected);
    }

}
