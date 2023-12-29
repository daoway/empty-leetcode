package com.blogspot.ostas.leetcode.all.medium.minimum_deletions_to_make_array_beautiful;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,1,2,3,5]
    Output: 1
    Explanation: You can delete either nums[0] or nums[1] to make nums = [1,2,3,5] which is beautiful. It can be proven you need at least 1 deletion to make nums beautiful.
    Example 2:
    Input: nums = [1,1,2,2,3,3]
    Output: 2
    Explanation: You can delete nums[0] and nums[5] to make nums = [1,2,2,3] which is beautiful. It can be proven you need at least 2 deletions to make nums beautiful.
      Constraints:
    1 <= nums.length <= 105
    0 <= nums[i] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 1, 2, 3, 5};
        int expected = 1;
        var result = solution.minDeletion(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 1, 2, 2, 3, 3};
        int expected = 2;
        var result = solution.minDeletion(nums);
        assertThat(result).isEqualTo(expected);
    }

}
