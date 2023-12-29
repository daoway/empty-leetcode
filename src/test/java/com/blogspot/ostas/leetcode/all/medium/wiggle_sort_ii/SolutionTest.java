package com.blogspot.ostas.leetcode.all.medium.wiggle_sort_ii;

import org.junit.jupiter.api.Test;

class SolutionTest {

    /*
        Example 1:
    Input: nums = [1,5,1,1,6,4]
    Output: [1,6,1,5,1,4]
    Explanation: [1,4,1,5,1,6] is also accepted.
    Example 2:
    Input: nums = [1,3,2,2,3,1]
    Output: [2,3,1,3,1,2]
      Constraints:
    1 <= nums.length <= 5 * 104
    0 <= nums[i] <= 5000
    It is guaranteed that there will be an answer for the given input nums.
      Follow Up: Can you do it in O(n) time and/or in-place with O(1) extra space?
    */

    @Test
    void test_0() {
        var solution = new Solution();
        int[] nums = new int[]{};
        solution.wiggleSort(nums);
    }
}
