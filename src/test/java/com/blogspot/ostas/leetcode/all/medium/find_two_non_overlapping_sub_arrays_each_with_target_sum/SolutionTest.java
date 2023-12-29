package com.blogspot.ostas.leetcode.all.medium.find_two_non_overlapping_sub_arrays_each_with_target_sum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [3,2,2,4,3], target = 3
    Output: 2
    Explanation: Only two sub-arrays have sum = 3 ([3] and [3]). The sum of their lengths is 2.
    Example 2:
    Input: arr = [7,3,4,7], target = 7
    Output: 2
    Explanation: Although we have three non-overlapping sub-arrays of sum = 7 ([7], [3,4] and [7]), but we will choose the first and third sub-arrays as the sum of their lengths is 2.
    Example 3:
    Input: arr = [4,3,2,6,2,3,4], target = 6
    Output: -1
    Explanation: We have only one sub-array of sum = 6.
      Constraints:
    1 <= arr.length <= 105
    1 <= arr[i] <= 1000
    1 <= target <= 108
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{3, 2, 2, 4, 3};
        int target = 3;
        int expected = 2;
        var result = solution.minSumOfLengths(arr, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{7, 3, 4, 7};
        int target = 7;
        int expected = 2;
        var result = solution.minSumOfLengths(arr, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] arr = new int[]{4, 3, 2, 6, 2, 3, 4};
        int target = 6;
        int expected = -1;
        var result = solution.minSumOfLengths(arr, target);
        assertThat(result).isEqualTo(expected);
    }

}
