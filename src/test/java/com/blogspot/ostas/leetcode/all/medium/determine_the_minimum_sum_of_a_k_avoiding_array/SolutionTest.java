package com.blogspot.ostas.leetcode.all.medium.determine_the_minimum_sum_of_a_k_avoiding_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 5, k = 4
    Output: 18
    Explanation: Consider the k-avoiding array [1,2,4,5,6], which has a sum of 18.
    It can be proven that there is no k-avoiding array with a sum less than 18.
    Example 2:
    Input: n = 2, k = 6
    Output: 3
    Explanation: We can construct the array [1,2], which has a sum of 3.
    It can be proven that there is no k-avoiding array with a sum less than 3.
      Constraints:
    1 <= n, k <= 50
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 5;
        int k = 4;
        int expected = 18;
        var result = solution.minimumSum(n, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 2;
        int k = 6;
        int expected = 3;
        var result = solution.minimumSum(n, k);
        assertThat(result).isEqualTo(expected);
    }

}
