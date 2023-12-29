package com.blogspot.ostas.leetcode.all.medium.rotate_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
        Example 1:
    Input: nums = [1,2,3,4,5,6,7], k = 3
    Output: [5,6,7,1,2,3,4]
    Explanation:
    rotate 1 steps to the right: [7,1,2,3,4,5,6]
    rotate 2 steps to the right: [6,7,1,2,3,4,5]
    rotate 3 steps to the right: [5,6,7,1,2,3,4]
    Example 2:
    Input: nums = [-1,-100,3,99], k = 2
    Output: [3,99,-1,-100]
    Explanation:
    rotate 1 steps to the right: [99,-1,-100,3]
    rotate 2 steps to the right: [3,99,-1,-100]
      Constraints:
    1 <= nums.length <= 105
    -231 <= nums[i] <= 231 - 1
    0 <= k <= 105
      Follow up:
    Try to come up with as many solutions as you can. There are at least three different ways to solve this problem.
    Could you do it in-place with O(1) extra space?
    */

    @Test
    void test_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] expected = new int[]{5, 6, 7, 1, 2, 3, 4};
        int k = 3;
        solution.rotate(nums, k);
        assertThat(nums).isEqualTo(expected);
    }

    @Test
    void test_1() {
        var solution = new Solution();
        int[] nums = new int[]{-1, -100, 3, 99};
        int[] expected = new int[]{3, 99, -1, -100};
        int k = 2;
        solution.rotate(nums, k);
        assertThat(nums).isEqualTo(expected);
    }

}
