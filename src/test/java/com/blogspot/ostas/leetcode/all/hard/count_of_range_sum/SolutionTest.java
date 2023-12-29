package com.blogspot.ostas.leetcode.all.hard.count_of_range_sum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [-2,5,-1], lower = -2, upper = 2
    Output: 3
    Explanation: The three ranges are: [0,0], [2,2], and [0,2] and their respective sums are: -2, -1, 2.
    Example 2:
    Input: nums = [0], lower = 0, upper = 0
    Output: 1
      Constraints:
    1 <= nums.length <= 105
    -231 <= nums[i] <= 231 - 1
    -105 <= lower <= upper <= 105
    The answer is guaranteed to fit in a 32-bit integer.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{-2, 5, -1};
        int lower = -2;
        int upper = 2;
        int expected = 3;
        var result = solution.countRangeSum(nums, lower, upper);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{0};
        int lower = 0;
        int upper = 0;
        int expected = 1;
        var result = solution.countRangeSum(nums, lower, upper);
        assertThat(result).isEqualTo(expected);
    }

}
