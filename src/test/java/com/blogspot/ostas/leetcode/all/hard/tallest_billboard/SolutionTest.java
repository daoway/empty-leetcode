package com.blogspot.ostas.leetcode.all.hard.tallest_billboard;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: rods = [1,2,3,6]
    Output: 6
    Explanation: We have two disjoint subsets {1,2,3} and {6}, which have the same sum = 6.
    Example 2:
    Input: rods = [1,2,3,4,5,6]
    Output: 10
    Explanation: We have two disjoint subsets {2,3,5} and {4,6}, which have the same sum = 10.
    Example 3:
    Input: rods = [1,2]
    Output: 0
    Explanation: The billboard cannot be supported, so we return 0.
      Constraints:
    1 <= rods.length <= 20
    1 <= rods[i] <= 1000
    sum(rods[i]) <= 5000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] rods = new int[]{1, 2, 3, 6};
        int expected = 6;
        var result = solution.tallestBillboard(rods);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] rods = new int[]{1, 2, 3, 4, 5, 6};
        int expected = 10;
        var result = solution.tallestBillboard(rods);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] rods = new int[]{1, 2};
        int expected = 0;
        var result = solution.tallestBillboard(rods);
        assertThat(result).isEqualTo(expected);
    }

}
