package com.blogspot.ostas.leetcode.all.medium.partition_array_for_maximum_sum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [1,15,7,9,2,5,10], k = 3
    Output: 84
    Explanation: arr becomes [15,15,15,9,10,10,10]
    Example 2:
    Input: arr = [1,4,1,5,7,3,6,1,9,9,3], k = 4
    Output: 83
    Example 3:
    Input: arr = [1], k = 1
    Output: 1
      Constraints:
    1 <= arr.length <= 500
    0 <= arr[i] <= 109
    1 <= k <= arr.length
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{1, 15, 7, 9, 2, 5, 10};
        int k = 3;
        int expected = 84;
        var result = solution.maxSumAfterPartitioning(arr, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{1, 4, 1, 5, 7, 3, 6, 1, 9, 9, 3};
        int k = 4;
        int expected = 83;
        var result = solution.maxSumAfterPartitioning(arr, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] arr = new int[]{1};
        int k = 1;
        int expected = 1;
        var result = solution.maxSumAfterPartitioning(arr, k);
        assertThat(result).isEqualTo(expected);
    }

}
