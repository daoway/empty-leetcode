package com.blogspot.ostas.leetcode.all.easy.min_max_game;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,3,5,2,4,8,2,2]
    Output: 1
    Explanation: The following arrays are the results of applying the algorithm repeatedly.
    First: nums = [1,5,4,2]
    Second: nums = [1,4]
    Third: nums = [1]
    1 is the last remaining number, so we return 1.
    Example 2:
    Input: nums = [3]
    Output: 3
    Explanation: 3 is already the last remaining number, so we return 3.
      Constraints:
    1 <= nums.length <= 1024
    1 <= nums[i] <= 109
    nums.length is a power of 2.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 3, 5, 2, 4, 8, 2, 2};
        int expected = 1;
        var result = solution.minMaxGame(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{3};
        int expected = 3;
        var result = solution.minMaxGame(nums);
        assertThat(result).isEqualTo(expected);
    }

}
