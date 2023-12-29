package com.blogspot.ostas.leetcode.all.hard.partition_array_into_two_arrays_to_minimize_sum_difference;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [3,9,7,3]
    Output: 2
    Explanation: One optimal partition is: [3,9] and [7,3].
    The absolute difference between the sums of the arrays is abs((3 + 9) - (7 + 3)) = 2.
    Example 2:
    Input: nums = [-36,36]
    Output: 72
    Explanation: One optimal partition is: [-36] and [36].
    The absolute difference between the sums of the arrays is abs((-36) - (36)) = 72.
    Example 3:
    Input: nums = [2,-1,0,4,-2,-9]
    Output: 0
    Explanation: One optimal partition is: [2,4,-9] and [-1,0,-2].
    The absolute difference between the sums of the arrays is abs((2 + 4 + -9) - (-1 + 0 + -2)) = 0.
      Constraints:
    1 <= n <= 15
    nums.length == 2 * n
    -107 <= nums[i] <= 107
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{3, 9, 7, 3};
        int expected = 2;
        var result = solution.minimumDifference(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{-36, 36};
        int expected = 72;
        var result = solution.minimumDifference(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{2, -1, 0, 4, -2, -9};
        int expected = 0;
        var result = solution.minimumDifference(nums);
        assertThat(result).isEqualTo(expected);
    }

}
