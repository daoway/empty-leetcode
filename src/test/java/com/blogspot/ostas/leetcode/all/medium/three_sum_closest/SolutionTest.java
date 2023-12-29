package com.blogspot.ostas.leetcode.all.medium.three_sum_closest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [-1,2,1,-4], target = 1
    Output: 2
    Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
    Example 2:
    Input: nums = [0,0,0], target = 1
    Output: 0
    Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).
      Constraints:
    3 <= nums.length <= 500
    -1000 <= nums[i] <= 1000
    -104 <= target <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{-1, 2, 1, -4};
        int target = 1;
        int expected = 2;
        var result = solution.threeSumClosest(nums, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{0, 0, 0};
        int target = 1;
        int expected = 0;
        var result = solution.threeSumClosest(nums, target);
        assertThat(result).isEqualTo(expected);
    }

}
