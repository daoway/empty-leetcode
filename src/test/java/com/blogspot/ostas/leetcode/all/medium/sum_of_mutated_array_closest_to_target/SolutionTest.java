package com.blogspot.ostas.leetcode.all.medium.sum_of_mutated_array_closest_to_target;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [4,9,3], target = 10
    Output: 3
    Explanation: When using 3 arr converts to [3, 3, 3] which sums 9 and that's the optimal answer.
    Example 2:
    Input: arr = [2,3,5], target = 10
    Output: 5
    Example 3:
    Input: arr = [60864,25176,27249,21296,20204], target = 56803
    Output: 11361
      Constraints:
    1 <= arr.length <= 104
    1 <= arr[i], target <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{4, 9, 3};
        int target = 10;
        int expected = 3;
        var result = solution.findBestValue(arr, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{2, 3, 5};
        int target = 10;
        int expected = 5;
        var result = solution.findBestValue(arr, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] arr = new int[]{60864, 25176, 27249, 21296, 20204};
        int target = 56803;
        int expected = 11361;
        var result = solution.findBestValue(arr, target);
        assertThat(result).isEqualTo(expected);
    }

}
