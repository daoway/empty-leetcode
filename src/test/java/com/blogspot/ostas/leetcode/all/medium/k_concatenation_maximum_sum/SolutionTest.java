package com.blogspot.ostas.leetcode.all.medium.k_concatenation_maximum_sum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [1,2], k = 3
    Output: 9
    Example 2:
    Input: arr = [1,-2,1], k = 5
    Output: 2
    Example 3:
    Input: arr = [-1,-2], k = 7
    Output: 0
      Constraints:
    1 <= arr.length <= 105
    1 <= k <= 105
    -104 <= arr[i] <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{1, 2};
        int k = 3;
        int expected = 9;
        var result = solution.kConcatenationMaxSum(arr, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{1, -2, 1};
        int k = 5;
        int expected = 2;
        var result = solution.kConcatenationMaxSum(arr, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] arr = new int[]{-1, -2};
        int k = 7;
        int expected = 0;
        var result = solution.kConcatenationMaxSum(arr, k);
        assertThat(result).isEqualTo(expected);
    }

}
