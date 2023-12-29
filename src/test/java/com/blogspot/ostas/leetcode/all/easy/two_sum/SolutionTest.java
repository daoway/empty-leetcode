package com.blogspot.ostas.leetcode.all.easy.two_sum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    Example 2:
    Input: nums = [3,2,4], target = 6
    Output: [1,2]
    Example 3:
    Input: nums = [3,3], target = 6
    Output: [0,1]
      Constraints:
    2 <= nums.length <= 104
    -109 <= nums[i] <= 109
    -109 <= target <= 109
    Only one valid answer exists.
      Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] expected = new int[]{0, 1};
        var result = solution.twoSum(nums, target);
        assertThat(result).containsExactlyInAnyOrder(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{3, 2, 4};
        int target = 6;
        int[] expected = new int[]{1, 2};
        var result = solution.twoSum(nums, target);
        assertThat(result).containsExactlyInAnyOrder(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{3, 3};
        int target = 6;
        int[] expected = new int[]{0, 1};
        var result = solution.twoSum(nums, target);
        assertThat(result).containsExactlyInAnyOrder(expected);
    }

}
