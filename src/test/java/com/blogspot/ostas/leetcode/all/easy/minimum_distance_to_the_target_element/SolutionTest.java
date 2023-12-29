package com.blogspot.ostas.leetcode.all.easy.minimum_distance_to_the_target_element;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,3,4,5], target = 5, start = 3
    Output: 1
    Explanation: nums[4] = 5 is the only value equal to target, so the answer is abs(4 - 3) = 1.
    Example 2:
    Input: nums = [1], target = 1, start = 0
    Output: 0
    Explanation: nums[0] = 1 is the only value equal to target, so the answer is abs(0 - 0) = 0.
    Example 3:
    Input: nums = [1,1,1,1,1,1,1,1,1,1], target = 1, start = 0
    Output: 0
    Explanation: Every value of nums is 1, but nums[0] minimizes abs(i - start), which is abs(0 - 0) = 0.
      Constraints:
    1 <= nums.length <= 1000
    1 <= nums[i] <= 104
    0 <= start < nums.length
    target is in nums.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4, 5};
        int target = 5;
        int start = 3;
        int expected = 1;
        var result = solution.getMinDistance(nums, target, start);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1};
        int target = 1;
        int start = 0;
        int expected = 0;
        var result = solution.getMinDistance(nums, target, start);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int target = 1;
        int start = 0;
        int expected = 0;
        var result = solution.getMinDistance(nums, target, start);
        assertThat(result).isEqualTo(expected);
    }

}
