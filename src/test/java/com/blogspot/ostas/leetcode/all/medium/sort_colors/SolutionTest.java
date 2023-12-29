package com.blogspot.ostas.leetcode.all.medium.sort_colors;

import org.junit.jupiter.api.Test;

class SolutionTest {

    /*
        Example 1:
    Input: nums = [2,0,2,1,1,0]
    Output: [0,0,1,1,2,2]
    Example 2:
    Input: nums = [2,0,1]
    Output: [0,1,2]
      Constraints:
    n == nums.length
    1 <= n <= 300
    nums[i] is either 0, 1, or 2.
      Follow up: Could you come up with a one-pass algorithm using only constant extra space?
    */

    @Test
    void test_0() {
        var solution = new Solution();
        int[] nums = new int[]{};
        solution.sortColors(nums);
    }
}
