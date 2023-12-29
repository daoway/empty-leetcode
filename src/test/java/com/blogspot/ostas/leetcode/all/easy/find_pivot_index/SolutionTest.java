package com.blogspot.ostas.leetcode.all.easy.find_pivot_index;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nums = [1,7,3,6,5,6]
    Output: 3
    Explanation:
    The pivot index is 3.
    Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
    Right sum = nums[4] + nums[5] = 5 + 6 = 11
    Example 2:
    Input: nums = [1,2,3]
    Output: -1
    Explanation:
    There is no index that satisfies the conditions in the problem statement.
    Example 3:
    Input: nums = [2,1,-1]
    Output: 0
    Explanation:
    The pivot index is 0.
    Left sum = 0 (no elements to the left of index 0)
    Right sum = nums[1] + nums[2] = 1 + -1 = 0
      Constraints:
    1 <= nums.length <= 104
    -1000 <= nums[i] <= 1000
      Note: This question is the same as 1991: https://leetcode.com/problems/find-the-middle-index-in-array/
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nums = new int[]{1, 7, 3, 6, 5, 6};
        int expected = 3;
        var result = solution.pivotIndex(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nums = new int[]{1, 2, 3};
        int expected = -1;
        var result = solution.pivotIndex(nums);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nums = new int[]{2, 1, -1};
        int expected = 0;
        var result = solution.pivotIndex(nums);
        assertThat(result).isEqualTo(expected);
    }

}
