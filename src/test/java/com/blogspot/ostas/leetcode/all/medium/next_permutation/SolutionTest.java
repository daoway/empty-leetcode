package com.blogspot.ostas.leetcode.all.medium.next_permutation;

import org.junit.jupiter.api.Test;

class SolutionTest {

    /*
        Example 1:
    Input: nums = [1,2,3]
    Output: [1,3,2]
    Example 2:
    Input: nums = [3,2,1]
    Output: [1,2,3]
    Example 3:
    Input: nums = [1,1,5]
    Output: [1,5,1]
      Constraints:
    1 <= nums.length <= 100
    0 <= nums[i] <= 100
    */

    @Test
    void test_0() {
        var solution = new Solution();
        int[] nums = new int[]{};
        solution.nextPermutation(nums);
    }
}
