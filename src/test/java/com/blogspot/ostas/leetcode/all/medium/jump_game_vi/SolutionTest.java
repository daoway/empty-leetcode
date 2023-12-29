package com.blogspot.ostas.leetcode.all.medium.jump_game_vi;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,-1,-2,4,-7,3], k = 2
    Output: 7
    Explanation: You can choose your jumps forming the subsequence [1,-1,4,3] (underlined above). The sum is 7.
    Example 2:
    Input: nums = [10,-5,-2,4,0,3], k = 3
    Output: 17
    Explanation: You can choose your jumps forming the subsequence [10,4,3] (underlined above). The sum is 17.
    Example 3:
    Input: nums = [1,-5,-20,4,-1,3,-6,-3], k = 2
    Output: 0
      Constraints:
    1 <= nums.length, k <= 105
    -104 <= nums[i] <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, -1, -2, 4, -7, 3};
        int k = 2;
        int expected = 7;
        var result = solution.maxResult(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{10, -5, -2, 4, 0, 3};
        int k = 3;
        int expected = 17;
        var result = solution.maxResult(nums, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{1, -5, -20, 4, -1, 3, -6, -3};
        int k = 2;
        int expected = 0;
        var result = solution.maxResult(nums, k);
        assertThat(result).isEqualTo(expected);
    }

}
