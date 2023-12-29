package com.blogspot.ostas.leetcode.all.hard.minimum_cost_to_split_an_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,1,2,1,3,3], k = 2
    Output: 8
    Explanation: We split nums to have two subarrays: [1,2], [1,2,1,3,3].
    The importance value of [1,2] is 2 + (0) = 2.
    The importance value of [1,2,1,3,3] is 2 + (2 + 2) = 6.
    The cost of the split is 2 + 6 = 8. It can be shown that this is the minimum possible cost among all the possible splits.
    Example 2:
    Input: nums = [1,2,1,2,1], k = 2
    Output: 6
    Explanation: We split nums to have two subarrays: [1,2], [1,2,1].
    The importance value of [1,2] is 2 + (0) = 2.
    The importance value of [1,2,1] is 2 + (2) = 4.
    The cost of the split is 2 + 4 = 6. It can be shown that this is the minimum possible cost among all the possible splits.
    Example 3:
    Input: nums = [1,2,1,2,1], k = 5
    Output: 10
    Explanation: We split nums to have one subarray: [1,2,1,2,1].
    The importance value of [1,2,1,2,1] is 5 + (3 + 2) = 10.
    The cost of the split is 10. It can be shown that this is the minimum possible cost among all the possible splits.
      Constraints:
    1 <= nums.length <= 1000
    0 <= nums[i] < nums.length
    1 <= k <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 1, 2, 1, 3, 3};
        int k = 2;
        int expected = 8;
        var result = solution.minCost(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 1, 2, 1};
        int k = 2;
        int expected = 6;
        var result = solution.minCost(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 1, 2, 1};
        int k = 5;
        int expected = 10;
        var result = solution.minCost(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
