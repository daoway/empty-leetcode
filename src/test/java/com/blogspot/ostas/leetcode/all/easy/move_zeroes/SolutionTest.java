package com.blogspot.ostas.leetcode.all.easy.move_zeroes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
        Example 1:
    Input: nums = [0,1,0,3,12]
    Output: [1,3,12,0,0]
    Example 2:
    Input: nums = [0]
    Output: [0]
      Constraints:
    1 <= nums.length <= 104
    -231 <= nums[i] <= 231 - 1
      Follow up: Could you minimize the total number of operations done?
    */

    @Test
    void test_0() {
        var solution = new Solution();
        int[] nums = new int[]{0, 1, 0, 3, 12};
        var expected = new int[]{1, 3, 12, 0, 0};
        solution.moveZeroes(nums);
        assertThat(nums).isEqualTo(expected);
    }
}
