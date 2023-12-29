package com.blogspot.ostas.leetcode.all.medium.partition_array_into_disjoint_intervals;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [5,0,3,8,6]
    Output: 3
    Explanation: left = [5,0,3], right = [8,6]
    Example 2:
    Input: nums = [1,1,1,0,6,12]
    Output: 4
    Explanation: left = [1,1,1,0], right = [6,12]
      Constraints:
    2 <= nums.length <= 105
    0 <= nums[i] <= 106
    There is at least one valid answer for the given input.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{5, 0, 3, 8, 6};
        int expected = 3;
        var result = solution.partitionDisjoint(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 1, 1, 0, 6, 12};
        int expected = 4;
        var result = solution.partitionDisjoint(nums);
        assertThat(result).isEqualTo(expected);
    }

}
