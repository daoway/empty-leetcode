package com.blogspot.ostas.leetcode.all.hard.count_increasing_quadruplets;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,3,2,4,5]
    Output: 2
    Explanation:
    - When i = 0, j = 1, k = 2, and l = 3, nums[i] < nums[k] < nums[j] < nums[l].
    - When i = 0, j = 1, k = 2, and l = 4, nums[i] < nums[k] < nums[j] < nums[l].
    There are no other quadruplets, so we return 2.
    Example 2:
    Input: nums = [1,2,3,4]
    Output: 0
    Explanation: There exists only one quadruplet with i = 0, j = 1, k = 2, l = 3, but since nums[j] < nums[k], we return 0.
      Constraints:
    4 <= nums.length <= 4000
    1 <= nums[i] <= nums.length
    All the integers of nums are unique. nums is a permutation.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 3, 2, 4, 5};
        long expected = 2;
        var result = solution.countQuadruplets(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4};
        long expected = 0;
        var result = solution.countQuadruplets(nums);
        assertThat(result).isEqualTo(expected);
    }

}
