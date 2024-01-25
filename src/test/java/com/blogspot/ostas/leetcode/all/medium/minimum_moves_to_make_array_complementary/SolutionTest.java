package com.blogspot.ostas.leetcode.all.medium.minimum_moves_to_make_array_complementary;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,2,4,3], limit = 4
    Output: 1
    Explanation: In 1 move, you can change nums to [1,2,2,3] (underlined elements are changed).
    nums[0] + nums[3] = 1 + 3 = 4.
    nums[1] + nums[2] = 2 + 2 = 4.
    nums[2] + nums[1] = 2 + 2 = 4.
    nums[3] + nums[0] = 3 + 1 = 4.
    Therefore, nums[i] + nums[n-1-i] = 4 for every i, so nums is complementary.
    Example 2:
    Input: nums = [1,2,2,1], limit = 2
    Output: 2
    Explanation: In 2 moves, you can change nums to [2,2,2,2]. You cannot change any number to 3 since 3 > limit.
    Example 3:
    Input: nums = [1,2,1,2], limit = 2
    Output: 0
    Explanation: nums is already complementary.
      Constraints:
    n == nums.length
    2 <= n <= 105
    1 <= nums[i] <= limit <= 105
    n is even.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 4, 3};
        int limit = 4;
        int expected = 1;
        var result = solution.minMoves(nums, limit);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 2, 1};
        int limit = 2;
        int expected = 2;
        var result = solution.minMoves(nums, limit);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 1, 2};
        int limit = 2;
        int expected = 0;
        var result = solution.minMoves(nums, limit);
        assertThat(result).isEqualTo(expected);
    }

}
