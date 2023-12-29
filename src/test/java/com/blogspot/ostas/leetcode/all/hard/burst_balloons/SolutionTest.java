package com.blogspot.ostas.leetcode.all.hard.burst_balloons;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [3,1,5,8]
    Output: 167
    Explanation:
    nums = [3,1,5,8] --> [3,5,8] --> [3,8] --> [8] --> []
    coins =  3*1*5    +   3*5*8   +  1*3*8  + 1*8*1 = 167
    Example 2:
    Input: nums = [1,5]
    Output: 10
      Constraints:
    n == nums.length
    1 <= n <= 300
    0 <= nums[i] <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{3, 1, 5, 8};
        int expected = 167;
        var result = solution.maxCoins(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 5};
        int expected = 10;
        var result = solution.maxCoins(nums);
        assertThat(result).isEqualTo(expected);
    }

}
