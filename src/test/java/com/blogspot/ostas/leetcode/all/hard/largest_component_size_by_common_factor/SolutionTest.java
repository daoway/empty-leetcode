package com.blogspot.ostas.leetcode.all.hard.largest_component_size_by_common_factor;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [4,6,15,35]
    Output: 4
    Example 2:
    Input: nums = [20,50,9,63]
    Output: 2
    Example 3:
    Input: nums = [2,3,6,7,4,12,21,39]
    Output: 8
      Constraints:
    1 <= nums.length <= 2 * 104
    1 <= nums[i] <= 105
    All the values of nums are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{4, 6, 15, 35};
        int expected = 4;
        var result = solution.largestComponentSize(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{20, 50, 9, 63};
        int expected = 2;
        var result = solution.largestComponentSize(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{2, 3, 6, 7, 4, 12, 21, 39};
        int expected = 8;
        var result = solution.largestComponentSize(nums);
        assertThat(result).isEqualTo(expected);
    }

}
