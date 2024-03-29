package com.blogspot.ostas.leetcode.all.medium.jump_game_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,3,1,1,4]
    Output: 2
    Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.
    Example 2:
    Input: nums = [2,3,0,1,4]
    Output: 2
      Constraints:
    1 <= nums.length <= 104
    0 <= nums[i] <= 1000
    It's guaranteed that you can reach nums[n - 1].
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, 3, 1, 1, 4};
        int expected = 2;
        var result = solution.jump(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{2, 3, 0, 1, 4};
        int expected = 2;
        var result = solution.jump(nums);
        assertThat(result).isEqualTo(expected);
    }

}
