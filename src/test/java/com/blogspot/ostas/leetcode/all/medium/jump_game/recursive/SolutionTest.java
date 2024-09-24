package com.blogspot.ostas.leetcode.all.medium.jump_game.recursive;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [2,3,1,1,4]
    Output: true
    Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
    Example 2:
    Input: nums = [3,2,1,0,4]
    Output: false
    Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.
      Constraints:
    1 <= nums.length <= 104
    0 <= nums[i] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{2, 3, 1, 1, 4};
        boolean expected = true;
        var result = solution.canJump(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{3, 2, 1, 0, 4};
        boolean expected = false;
        var result = solution.canJump(nums);
        assertThat(result).isEqualTo(expected);
    }

}
